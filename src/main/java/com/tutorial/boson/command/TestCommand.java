package com.tutorial.boson.command;

import com.tutorial.boson.Utils;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;

public class TestCommand implements Command<CommandSource> {
    public static TestCommand instance = new TestCommand();

    @Override
    public int run(CommandContext<CommandSource> context) {
        context.getSource().sendFeedback(new TranslationTextComponent("cmd." + Utils.MOD_ID + ".hello"), false);
        return 0;
    }
}
