package net.redflower.pridecraft;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.pridecraft.block.PrideCraftBlocks;
import net.redflower.pridecraft.item.PrideCraftItems;

import java.util.function.Supplier;

public class ModCreativeModTabs {
public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrideCraft.MODID);

public static final Supplier<CreativeModeTab> PRIDE_CRAFT_BLOCKS_TAB = CREATIVE_MODE_TAB.register("pride_craft_blocks_tab",
        () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(PrideCraftBlocks.PROGRESS_PRIDE_FLAG_BLOCK))
                .title(Component.translatable("creativetab.pridecraft.blocks"))
                .displayItems((itemDisplayParameters, output) -> {
                    //Other Blocks
                    //Ores
                    output.accept(PrideCraftBlocks.UNKNOWN_ORE);
                    output.accept(PrideCraftBlocks.DEEPSLATE_UNKNOWN_ORE);
                    output.accept(PrideCraftBlocks.PRIDE_ORE);
                    output.accept(PrideCraftBlocks.DEEPSLATE_PRIDE_ORE);

                    //Storage Blocks
                    output.accept(PrideCraftBlocks.UNKNOWN_MATERIAL_BLOCK);
                    output.accept(PrideCraftBlocks.CORRUPTED_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.PRIDE_BLOCK);

                    //Flag Blocks
                    output.accept(PrideCraftBlocks.ABROSEXUAL_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.AGENDER_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.AROACE_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.AROMANTIC_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.ASEXUAL_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.BIGENDER_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.BISEXUAL_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.DEMIBOY_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.DEMIGIRL_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.DEMINONBINARY_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.DEMIROMANTIC_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.DEMISEXUAL_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.GAY_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.GENDERFLUID_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.GENDERFLUX_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.GENDERQUEER_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.GRAYROMANTIC_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.GRAYSEXUAL_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.INTERSEX_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.LESBIAN_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.NONBINARY_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.OMNISEXUAL_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.PANSEXUAL_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.POLYSEXUAL_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.PROGRESS_PRIDE_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.QUEER_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.RAINBOW_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.TRANSFEMININE_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.TRANSGENDER_FLAG_BLOCK);
                    output.accept(PrideCraftBlocks.TRANSMASCULINE_FLAG_BLOCK);

                    //Flag Carpets
                    output.accept(PrideCraftBlocks.ABROSEXUAL_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.AGENDER_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.AROACE_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.AROMANTIC_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.ASEXUAL_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.BIGENDER_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.BISEXUAL_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.DEMIBOY_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.DEMIGIRL_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.DEMINONBINARY_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.DEMIROMANTIC_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.DEMISEXUAL_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.GAY_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.GENDERFLUID_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.GENDERFLUX_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.GENDERQUEER_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.GRAYROMANTIC_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.GRAYSEXUAL_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.INTERSEX_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.LESBIAN_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.NONBINARY_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.OMNISEXUAL_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.PANSEXUAL_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.POLYSEXUAL_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.PROGRESS_PRIDE_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.QUEER_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.RAINBOW_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.TRANSFEMININE_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.TRANSGENDER_FLAG_CARPET);
                    output.accept(PrideCraftBlocks.TRANSMASCULINE_FLAG_CARPET);

                    //Mini Flags
                    output.accept(PrideCraftBlocks.ABROSEXUAL_MINI_FLAG);
                    output.accept(PrideCraftBlocks.AGENDER_MINI_FLAG);
                    output.accept(PrideCraftBlocks.AROACE_MINI_FLAG);
                    output.accept(PrideCraftBlocks.AROMANTIC_MINI_FLAG);
                    output.accept(PrideCraftBlocks.ASEXUAL_MINI_FLAG);
                    output.accept(PrideCraftBlocks.BIGENDER_MINI_FLAG);
                    output.accept(PrideCraftBlocks.BISEXUAL_MINI_FLAG);
                    output.accept(PrideCraftBlocks.DEMIBOY_MINI_FLAG);
                    output.accept(PrideCraftBlocks.DEMIGIRL_MINI_FLAG);
                    output.accept(PrideCraftBlocks.DEMINONBINARY_MINI_FLAG);
                    output.accept(PrideCraftBlocks.DEMIROMANTIC_MINI_FLAG);
                    output.accept(PrideCraftBlocks.DEMISEXUAL_MINI_FLAG);
                    output.accept(PrideCraftBlocks.GAY_MINI_FLAG);
                    output.accept(PrideCraftBlocks.GENDERFLUID_MINI_FLAG);
                    output.accept(PrideCraftBlocks.GENDERFLUX_MINI_FLAG);
                    output.accept(PrideCraftBlocks.GENDERQUEER_MINI_FLAG);
                    output.accept(PrideCraftBlocks.GRAYROMANTIC_MINI_FLAG);
                    output.accept(PrideCraftBlocks.GRAYSEXUAL_MINI_FLAG);
                    output.accept(PrideCraftBlocks.INTERSEX_MINI_FLAG);
                    output.accept(PrideCraftBlocks.LESBIAN_MINI_FLAG);
                    output.accept(PrideCraftBlocks.NONBINARY_MINI_FLAG);
                    output.accept(PrideCraftBlocks.OMNISEXUAL_MINI_FLAG);
                    output.accept(PrideCraftBlocks.PANSEXUAL_MINI_FLAG);
                    output.accept(PrideCraftBlocks.POLYSEXUAL_MINI_FLAG);
                    output.accept(PrideCraftBlocks.PROGRESS_PRIDE_MINI_FLAG);
                    output.accept(PrideCraftBlocks.QUEER_MINI_FLAG);
                    output.accept(PrideCraftBlocks.RAINBOW_MINI_FLAG);
                    output.accept(PrideCraftBlocks.TRANSFEMININE_MINI_FLAG);
                    output.accept(PrideCraftBlocks.TRANSGENDER_MINI_FLAG);
                    output.accept(PrideCraftBlocks.TRANSMASCULINE_MINI_FLAG);

                    //Wall Flags
                    output.accept(PrideCraftBlocks.ABROSEXUAL_WALL_FLAG);
                    output.accept(PrideCraftBlocks.AGENDER_WALL_FLAG);
                    output.accept(PrideCraftBlocks.AROACE_WALL_FLAG);
                    output.accept(PrideCraftBlocks.AROMANTIC_WALL_FLAG);
                    output.accept(PrideCraftBlocks.ASEXUAL_WALL_FLAG);
                    output.accept(PrideCraftBlocks.BIGENDER_WALL_FLAG);
                    output.accept(PrideCraftBlocks.BISEXUAL_WALL_FLAG);
                    output.accept(PrideCraftBlocks.DEMIBOY_WALL_FLAG);
                    output.accept(PrideCraftBlocks.DEMIGIRL_WALL_FLAG);
                    output.accept(PrideCraftBlocks.DEMINONBINARY_WALL_FLAG);
                    output.accept(PrideCraftBlocks.DEMIROMANTIC_WALL_FLAG);
                    output.accept(PrideCraftBlocks.DEMISEXUAL_WALL_FLAG);
                    output.accept(PrideCraftBlocks.GAY_WALL_FLAG);
                    output.accept(PrideCraftBlocks.GENDERFLUID_WALL_FLAG);
                    output.accept(PrideCraftBlocks.GENDERFLUX_WALL_FLAG);
                    output.accept(PrideCraftBlocks.GENDERQUEER_WALL_FLAG);
                    output.accept(PrideCraftBlocks.GRAYROMANTIC_WALL_FLAG);
                    output.accept(PrideCraftBlocks.GRAYSEXUAL_WALL_FLAG);
                    output.accept(PrideCraftBlocks.INTERSEX_WALL_FLAG);
                    output.accept(PrideCraftBlocks.LESBIAN_WALL_FLAG);
                    output.accept(PrideCraftBlocks.NONBINARY_WALL_FLAG);
                    output.accept(PrideCraftBlocks.OMNISEXUAL_WALL_FLAG);
                    output.accept(PrideCraftBlocks.PANSEXUAL_WALL_FLAG);
                    output.accept(PrideCraftBlocks.POLYSEXUAL_WALL_FLAG);
                    output.accept(PrideCraftBlocks.PROGRESS_PRIDE_WALL_FLAG);
                    output.accept(PrideCraftBlocks.QUEER_WALL_FLAG);
                    output.accept(PrideCraftBlocks.RAINBOW_WALL_FLAG);
                    output.accept(PrideCraftBlocks.TRANSFEMININE_WALL_FLAG);
                    output.accept(PrideCraftBlocks.TRANSGENDER_WALL_FLAG);
                    output.accept(PrideCraftBlocks.TRANSMASCULINE_WALL_FLAG);

                    //Flowers
                    output.accept(PrideCraftBlocks.ABROSEXUAL_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.AGENDER_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.AROACE_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.AROMANTIC_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.ASEXUAL_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.BIGENDER_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.BISEXUAL_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.DEMIBOY_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.DEMIGIRL_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.DEMINONBINARY_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.DEMIROMANTIC_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.DEMISEXUAL_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.GAY_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.GENDERFLUID_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.GENDERFLUX_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.GENDERQUEER_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.GRAYROMANTIC_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.GRAYSEXUAL_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.INTERSEX_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.LESBIAN_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.NONBINARY_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.OMNISEXUAL_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.PANSEXUAL_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.POLYSEXUAL_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.PROGRESS_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.QUEER_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.RAINBOW_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.TRANSFEMININE_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.TRANSGENDER_PRIDE_FLOWER);
                    output.accept(PrideCraftBlocks.TRANSMASCULINE_PRIDE_FLOWER);
                })
                .build());

    public static final Supplier<CreativeModeTab> PRIDE_CRAFT_ITEMS_TAB = CREATIVE_MODE_TAB.register("pride_craft_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(PrideCraftItems.PROGRESS_PRIDE_MATERIAL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "pride_craft_blocks_tab"))
                    .title(Component.translatable("creativetab.pridecraft.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Other Things
                        output.accept(PrideCraftItems.UNKNOWN_MATERIAL);
                        output.accept(PrideCraftItems.CORRUPTED_FLAG_MATERIAL);
                        output.accept(PrideCraftItems.PRIDE_INGOT);

                        //Flag Materials
                        output.accept(PrideCraftItems.ABROSEXUAL_MATERIAL);
                        output.accept(PrideCraftItems.AGENDER_MATERIAL);
                        output.accept(PrideCraftItems.AROACE_MATERIAL);
                        output.accept(PrideCraftItems.AROMANTIC_MATERIAL);
                        output.accept(PrideCraftItems.ASEXUAL_MATERIAL);
                        output.accept(PrideCraftItems.BIGENDER_MATERIAL);
                        output.accept(PrideCraftItems.BISEXUAL_MATERIAL);
                        output.accept(PrideCraftItems.DEMIBOY_MATERIAL);
                        output.accept(PrideCraftItems.DEMIGIRL_MATERIAL);
                        output.accept(PrideCraftItems.DEMINONBINARY_MATERIAL);
                        output.accept(PrideCraftItems.DEMIROMANTIC_MATERIAL);
                        output.accept(PrideCraftItems.DEMISEXUAL_MATERIAL);
                        output.accept(PrideCraftItems.GAY_MATERIAL);
                        output.accept(PrideCraftItems.GENDERFLUID_MATERIAL);
                        output.accept(PrideCraftItems.GENDERFLUX_MATERIAL);
                        output.accept(PrideCraftItems.GENDERQUEER_MATERIAL);
                        output.accept(PrideCraftItems.GRAYROMANTIC_MATERIAL);
                        output.accept(PrideCraftItems.GRAYSEXUAL_MATERIAL);
                        output.accept(PrideCraftItems.INTERSEX_MATERIAL);
                        output.accept(PrideCraftItems.LESBIAN_MATERIAL);
                        output.accept(PrideCraftItems.NONBINARY_MATERIAL);
                        output.accept(PrideCraftItems.OMNISEXUAL_MATERIAL);
                        output.accept(PrideCraftItems.PANSEXUAL_MATERIAL);
                        output.accept(PrideCraftItems.POLYSEXUAL_MATERIAL);
                        output.accept(PrideCraftItems.PROGRESS_PRIDE_MATERIAL);
                        output.accept(PrideCraftItems.QUEER_MATERIAL);
                        output.accept(PrideCraftItems.RAINBOW_MATERIAL);
                        output.accept(PrideCraftItems.TRANSFEMININE_MATERIAL);
                        output.accept(PrideCraftItems.TRANSGENDER_MATERIAL);
                        output.accept(PrideCraftItems.TRANSMASCULINE_MATERIAL);

                        output.accept(PrideCraftItems.BLAHAJ);
                        output.accept(PrideCraftItems.BLUE_BLAHAJ);
                        output.accept(PrideCraftItems.GOLDEN_BLAHAJ);
                        output.accept(PrideCraftItems.GREEN_BLAHAJ);
                        output.accept(PrideCraftItems.ORANGE_BLAHAJ);
                        output.accept(PrideCraftItems.PURPLE_BLAHAJ);
                        output.accept(PrideCraftItems.RED_BLAHAJ);
                    })
                    .build());




public static void register(IEventBus eventBus) {CREATIVE_MODE_TAB.register(eventBus); }
}
