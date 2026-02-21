package net.moddedmite.mitemod.morefood.item.register;

import net.moddedmite.mitemod.morefood.MoreFoodInit;
import net.moddedmite.mitemod.morefood.item.MFItems;
import net.moddedmite.mitemod.morefood.creativetab.MFCreativeTab;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;

import static net.moddedmite.mitemod.morefood.MoreFoodInit.NameSpace;

public class ItemTextureRegister extends MFItems {

    public static void registerItems(ItemRegistryEvent event) {
        event.register(NameSpace, MoreFoodInit.resourceId + "food/horse_meat", "horse_meat", horse_meat, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/horse_meat_cooked", "horse_meat_cooked", horse_meat_cooked, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bowl_cactus_soup", "bowl_cactus_soup", bowl_cactus_soup, MFCreativeTab.TAB);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/porkchop_stew", "porkchop_stew", bowlPorkchopStew, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/lampchop_stew", "lampchop_stew", bowlLampchopStew, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bowl_fruit_salad", "bowl_fruit_salad", bowl_fruit_salad, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bowl_horsemeat_stew", "bowl_horsemeat_stew", bowlHorsemeatStew, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/fried_egg", "fried_egg", fried_egg, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bowl_melon_salad", "bowl_melon_salad", bowl_melon_salad, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bowl_carrot_soup", "bowl_carrot_soup", bowl_carrot_soup, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/carrot_cake", "carrot_cake", carrot_cake, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/prok_eggs", "prok_eggs", prok_eggs, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/chicken_sandwich", "chicken_sandwich", chicken_sandwich, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/cooked_bacon", "cooked_bacon", cooked_bacon, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bacon", "bacon", bacon, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/apple_pie", "apple_pie", apple_pie, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/blueberry_pie", "blueberry_pie", blueberry_pie, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/roastedseeds", "roastedseeds", roastedseeds, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/bowl_netherStalkSeeds_soup", "bowl_netherStalkSeeds_soup", bowl_netherStalkSeeds_soup, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/hamburger", "hamburger", hamburger, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/beef_nugget", "beef_nugget", beef_nugget, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/mutton_nugget", "mutton_nugget", mutton_nugget, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/chores", "chores", chores, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/jelly", "jelly", jelly, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/kebabs", "kebabs", kebabs, MFCreativeTab.TAB);
        event.register(NameSpace,MoreFoodInit.resourceId + "food/cooked_chicken_skewer", "cooked_chicken_skewer", cooked_chicken_skewer, MFCreativeTab.TAB);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/squid_meat", "squid_meat", squid_meat, MFCreativeTab.TAB);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/squid_meat_cooked", "squid_meat_cooked", squid_meat_cooked, MFCreativeTab.TAB);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/squid_sashimi", "squid_sashimi", squid_sashimi, MFCreativeTab.TAB);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/seafood_feast", "seafood_feast", seafood_feast, MFCreativeTab.TAB);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/squid_sashimi_cooked", "squid_sashimi_cooked", squid_sashimi_cooked, MFCreativeTab.TAB);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/bread_zip", "bread_zip", bread_zip, MFCreativeTab.TAB);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/baguette_item", "baguette", baguette, MFCreativeTab.TAB);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/dried_flesh", "dried_flesh", dried_flesh, MFCreativeTab.TAB);
        event.register(NameSpace, MoreFoodInit.resourceId + "food/lollipop", "lollipop", lollipop, MFCreativeTab.TAB);
    }
}