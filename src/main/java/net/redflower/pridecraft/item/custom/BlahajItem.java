package net.redflower.pridecraft.item.custom;

import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.Nullable;

public class BlahajItem extends Item {

    public Holder<MobEffect> Effect;
    public int amplifier;

    public BlahajItem(Properties properties, Holder<MobEffect> effect, int amplifier) {
        super(properties);
        this.Effect = effect;
        this.amplifier = amplifier;
    }

    public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, @Nullable EquipmentSlot slot) {
        if (entity instanceof LivingEntity living) {
            living.addEffect(new MobEffectInstance(Effect, 40, amplifier, false, false, false));
        }
    }

}
