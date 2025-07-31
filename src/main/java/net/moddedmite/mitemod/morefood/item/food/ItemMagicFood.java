package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;

public class ItemMagicFood extends ItemFood {

    public ItemMagicFood(int id, int satiation, int nutrition, String texture) {
        super(id, Material.fruit, satiation, nutrition,  true, false, true, texture);
        this.addMaterial(Material.gold);
        this.setPlantProduct();
    }

    @Override
    protected void onEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 600, 0).setAmplifier(0));
        }
        super.onEaten(stack, worldIn, player);
    }

}

