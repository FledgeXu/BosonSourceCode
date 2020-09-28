package com.gihtub.fledgexu.boson.tool;

import com.gihtub.fledgexu.boson.group.ModGroup;
import com.gihtub.fledgexu.boson.melee_weapons.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class ObsidianPickaxe extends PickaxeItem {
    public ObsidianPickaxe() {
        super(ModItemTier.OBSIDIAN, 2, -3f, (new Item.Properties()).group(ModGroup.itemGroup));
    }
}
