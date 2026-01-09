package net.redflower.pride_craft.util;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.redflower.pride_craft.PrideCraft;

public class ModTextInfo {

    public static MutableComponent getInformation(String key, Object... args) {
        return Component.translatable(PrideCraft.MODID + "." + key, args);
    }
}
