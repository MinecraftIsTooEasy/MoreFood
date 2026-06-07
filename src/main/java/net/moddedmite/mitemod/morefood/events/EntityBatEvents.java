package net.moddedmite.mitemod.morefood.events;

import moddedmite.rustedironcore.api.event.Handlers;
import moddedmite.rustedironcore.api.event.listener.IEntityEventListener;
import net.minecraft.DamageSource;
import net.minecraft.EntityBat;
import net.minecraft.EntityLivingBase;
import net.minecraft.EntityPlayer;
import net.moddedmite.mitemod.morefood.item.MFItems;

public class EntityBatEvents {
    public static void init() {
        Handlers.EntityEvent.register(new IEntityEventListener() {
            @Override
            public void onDeath(EntityLivingBase entity, DamageSource damageSource) {

                String entityName = entity.getEntityName();
                String deathReason = damageSource.damageType;
                System.out.println(entityName + " died due to " + deathReason);

                if (entity instanceof EntityBat && !entity.worldObj.isRemote && damageSource.getResponsibleEntity() instanceof EntityPlayer)  {
                    entity.dropItem(MFItems.bat_wing.itemID, entity.worldObj.rand.nextInt(2) + 1);
                }

            }
        });

    }
}