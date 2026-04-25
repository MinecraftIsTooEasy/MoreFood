package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.item.MFMaterials;

import java.util.List;

public class ItemHumanoidFleshCooked extends ItemFood {

    public ItemHumanoidFleshCooked(int id, int satiation, int nutrition, int sugarContent, boolean hasProtein, boolean hasEssentialFats, boolean hasPhytonutrients, String textureName)
    {
        super(id, MFMaterials.humanoid_flesh,satiation, nutrition, sugarContent, hasProtein, hasEssentialFats, hasPhytonutrients, textureName);
        this.addMaterial(Material.meat);
        this.setAnimalProduct();
        this.setAlwaysEdible();
    }

    @Override
    protected void onEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 0).setAmplifier(0));;
            player.addPotionEffect(new PotionEffect(Potion.poison.id, 120, 0).setAmplifier(0));
        }
        super.onEaten(stack, worldIn, player);
    }
}
