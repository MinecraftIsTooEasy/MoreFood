package net.moddedmite.mitemod.morefood.item.register;

import net.moddedmite.mitemod.morefood.item.MFItems;
import net.minecraft.*;


public class FurnaceRecipesExtend extends MFItems {

    public static void registerFurnaceRecipes() {
        FurnaceRecipes.smelting().addSmelting(horse_meat.itemID, new ItemStack(horse_meat_cooked));
        FurnaceRecipes.smelting().addSmelting(egg.itemID,new ItemStack(fried_egg));
        FurnaceRecipes.smelting().addSmelting(bacon.itemID, new ItemStack(cooked_bacon));
        FurnaceRecipes.smelting().addSmelting(Item.seeds.itemID, new ItemStack(roastedseeds.itemID));
        FurnaceRecipes.smelting().addSmelting(squid_meat.itemID, new ItemStack(squid_meat_cooked.itemID));
        ItemFood.setCookingResult((ItemFood) horse_meat, (ItemFood) horse_meat_cooked, 6);
        ItemFood.setCookingResult((ItemFood) bacon, (ItemFood) cooked_bacon, 6 );
        ItemFood.setCookingResult((ItemFood) seeds, (ItemFood) roastedseeds, 2);
        ItemFood.setCookingResult((ItemFood) squid_meat, (ItemFood) squid_meat_cooked, 5);
    }
}
