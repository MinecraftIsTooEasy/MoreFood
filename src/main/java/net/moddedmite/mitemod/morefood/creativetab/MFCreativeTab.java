package net.moddedmite.mitemod.morefood.creativetab;

import huix.glacier.api.extension.creativetab.GlacierCreativeTabs;
import net.moddedmite.mitemod.morefood.item.MFItems;

public class MFCreativeTab extends GlacierCreativeTabs {

    public static final MFCreativeTab TAB = new MFCreativeTab();

    public MFCreativeTab() {
        super("MoreFood");
    }

    public int getTabIconItemIndex() {
        return MFItems.hamburger.itemID;
    }
}