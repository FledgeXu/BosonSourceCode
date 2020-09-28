package com.tutorial.boson.container;

import com.tutorial.boson.Utils;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Utils.MOD_ID);
    public static final RegistryObject<TileEntityType<ObsidianFirstContainerTileEntity>> obsidianFirstContainerTileEntity = TILE_ENTITIES.register("obsidian_first_container_tileentity", () -> TileEntityType.Builder.create(ObsidianFirstContainerTileEntity::new, BlockRegistry.obsidianFirstContainerBlock.get()).build(null));
}
