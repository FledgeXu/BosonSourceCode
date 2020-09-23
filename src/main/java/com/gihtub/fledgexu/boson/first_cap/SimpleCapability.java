package com.gihtub.fledgexu.boson.first_cap;

import net.minecraft.util.math.BlockPos;

public class SimpleCapability implements ISimpleCapability {
    private final String context;

    public SimpleCapability(String context) {
        this.context = context;
    }

    @Override
    public String getString(BlockPos pos) {
        return pos.toString() + ":::" + this.context;
    }
}
