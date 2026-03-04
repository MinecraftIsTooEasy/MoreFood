package net.moddedmite.mitemod.morefood;

import moddedmite.rustedironcore.api.event.Handlers;

import net.moddedmite.mitemod.morefood.events.IceTeaListener;
import net.moddedmite.mitemod.morefood.events.UseTickListener;

public class MFRICEvents extends Handlers {

    public static void register() {

        Handlers.LootTable.register(new IceTeaListener());

        Handlers.Tick.register(new UseTickListener());
    }
}