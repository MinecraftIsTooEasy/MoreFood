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

    protected SlotCraftingMixin(IInventory craftMatrix) {
        this.craftMatrix = craftMatrix;
    }

    @Inject(method = "onPickupFromSlot", at = @At(value = "INVOKE", target = "Lnet/minecraft/ItemStack;getItem()Lnet/minecraft/Item;", ordinal = 0))
    private void damageDagger(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack, CallbackInfo ci) {
        for (int slot = this.craftMatrix.getSizeInventory() - 1; slot >= 0; --slot) {
            ItemStack stack = this.craftMatrix.getStackInSlot(slot);
            if (stack != null) {
                Item item = stack.getItem();
                if (item instanceof ItemDagger) {
                    itemWasKnife = true;
                    int currentDamage = stack.getItemDamage();
                    stack.setItemDamage(currentDamage + 20);
                    if (stack.getItemDamage() >= stack.getMaxDamage()) {
                        this.craftMatrix.setInventorySlotContents(slot, null);
                    }
                }
            }
        }
    }

    @WrapOperation(method = "onPickupFromSlot", at = @At(value = "INVOKE", target = "Lnet/minecraft/IInventory;decrStackSize(II)Lnet/minecraft/ItemStack;"))
    private ItemStack decrDagger(IInventory instance, int i, int j, Operation<ItemStack> original, @Local(name = "item") Item item) {
        if (itemWasKnife && item instanceof ItemDagger) return this.craftMatrix.decrStackSize(i, 0);
        else return original.call(instance, i, j);
    }
}




