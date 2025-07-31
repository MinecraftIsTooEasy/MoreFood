package net.moddedmite.mitemod.morefood.mixins.animal;

import net.moddedmite.mitemod.morefood.item.MFItems;
import net.minecraft.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value = EntityHorse.class, priority = 999)
public abstract class EntityHorseMixin extends EntityAnimal {
    public EntityHorseMixin(World par1World) {
        super(par1World);
    }

    @ModifyArg(method = "dropFewItems", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/EntityHorse;dropItem(II)Lnet/minecraft/EntityItem;", ordinal = 1), index = 0)
    private int horseMeat(int par1) {
        return this.isBurning() ? MFItems.horse_meat_cooked.itemID : MFItems.horse_meat.itemID;
    }
}
