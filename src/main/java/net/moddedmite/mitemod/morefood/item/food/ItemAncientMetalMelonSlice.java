package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.item.MFMaterials;

import java.util.List;

public class ItemAncientMetalMelonSlice extends ItemFood {

    public ItemAncientMetalMelonSlice(int id, int satiation, int nutrition, int sugarContent, boolean hasProtein, boolean hasEssentialFats, boolean hasPhytonutrients, String textureName)
    {
        super(id, MFMaterials.ancient_metal_melon_slice, satiation, nutrition, sugarContent, hasProtein, hasEssentialFats, hasPhytonutrients, textureName);
        this.addMaterial(Material.ancient_metal);
        this.setPlantProduct();
        this.setAlwaysEdible();
    }

    @Override
    protected void onEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 9600, 0).setAmplifier(1));
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

