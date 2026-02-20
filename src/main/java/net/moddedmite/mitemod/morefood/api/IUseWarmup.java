package net.moddedmite.mitemod.morefood.api;

import net.minecraft.EntityPlayer;
import net.minecraft.ItemStack;
import net.minecraft.World;

public interface IUseWarmup {

    int getItemUseWarmupDuration();

    void onUseTick(ItemStack stack, World world, EntityPlayer player, int used);
}