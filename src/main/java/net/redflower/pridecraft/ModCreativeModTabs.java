package net.redflower.pridecraft;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.pridecraft.block.ModBlocks;
import net.redflower.pridecraft.item.ModItems;

import java.util.function.Supplier;

public class ModCreativeModTabs {
public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrideCraft.MODID);

public static final Supplier<CreativeModeTab> PRIDE_CRAFT_BLOCKS_TAB = CREATIVE_MODE_TAB.register("pride_craft_blocks_tab",
        () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK))
                .title(Component.translatable("creativetab.pridecraft.blocks"))
                .displayItems((itemDisplayParameters, output) -> {
                    //Other Blocks
                    output.accept(ModBlocks.UNKNOWN_ORE);
                    output.accept(ModBlocks.DEEPSLATE_UNKNOWN_ORE);

                    //Flag Blocks
                    output.accept(ModBlocks.ABROSEXUAL_FLAG_BLOCK);
                    output.accept(ModBlocks.AGENDER_FLAG_BLOCK);
                    output.accept(ModBlocks.AROACE_FLAG_BLOCK);
                    output.accept(ModBlocks.AROMANTIC_FLAG_BLOCK);
                    output.accept(ModBlocks.ASEXUAL_FLAG_BLOCK);
                    output.accept(ModBlocks.BIGENDER_FLAG_BLOCK);
                    output.accept(ModBlocks.BISEXUAL_FLAG_BLOCK);
                    output.accept(ModBlocks.DEMIBOY_FLAG_BLOCK);
                    output.accept(ModBlocks.DEMIGIRL_FLAG_BLOCK);
                    output.accept(ModBlocks.DEMINONBINARY_FLAG_BLOCK);
                    output.accept(ModBlocks.DEMIROMANTIC_FLAG_BLOCK);
                    output.accept(ModBlocks.DEMISEXUAL_FLAG_BLOCK);
                    output.accept(ModBlocks.GAY_FLAG_BLOCK);
                    output.accept(ModBlocks.GENDERFLUID_FLAG_BLOCK);
                    output.accept(ModBlocks.GENDERFLUX_FLAG_BLOCK);
                    output.accept(ModBlocks.GENDERQUEER_FLAG_BLOCK);
                    output.accept(ModBlocks.GRAYROMANTIC_FLAG_BLOCK);
                    output.accept(ModBlocks.GRAYSEXUAL_FLAG_BLOCK);
                    output.accept(ModBlocks.INTERSEX_FLAG_BLOCK);
                    output.accept(ModBlocks.LESBIAN_FLAG_BLOCK);
                    output.accept(ModBlocks.NONBINARY_FLAG_BLOCK);
                    output.accept(ModBlocks.OMNISEXUAL_FLAG_BLOCK);
                    output.accept(ModBlocks.PANSEXUAL_FLAG_BLOCK);
                    output.accept(ModBlocks.POLYSEXUAL_FLAG_BLOCK);
                    output.accept(ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK);
                    output.accept(ModBlocks.QUEER_FLAG_BLOCK);
                    output.accept(ModBlocks.RAINBOW_FLAG_BLOCK);
                    output.accept(ModBlocks.TRANSGENDER_FLAG_BLOCK);
                })
                .build());

    public static final Supplier<CreativeModeTab> PRIDE_CRAFT_ITEMS_TAB = CREATIVE_MODE_TAB.register("pride_craft_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.PROGRESS_PRIDE_MATERIAL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "pride_craft_blocks_tab"))
                    .title(Component.translatable("creativetab.pridecraft.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Other Things
                        output.accept(ModItems.UNKNOWN_MATERIAL);
                        output.accept(ModItems.CORRUPTED_FLAG_MATERIAL);

                        //Flag Materials
                        output.accept(ModItems.ABROSEXUAL_MATERIAL);
                        output.accept(ModItems.AGENDER_MATERIAL);
                        output.accept(ModItems.AROACE_MATERIAL);
                        output.accept(ModItems.AROMANTIC_MATERIAL);
                        output.accept(ModItems.ASEXUAL_MATERIAL);
                        output.accept(ModItems.BIGENDER_MATERIAL);
                        output.accept(ModItems.BISEXUAL_MATERIAL);
                        output.accept(ModItems.DEMIBOY_MATERIAL);
                        output.accept(ModItems.DEMIGIRL_MATERIAL);
                        output.accept(ModItems.DEMINONBINARY_MATERIAL);
                        output.accept(ModItems.DEMIROMANTIC_MATERIAL);
                        output.accept(ModItems.DEMISEXUAL_MATERIAL);
                        output.accept(ModItems.GAY_MATERIAL);
                        output.accept(ModItems.GENDERFLUID_MATERIAL);
                        output.accept(ModItems.GENDERFLUX_MATERIAL);
                        output.accept(ModItems.GENDERQUEER_MATERIAL);
                        output.accept(ModItems.GRAYROMANTIC_MATERIAL);
                        output.accept(ModItems.GRAYSEXUAL_MATERIAL);
                        output.accept(ModItems.INTERSEX_MATERIAL);
                        output.accept(ModItems.LESBIAN_MATERIAL);
                        output.accept(ModItems.NONBINARY_MATERIAL);
                        output.accept(ModItems.OMNISEXUAL_MATERIAL);
                        output.accept(ModItems.PANSEXUAL_MATERIAL);
                        output.accept(ModItems.POLYSEXUAL_MATERIAL);
                        output.accept(ModItems.PROGRESS_PRIDE_MATERIAL);
                        output.accept(ModItems.QUEER_MATERIAL);
                        output.accept(ModItems.RAINBOW_MATERIAL);
                        output.accept(ModItems.TRANSGENDER_MATERIAL);
                    })
                    .build());




public static void register(IEventBus eventBus) {CREATIVE_MODE_TAB.register(eventBus); }
}
