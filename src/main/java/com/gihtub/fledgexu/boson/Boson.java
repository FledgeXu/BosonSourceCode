package com.gihtub.fledgexu.boson;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class Boson {
    public Boson() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        com.gihtub.fledgexu.boson.first_item.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.food.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.melee_weapons.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.first_block.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.first_block.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.blockstate.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.blockstate.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.notsoildblock.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.notsoildblock.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.special_render_type.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.special_render_type.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.obj.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.obj.BlockRegistry.BLOCKS.register(eventBus);
    }
}
