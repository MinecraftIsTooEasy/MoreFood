package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.item.MFMaterials;

import java.util.List;

public class ItemStargazyPie extends ItemFood {

    public ItemStargazyPie(int id, int satiation, int nutrition, int sugarContent, boolean hasProtein, boolean hasEssentialFats, boolean hasPhytonutrients, String textureName)
    {
        super(id, MFMaterials.stargazy_pie,satiation, nutrition, sugarContent, hasProtein, hasEssentialFats, hasPhytonutrients, textureName);
        this.addMaterial(Material.bread);
        this.setPlantProduct();
        this.setAlwaysEdible();
    }

    @Override
    protected void onEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 1800, 0).setAmplifier(0));
        }
        super.onEaten(stack, worldIn, player);
    }
    @Override
    @SuppressWarnings("unchecked")
    public void addInformationBeforeEnchantments(ItemStack item_stack, EntityPlayer player, List info, boolean extended_info, Slot slot) {
        if (extended_info) {
            info.add(I18n.getString("item." + this.getIconString() + ".info"));
        }
    }

}