package net.moddedmite.mitemod.morefood.events;

import moddedmite.rustedironcore.api.event.listener.ITickListener;
import net.minecraft.EntityPlayer;
import net.minecraft.ItemStack;
import net.moddedmite.mitemod.morefood.item.food.ItemBaguette;
import net.moddedmite.mitemod.morefood.api.IUseWarmup;

public class UseTickListener implements ITickListener {

    @Override
    public void onEntityPlayerTick(EntityPlayer player) {
        if (player == null || player.worldObj == null) return;

        ItemStack current = player.inventory.getCurrentItemStack();
        if (current == null) return;

        int max = current.getMaxItemUseDuration();
        int remaining = player.getItemInUseCount();
        int used = max - remaining;

        if (current.getItem() instanceof IUseWarmup) {
            ((IUseWarmup) current.getItem()).onUseTick(current, player.worldObj, player, used);
            return;
        }

        if (used < max - 11 && used % 4 == 0) {
            if (current.getItem() instanceof ItemBaguette) {
                ((ItemBaguette) current.getItem()).performUseEffects(player);
            }
        }
    }
}