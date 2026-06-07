package net.moddedmite.mitemod.morefood;

import moddedmite.rustedironcore.api.event.Handlers;

import net.moddedmite.mitemod.morefood.events.*;

public class MFRICEvents extends Handlers {

    public static void register() {

        Handlers.LootTable.register(new IceTeaListener());

        Handlers.Tick.register(new UseTickListener());

        EntityHumanEvents.init();
        EntityBatEvents.init();
        EntityOcelotEvents.init();
        EntityWolfEvents.init();
    }
}