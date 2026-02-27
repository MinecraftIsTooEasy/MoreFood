package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.item.MFMaterials;
import net.moddedmite.mitemod.morefood.client.MFSounds;

import java.util.List;

public class ItemIceTea extends ItemFood {

    public ItemIceTea(int id, int satiation, int nutrition, int sugarContent, boolean hasProtein, boolean hasEssentialFats, boolean hasPhytonutrients, String textureName)
    {
        super(id, MFMaterials.ice_tea,satiation, nutrition, sugarContent, hasProtein, hasEssentialFats, hasPhytonutrients, textureName);
        this.addMaterial(Material.bread);
        this.setPlantProduct();
        this.setAlwaysEdible();
    }

    @Override
    protected void onEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.field_76443_y.id, 2400, 0).setAmplifier(0));
        }

        super.onEaten(stack, worldIn, player);
    }

    @Override
    public EnumItemInUseAction getItemInUseAction(ItemStack item_stack, EntityPlayer player) {
        return EnumItemInUseAction.DRINK;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformationBeforeEnchantments(ItemStack item_stack, EntityPlayer player, List info, boolean extended_info, Slot slot) {
        if (extended_info) {
            info.add(I18n.getString("item." + this.getIconString() + ".info"));
        }
    }

    @Override
    public void onItemUseFinish(ItemStack item_stack, World world, EntityPlayer player) {
        if (player.onServer()) {
            player.addFoodValue(this);
            world.playSoundAtEntity(player, MFSounds.iceTea.toString(), 0.5f, player.rand.nextFloat() * 0.1f + 0.9f);
            this.onEaten(item_stack, world, player);
        }

        super.onItemUseFinish(item_stack, world, player);
    }

}