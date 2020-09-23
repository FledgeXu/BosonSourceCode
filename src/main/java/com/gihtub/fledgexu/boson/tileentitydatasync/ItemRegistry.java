package com.gihtub.fledgexu.boson.tileentitydatasync;

import com.gihtub.fledgexu.boson.Utils;
import com.gihtub.fledgexu.boson.group.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianZombieBlock = ITEMS.register("obsidian_zombie_block", () -> new BlockItem(BlockRegistry.obsidianZombieBlock.get(), new Item.Properties().group(ModGroup.itemGroup)));
}
