package net.moddedmite.mitemod.morefood.mixins.client.render;

import net.minecraft.*;
import net.moddedmite.mitemod.morefood.client.render.BaguetteRenderer;
import net.moddedmite.mitemod.morefood.item.food.ItemBaguette;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin {

    @Shadow private ItemStack itemToRender;
    @Shadow private float prevEquippedProgress;
    @Shadow private float equippedProgress;
    @Shadow private Minecraft mc;

    @Inject(method = "renderItemInFirstPerson", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glPushMatrix()V", ordinal = 3), cancellable = true)
    private void renderBaguetteInHandHehe(float tickDelta, CallbackInfo ci) {

        ItemStack stack = this.itemToRender;
        float equipTime = this.prevEquippedProgress + (this.equippedProgress - this.prevEquippedProgress) * tickDelta;
        EntityPlayer player = this.mc.thePlayer;

        if (stack.getItem() instanceof ItemBaguette) {
            BaguetteRenderer.renderBaguetteFirstPerson((ItemRenderer) (Object) this, tickDelta, equipTime, stack, player);
            GL11.glDisable(32826);
            RenderHelper.disableStandardItemLighting();
            ci.cancel();
        }
    }

    @Inject(method = "renderItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/TextureManager;bindTexture(Lnet/minecraft/ResourceLocation;)V", ordinal = 1), cancellable = true)
    private void renderBaguetteHehe(EntityLivingBase entity, ItemStack stack, int pass, CallbackInfo ci) {
        if (stack != null && stack.getItem() instanceof ItemBaguette) {

            Icon icon = entity.getItemIcon(stack, pass);

            BaguetteRenderer.renderBaguette(stack, icon);
            ci.cancel();

            GL11.glDisable(32826);
            GL11.glPopMatrix();
        }

    }
}