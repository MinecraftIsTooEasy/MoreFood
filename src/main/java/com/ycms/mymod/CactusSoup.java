package com.ycms.mymod;

import net.minecraft.CreativeTabs;
import net.minecraft.Item;
import net.minecraft.ItemFood;

public class CactusSoup extends ItemFood {
    public CactusSoup() {
        setUnlocalizedName("CactusSoup");
        setMaxStackSize(3);
        setCreativeTab(CreativeTabs.tabFood);

    }

    public static void registerItem(Item item, String name) {
    }

    public static final CactusSoup cactusSoup = new CactusSoup();
}

