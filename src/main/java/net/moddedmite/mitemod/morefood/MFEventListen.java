package net.moddedmite.mitemod.morefood;

import net.moddedmite.mitemod.morefood.item.register.FurnaceRecipesExtend;
import net.moddedmite.mitemod.morefood.item.register.ItemTextureRegister;
import net.moddedmite.mitemod.morefood.item.register.RecipeRegister;
import com.google.common.eventbus.Subscribe;
import net.minecraft.ChatMessageComponent;
import net.minecraft.EntityPlayer;
import net.xiaoyu233.fml.reload.event.HandleChatCommandEvent;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;
import net.xiaoyu233.fml.reload.event.PlayerLoggedInEvent;
import net.xiaoyu233.fml.reload.event.RecipeRegistryEvent;

public class MFEventListen {

    @Subscribe
    public void onItemRegister(ItemRegistryEvent event) {
        ItemTextureRegister.registerItems(event);
    }

    @Subscribe
    public void onRecipeRegister(RecipeRegistryEvent event) {
        RecipeRegister.registerRecipes(event);
        FurnaceRecipesExtend.registerFurnaceRecipes();
    }
}
