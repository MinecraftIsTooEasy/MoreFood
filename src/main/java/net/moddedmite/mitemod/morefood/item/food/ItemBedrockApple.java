package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.item.MFMaterials;

import java.util.List;

public class ItemBedrockApple extends ItemFood {

    public ItemBedrockApple(int id, int satiation, int nutrition, int sugarContent, boolean hasProtein, boolean hasEssentialFats, boolean hasPhytonutrients, String textureName)
    {
        super(id, MFMaterials.bedrock_apple, satiation, nutrition, sugarContent, hasProtein, hasEssentialFats, hasPhytonutrients, textureName);
        this.addMaterial(Material.gold);
        this.setPlantProduct();
        this.setAlwaysEdible();
    }

    @Override
    protected void onEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 2147483647, 0).setAmplifier(10));
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 2147483647, 0).setAmplifier(10));
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 2147483647, 0).setAmplifier(10));
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 2147483647, 0).setAmplifier(10));
            player.addPotionEffect(new PotionEffect(Potion.field_76443_y.id, 2147483647, 0).setAmplifier(10));
            player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 2147483647, 0).setAmplifier(10));
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
