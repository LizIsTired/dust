package net.lizistired.cavedust.utils;

import com.minelittlepony.common.client.gui.element.AbstractSlider;
import net.minecraft.text.Text;

import javax.swing.*;

public class TranslatableTextHelper {
    public Text formatMaxX(AbstractSlider<Float> slider) {
        return Text.translatable("menu.cavedust.width", (int)Math.floor(slider.getValue()));
    }
    public Text formatMaxY(AbstractSlider<Float> slider) {
        return Text.translatable("menu.cavedust.height", (int)Math.floor(slider.getValue()));
    }
    public Text formatUpperLimit(AbstractSlider<Float> slider) {
        return Text.translatable("menu.cavedust.upperlimit", (int)Math.floor(slider.getValue()));
    }
    public Text formatLowerLimit(AbstractSlider<Float> slider) {
        return Text.translatable("menu.cavedust.lowerlimit", (int)Math.floor(slider.getValue()));
    }
    public Text formatParticleMultiplier(AbstractSlider<Float> slider) {
        return Text.translatable("menu.cavedust.particlemultiplier", (int)Math.floor(slider.getValue()));
    }

    public Text formatParticleMultiplierMultiplier(AbstractSlider<Float> slider) {
        return Text.translatable("menu.cavedust.particlemultipliermultiplier", (int)Math.floor(slider.getValue()));
    }
    public Text formatVelocityRandomness(AbstractSlider<Float> slider) {
        return Text.translatable("menu.cavedust.velocityrandomness", (int) Math.floor(slider.getValue()));
    }

    public Text formatScaleLower(AbstractSlider<Float> slider) {
        return Text.translatable("menu.cavedust.scalelower", (int) Math.floor(slider.getValue()));
    }

    public Text formatScaleHigher(AbstractSlider<Float> slider) {
        return Text.translatable("menu.cavedust.scalehigher", (int) Math.floor(slider.getValue()));
    }
}
