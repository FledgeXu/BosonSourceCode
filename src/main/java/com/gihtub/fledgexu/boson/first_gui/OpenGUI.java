package com.gihtub.fledgexu.boson.first_gui;

import com.gihtub.fledgexu.boson.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TranslationTextComponent;

public class OpenGUI {
    public OpenGUI() {
        Minecraft.getInstance().displayGuiScreen(new ObsidianFirstGui(new TranslationTextComponent(Utils.MOD_ID + ".test")));
    }
}
