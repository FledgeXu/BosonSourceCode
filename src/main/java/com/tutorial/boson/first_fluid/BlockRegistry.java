package com.tutorial.boson.first_fluid;

import com.tutorial.boson.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static RegistryObject<FlowingFluidBlock> obsidianRubikCube = BLOCKS.register("obsidian_fluid", () -> new FlowingFluidBlock(FluidRegistry.obsidianFluid, Block.Properties.create(Material.WATER).doesNotBlockMovement().hardnessAndResistance(100.0F).noDrops()));
}
