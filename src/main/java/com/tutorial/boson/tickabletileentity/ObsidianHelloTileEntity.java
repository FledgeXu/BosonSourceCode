package com.tutorial.boson.tickabletileentity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.TranslationTextComponent;

public class ObsidianHelloTileEntity extends TileEntity implements ITickableTileEntity {
    private static final int MAX_TIME = 5 * 20;
    private int timer = 0;

    public ObsidianHelloTileEntity() {
        super(TileEntityTypeRegistry.obsidianHelloTileEntity.get());
    }

    @Override
    public void tick() {
        if (world != null && !world.isRemote) {
            if (timer == MAX_TIME) {
                PlayerEntity player = world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 10, false);
                TranslationTextComponent translationTextComponent = new TranslationTextComponent("message.hello_block.hello");
                if (player != null) {
                    player.sendStatusMessage(translationTextComponent, false);
                }
                timer = 0;
            }
            timer++;
        }
    }
}
