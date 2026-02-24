package net.moddedmite.mitemod.morefood.item.tool;

import net.minecraft.*;

public class ItemKitchenKnife extends ItemKnife {
    public ItemKitchenKnife(int itemId, Material material) {
        super(itemId, material);

    }

    @Override
    public float getBaseDamageVsEntity() {
        return 1.25F;
    }

    @Override
    public float getBaseDecayRateForBreakingBlock(Block block) {
        return 1;
    }

    @Override
    public float getBaseDecayRateForAttackingEntity(ItemStack itemStack) {
        return 1;
    }

    @Override
    public String getToolType() {
        return "KitchenKnife";
    }

    @Override
    public int getNumComponentsForDurability() {
        return 2;
    }
}