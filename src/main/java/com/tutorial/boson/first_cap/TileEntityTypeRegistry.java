package com.tutorial.boson.first_cap;

import com.tutorial.boson.Utils;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Utils.MOD_ID);
    public static final RegistryObject<TileEntityType<ObsidianDownBlockTileEntity>> obsidianDownTileEntity = TILE_ENTITIES.register("obsidian_down_tileentity", () -> TileEntityType.Builder.create(ObsidianDownBlockTileEntity::new, BlockRegistry.obsidianDownBlock.get()).build(null));
    public static final RegistryObject<TileEntityType<ObsidianUpBlockTileEntity>> obsidianUpTileEntity = TILE_ENTITIES.register("obsidian_up_tileentity", () -> TileEntityType.Builder.create(ObsidianUpBlockTileEntity::new, BlockRegistry.obsidianUpBlock.get()).build(null));
}
