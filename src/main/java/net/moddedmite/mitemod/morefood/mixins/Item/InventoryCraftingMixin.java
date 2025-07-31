package net.moddedmite.mitemod.morefood.mixins.Item;


import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.InventoryCrafting;
import net.minecraft.ItemDagger;
import net.minecraft.ItemKnife;
import net.minecraft.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(InventoryCrafting.class)
public class InventoryCraftingMixin {

    @Shadow private ItemStack[] stackList;

    @Inject(method = "hasDamagedItem", at = @At(value = "FIELD", target = "Lnet/minecraft/InventoryCrafting;stackList:[Lnet/minecraft/ItemStack;", ordinal = 1), cancellable = true)
    private void hasDamagedDagger(CallbackInfoReturnable<Boolean> cir, @Local(name = "i") int i) {
        ItemStack item_stack = this.stackList[i];
        if (item_stack != null && item_stack.isItemDamaged() && item_stack.getItem() instanceof ItemDagger) {
            cir.setReturnValue(false);
        }
    }
}
