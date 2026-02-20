package net.moddedmite.mitemod.morefood.item.food;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.creativetab.MFCreativeTab;
import net.moddedmite.mitemod.morefood.api.IUseWarmup;
import net.moddedmite.mitemod.morefood.item.MFMaterials;

public class ItemBaguette extends ItemFood implements IUseWarmup {

    public ItemBaguette(int id) {
        super(id, MFMaterials.baguette, 20, 10, false, false, false, "baguette");
        setCreativeTab(MFCreativeTab.TAB);
    }

//    @Override
//    protected void onEaten(ItemStack stack, World world, EntityPlayer player) {
//        super.onEaten(stack, world, player);
//
//        if (!world.isRemote)
//            player.getFoodStats().setSatiation(20, true);
//    }

    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 200;
    }

    @Override
    public int getItemUseWarmupDuration() {
        return 12;
    }

    @Override
    public void onUseTick(ItemStack stack, World world, EntityPlayer player, int used) {

        int max = stack.getMaxItemUseDuration();

        if (used < max - 11 && used % 4 == 0) {
            this.performUseEffects(player);
        }
    }

    public void performUseEffects(EntityPlayer player) {
        player.playSound("random.eat", 0.5F + 0.5F * (float)player.rand.nextInt(2), getPitchFromStack(player));

        if (player.worldObj.isRemote) {
            Minecraft mc = Minecraft.getMinecraft();

            for (int i = 0; i < 5; ++i) {
                Vec3 motion = player.worldObj.getWorldVec3Pool().getVecFromPool(((double)player.rand.nextFloat() - 0.5D) * 0.1D,
                        Math.random() * 0.1D + 0.1D, 0.0D);
                motion.rotateAroundX(-player.rotationPitch * (float)Math.PI / 180.0F);
                motion.rotateAroundY(-player.rotationYaw * (float)Math.PI / 180.0F);

                Vec3 pos = player.worldObj.getWorldVec3Pool().getVecFromPool(((double)player.rand.nextFloat() - 0.5D) * 0.3D,
                        (double)(-player.rand.nextFloat()) * 0.6D - 0.3D, 0.6D);
                pos.rotateAroundX(-player.rotationPitch * (float)Math.PI / 180.0F);
                pos.rotateAroundY(-player.rotationYaw * (float)Math.PI / 180.0F);
                pos = pos.addVector(player.posX, player.posY + (double)player.getEyeHeight(), player.posZ);

                EntityFX fx = new EntityBreakingFX(mc.theWorld, pos.xCoord, pos.yCoord, pos.zCoord, Item.bread);

                fx.motionX = motion.xCoord;
                fx.motionY = motion.yCoord + 0.05D;
                fx.motionZ = motion.zCoord;

                mc.effectRenderer.addEffect(fx);
            }
        }
    }

    protected float getPitchFromStack(EntityPlayer player) {
        return 0.5F + ((float) (getMaxItemUseDuration(null) - player.getItemInUseCount()) / getMaxItemUseDuration(null)) * 0.8F;
    }
}