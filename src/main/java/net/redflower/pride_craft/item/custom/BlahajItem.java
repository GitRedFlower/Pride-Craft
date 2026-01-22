package net.redflower.pride_craft.item.custom;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BlahajItem extends Item {

    public MobEffect Effect;
    public int amplifier;

    public BlahajItem(Properties properties, MobEffect effect, int amplifier) {
        super(properties);
        this.Effect = effect;
        this.amplifier = amplifier;
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (entity instanceof LivingEntity living) {
            living.addEffect(new MobEffectInstance(Effect, 40, amplifier, false, false, false));
        }
    }
}
