package com.gihtub.fledgexu.boson;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class Boson {
    public Boson() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        com.gihtub.fledgexu.boson.first_item.ItemRegistry.ITEMS.register(eventBus);
    }
}
