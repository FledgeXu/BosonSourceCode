package com.tutorial.boson.first_fluid;

import com.tutorial.boson.Utils;
import com.tutorial.boson.group.ModGroup;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.item.Items.BUCKET;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static RegistryObject<Item> obsidianFluidBucket = ITEMS.register("obsidian_fluid_bucket", () -> new BucketItem(FluidRegistry.obsidianFluid, new Item.Properties().group(ModGroup.ITEM_GROUP).containerItem(BUCKET)));
}
