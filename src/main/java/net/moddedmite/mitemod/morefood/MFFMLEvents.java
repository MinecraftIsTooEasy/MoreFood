package net.moddedmite.mitemod.morefood;

import moddedmite.rustedironcore.api.event.events.CraftingRecipeRegisterEvent;
import net.moddedmite.mitemod.morefood.client.MFSounds;
import net.moddedmite.mitemod.morefood.item.register.FurnaceRecipesExtend;
import net.moddedmite.mitemod.morefood.item.register.ItemTextureRegister;
import net.moddedmite.mitemod.morefood.item.register.RecipeRegister;

import com.google.common.eventbus.Subscribe;

import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;
import net.xiaoyu233.fml.reload.event.RecipeRegistryEvent;
import net.xiaoyu233.fml.reload.event.SoundsRegisterEvent;

import java.util.function.Consumer;

public class MFFMLEvents {

    @Subscribe
    public void onItemRegister(ItemRegistryEvent event) {
        ItemTextureRegister.registerItems(event);
    }

    @Subscribe
    public void onRecipeRegister(RecipeRegistryEvent event) {
        RecipeRegister.registerRecipes(event);
        FurnaceRecipesExtend.registerFurnaceRecipes();
    }

    @Subscribe
    public void onSoundsRegister(SoundsRegisterEvent event) {
        event.registerSound(MFSounds.IceTea);
    }
}

