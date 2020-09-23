package com.gihtub.fledgexu.boson.tileentitydatasync;

import com.gihtub.fledgexu.boson.Utils;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> obsidianZombieBlock = BLOCKS.register("obsidian_zombie_block", ObsidianZombieBlock::new);
}
