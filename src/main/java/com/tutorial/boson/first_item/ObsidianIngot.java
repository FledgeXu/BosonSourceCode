package com.tutorial.boson.first_item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class ObsidianIngot extends Item {
    public ObsidianIngot() {
        super(new Properties().group(ItemGroup.MATERIALS));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (!worldIn.isRemote) {
            File file = new File("test" + File.separator + "test.txt");
            try {
                FileUtils.writeStringToFile(file, "test", Charset.defaultCharset());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
