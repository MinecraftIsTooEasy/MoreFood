package net.moddedmite.mitemod.morefood.compat;

import net.moddedmite.mitemod.morefood.item.MFItems;
import net.moddedmite.mitemod.morefood.item.MFMaterials;
import net.oilcake.mitelros.api.ITFPlugin;
import net.oilcake.mitelros.api.ITFRegistry;

public class MFITFPlugin implements ITFPlugin {

    @Override
    public void register(ITFRegistry registry) {

        registry.registerMaterialWater(MFMaterials.cactus_soup, 2);
        registry.registerMaterialWater(MFMaterials.porkchop_stew, 4);
        registry.registerMaterialWater(MFMaterials.lampchop_stew, 4);
        registry.registerMaterialWater(MFMaterials.horsemeat_stew, 4);
        registry.registerMaterialWater(MFMaterials.fruit_salad, 4);
        registry.registerMaterialWater(MFMaterials.melon_salad, 4);
        registry.registerMaterialWater(MFMaterials.carrot_soup, 4);
        registry.registerMaterialWater(MFMaterials.seeds, -1);
        registry.registerMaterialWater(MFMaterials.bowl_netherStalkSeeds_soup, 2);
        registry.registerMaterialWater(MFMaterials.chores, -1);
        registry.registerMaterialWater(MFMaterials.jelly, 1);
        registry.registerItemWater(MFItems.squid_sashimi, 1);
        registry.registerItemWater(MFItems.squid_meat, 1);
        registry.registerMaterialWater(MFMaterials.seafood_feast, 8);
        registry.registerMaterialWater(MFMaterials.bread_zip, -9);
        registry.registerMaterialWater(MFMaterials.baguette, -3);
        registry.registerMaterialWater(MFMaterials.dried_flesh, -1);
        registry.registerMaterialWater(MFMaterials.lollipop, -1);
    }
}