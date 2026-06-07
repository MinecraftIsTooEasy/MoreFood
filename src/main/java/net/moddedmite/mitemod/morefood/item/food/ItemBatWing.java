package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.item.MFMaterials;

import java.util.List;

public class ItemBatWing extends ItemFood {



    public ItemBatWing(int id, int satiation, int nutrition, int sugarContent, boolean hasProtein, boolean hasEssentialFats, boolean hasPhytonutrients, String textureName)
    {
        super(id, MFMaterials.bat_wing,satiation, nutrition, sugarContent, hasProtein, hasEssentialFats, hasPhytonutrients, textureName);
        this.addMaterial(Material.meat);
        this.setAnimalProduct();
    }

    @Override
    protected void onEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote && worldIn.rand.nextFloat() < 0.25F) {
            player.addPotionEffect(new PotionEffect(Potion.hunger.id, 400, 0).setAmplifier(0));
        }
        if (!worldIn.isRemote && worldIn.rand.nextFloat() < 0.1F) {
            player.addPotionEffect(new PotionEffect(Potion.poison.id, 300, 0).setAmplifier(0));
        }
        super.onEaten(stack, worldIn, player);
    }
}
