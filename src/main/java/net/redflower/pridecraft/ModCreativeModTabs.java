package net.redflower.pridecraft;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrideCraft.MODID);

public static final Supplier<CreativeModeTab> PRIDE_CRAFT_BLOCKS_TAB = CREATIVE_MODE_TAB.register("pride_craft_blocks_tab",
        () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(Blocks.BLACK_CONCRETE))
                .title(Component.translatable("creativetab.pridecraft.blocks"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(Blocks.DIAMOND_BLOCK);
                })
                .build());

    public static final Supplier<CreativeModeTab> PRIDE_CRAFT_ITEMS_TAB = CREATIVE_MODE_TAB.register("pride_craft_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.DIAMOND))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "pride_craft_blocks_tab"))
                    .title(Component.translatable("creativetab.pridecraft.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.DIAMOND);
                    })
                    .build());




public static void register(IEventBus eventBus) {CREATIVE_MODE_TAB.register(eventBus); }
}
