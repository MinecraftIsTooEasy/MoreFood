package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.item.MFMaterials;

import java.util.List;

public class ItemHumanoidFlesh extends ItemFood {

    public ItemHumanoidFlesh(int id, int satiation, int nutrition, int sugarContent, boolean hasProtein, boolean hasEssentialFats, boolean hasPhytonutrients, String textureName)
    {
        super(id, MFMaterials.humanoid_flesh,satiation, nutrition, sugarContent, hasProtein, hasEssentialFats, hasPhytonutrients, textureName);
        this.addMaterial(Material.meat);
        this.setAnimalProduct();
        this.setAlwaysEdible();
    }

    @Override
    protected void onEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.weakness.id, 1200, 0).setAmplifier(0));
            player.addPotionEffect(new PotionEffect(Potion.blindness.id, 1200, 0).setAmplifier(0));
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 2400, 0).setAmplifier(0));
            player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 1200, 0).setAmplifier(0));
            player.addPotionEffect(new PotionEffect(Potion.poison.id, 540, 0).setAmplifier(0));
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
