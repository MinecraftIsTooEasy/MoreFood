package net.moddedmite.mitemod.morefood.mixins.Item;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = SlotCrafting.class, priority = 1200)
public abstract class SlotCraftingMixin {
    @Mutable @Final @Shadow private final IInventory craftMatrix;

    @Unique private boolean itemWasKnife = false;
    @Unique private boolean isCraftingDagger = false;

    protected SlotCraftingMixin(IInventory craftMatrix) {
        this.craftMatrix = craftMatrix;
    }

    @Inject(method = "onPickupFromSlot", at = @At(value = "INVOKE", target = "Lnet/minecraft/ItemStack;getItem()Lnet/minecraft/Item;", ordinal = 0))
    private void damageDagger(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack, CallbackInfo ci) {
        // 检查是否正在合成短剑
        isCraftingDagger = par2ItemStack.getItem() instanceof ItemDagger;
        
        for (int slot = this.craftMatrix.getSizeInventory() - 1; slot >= 0; --slot) {
            ItemStack stack = this.craftMatrix.getStackInSlot(slot);
            if (stack != null) {
                Item item = stack.getItem();
                if (item instanceof ItemDagger) {
                    itemWasKnife = true;
                    
                    // 只有当不是在合成短剑时才减少耐久度
                    if (!isCraftingDagger) {
                        int currentDamage = stack.getItemDamage();
                        stack.setItemDamage(currentDamage + 20);
                        if (stack.getItemDamage() >= stack.getMaxDamage()) {
                            this.craftMatrix.setInventorySlotContents(slot, null);
                        }
                    }
                }
            }
        }
    }

    @WrapOperation(method = "onPickupFromSlot", at = @At(value = "INVOKE", target = "Lnet/minecraft/IInventory;decrStackSize(II)Lnet/minecraft/ItemStack;"))
    private ItemStack decrDagger(IInventory instance, int i, int j, Operation<ItemStack> original, @Local(name = "item") Item item) {
        // 检查当前槽位的物品是否是匕首
        ItemStack stack = this.craftMatrix.getStackInSlot(i);
        if (stack != null && stack.getItem() instanceof ItemDagger) {
            // 如果是在合成短剑，消耗材料
            if (isCraftingDagger) {
                return original.call(instance, i, j);
            } else {
                // 如果不是在合成短剑，只减少耐久度，不消耗物品
                return null;
            }
        } else {
            return original.call(instance, i, j);
        }
    }
}