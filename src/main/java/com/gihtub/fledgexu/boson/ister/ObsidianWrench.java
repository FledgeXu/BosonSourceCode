package com.gihtub.fledgexu.boson.ister;

import com.gihtub.fledgexu.boson.group.ModGroup;
import net.minecraft.item.Item;

public class ObsidianWrench extends Item {
    public ObsidianWrench() {
        super(new Properties().group(ModGroup.itemGroup).setISTER(() -> ObsidianWrenchItemStackTileEntityRenderer::new));
    }
}
