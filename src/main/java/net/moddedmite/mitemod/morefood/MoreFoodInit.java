package net.moddedmite.mitemod.morefood;

import net.fabricmc.api.ModInitializer;
import net.xiaoyu233.fml.ModResourceManager;
import net.xiaoyu233.fml.reload.event.MITEEvents;
//import net.xiaoyu233.fml.reload.utils.IDAllocator;

public class MoreFoodInit implements ModInitializer {
    public static final String NameSpace = "More Food";
    public static final String resourceId = "morefood:";
    public static final String modId = "more_food";
//    public static IDAllocator allocator;

    @Override
    public void onInitialize() {
        MITEEvents.MITE_EVENT_BUS.register(new MFEventListen());
        ModResourceManager.addResourcePackDomain("morefood");
//        allocator = new IDAllocator(modId, 0, 64);
    }
}