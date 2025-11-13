package net.moddedmite.mitemod.morefood.item.register;

import net.moddedmite.mitemod.morefood.MoreFoodInit;
import net.moddedmite.mitemod.morefood.item.MFItems;
import net.minecraft.CreativeTabs;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;

import static net.moddedmite.mitemod.morefood.MoreFoodInit.NameSpace;

public class ItemTextureRegister extends MFItems {

    public static void registerItems(ItemRegistryEvent event) {
        event.register(NameSpace, MoreFoodInit.resourceId + "food/horse_meat", "horse_meat", horse_meat, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/horse_meat_cooked", "horse_meat_cooked", horse_meat_cooked, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bowl_cactus_soup", "bowl_cactus_soup", bowl_cactus_soup, CreativeTabs.tabFood);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/porkchop_stew", "porkchop_stew", bowlPorkchopStew, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/lampchop_stew", "lampchop_stew", bowlLampchopStew, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bowl_fruit_salad", "bowl_fruit_salad", bowl_fruit_salad, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bowl_horsemeat_stew", "bowl_horsemeat_stew", bowlHorsemeatStew, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/fried_egg", "fried_egg", fried_egg, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bowl_melon_salad", "bowl_melon_salad", bowl_melon_salad, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bowl_carrot_soup", "bowl_carrot_soup", bowl_carrot_soup, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/carrot_cake", "carrot_cake", carrot_cake, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/prok_eggs", "prok_eggs", prok_eggs, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/chicken_sandwich", "chicken_sandwich", chicken_sandwich, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/cooked_bacon", "cooked_bacon", cooked_bacon, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bacon", "bacon", bacon, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/apple_pie", "apple_pie", apple_pie, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/blueberry_pie", "blueberry_pie", blueberry_pie, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/roastedseeds", "roastedseeds", roastedseeds, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bowl_netherStalkSeeds_soup", "bowl_netherStalkSeeds_soup", bowl_netherStalkSeeds_soup, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/hamburger", "hamburger", hamburger, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/beef_nugget", "beef_nugget", beef_nugget, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/mutton_nugget", "mutton_nugget", mutton_nugget, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/chores", "chores", chores, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/jelly", "jelly", jelly, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/kebabs", "kebabs", kebabs, CreativeTabs.tabFood);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/cooked_chicken_skewer", "cooked_chicken_skewer", cooked_chicken_skewer, CreativeTabs.tabFood);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/squid_meat", "squid_meat", squid_meat, CreativeTabs.tabFood);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/squid_meat_cooked", "squid_meat_cooked", squid_meat_cooked, CreativeTabs.tabFood);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/squid_sashimi", "squid_sashimi", squid_sashimi, CreativeTabs.tabFood);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/seafood_feast", "seafood_feast", seafood_feast, CreativeTabs.tabFood);

    }
}