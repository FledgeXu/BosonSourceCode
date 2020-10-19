package com.tutorial.boson.datagen;

import net.minecraft.data.BiomeProvider;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenEvent {
    @SubscribeEvent
    public static void dataGen(GatherDataEvent event) {
        event.getGenerator().addProvider(new Recipes(event.getGenerator()));
        event.getGenerator().addProvider(new BiomeProvider(event.getGenerator()));
    }
}
