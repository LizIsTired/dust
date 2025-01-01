package net.lizistired.cavedust;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CaveDustServer  implements ModInitializer {
    public static final DefaultParticleType CAVE_DUST = FabricParticleTypes.simple();
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier("cavedust", "cave_dust"), CAVE_DUST);
    }
}
