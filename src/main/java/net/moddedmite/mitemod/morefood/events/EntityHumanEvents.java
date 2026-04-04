package net.moddedmite.mitemod.morefood.events;

import moddedmite.rustedironcore.api.event.Handlers;
import moddedmite.rustedironcore.api.event.listener.IEntityEventListener;
import net.minecraft.DamageSource;
import net.minecraft.EntityLivingBase;
import net.minecraft.EntityVillager;
import net.minecraft.ServerPlayer;
import net.moddedmite.mitemod.morefood.item.MFItems;

public class EntityHumanEvents {
    public static void init() {
        Handlers.EntityEvent.register(new IEntityEventListener() {
            @Override
            public void onDeath(EntityLivingBase entity, DamageSource damageSource) {

                String entityName = entity.getEntityName();
                String deathReason = damageSource.damageType;
                System.out.println(entityName + " died due to " + deathReason);

                if (entity instanceof EntityVillager && !entity.worldObj.isRemote)  {
                    entity.dropItem(MFItems.humanoid_flesh.itemID, 1);
                }

            }
            @Override
            public void onServerPlayerDeath(ServerPlayer player, DamageSource damageSource) {
                System.out.println("Server player " + player.getEntityName() + " died from " + damageSource.getDamageType());
                if (!player.worldObj.isRemote) {
                    player.dropItem(MFItems.humanoid_flesh.itemID, 1);
                }
            }
        });

    }
}