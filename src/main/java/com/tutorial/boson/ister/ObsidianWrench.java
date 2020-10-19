package com.tutorial.boson.ister;

import com.tutorial.boson.group.ModGroup;
import net.minecraft.item.Item;

public class ObsidianWrench extends Item {
    public ObsidianWrench() {
        super(new Properties().group(ModGroup.ITEM_GROUP).setISTER(() -> ObsidianWrenchItemStackTileEntityRenderer::new));
    }
}
