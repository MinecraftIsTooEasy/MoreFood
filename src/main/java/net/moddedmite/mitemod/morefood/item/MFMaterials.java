package net.moddedmite.mitemod.morefood.item;

import net.minecraft.*;

public class MFMaterials extends Material {
    public static final Material porkchop_stew;
    public static final Material cactus_soup;
    public static final Material lampchop_stew;
    public static final Material fruit_salad;
    public static Material horsemeat_stew;
    public static Material melon_salad;
    public static Material carrot_soup;
    public static Material carrot_cake;
    public static Material apple_juice_bucket;
    public static Material appleRed;
    public static Material prok_eggs;
    public static Material chicken_sandwich;
    public static Material berry;
    public static Material seeds;
    public static Material bowl_netherStalkSeeds_soup;
    public static Material grass_salad;
    public static Material hamburger;
    public static Material chores;
    public static Material jelly;
    public static Material kebabs;
    public static Material seafood_feast;
    public static Material squid_sashimi_cooked;
    public static Material bread_zip;
    public static Material baguette;
    public static Material dried_flesh;
    public static Material stuffed_potato;
    public static Material lollipop;
    public static Material blaze_apple;
    public static Material shepherds_pie;
    public static Material egg_sandwich;
    public static Material raw_pasta;
    public static Material raw_pasta_cooked;
    public static Material squid_ink_pasta;
    public static Material ancient_metal_melon_slice;
    public static Material meat_jelly;
    public static Material donkey_burger;
    public static Material stargazy_pie;
    public static Material cooked_carrot;
    public static Material ice_tea;
    public static Material bedrock_apple;


    public MFMaterials(EnumEquipmentMaterial enum_crafting_material) {
        super(enum_crafting_material);
    }

    static {
        porkchop_stew = (new MaterialFood("porkchop_stew")).setHarmedByPepsin();
        lampchop_stew = (new MaterialFood("chestnut_soup")).setHarmedByPepsin();
        cactus_soup = (new MaterialFood("cactus_stew")).setHarmedByPepsin();
        fruit_salad = (new MaterialFood("fruit_salad")).setHarmedByPepsin();
        horsemeat_stew = (new MaterialFood("horsemeat_stew")).setHarmedByPepsin();
        melon_salad = (new MaterialFood("melon_salad")).setHarmedByPepsin();
        carrot_soup = (new MaterialFood("carrot_soup")).setHarmedByPepsin();
        carrot_cake = (new MaterialFood("carrot_cake")).setHarmedByPepsin();
        apple_juice_bucket = new MaterialFood("apple_juice_bucket");
        prok_eggs = new MaterialFood("prok_eggs").setHarmedByPepsin();
        chicken_sandwich = new MaterialFood("chicken_sandwich").setHarmedByPepsin();
        berry = new MaterialFood("berry").setHarmedByPepsin();
        bowl_netherStalkSeeds_soup = new MaterialFood("bowl_netherStalkSeeds_soup").setHarmedByPepsin();
        grass_salad = new MaterialFood("grass_salad").setHarmedByPepsin();
        hamburger = new MaterialFood("grass_salad").setHarmedByPepsin();
        chores = new MaterialFood("chores").setHarmedByPepsin();
        jelly = new MaterialFood("jelly").setHarmedByPepsin();
        kebabs = new MaterialFood("kebabs").setHarmedByPepsin();
        seafood_feast = new MaterialFood("seafood_feast").setHarmedByPepsin();
        appleRed = new MaterialFood("appleRed").setHarmedByPepsin();
        squid_sashimi_cooked = new MaterialFood("squid_sashimi_cooked").setHarmedByPepsin();
        bread_zip = new MaterialFood("bread_zip").setHarmedByPepsin();
        baguette = new MaterialFood("baguette").setHarmedByPepsin();
        seeds = new MaterialFood("seeds").setHarmedByPepsin();
        dried_flesh = new MaterialFood("dried_flesh").setHarmedByPepsin();
        stuffed_potato = new MaterialFood("stuffed_potato").setHarmedByPepsin();
        shepherds_pie = new MaterialFood("shepherds_pie").setHarmedByPepsin();
        egg_sandwich = new MaterialFood("egg_sandwich").setHarmedByPepsin();
        raw_pasta = new MaterialFood("raw_pasta").setHarmedByPepsin();
        raw_pasta_cooked = new MaterialFood("raw_pasta_cooked").setHarmedByPepsin();
        squid_ink_pasta = new MaterialFood("squid_ink_pasta").setHarmedByPepsin();
        lollipop = new MaterialFood("lollipop").setHarmedByPepsin();
        blaze_apple = new MaterialFood("blaze_apple").setHarmedByPepsin();
        ancient_metal_melon_slice = new MaterialFood("ancient_metal_melon_slice").setHarmedByPepsin();
        meat_jelly = new MaterialFood("meat_jelly").setHarmedByPepsin();
        donkey_burger = new MaterialFood("donkey_burger").setHarmedByPepsin();
        stargazy_pie = new MaterialFood("stargazy_pie").setHarmedByPepsin();
        cooked_carrot = new MaterialFood("cooked_carrot").setHarmedByPepsin();
        ice_tea = new MaterialFood("ice_tea").setHarmedByPepsin();
        bedrock_apple = new MaterialFood("bedrock_apple").setHarmedByPepsin();
    }
}
