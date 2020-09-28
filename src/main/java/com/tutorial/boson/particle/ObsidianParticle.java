package com.tutorial.boson.particle;

import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.SpriteTexturedParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.vector.Vector3d;

import java.awt.*;

public class ObsidianParticle extends SpriteTexturedParticle {
    protected ObsidianParticle(ClientWorld world, double x, double y, double z, Vector3d speed, Color color, float diameter) {
        super(world, x, y, z, speed.x, speed.y, speed.z);
        maxAge = 100;
        motionX = speed.x;
        motionY = speed.y;
        motionZ = speed.z;
        setColor(color.getRed() / 255F, color.getGreen() / 255F, color.getBlue() / 255F);
        this.setAlphaF(color.getAlpha());
        final float PARTICLE_SCALE_FOR_ONE_METRE = 0.5F;
        particleScale = PARTICLE_SCALE_FOR_ONE_METRE * diameter;
        this.canCollide = true;
    }

    @Override
    public IParticleRenderType getRenderType() {
        return IParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }
}
