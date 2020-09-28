package com.tutorial.boson.first_tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;

public class ObsidianCounterTileEntity extends TileEntity {
    private int counter = 0;

    public ObsidianCounterTileEntity() {
        super(TileEntityTypeRegistry.obsidianCounterTileEntity.get());
    }

    public int increase() {
        counter++;
        markDirty();
        return counter;
    }

    @Override
    public void read(BlockState state, CompoundNBT nbt) {
        counter = nbt.getInt("counter");
        super.read(state, nbt);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.putInt("counter", counter);
        return super.write(compound);
    }
}
