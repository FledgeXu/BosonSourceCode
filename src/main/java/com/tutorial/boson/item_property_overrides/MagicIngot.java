package com.tutorial.boson.item_property_overrides;

import com.tutorial.boson.group.ModGroup;
import net.minecraft.item.Item;

public class MagicIngot extends Item {
    public MagicIngot() {
        super(new Properties().group(ModGroup.ITEM_GROUP));
    }
}
