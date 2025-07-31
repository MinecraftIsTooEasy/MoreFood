package net.moddedmite.mitemod.morefood.item;

import net.moddedmite.mitemod.morefood.item.food.ItemFriedEgg;
import net.minecraft.*;
import net.xiaoyu233.fml.reload.utils.IdUtil;

public class MFItems extends Item {
    public static final Item horse_meat = new ItemMeat(getNextItemID(), 6, 6, true, false, "horse_meat");
    public static final Item horse_meat_cooked = new ItemMeat(getNextItemID(), 12, 12, true, true, "horse_meat_cooked");
    public static final ItemBowl bowl_cactus_soup = (ItemBowl) (new ItemBowl(getNextItemID(), MFMaterials.cactus_soup, "bowl_cactus_soup")).setFoodValue(1, 1, false, false, true).setPlantProduct().setUnlocalizedName("cactus_soup");
    public static final ItemBowl bowlPorkchopStew = (ItemBowl) (new ItemBowl(getNextItemID(), MFMaterials.porkchop_stew, "porkchop_stew")).setFoodValue(14, 14, true, false, true).setPlantProduct().setAnimalProduct().setUnlocalizedName("porkchopStew");
    public static final ItemBowl bowlLampchopStew = (ItemBowl) (new ItemBowl(getNextItemID(), MFMaterials.lampchop_stew, "lampchop_stew")).setFoodValue(12, 12, true, false, true).setPlantProduct().setAnimalProduct().setUnlocalizedName("lampchopStew");
    public static final ItemBowl bowl_fruit_salad = (ItemBowl) (new ItemBowl(getNextItemID(), MFMaterials.fruit_salad, "bowl_fruit_salad")).setFoodValue(4, 4, 500, false, false, true).setPlantProduct().setUnlocalizedName("fruit_salad");
    public static final ItemBowl bowlHorsemeatStew = (ItemBowl) (new ItemBowl(getNextItemID(), MFMaterials.horsemeat_stew, "bowl_horsemeat_stew")).setFoodValue(16, 16, true, false, true).setPlantProduct().setAnimalProduct().setUnlocalizedName("bowl_horsemeat_stew");
    public static final Item fried_egg = new ItemFriedEgg(getNextItemID()).setFoodValue(2, 2, true, MITEConstant.egg_has_essential_fats, false).setAnimalProduct().setUnlocalizedName("fired_egg");
    public static final ItemBowl bowl_melon_salad = (ItemBowl) (new ItemBowl(getNextItemID(), MFMaterials.melon_salad,"bowl_melon_salad")).setFoodValue(3, 3, 4800, false, false, true).setPlantProduct().setUnlocalizedName("melon_salad");
    public static final ItemBowl bowl_carrot_soup = (ItemBowl) (new ItemBowl(getNextItemID(), MFMaterials.carrot_soup,"bowl_melon_salad")).setFoodValue(3, 3, false, false, true).setPlantProduct().setUnlocalizedName("melon_salad");
    public static final ItemFood carrot_cake = (ItemFood) (new ItemFood(getNextItemID(), MFMaterials.carrot_cake,6,6,500,false, false, true, "carrot_cake")).setMaxStackSize(8);
    public static final ItemFood prok_eggs = (ItemFood) (new ItemFood(getNextItemID(), MFMaterials.prok_eggs,8,8,true,false, false, "prok_eggs")).setAnimalProduct().setUnlocalizedName("prok_eggs").setMaxStackSize(16);
    public static final ItemFood chicken_sandwich = (ItemFood)(new ItemFood(getNextItemID(), MFMaterials.chicken_sandwich, 12, 12,true, false, true, "chicken_sandwich")).setAnimalProduct().setPlantProduct().setUnlocalizedName("chicken_sandwich").setMaxStackSize(16);
    public static final ItemFood cooked_bacon = new ItemMeat(getNextItemID(), 5, 5, false, true, "cooked_bacon");
    public static final ItemFood bacon = new ItemMeat(getNextItemID(), 3, 3, false, false, "bacon");
    public static final ItemFood apple_pie = (ItemFood) new ItemFood(getNextItemID(), MFMaterials.appleRed, 10, 6, 1000, false, false, true, "apple_pie").setPlantProduct().setMaxStackSize(8);
    public static final ItemFood blueberry_pie = (ItemFood) new ItemFood(getNextItemID(), MFMaterials.berry, 10, 6, 1000, false, false, true, "blueberry_pie").setPlantProduct().setMaxStackSize(8);
    public static final ItemFood roastedseeds = (ItemFood) new ItemFood(getNextItemID(), MFMaterials.seeds, 3, 1, false, false, false, "roastedseeds").setPlantProduct().setMaxStackSize(64);
    public static final ItemBowl bowl_netherStalkSeeds_soup = (ItemBowl) (new ItemBowl(getNextItemID(), MFMaterials.bowl_netherStalkSeeds_soup,"bowl_netherStalkSeeds_soup")).setFoodValue(3, 3, false, false, false).setUnlocalizedName("bowl_netherStalkSeeds_soup");
    public static final ItemFood hamburger = (ItemFood) (new ItemFood(getNextItemID(), MFMaterials.hamburger,16,16,true,false,true,"hamburger")).setMaxStackSize(16).setUnlocalizedName("hamburger");
    public static final Item beef_nugget = new ItemMeat(getNextItemID(), 2, 2, false, true, "beef_nugget");
    public static final Item mutton_nugget = new ItemMeat(getNextItemID(), 2, 2, false, true, "mutton_nugget");
    public static final ItemFood chores = new ItemFood(getNextItemID(), MFMaterials.chores, 12, 6, true, false, false, "chores");
    public static final ItemFood jelly = new ItemFood(getNextItemID(), MFMaterials.jelly, 4, 4, false, false, false, "jelly");
    public static final ItemFood kebabs = new ItemFood(getNextItemID(), MFMaterials.kebabs, 8, 8, true, false, false, "kebabs");
    public static final ItemFood cooked_chicken_skewer = new ItemFood(getNextItemID(), MFMaterials.kebabs, 8, 8, true, false, false,"kebabs");


    private static int getNextItemID() {
        return IdUtil.getNextItemID();
    }
}

//public static final ItemBucketApple bucketCopperApple = (ItemBucketApple) (new ItemBucketApple(getNextItemID(), Materials.apple_juice_bucket)).setContainerItem(Item.bucketCopperEmpty).setFoodValue(0,4,2000,false,false,true).setPlantProduct();
//public static final ItemBucketApple bucketSilverApple = (ItemBucketApple) (new ItemBucketApple(getNextItemID(), Materials.apple_juice_bucket)).setContainerItem(Item.bucketSilverEmpty);
//public static final ItemBucketApple bucketGoldApple = (ItemBucketApple) (new ItemBucketApple(getNextItemID(), Materials.apple_juice_bucket)).setContainerItem(Item.bucketGoldEmpty);
//public static final ItemBucketApple bucketIronApple = (ItemBucketApple) (new ItemBucketApple(getNextItemID(), Materials.apple_juice_bucket)).setContainerItem(Item.bucketIronEmpty);
//public static final ItemBucketApple bucketAncientMetalApple = (ItemBucketApple) (new ItemBucketApple(getNextItemID(), Materials.apple_juice_bucket)).setContainerItem(Item.bucketAncientMetalEmpty);
//public static final ItemBucketApple bucketMithrilApple = (ItemBucketApple) (new ItemBucketApple(getNextItemID(), Materials.apple_juice_bucket)).setContainerItem(Item.bucketMithrilEmpty);
//public static final ItemBucketApple bucketAdamantiumApple = (ItemBucketApple) (new ItemBucketApple(getNextItemID(), Materials.apple_juice_bucket)).setContainerItem(Item.bucketAdamantiumEmpty);

