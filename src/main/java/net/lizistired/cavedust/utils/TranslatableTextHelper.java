package net.lizistired.cavedust.utils;

import com.minelittlepony.common.client.gui.element.AbstractSlider;
import net.minecraft.text.Text;

public class TranslatableTextHelper {
    public Text formatMaxWidth(AbstractSlider<Float> slider) {
        return Text.translatable("menu.cavedust.width", (int)Math.floor(slider.getValue()));
    }
    public Text formatMaxHeight(AbstractSlider<Float> slider) {
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
}
