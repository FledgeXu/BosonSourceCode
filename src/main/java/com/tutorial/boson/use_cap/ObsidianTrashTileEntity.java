package com.tutorial.boson.use_cap;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ObsidianTrashTileEntity extends TileEntity {
    public ObsidianTrashTileEntity() {
        super(TileEntityTypeRegistry.obsidianTrash.get());
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (side == Direction.UP && cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return LazyOptional.of(() -> new ItemStackHandler() {
                @Override
                public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
                    return stack.getItem() == Items.COBBLESTONE;
                }
            }).cast();
        }
        return super.getCapability(cap, side);
    }
}
