//package com.github.Debris.HelloFML.mixins.recipe;
//
//
//import net.minecraft.*;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Overwrite;
//import org.spongepowered.asm.mixin.Shadow;
//
//@Mixin(RecipesWeapons.class)
//public class RecipesWeaponsMixin {
//    private static final Object[][] melee_weapons = new Object[0][];
//    private static final Object[][] arrows = new Object[0][];

//"rusted_iron_core": ">=1.3.1"
//implementation files('RustedIronCore-1.3.1.jar')
//    /**
//     * @author
//     */
//    @Overwrite
//    public void addRecipes(CraftingManager par1CraftingManager) {
//        par1CraftingManager.addRecipes(melee_weapons, -1);
//        par1CraftingManager.addRecipes(arrows, Skill.ARCHERY.id);
//        par1CraftingManager.addRecipe(new ItemStack(Item.bow, 1), new Object[]{" #X", "# X", " #X", 'X', Item.silk, '#', Item.stick}).setSkillset(Skill.ARCHERY.id);
//        par1CraftingManager.addRecipe(new ItemStack(Item.bowMithril, 1), new Object[]{" #X", "#IX", " #X", 'X', Item.silk, 'I', Item.ingotMithril, '#', Item.stick}).setSkillset(Skill.ARCHERY.id + Skill.BLACKSMITHING.id);
//        par1CraftingManager.addRecipe(new ItemStack(Item.bowAncientMetal, 1), new Object[]{" #X", "#IX", " #X", 'X', Item.silk, 'I', Item.ingotAncientMetal, '#', Item.stick}).setSkillset(Skill.ARCHERY.id + Skill.BLACKSMITHING.id);
//        par1CraftingManager.addRecipe(new ItemStack(Item.knifeFlint, 1), new Object[]{"Xs", "# ", 'X', Item.flint, '#', Item.stick, 's', Item.sinew}).setSkillset(Skill.MASONRY.id);
//        par1CraftingManager.addRecipe(new ItemStack(Item.knifeObsidian, 1), new Object[]{"Xs", "# ", 'X', Block.obsidian, '#', Item.stick, 's', Item.sinew}).setSkillset(Skill.MASONRY.id);
//        par1CraftingManager.addRecipe(new ItemStack(Item.cudgelWood, 1), new Object[]{"X", "#", 'X', Block.planks, '#', Item.stick}).setSkillset(Skill.CARPENTRY.id);
//        par1CraftingManager.addRecipe(new ItemStack(Item.bow, 1), new Object[]{" #X", "# X", " #X", 'X', Item.sinew, '#', Item.stick}).setSkillset(Skill.ARCHERY.id);
//
//    Object[][] newMeleeWeapons = new Object[melee_weapons.length][];
//        for (int i = 0; i < melee_weapons.length; i++) {
//        newMeleeWeapons[i] = melee_weapons[i].clone();
//        if (newMeleeWeapons[i][0] == null && newMeleeWeapons[i][1] instanceof Item && ((Item) newMeleeWeapons[i][1]).getRegistryName().getPath().startsWith("knife")) {
//            newMeleeWeapons[i] = new Object[]{"Xs", "# ", 'X', ((Item) newMeleeWeapons[i][1]).getRegistryName().getPath().substring(5), '#', Item.stick, 's', Item.sinew};
//        }
//    }
//
//        par1CraftingManager.addRecipes(newMeleeWeapons, -1);
//}
//
//
//
//}
