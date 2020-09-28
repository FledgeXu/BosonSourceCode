package com.tutorial.boson.first_cap;

import com.tutorial.boson.Utils;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> obsidianDownBlock = BLOCKS.register("obsidian_down_block", ObsidianDownBlock::new);
    public static final RegistryObject<Block> obsidianUpBlock = BLOCKS.register("obsidian_up_block", ObsidianUpBlock::new);
}
