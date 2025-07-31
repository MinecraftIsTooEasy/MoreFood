package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;

public class ItemBucketApple extends ItemBucketMilk {
    public ItemBucketApple(int id, Material material) {
        super(id, material);
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setFoodValue(4, 4, false, false, false);
        this.setPlantProduct();
        this.setAlwaysEdible();
        this.setCraftingDifficultyAsComponent(100.0F);
    }

    public void onItemUseFinish(ItemStack item_stack, World world, EntityPlayer player) {
        if (player.onServer()) {
            player.getFoodStats().addFoodValue(this);
        }

        super.onItemUseFinish(item_stack, world, player);
    }

    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 32;
    }

    public static ItemVessel getPeer(Material vessel_material, Material contents) {
        return ItemBucket.getPeer(vessel_material, contents);
    }

    public ItemVessel getPeerForContents(Material contents) {
        return getPeer(this.getVesselMaterial(), contents);
    }

    public ItemVessel getPeerForVesselMaterial(Material vessel_material) {
        return getPeer(vessel_material, this.getContents());
    }

    public Item getItemProducedOnItemUseFinish() {
        return this.getContainerItem();
    }

    public float getCompostingValue() {
        return 0.0F;
    }
}
