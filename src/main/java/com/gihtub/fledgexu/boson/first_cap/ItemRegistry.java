package com.gihtub.fledgexu.boson.first_cap;

import com.gihtub.fledgexu.boson.Utils;
import com.gihtub.fledgexu.boson.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianDownBlockItem = ITEMS.register("obsidian_down_block", () -> new BlockItem(BlockRegistry.obsidianDownBlock.get(), new Item.Properties().group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianUpBlockItem = ITEMS.register("obsidian_up_block", () -> new BlockItem(BlockRegistry.obsidianUpBlock.get(), new Item.Properties().group(ModGroup.itemGroup)));
}
