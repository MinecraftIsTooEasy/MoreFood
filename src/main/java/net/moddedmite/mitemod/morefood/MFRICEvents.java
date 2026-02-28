package net.moddedmite.mitemod.morefood;

import moddedmite.rustedironcore.api.event.Handlers;
import net.moddedmite.mitemod.morefood.events.IceTeaListener;

public class MFRICEvents extends Handlers {

    @SuppressWarnings("unchecked")
    public static void register() {
        Handlers.LootTable.register(new IceTeaListener());
    }
}