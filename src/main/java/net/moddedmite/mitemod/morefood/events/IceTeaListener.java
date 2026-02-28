package net.moddedmite.mitemod.morefood.events;

import moddedmite.rustedironcore.api.event.listener.ILootTableRegisterListener;
import net.minecraft.Item;
import net.minecraft.ItemStack;
import net.minecraft.WeightedRandomChestContent;
import net.moddedmite.mitemod.morefood.item.MFItems;

import java.util.List;

public class IceTeaListener implements ILootTableRegisterListener {

    @Override
    public void onFortressRegister(List<WeightedRandomChestContent> original) {

            original.add(new WeightedRandomChestContent(
                    new ItemStack(MFItems.ice_tea, 1),
                    1,
                    1,
                    3
            ));

    }

    @Override
    public void onFishingRegister(List<WeightedRandomChestContent> original) {

            original.add(new WeightedRandomChestContent(
                    new ItemStack( MFItems.ice_tea, 1),
                    1,
                    1,
                    3
            ));

    }
}