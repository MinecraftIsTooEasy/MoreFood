package net.moddedmite.mitemod.morefood;

import net.fabricmc.api.ModInitializer;
import net.xiaoyu233.fml.ModResourceManager;
import net.xiaoyu233.fml.reload.event.MITEEvents;

public class MoreFoodInit implements ModInitializer {
    public static final String NameSpace = "More Food";

    @Override
    public void onInitialize() {
        MITEEvents.MITE_EVENT_BUS.register(new MFEventListen());
        ModResourceManager.addResourcePackDomain("morefood");
    }
}