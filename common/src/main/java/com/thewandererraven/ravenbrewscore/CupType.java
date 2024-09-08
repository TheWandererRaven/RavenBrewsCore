package com.thewandererraven.ravenbrewscore;

import net.minecraft.util.StringRepresentable;

import java.util.Locale;

public enum CupType implements StringRepresentable {
    SMALL("small"),
    MEDIUM("medium"),
    COFFEE_MUG("coffee_mug"),
    LARGE("large");

    private final String prefix;

    CupType(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String getSerializedName() {
        return this.prefix;
    }

    public static CupType byPrefix(String prefix) {
        return CupType.valueOf(prefix.toUpperCase(Locale.ROOT));
    }
    public static double getSizeMultiplier(CupType type) {
        return switch (type) {
            case SMALL -> CupSizes.SMALL;
            case LARGE -> CupSizes.LARGE;
            default -> CupSizes.MEDIUM;
        };
    }
}
