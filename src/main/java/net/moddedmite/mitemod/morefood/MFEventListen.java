package net.moddedmite.mitemod.morefood;

import moddedmite.rustedironcore.api.event.Handlers;
import net.moddedmite.mitemod.morefood.events.UseTickListener;
import net.moddedmite.mitemod.morefood.item.register.FurnaceRecipesExtend;
import net.moddedmite.mitemod.morefood.item.register.ItemTextureRegister;
import net.moddedmite.mitemod.morefood.item.register.RecipeRegister;
import com.google.common.eventbus.Subscribe;
import net.moddedmite.mitemod.morefood.sound.Sounds;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;
import net.xiaoyu233.fml.reload.event.RecipeRegistryEvent;
import net.xiaoyu233.fml.reload.event.SoundsRegisterEvent;

public class MFEventListen extends Handlers {

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
        event.registerSound(Sounds.icetea);
    }

    public static void registerRICEvents() {
        Handlers.Tick.register(new UseTickListener());
    }
}