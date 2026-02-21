package net.moddedmite.mitemod.morefood.item.food;

import com.google.common.collect.Multimap;
import net.minecraft.*;
import net.moddedmite.mitemod.morefood.item.MFMaterials;

public class ItemLollipop extends ItemFood {

    public ItemLollipop(int id, int satiation, int nutrition, int sugarContent, boolean hasProtein, boolean hasEssentialFats, boolean hasPhytonutrients, String textureName)
    {
        super(id, MFMaterials.lollipop, satiation, nutrition, sugarContent, hasProtein, hasEssentialFats, hasPhytonutrients, textureName);
        this.setMaxStackSize(16);
        this.setReachBonus(0.5F);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Multimap<String, AttributeModifier> getItemAttributeModifiers()
    {
        Multimap<String, AttributeModifier> map = super.getItemAttributeModifiers();
        map.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(),
                new AttributeModifier(Item.field_111210_e, "Lollipop attack bonus1", 1.5, 0));
        return map;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        boolean result = super.hitEntity(stack, target, attacker);

        if (attacker == null || attacker.worldObj == null) return result;

        if (!(attacker instanceof EntityPlayer) || !((EntityPlayer) attacker).capabilities.isCreativeMode)
        {
            if (attacker.worldObj.rand.nextFloat() < 0.02F)
            {
                stack.stackSize--;

                attacker.worldObj.playSoundAtEntity(attacker, "random.break", 0.8F, 0.8F + attacker.worldObj.rand.nextFloat() * 0.4F);
            }
        }

        return result;
    }
}