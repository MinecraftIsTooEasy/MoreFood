package net.moddedmite.mitemod.morefood.events;

import moddedmite.rustedironcore.api.event.Handlers;
import moddedmite.rustedironcore.api.event.listener.IEntityEventListener;
import net.minecraft.*;
import net.moddedmite.mitemod.morefood.item.MFItems;

public class EntityWolfEvents {
    public static void init() {
        Handlers.EntityEvent.register(new IEntityEventListener() {
            @Override
            public void onDeath(EntityLivingBase entity, DamageSource damageSource) {

                String entityName = entity.getEntityName();
                String deathReason = damageSource.damageType;
                System.out.println(entityName + " died due to " + deathReason);

                if (entity instanceof EntityWolf && !entity.worldObj.isRemote && damageSource.getResponsibleEntity() instanceof EntityPlayer) {
                    EntityWolf wolf = (EntityWolf) entity;
                    if (!wolf.isChild()) {
                        entity.dropItem(MFItems.wolf_meat.itemID, entity.worldObj.rand.nextInt(3) + 1);
                    }
                }

            }
        });
    }
}