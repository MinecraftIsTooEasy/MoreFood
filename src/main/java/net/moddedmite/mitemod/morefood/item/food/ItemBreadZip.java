package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.item.MFMaterials;

public class ItemBreadZip extends ItemFood {

    public ItemBreadZip(int id, int satiation, int nutrition, int sugarContent, boolean hasProtein, boolean hasEssentialFats, boolean hasPhytonutrients, String textureName)
    {
        super(id, MFMaterials.bread_zip, satiation, nutrition, sugarContent, hasProtein, hasEssentialFats, hasPhytonutrients, textureName);
        this.addMaterial(Material.bread);
        this.setPlantProduct();
    }

    @Override
    protected void onEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.field_76443_y.id, 1200, 0).setAmplifier(0));
        }
        super.onEaten(stack, worldIn, player);
    }

}