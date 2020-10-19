package com.tutorial.boson.first_cap;

import com.tutorial.boson.Utils;
import com.tutorial.boson.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianDownBlockItem = ITEMS.register("obsidian_down_block", () -> new BlockItem(BlockRegistry.obsidianDownBlock.get(), new Item.Properties().group(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> obsidianUpBlockItem = ITEMS.register("obsidian_up_block", () -> new BlockItem(BlockRegistry.obsidianUpBlock.get(), new Item.Properties().group(ModGroup.ITEM_GROUP)));
}
