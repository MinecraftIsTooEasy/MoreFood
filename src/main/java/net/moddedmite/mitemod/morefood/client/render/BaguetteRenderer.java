package net.moddedmite.mitemod.morefood.client.render;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.api.IUseWarmup;
import net.moddedmite.mitemod.morefood.item.food.ItemBaguette;
import org.lwjgl.opengl.GL11;

public class BaguetteRenderer {
    public static void renderBaguetteFirstPerson(ItemRenderer renderer, float tickDelta, float equipTime, ItemStack stack, EntityPlayer player) {
        GL11.glPushMatrix();

        float var20 = 0.8F;
        if (player.getItemInUseCount() > 0) {

            Item item = stack.getItem();

            float var23 = (float)player.getItemInUseCount() - tickDelta + 1.0F;
            if (item instanceof ItemBaguette) {
                stack.getMaxItemUseDuration();
                    float var14;
                    float var15;

                    // Determine warmup: prefer IUseWarmupProvider if the item implements it, otherwise default to 12
                    int warmup;
                    warmup = ((IUseWarmup) item).getItemUseWarmupDuration();

                    GL11.glTranslatef(0.0F, MathHelper.abs(MathHelper.cos(var23 / 8.0F * (float)Math.PI) * 0.02F) * (stack.getMaxItemUseDuration() - player.getItemInUseCount() >= warmup ? 1.0F : 0.0F), 0.0F);
                    int iItemInUseCount = MathHelper.clamp_int(32 - (stack.getMaxItemUseDuration() - player.getItemInUseCount()), 0, 32);
                    float itemUseInterpolation =
                            (Math.max(0, stack.getMaxItemUseDuration() - var23 - 12) / stack.getMaxItemUseDuration());
                    var23 = (float)iItemInUseCount - tickDelta + 1.0F;
                    var14 = var23 / 32.0F;
                    var14 = var14 * var14 * var14;
                    var14 = var14 * var14 * var14;
                    var14 = var14 * var14 * var14;
                    var15 = 1.0F - var14;
                    GL11.glTranslatef(var15 * .45F, .2F, 12.5F * itemUseInterpolation);
                    GL11.glRotatef(var15 * 111.75F, 0.0F, 1.0F, 0.0F);
                    GL11.glRotatef(-var15 * 90.0F, 0.0F, 0.0F, 1.0F);
                    GL11.glRotatef(var15 * 2F, 1.0F, 0.0F, 0.0F);

            } else {
                // eat/drink behavior
                float var13 = 1.0F - var23 / (float)stack.getMaxItemUseDuration();
                float var14 = 1.0F - var13;
                var14 = var14 * var14 * var14;
                var14 = var14 * var14 * var14;
                var14 = var14 * var14 * var14;
                float var15 = 1.0F - var14;
                GL11.glTranslatef(0.0F, MathHelper.abs(MathHelper.cos(var23 / 4.0F * (float)Math.PI) * 0.1F) * (float)((double)var13 > 0.2 ? 1 : 0), 0.0F);
                GL11.glTranslatef(var15 * 0.8F, -var15 * 0.8F, 0.0F);
                GL11.glRotatef(var15 * 90.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(var15 * 10.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(var15 * 30.0F, 0.0F, 0.0F, 1.0F);
            }
        } else {
            float var21 = player.getSwingProgress(tickDelta);
            float var23 = MathHelper.sin(var21 * (float)Math.PI);
            float var13 = MathHelper.sin(MathHelper.sqrt_float(var21) * (float)Math.PI);
            GL11.glTranslatef(-var13 * 0.4F, MathHelper.sin(MathHelper.sqrt_float(var21) * (float)Math.PI * 2.0F) * 0.2F, -var23 * 0.2F);
        }

        GL11.glTranslatef(0.7F * var20, -0.65F * var20 - (1.0F - equipTime) * 0.6F, -0.9F * var20);
        GL11.glScalef(.5F, 1.5F, 1.5F);
        GL11.glTranslatef(-0.2F, 0.015F, 0F);
        GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
        GL11.glEnable(32826);
        float var21 = player.getSwingProgress(tickDelta);
        float var23 = MathHelper.sin(var21 * var21 * (float)Math.PI);
        float var13 = MathHelper.sin(MathHelper.sqrt_float(var21) * (float)Math.PI);
        GL11.glRotatef(-var23 * 20.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-var13 * 20.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(-var13 * 80.0F, 1.0F, 0.0F, 0.0F);
        float var14 = 0.4F;
        GL11.glScalef(var14, var14, var14);
        if (player.getItemInUseCount() > 0) {
            Item item = stack.getItem();
            // bow-specific behavior: detect ItemBow
            if (item instanceof ItemBow) {
                GL11.glRotatef(-18.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(-8.0F, 1.0F, 0.0F, 0.0F);
                GL11.glTranslatef(-0.9F, 0.2F, 0.0F);
                float var16 = (float)stack.getMaxItemUseDuration() - ((float)player.getItemInUseCount() - tickDelta + 1.0F);
                float var17 = var16 / 20.0F;
                var17 = (var17 * var17 + var17 * 2.0F) / 3.0F;
                if (var17 > 1.0F) {
                    var17 = 1.0F;
                }

                if (var17 > 0.1F) {
                    GL11.glTranslatef(0.0F, MathHelper.sin((var16 - 0.1F) * 1.3F) * 0.01F * (var17 - 0.1F), 0.0F);
                }

                GL11.glTranslatef(0.0F, 0.0F, var17 * 0.1F);
                GL11.glRotatef(-335.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
                GL11.glTranslatef(0.0F, 0.5F, 0.0F);
                float var18 = 1.0F + var17 * 0.2F;
                GL11.glScalef(1.0F, 1.0F, var18);
                GL11.glTranslatef(0.0F, -0.5F, 0.0F);
                GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
            }
        }

        if (stack.getItem().shouldRotateAroundWhenRendering()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
        }

        renderer.renderItem(player, stack, 0);
        GL11.glPopMatrix();
    }

    public static void renderBaguette() {
        TextureManager manager = Minecraft.getMinecraft().getTextureManager();

        manager.bindTexture(new ResourceLocation("morefood", "textures/items/food/baguette.png"));

        Tessellator tess = Tessellator.instance;

        float uMin = 0.0F;
        float uMax = 1.0F;
        float vMin = 0.0F;
        float vMax = 1.0F;

        int texWidth = 256;
        int texHeight = 256;

        GL11.glEnable(32826);
        GL11.glTranslatef(-0.0F, -0.3F, 0.0F);
        GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
        GL11.glScalef(16F, 16F, 1F);
        GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
        GL11.glColor3f(1.0F, 1.0F, 1.0F);
        ItemRenderer.renderItemIn2D(tess, uMax, vMin, uMin, vMax, texWidth, texHeight, 0.0625F);
    }
}
