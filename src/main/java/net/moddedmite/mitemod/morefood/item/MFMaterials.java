package net.moddedmite.mitemod.morefood.item;

import net.minecraft.EnumEquipmentMaterial;
import net.minecraft.Material;
import net.minecraft.MaterialFood;

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
    }
}
