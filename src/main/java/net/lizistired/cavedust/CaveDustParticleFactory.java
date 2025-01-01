package net.lizistired.cavedust;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.lizistired.cavedust.utils.MathHelper;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
import org.jetbrains.annotations.Nullable;

public class CaveDustParticleFactory extends SpriteBillboardParticle {
    private final SpriteProvider spriteProvider;
    CaveDustParticleFactory(ClientWorld clientWorld, double x, double y, double z, double velocityX, double velocityY, double velocityZ, SpriteProvider spriteProvider) {
        super(clientWorld, x, y, z);
        this.spriteProvider = spriteProvider; //Sets the sprite provider from above to the sprite provider in the constructor method
        this.maxAge = 200; //20 ticks = 1 second
        this.velocityX = velocityX; //The velX from the constructor parameters
        this.velocityY = -0.007f; //Allows the particle to slowly fall
        this.velocityZ = velocityZ;
        this.x = x; //The x from the constructor parameters
        this.y = y;
        this.z = z;
        this.collidesWithWorld = true;
        this.alpha = 1.0f; //Setting the alpha to 1.0f means there will be no opacity change until the alpha value is changed
        this.setSpriteForAge(spriteProvider); //Required
    }

    @Override
    public void tick() {
        super.tick();
        if(this.alpha < 0.0f){
            this.markDead();
        }
        this.alpha -= 0.005f;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }


        @Override
        public @Nullable Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new CaveDustParticleFactory(world, x, y, z, velocityX, velocityY, velocityZ, this.spriteProvider);
        }
    }
}
