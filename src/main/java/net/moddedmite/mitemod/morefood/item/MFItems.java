package net.moddedmite.mitemod.morefood.item;

import net.moddedmite.mitemod.morefood.item.food.*;
import net.minecraft.*;
import net.xiaoyu233.fml.reload.utils.IdUtil;

public class MFItems extends Item {

    public static final ItemMeat horse_meat = new ItemMeat(getItemId("horse_meat"), 6, 6, true, false, "horse_meat");
    public static final ItemMeat horse_meat_cooked = new ItemMeat(getItemId("horse_meat_cooked"), 12, 12, true, true, "horse_meat_cooked");
    public static final ItemBowl bowl_cactus_soup = (ItemBowl) (new ItemBowl(getItemId("bowl_cactus_soup"), MFMaterials.cactus_soup, "bowl_cactus_soup")).setFoodValue(1, 1, false, false, true).setPlantProduct().setUnlocalizedName("cactus_soup");
    public static final ItemBowl bowlPorkchopStew = (ItemBowl) (new ItemBowl(getItemId("bowlPorkchopStew"), MFMaterials.porkchop_stew, "porkchop_stew")).setFoodValue(14, 14, true, false, true).setPlantProduct().setAnimalProduct().setUnlocalizedName("porkchopStew");
    public static final ItemBowl bowlLampchopStew = (ItemBowl) (new ItemBowl(getItemId("bowlLampchopStew"), MFMaterials.lampchop_stew, "lampchop_stew")).setFoodValue(12, 12, true, false, true).setPlantProduct().setAnimalProduct().setUnlocalizedName("lampchopStew");
    public static final ItemBowl bowl_fruit_salad = (ItemBowl) (new ItemBowl(getItemId("bowl_fruit_salad"), MFMaterials.fruit_salad, "bowl_fruit_salad")).setFoodValue(4, 4, 500, false, false, true).setPlantProduct().setUnlocalizedName("fruit_salad");
    public static final ItemBowl bowlHorsemeatStew = (ItemBowl) (new ItemBowl(getItemId("bowlHorsemeatStew"), MFMaterials.horsemeat_stew, "bowl_horsemeat_stew")).setFoodValue(16, 16, true, false, true).setPlantProduct().setAnimalProduct().setUnlocalizedName("bowl_horsemeat_stew");
    public static final Item fried_egg = new ItemFriedEgg(getItemId("fried_egg")).setFoodValue(3, 2, true, MITEConstant.egg_has_essential_fats, false).setAnimalProduct().setUnlocalizedName("fired_egg");
    public static final ItemBowl bowl_melon_salad = (ItemBowl) (new ItemBowl(getItemId("bowl_melon_salad"), MFMaterials.melon_salad,"bowl_melon_salad")).setFoodValue(4, 4, 4800, false, false, true).setPlantProduct().setUnlocalizedName("melon_salad");
    public static final ItemBowl bowl_carrot_soup = (ItemBowl) (new ItemBowl(getItemId("bowl_carrot_soup"), MFMaterials.carrot_soup,"bowl_melon_salad")).setFoodValue(7, 7, false, false, true).setPlantProduct().setUnlocalizedName("melon_salad");
    public static final ItemFood carrot_cake = (ItemFood) (new ItemFood(getItemId("carrot_cake"), MFMaterials.carrot_cake,6,6,500,false, false, true, "carrot_cake")).setMaxStackSize(8);
    public static final ItemFood prok_eggs = (ItemFood) (new ItemFood(getItemId("prok_eggs"), MFMaterials.prok_eggs,8,8,true,false, false, "prok_eggs")).setAnimalProduct().setUnlocalizedName("prok_eggs").setMaxStackSize(16);
    public static final ItemFood chicken_sandwich = (ItemFood)(new ItemFood(getItemId("chicken_sandwich"), MFMaterials.chicken_sandwich, 13, 7,true, false, true, "chicken_sandwich")).setAnimalProduct().setPlantProduct().setUnlocalizedName("chicken_sandwich").setMaxStackSize(16);
    public static final ItemFood cooked_bacon = new ItemMeat(getItemId("cooked_bacon"), 4, 4, false, true, "cooked_bacon");
    public static final ItemFood bacon = new ItemMeat(getItemId("bacon"), 2, 2, false, false, "bacon");
    public static final ItemFood apple_pie = (ItemFood) new ItemFood(getItemId("apple_pie"), MFMaterials.appleRed, 10, 6, 1000, false, false, true, "apple_pie").setPlantProduct().setMaxStackSize(8);
    public static final ItemFood blueberry_pie = (ItemFood) new ItemFood(getItemId("blueberry_pie"), MFMaterials.berry, 10, 6, 1000, false, false, true, "blueberry_pie").setPlantProduct().setMaxStackSize(8);
    public static final ItemFood roastedseeds = (ItemFood) new ItemFood(getItemId("roastedseeds"), MFMaterials.seeds, 3, 0, false, false, false, "roastedseeds").setPlantProduct().setMaxStackSize(64);
    public static final ItemBowl bowl_netherStalkSeeds_soup = (ItemBowl) (new ItemBowl(getItemId("bowl_netherStalkSeeds_soup"), MFMaterials.bowl_netherStalkSeeds_soup,"bowl_netherStalkSeeds_soup")).setFoodValue(4, 4, false, false, true).setUnlocalizedName("bowl_netherStalkSeeds_soup");
    public static final ItemFood hamburger = (ItemFood) (new ItemFood(getItemId("hamburger"), MFMaterials.hamburger,16,10,true,false,true,"hamburger")).setMaxStackSize(16).setUnlocalizedName("hamburger");
    public static final Item beef_nugget = new ItemMeat(getItemId("beef_nugget"), 2, 2, false, true, "beef_nugget");
    public static final Item mutton_nugget = new ItemMeat(getItemId("mutton_nugget"), 2, 2, false, true, "mutton_nugget");
    public static final ItemFood chores = new ItemFood(getItemId("chores"), MFMaterials.chores, 12, 6, true, false, false, "chores");
    public static final ItemFood jelly = new ItemFood(getItemId("jelly"), MFMaterials.jelly, 4, 4, false, false, false, "jelly");
    public static final ItemFood kebabs = new ItemFood(getItemId("kebabs"), MFMaterials.kebabs, 8, 8, true, false, false, "kebabs");
    public static final ItemFood cooked_chicken_skewer = new ItemFood(getItemId("cooked_chicken_skewer"), MFMaterials.kebabs, 8, 8, true, false, false,"kebabs");
    public static final Item squid_sashimi = new ItemMeat(getItemId("squid_sashimi"), 4, 6, true, false, "squid_sashimi");
    public static final Item squid_sashimi_cooked = new ItemMeat(getItemId("squid_sashimi_cooked"), 8, 12, true, true, "squid_sashimi_cooked");
    public static final Item squid_meat = new ItemMeat(getItemId("squid_meat"), 3, 3, true, false, "squid_meat");
    public static final Item squid_meat_cooked = new ItemMeat(getItemId("squid_meat_cooked"), 6, 6, true, true, "squid_meat_cooked");
    public static final ItemBowl seafood_feast = (ItemBowl) (new ItemBowl(getItemId("seafood_feast"), MFMaterials.seafood_feast, "seafood_feast")).setFoodValue(20, 20, true, true, true).setPlantProduct().setAnimalProduct().setUnlocalizedName("porkchopStew").setMaxStackSize(4);
    public static final ItemFood bread_zip = (ItemFood) (new ItemBreadZip(getItemId("bread_zip"),72,18,0,false,false,false, "bread_zip")).setUnlocalizedName("bread_zip");
    public static final ItemFood baguette = (ItemFood) new ItemBaguette(getItemId("baguette")).setUnlocalizedName("baguette");
    public static final ItemFood dried_flesh = (ItemFood) (new ItemFood(getItemId("dried_flesh"), MFMaterials.dried_flesh, 6, 2, 250, true, false, false, "dried_flesh")).setAnimalProduct().setMaxStackSize(16);
    public static final ItemFood stuffed_potato = (ItemFood) (new ItemFood(getItemId("stuffed_potato"), MFMaterials.stuffed_potato, 15, 13, true, false, true, "stuffed_potato")).setUnlocalizedName("stuffed_potato");
    public static final ItemFood egg_sandwich = (ItemFood) (new ItemFood(getItemId("egg_sandwich"), MFMaterials.egg_sandwich, 16, 8, true, false, false, "egg_sandwich")).setUnlocalizedName("egg_sandwich");
    public static final ItemFood shepherds_pie = (ItemFood) (new ItemFood(getItemId("shepherds_pie"), MFMaterials.shepherds_pie, 10, 7, true, false, true, "shepherds_pie")).setUnlocalizedName("shepherds_pie");
    public static final ItemFood raw_pasta = (ItemFood) (new ItemFood(getItemId("raw_pasta"), MFMaterials.raw_pasta, 1, 2, false, false, false, "raw_pasta")).setUnlocalizedName("raw_pasta");
    public static final ItemFood raw_pasta_cooked = (ItemFood) (new ItemFood(getItemId("raw_pasta_cooked"), MFMaterials.raw_pasta_cooked, 3, 2, false, false, false, "raw_pasta_cooked")).setUnlocalizedName("raw_pasta_cooked");
    public static final ItemBowl squid_ink_pasta = (ItemBowl) (new ItemBowl(getItemId("squid_ink_pasta"), MFMaterials.seafood_feast, "squid_ink_pasta")).setFoodValue(13, 13, true, false, true).setPlantProduct().setAnimalProduct().setUnlocalizedName("porkchopStew").setMaxStackSize(4);
    public static final ItemFood lollipop = (ItemFood) new ItemLollipop(getItemId("lollipop"), 2, 6, 4000, false, false, false, "lollipop").setUnlocalizedName("lollipop");
    public static final ItemFood blaze_apple = (ItemFood) (new ItemBlazeApple(getItemId("blaze_apple"), 2, 1, 1000, false,false, false, "blaze_apple")).setPlantProduct().setMaxStackSize(16);
    public static final ItemFood ancient_metal_melon_slice = (ItemFood) (new ItemAncientMetalMelonSlice(getItemId("ancient_metal_melon_slice"), 2, 1, 1000, false,false, true, "ancient_metal_melon_slice")).setPlantProduct().setMaxStackSize(16);
    public static final ItemFood meat_jelly = (ItemFood) (new ItemFood(getItemId("meat_jelly"), MFMaterials.meat_jelly, 2, 2, true, false, false, "meat_jelly")).setMaxStackSize(16);
    public static final ItemFood donkey_burger = (ItemFood) (new ItemFood(getItemId("donkey_burger"), MFMaterials.donkey_burger, 20, 15, true,false, true, "donkey_burger")).setPlantProduct().setMaxStackSize(16);
    public static final ItemFood stargazy_pie = (ItemFood) (new ItemStargazyPie(getItemId("stargazy_pie"), 9, 9, 0, true, false, true, "stargazy_pie")).setUnlocalizedName("stargazy_pie");
    public static final ItemFood cooked_carrot = (ItemFood) (new ItemFood(getItemId("cooked_carrot"), MFMaterials.cooked_carrot, 3, 3, true, false, true, "cooked_carrot")).setUnlocalizedName("cooked_carrot");
    public static final ItemFood ice_tea = (ItemFood) (new ItemIceTea(getItemId("ice_tea"), 12, 8, 1000, false, false, false, "ice_tea")).setUnlocalizedName("ice_tea");
    public static final ItemFood bedrock_apple = (ItemFood) (new ItemBedrockApple(getItemId("bedrock_apple"), 2, 1, 1000, false,false, true, "bedrock_apple")).setPlantProduct().setMaxStackSize(16);

    private static int getItemId(String contentName) {
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

