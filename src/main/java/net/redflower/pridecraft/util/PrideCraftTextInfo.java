package net.redflower.pridecraft.util;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.redflower.pridecraft.PrideCraft;

public class PrideCraftTextInfo {

    public static MutableComponent getInformation(String key, Object... args) {
        return Component.translatable(PrideCraft.MODID + "." + key, args);
    }
}
