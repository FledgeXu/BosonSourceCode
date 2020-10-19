package com.tutorial.boson.container;

import com.tutorial.boson.Utils;
import com.tutorial.boson.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianFirstContainerItem = ITEMS.register("obsidian_first_container", () -> new BlockItem(BlockRegistry.obsidianFirstContainerBlock.get(), new Item.Properties().group(ModGroup.ITEM_GROUP)));
}
