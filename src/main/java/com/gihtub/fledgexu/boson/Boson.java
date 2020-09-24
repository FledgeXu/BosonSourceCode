package com.gihtub.fledgexu.boson;

import com.gihtub.fledgexu.boson.configure.Config;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class Boson {
    public Boson() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
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
        com.gihtub.fledgexu.boson.first_tileentity.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.first_tileentity.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.first_tileentity.TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        com.gihtub.fledgexu.boson.tickabletileentity.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.tickabletileentity.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.tickabletileentity.TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        com.gihtub.fledgexu.boson.tileentitydatasync.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.tileentitydatasync.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.tileentitydatasync.TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        com.gihtub.fledgexu.boson.ibakedmodel.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.ibakedmodel.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.ister.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.network.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.first_entity.EntityTypeRegistry.ENTITY_TYPES.register(eventBus);
        com.gihtub.fledgexu.boson.obsidian_animal.EntityTypeRegistry.ENTITY_TYPES.register(eventBus);
        com.gihtub.fledgexu.boson.first_cap.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.first_cap.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.first_cap.TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        com.gihtub.fledgexu.boson.use_cap.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.use_cap.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.use_cap.TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        com.gihtub.fledgexu.boson.entity_capabilityprovider.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.wordsaveddata.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.wordsaveddata.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.first_gui.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.container.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.container.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.container.TileEntityTypeRegistry.TILE_ENTITIES.register(eventBus);
        com.gihtub.fledgexu.boson.container.ContainerTypeRegistry.CONTAINERS.register(eventBus);
        com.gihtub.fledgexu.boson.hud.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.first_fluid.ItemRegistry.ITEMS.register(eventBus);
        com.gihtub.fledgexu.boson.first_fluid.BlockRegistry.BLOCKS.register(eventBus);
        com.gihtub.fledgexu.boson.first_fluid.FluidRegistry.FLUIDS.register(eventBus);
        com.gihtub.fledgexu.boson.configure.ItemRegistry.ITEMS.register(eventBus);
    }
}
