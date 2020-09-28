package com.tutorial.boson.obsidian_animal;

import com.tutorial.boson.Utils;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ObsidianAnimalRender extends MobRenderer<ObsidianAnimal, ObsidianAnimalModel> {

    public ObsidianAnimalRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ObsidianAnimalModel(), 1F);
    }

    public ObsidianAnimalRender(EntityRendererManager renderManagerIn, ObsidianAnimalModel entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
    }

    @Override
    public ResourceLocation getEntityTexture(ObsidianAnimal entity) {
        return new ResourceLocation(Utils.MOD_ID, "textures/entity/obsidian_animal.png");

    }
}
