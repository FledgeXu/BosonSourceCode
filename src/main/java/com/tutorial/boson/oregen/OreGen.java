package com.tutorial.boson.oregen;


import com.tutorial.boson.first_block.BlockRegistry;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.FeatureSpreadConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.NoPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber()
public class OreGen {
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onSetUpEvent(BiomeLoadingEvent event) {
        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a,
                                BlockRegistry.obsidianBlock.get().getDefaultState(),
                                9)
                ).withPlacement(Placement.field_242907_l.configure(new TopSolidRangeConfig(0, 0, 64)))
                        .withPlacement(Placement.field_242903_g.configure(NoPlacementConfig.field_236556_b_))
                        .withPlacement(Placement.field_242899_c.configure(new FeatureSpreadConfig(FeatureSpread.func_242252_a(20))))
        );
    }
}
