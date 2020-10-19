package com.tutorial.boson.first_gui;

import com.tutorial.boson.group.ModGroup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

public class ObsidianFirstGuiItem extends Item {
    public ObsidianFirstGuiItem() {
        super(new Properties().group(ModGroup.ITEM_GROUP));
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (worldIn.isRemote) {
            DistExecutor.safeCallWhenOn(Dist.CLIENT, () -> OpenGUI::new);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
