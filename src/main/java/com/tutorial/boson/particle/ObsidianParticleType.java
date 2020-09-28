package com.tutorial.boson.particle;

import com.mojang.serialization.Codec;
import net.minecraft.particles.ParticleType;
import net.minecraft.util.math.vector.Vector3d;

import java.awt.*;

public class ObsidianParticleType extends ParticleType<ObsidianParticleData> {
    public ObsidianParticleType() {
        super(false, ObsidianParticleData.DESERIALIZER);
    }

    @Override
    public Codec<ObsidianParticleData> func_230522_e_() {
        return Codec.unit(new ObsidianParticleData(new Vector3d(0, 0, 0), new Color(0), 0));
    }
}
