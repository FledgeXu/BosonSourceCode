package com.tutorial.boson.ter;

import com.tutorial.boson.Utils;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Utils.MOD_ID);
    public static final RegistryObject<TileEntityType<ObsidianTERTileEntity>> obsidianTERTileEntity = TILE_ENTITIES.register("obsidian_ter_tileentity", () -> TileEntityType.Builder.create(ObsidianTERTileEntity::new, BlockRegistry.obsidianTERBlock.get()).build(null));
}

