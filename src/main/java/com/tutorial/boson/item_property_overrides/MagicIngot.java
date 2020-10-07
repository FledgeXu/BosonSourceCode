package com.tutorial.boson.item_property_overrides;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MagicIngot extends Item {
    public MagicIngot() {
        super(new Properties().group(ItemGroup.MATERIALS));
    }
}
