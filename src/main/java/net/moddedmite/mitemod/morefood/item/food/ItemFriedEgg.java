package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.creativetab.MFCreativeTab;

public class ItemFriedEgg extends ItemEgg {
    public ItemFriedEgg(int par1) {
        super(par1);
        this.setMaxStackSize(16);
        this.setCreativeTab(MFCreativeTab.TAB);
        this.setAnimalProduct();
        this.setCraftingDifficultyAsComponent(25.0F);

    }

    @Override
    public boolean onItemRightClick(EntityPlayer player, float partial_tick, boolean ctrl_is_down) {
        return false;
    }

    public float getCompostingValue() {
        return 1.0F;
    }
}
