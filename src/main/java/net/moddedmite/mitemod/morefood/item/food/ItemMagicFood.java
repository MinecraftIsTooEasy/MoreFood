package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.item.MFMaterials;

public class ItemMagicFood extends ItemFood {

    public ItemMagicFood(int id, int satiation, int nutrition, int sugarContent, boolean hasProtein, boolean hasEssentialFats, boolean hasPhytonutrients, String textureName)
    {
        super(id, MFMaterials.blaze_apple, satiation, nutrition, sugarContent, hasProtein, hasEssentialFats, hasPhytonutrients, textureName);
        this.addMaterial(Material.gold);
        this.setPlantProduct();
        this.setAlwaysEdible();
    }

    @Override
    protected void onEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1200, 0).setAmplifier(0));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 1200, 0).setAmplifier(0));
        }
        super.onEaten(stack, worldIn, player);
    }

}

