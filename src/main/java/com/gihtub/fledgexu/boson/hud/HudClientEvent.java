package com.gihtub.fledgexu.boson.hud;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Hand;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class HudClientEvent {
    public static ObsidianGUI obsidianGUI;
    @SubscribeEvent
    public static void onOverlayRender(RenderGameOverlayEvent event) {
        if (event.getType() != RenderGameOverlayEvent.ElementType.ALL) {
            return;
        }
        if (Minecraft.getInstance().player == null || Minecraft.getInstance().player.getHeldItem(Hand.MAIN_HAND).getItem() != ItemRegistry.obsidianHud.get()) {
            return;
        }
        ObsidianGUI obsidianGUI = new ObsidianGUI(event.getMatrixStack());
        obsidianGUI.render();
    }
}