package net.moddedmite.mitemod.morefood.mixins.animal;

import net.minecraft.DamageSource;
import net.minecraft.EntityWaterMob; // 鱿鱼的直接父类是水生生物类
import net.minecraft.EntitySquid;
import net.minecraft.World;
import net.moddedmite.mitemod.morefood.item.MFItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntitySquid.class)
public abstract class EntitySquidMixin extends EntityWaterMob {

    public EntitySquidMixin(World par1World) {
        super(par1World);
    }

    @Inject(method = "dropFewItems", at = @At("RETURN"))
    private void dropSquidItems(boolean recently_hit_by_player, DamageSource damage_source, CallbackInfo ci) {
        if (this.rand.nextDouble() < 0.4) {
            dropItem(MFItems.squid_sashimi.itemID, 1);
        }
        int boneCount = this.rand.nextInt(2);
        for (int i = 0; i < boneCount; i++) {
            dropItem(MFItems.squid_meat.itemID, 1);
        }
    }
}