package com.gihtub.fledgexu.boson.entity_capabilityprovider;

import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.INBTSerializable;

public interface ISpeedUpCapability extends INBTSerializable<CompoundNBT> {
    int getLevel();
}
