package net.moddedmite.mitemod.morefood.item.register;

import net.moddedmite.mitemod.morefood.item.MFItems;
import net.minecraft.*;
import net.xiaoyu233.fml.reload.event.RecipeRegistryEvent;

public class RecipeRegister extends MFItems {
    public static void registerRecipes(RecipeRegistryEvent register) {
        registerMiscRecipes(register);
    }

    private static void registerMiscRecipes(RecipeRegistryEvent register) {
        register.registerShapelessRecipe(new ItemStack(bowl_cactus_soup, 1), true, Block.cactus, Item.bowlWater);
        register.registerShapelessRecipe(new ItemStack(bowlLampchopStew, 1), true, Item.bowlWater, Item.potato, Item.onion, Item.lambchopCooked);
        register.registerShapelessRecipe(new ItemStack(bowlPorkchopStew, 1), true, bowlWater, Item.porkCooked, Item.carrot, Item.potato, Block.mushroomBrown);
        register.registerShapelessRecipe(new ItemStack(bowl_fruit_salad, 1), true, Item.appleRed, Item.bowlEmpty, Item.blueberries, Block.plantYellow);
        register.registerShapelessRecipe(new ItemStack(bowlHorsemeatStew, 1), true, MFItems.horse_meat_cooked, Item.bowlWater, Block.mushroomBrown, Item.onion);
        register.registerShapelessRecipe(new ItemStack(bowl_melon_salad, 1), true, Item.bowlEmpty, Item.melon, Item.melon, Item.melon);
        register.registerShapelessRecipe(new ItemStack(bowl_carrot_soup, 1), true, Item.bowlEmpty, Item.carrot, Item.carrot, Item.carrot);
        register.registerShapelessRecipe(new ItemStack(carrot_cake, 1), true, Item.carrot, Item.flour, Item.egg, Item.sugar);
        register.registerShapelessRecipe(new ItemStack(prok_eggs, 2), true, Item.porkCooked, MFItems.fried_egg, MFItems.fried_egg);
        register.registerShapelessRecipe(new ItemStack(prok_eggs, 1), true, MFItems.cooked_bacon, MFItems.fried_egg);
        register.registerShapelessRecipe(new ItemStack(chicken_sandwich, 1), true, Item.chickenCooked, Item.carrot, Item.bread, Item.bread);
        register.registerShapelessRecipe(new ItemStack(apple_pie, 1), true, Item.appleRed, Item.sugar, Item.flour, Item.egg);
        register.registerShapelessRecipe(new ItemStack(blueberry_pie, 1), true, Item.blueberries, Item.sugar, Item.flour, Item.egg);
        register.registerShapelessRecipe(new ItemStack(bowl_netherStalkSeeds_soup, 1), true, Item.bowlWater, new ItemStack(netherStalkSeeds, 3));
        register.registerShapelessRecipe(new ItemStack(hamburger, 1), true, Item.bread, Item.bread, Item.onion, Item.beefCooked, MFItems.cooked_bacon, Item.carrot);
        register.registerShapelessRecipe(new ItemStack(dried_flesh, 1), true,Item.sugar, new ItemStack(rottenFlesh, 4) );

        register.registerShapelessRecipe(new ItemStack(seafood_feast, 1), true, Item.bowlEmpty, MFItems.squid_meat,MFItems.squid_meat,MFItems.squid_meat, MFItems.squid_sashimi, Item.fishRaw, Item.onion,Item.egg);


//        register.registerShapelessRecipe(new ItemStack(bacon, 2), true, Item.porkRaw,Item.knifeFlint);
//        register.registerShapelessRecipe(new ItemStack(beef_nugget,4),true,Item.beefCooked,Item.knifeFlint);
//        register.registerShapelessRecipe(new ItemStack(mutton_nugget,3),true,Item.lambchopCooked,Item.knifeFlint);
//        register.registerShapelessRecipe(new ItemStack(bacon, 2), true,Item.knifeFlint, Item.porkRaw);
//        register.registerShapelessRecipe(new ItemStack(beef_nugget,4),true,Item.knifeFlint,Item.beefCooked);
//        register.registerShapelessRecipe(new ItemStack(mutton_nugget,3),true,Item.knifeFlint,Item.lambchopCooked);
        register.registerShapelessRecipe(new ItemStack(chores, 1), true, MFItems.beef_nugget, MFItems.mutton_nugget, MFItems.roastedseeds, new ItemStack(Item.dyePowder, 1, 15));
        register.registerShapelessRecipe(new ItemStack(jelly, 1), true, new ItemStack(Item.slimeBall, 4));
        register.registerShapedRecipe(new ItemStack(kebabs, 1), true, " A ", " B ", " C ", 'A', Item.lambchopCooked, 'B', Block.mushroomBrown, 'C', Item.stick);
        register.registerShapedRecipe(new ItemStack(bread_zip, 1), true, "aaa", "aaa", "aaa", 'a', Item.bread);
        register.registerShapedRecipe(new ItemStack(lollipop, 1), true, " aa", " aa", "b  ", 'a', Item.sugar, 'b', Item.stick);

        register.registerShapedRecipe(new ItemStack(cooked_chicken_skewer, 1), true, " A ", " B ", " C ", 'A', Item.chickenCooked, 'B', Block.mushroomBrown, 'C', Item.stick);

        for (Item item : Item.itemsList) {
            if (item instanceof ItemDagger dagger) {
                register.registerShapelessRecipe(new ItemStack(bacon, 2), true, dagger, Item.porkRaw);
                register.registerShapelessRecipe(new ItemStack(beef_nugget, 4), true, dagger, Item.beefCooked);
                register.registerShapelessRecipe(new ItemStack(mutton_nugget, 3), true, dagger, Item.lambchopCooked);
            }
        }
    }

}
