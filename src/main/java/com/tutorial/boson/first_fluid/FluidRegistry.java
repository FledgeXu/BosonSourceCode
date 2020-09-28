package com.tutorial.boson.first_fluid;

import com.tutorial.boson.Utils;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidRegistry {
    public static final ResourceLocation STILL_OIL_TEXTURE = new ResourceLocation("block/water_still");
    public static final ResourceLocation FLOWING_OIL_TEXTURE = new ResourceLocation("block/water_flow");

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Utils.MOD_ID);
    public static RegistryObject<FlowingFluid> obsidianFluid = FLUIDS.register("obsidian_fluid", () -> new ForgeFlowingFluid.Source(FluidRegistry.PROPERTIES));
    public static RegistryObject<FlowingFluid> obsidianFluidFlowing = FLUIDS.register("obsidian_fluid_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.PROPERTIES));
    public static ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(obsidianFluid, obsidianFluidFlowing, FluidAttributes.builder(STILL_OIL_TEXTURE, FLOWING_OIL_TEXTURE).color(0xFF420372).density(4000).viscosity(4000)).bucket(ItemRegistry.obsidianFluidBucket).block(BlockRegistry.obsidianRubikCube).slopeFindDistance(3).explosionResistance(100F);
}
