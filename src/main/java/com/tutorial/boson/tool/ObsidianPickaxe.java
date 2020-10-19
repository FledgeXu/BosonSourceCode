package com.tutorial.boson.tool;

import com.tutorial.boson.group.ModGroup;
import com.tutorial.boson.melee_weapons.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class ObsidianPickaxe extends PickaxeItem {
    public ObsidianPickaxe() {
        super(ModItemTier.OBSIDIAN, 2, -3f, (new Item.Properties()).group(ModGroup.ITEM_GROUP));
    }
}
