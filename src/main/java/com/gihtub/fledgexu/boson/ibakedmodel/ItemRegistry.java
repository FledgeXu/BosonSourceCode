package com.gihtub.fledgexu.boson.ibakedmodel;

import com.gihtub.fledgexu.boson.Utils;
import com.gihtub.fledgexu.boson.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianHidden = ITEMS.register("obsidian_hidden", () -> new BlockItem(BlockRegistry.obsidianHidden.get(), new Item.Properties().group(ModGroup.itemGroup)));
}
