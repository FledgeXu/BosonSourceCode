package com.tutorial.boson.obsidian_animal;

import com.tutorial.boson.Utils;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Utils.MOD_ID);
    public static final RegistryObject<EntityType<ObsidianAnimal>> obsidianAnimal = ENTITY_TYPES.register("obsidian_animal", () -> EntityType.Builder.create(ObsidianAnimal::new, EntityClassification.MISC).size(1, 1F).build("obsidian_animal"));
}
