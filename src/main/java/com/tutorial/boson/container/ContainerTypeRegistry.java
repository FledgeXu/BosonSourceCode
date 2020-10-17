package com.tutorial.boson.container;

import com.tutorial.boson.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypeRegistry {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, Utils.MOD_ID);
    public static final RegistryObject<ContainerType<ObsidianFirstContainer>> obsidianFirstContainer = CONTAINERS.register("obsidian_first_container", () -> IForgeContainerType.create((int windowId, PlayerInventory inv, PacketBuffer data) -> new ObsidianFirstContainer(windowId, inv, data.readBlockPos(), DistExecutor.safeRunForDist(() -> () -> Minecraft.getInstance().world, () -> () -> null), new ObsidianFirstContainerItemNumber())));
}
