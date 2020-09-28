package com.tutorial.boson.ister;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Vector3f;

public class ObsidianWrenchItemStackTileEntityRenderer extends ItemStackTileEntityRenderer {
    private int degree = 0;

    @Override
    public void func_239207_a_(ItemStack stack, ItemCameraTransforms.TransformType transformType, MatrixStack matrixStack, IRenderTypeBuffer buffer, int combinedLight, int combinedOverlay) {
        if (degree == 360) {
            degree = 0;
        }
        degree++;
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        IBakedModel ibakedmodel = itemRenderer.getItemModelWithOverrides(stack, null, null);
        matrixStack.push();
        matrixStack.translate(0.5F, 0.5F, 0.5F);
        float xOffset = -1 / 32f;
        float zOffset = 0;
        matrixStack.translate(-xOffset, 0, -zOffset);
        matrixStack.rotate(Vector3f.YP.rotationDegrees(degree));
        matrixStack.translate(xOffset, 0, zOffset);
        itemRenderer.renderItem(stack, ItemCameraTransforms.TransformType.NONE, false, matrixStack, buffer, combinedLight, combinedOverlay, ibakedmodel.getBakedModel());
        matrixStack.pop();
    }
}
