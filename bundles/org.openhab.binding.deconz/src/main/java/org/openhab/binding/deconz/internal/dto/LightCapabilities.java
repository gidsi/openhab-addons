package org.openhab.binding.deconz.internal.dto;

/*
 * This class is used to store the capabilities of a light.
 * It is part of a {@link LightMessage}.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

@NonNullByDefault
public class LightCapabilities {
    public String @Nullable [] alerts;
    public @Nullable ColorCapabilities color;

    public static class ColorCapabilities {
        public String @Nullable [] effects;

        public List<String> getEffectsList() {
            if (effects == null) {
                return new ArrayList<>();
            } else {
                return Arrays.asList(effects);
            }
        }

        public String toString() {
            return "ColorCapabilities{" + "effects=" + Arrays.toString(effects) + '}';
        }
    }

    @Override
    public String toString() {
        return "LightCapabilities{" + "alerts=" + Arrays.toString(alerts) + ", color=" + color + '}';
    }
}
