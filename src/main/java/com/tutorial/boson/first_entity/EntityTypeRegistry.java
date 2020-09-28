package com.tutorial.boson.first_entity;

import com.tutorial.boson.Utils;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Utils.MOD_ID);
    public static final RegistryObject<EntityType<FlyingSwordEntity>> flyingSwordEntity = ENTITY_TYPES.register("flying_sword", () -> EntityType.Builder.create(FlyingSwordEntity::new, EntityClassification.MISC).size(3, 0.5F).build("flying_sword"));
}
