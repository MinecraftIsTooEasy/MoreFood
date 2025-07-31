package net.moddedmite.mitemod.morefood.item.register;

import net.moddedmite.mitemod.morefood.item.MFItems;
import net.minecraft.CreativeTabs;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;

import static net.moddedmite.mitemod.morefood.MoreFoodInit.NameSpace;

public class ItemTextureRegister extends MFItems {

    public static void registerItems(ItemRegistryEvent event) {
        event.register(NameSpace,"food/horse_meat", horse_meat, CreativeTabs.tabFood);
        event.register(NameSpace,"food/horse_meat_cooked", horse_meat_cooked, CreativeTabs.tabFood);
        event.register(NameSpace,"food/bowl_cactus_soup", bowl_cactus_soup, CreativeTabs.tabFood);
        event.register(NameSpace, "food/porkchop_stew", bowlPorkchopStew, CreativeTabs.tabFood);
        event.register(NameSpace,"food/lampchop_stew", bowlLampchopStew, CreativeTabs.tabFood);
        event.register(NameSpace,"food/bowl_fruit_salad", bowl_fruit_salad, CreativeTabs.tabFood);
        event.register(NameSpace,"food/bowl_horsemeat_stew", bowlHorsemeatStew, CreativeTabs.tabFood);
        event.register(NameSpace,"food/fried_egg", fried_egg, CreativeTabs.tabFood);
        event.register(NameSpace,"food/bowl_melon_salad", bowl_melon_salad, CreativeTabs.tabFood);
        event.register(NameSpace,"food/bowl_carrot_soup", bowl_carrot_soup, CreativeTabs.tabFood);
        event.register(NameSpace,"food/carrot_cake", carrot_cake, CreativeTabs.tabFood);
        event.register(NameSpace,"food/prok_eggs", prok_eggs, CreativeTabs.tabFood);
        event.register(NameSpace,"food/chicken_sandwich", chicken_sandwich, CreativeTabs.tabFood);
        event.register(NameSpace,"food/cooked_bacon", cooked_bacon, CreativeTabs.tabFood);
        event.register(NameSpace,"food/bacon", bacon, CreativeTabs.tabFood);
        event.register(NameSpace,"food/apple_pie", apple_pie, CreativeTabs.tabFood);
        event.register(NameSpace,"food/blueberry_pie", blueberry_pie, CreativeTabs.tabFood);
        event.register(NameSpace,"food/roastedseeds", roastedseeds, CreativeTabs.tabFood);
        event.register(NameSpace,"food/bowl_netherStalkSeeds_soup", bowl_netherStalkSeeds_soup, CreativeTabs.tabFood);
        event.register(NameSpace,"food/hamburger", hamburger, CreativeTabs.tabFood);
        event.register(NameSpace,"food/beef_nugget", beef_nugget, CreativeTabs.tabFood);
        event.register(NameSpace,"food/mutton_nugget", mutton_nugget, CreativeTabs.tabFood);
        event.register(NameSpace,"food/chores", chores, CreativeTabs.tabFood);
        event.register(NameSpace,"food/jelly", jelly, CreativeTabs.tabFood);
        event.register(NameSpace,"food/kebabs", kebabs, CreativeTabs.tabFood);
        event.register(NameSpace,"food/cooked_chicken_skewer", cooked_chicken_skewer, CreativeTabs.tabFood);
    }
}