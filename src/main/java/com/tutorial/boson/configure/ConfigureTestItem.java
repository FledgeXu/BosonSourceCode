package com.tutorial.boson.configure;

import com.tutorial.boson.Utils;
import com.tutorial.boson.group.ModGroup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class ConfigureTestItem extends Item {
    public ConfigureTestItem() {
        super(new Properties().group(ModGroup.ITEM_GROUP));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (!worldIn.isRemote) {
            playerIn.sendMessage(new TranslationTextComponent("message." + Utils.MOD_ID + ".config", Config.VALUE.get()), playerIn.getUniqueID());
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
