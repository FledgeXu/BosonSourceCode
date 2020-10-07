package com.tutorial.boson.item_property_overrides;

import com.tutorial.boson.Utils;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PropertyRegistry {
    @SubscribeEvent
    public static void propertyOverrideRegistry(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemModelsProperties.registerProperty(ItemRegistry.magicIngot.get(), new ResourceLocation(Utils.MOD_ID, "size"), (itemStack, clientWorld, livingEntity) -> itemStack.getCount());
        });
    }
}
