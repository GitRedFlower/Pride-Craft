package net.redflower.pride_craft;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.redflower.pride_craft.block.ModBlocks;
import net.redflower.pride_craft.item.ModItems;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrideCraft.MODID);

    public static final RegistryObject<CreativeModeTab> PRIDE_CRAFT_BLOCKS_TAB = CREATIVE_MODE_TABS.register("pride_craft_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK.get()))
                    .title(Component.translatable("creativetab.pride_craft.blocks"))
                    .displayItems((parameters, output) -> {
                        //Other Blocks
                        //Ores
                        output.accept(ModBlocks.UNKNOWN_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_UNKNOWN_ORE.get());
                        //Storage Blocks
                        output.accept(ModBlocks.UNKNOWN_MATERIAL_BLOCK.get());
                        output.accept(ModBlocks.CORRUPTED_FLAG_BLOCK.get());

                        //Flag Blocks
                        output.accept(ModBlocks.ABROSEXUAL_FLAG_BLOCK.get());
                        output.accept(ModBlocks.AGENDER_FLAG_BLOCK.get());
                        output.accept(ModBlocks.AROACE_FLAG_BLOCK.get());
                        output.accept(ModBlocks.AROMANTIC_FLAG_BLOCK.get());
                        output.accept(ModBlocks.ASEXUAL_FLAG_BLOCK.get());
                        output.accept(ModBlocks.BIGENDER_FLAG_BLOCK.get());
                        output.accept(ModBlocks.BISEXUAL_FLAG_BLOCK.get());
                        output.accept(ModBlocks.DEMIBOY_FLAG_BLOCK.get());
                        output.accept(ModBlocks.DEMIGIRL_FLAG_BLOCK.get());
                        output.accept(ModBlocks.DEMINONBINARY_FLAG_BLOCK.get());
                        output.accept(ModBlocks.DEMIROMANTIC_FLAG_BLOCK.get());
                        output.accept(ModBlocks.DEMISEXUAL_FLAG_BLOCK.get());
                        output.accept(ModBlocks.GAY_FLAG_BLOCK.get());
                        output.accept(ModBlocks.GENDERFLUID_FLAG_BLOCK.get());
                        output.accept(ModBlocks.GENDERFLUX_FLAG_BLOCK.get());
                        output.accept(ModBlocks.GENDERQUEER_FLAG_BLOCK.get());
                        output.accept(ModBlocks.GRAYROMANTIC_FLAG_BLOCK.get());
                        output.accept(ModBlocks.GRAYSEXUAL_FLAG_BLOCK.get());
                        output.accept(ModBlocks.INTERSEX_FLAG_BLOCK.get());
                        output.accept(ModBlocks.LESBIAN_FLAG_BLOCK.get());
                        output.accept(ModBlocks.NONBINARY_FLAG_BLOCK.get());
                        output.accept(ModBlocks.OMNISEXUAL_FLAG_BLOCK.get());
                        output.accept(ModBlocks.PANSEXUAL_FLAG_BLOCK.get());
                        output.accept(ModBlocks.POLYSEXUAL_FLAG_BLOCK.get());
                        output.accept(ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK.get());
                        output.accept(ModBlocks.QUEER_FLAG_BLOCK.get());
                        output.accept(ModBlocks.RAINBOW_FLAG_BLOCK.get());
                        output.accept(ModBlocks.TRANSFEMININE_FLAG_BLOCK.get());
                        output.accept(ModBlocks.TRANSGENDER_FLAG_BLOCK.get());
                        output.accept(ModBlocks.TRANSMASCULINE_FLAG_BLOCK.get());

                        //Flag Carpets
                        output.accept(ModBlocks.ABROSEXUAL_FLAG_CARPET.get());
                        output.accept(ModBlocks.AGENDER_FLAG_CARPET.get());
                        output.accept(ModBlocks.AROACE_FLAG_CARPET.get());
                        output.accept(ModBlocks.AROMANTIC_FLAG_CARPET.get());
                        output.accept(ModBlocks.ASEXUAL_FLAG_CARPET.get());
                        output.accept(ModBlocks.BIGENDER_FLAG_CARPET.get());
                        output.accept(ModBlocks.BISEXUAL_FLAG_CARPET.get());
                        output.accept(ModBlocks.DEMIBOY_FLAG_CARPET.get());
                        output.accept(ModBlocks.DEMIGIRL_FLAG_CARPET.get());
                        output.accept(ModBlocks.DEMINONBINARY_FLAG_CARPET.get());
                        output.accept(ModBlocks.DEMIROMANTIC_FLAG_CARPET.get());
                        output.accept(ModBlocks.DEMISEXUAL_FLAG_CARPET.get());
                        output.accept(ModBlocks.GAY_FLAG_CARPET.get());
                        output.accept(ModBlocks.GENDERFLUID_FLAG_CARPET.get());
                        output.accept(ModBlocks.GENDERFLUX_FLAG_CARPET.get());
                        output.accept(ModBlocks.GENDERQUEER_FLAG_CARPET.get());
                        output.accept(ModBlocks.GRAYROMANTIC_FLAG_CARPET.get());
                        output.accept(ModBlocks.GRAYSEXUAL_FLAG_CARPET.get());
                        output.accept(ModBlocks.INTERSEX_FLAG_CARPET.get());
                        output.accept(ModBlocks.LESBIAN_FLAG_CARPET.get());
                        output.accept(ModBlocks.NONBINARY_FLAG_CARPET.get());
                        output.accept(ModBlocks.OMNISEXUAL_FLAG_CARPET.get());
                        output.accept(ModBlocks.PANSEXUAL_FLAG_CARPET.get());
                        output.accept(ModBlocks.POLYSEXUAL_FLAG_CARPET.get());
                        output.accept(ModBlocks.PROGRESS_PRIDE_FLAG_CARPET.get());
                        output.accept(ModBlocks.QUEER_FLAG_CARPET.get());
                        output.accept(ModBlocks.RAINBOW_FLAG_CARPET.get());
                        output.accept(ModBlocks.TRANSFEMININE_FLAG_CARPET.get());
                        output.accept(ModBlocks.TRANSGENDER_FLAG_CARPET.get());
                        output.accept(ModBlocks.TRANSMASCULINE_FLAG_CARPET.get());

                        //Wall Flags
                        output.accept(ModBlocks.ABROSEXUAL_WALL_FLAG.get());
                        output.accept(ModBlocks.AGENDER_WALL_FLAG.get());
                        output.accept(ModBlocks.AROACE_WALL_FLAG.get());
                        output.accept(ModBlocks.AROMANTIC_WALL_FLAG.get());
                        output.accept(ModBlocks.ASEXUAL_WALL_FLAG.get());
                        output.accept(ModBlocks.BIGENDER_WALL_FLAG.get());
                        output.accept(ModBlocks.BISEXUAL_WALL_FLAG.get());
                        output.accept(ModBlocks.DEMIBOY_WALL_FLAG.get());
                        output.accept(ModBlocks.DEMIGIRL_WALL_FLAG.get());
                        output.accept(ModBlocks.DEMINONBINARY_WALL_FLAG.get());
                        output.accept(ModBlocks.DEMIROMANTIC_WALL_FLAG.get());
                        output.accept(ModBlocks.DEMISEXUAL_WALL_FLAG.get());
                        output.accept(ModBlocks.GAY_WALL_FLAG.get());
                        output.accept(ModBlocks.GENDERFLUID_WALL_FLAG.get());
                        output.accept(ModBlocks.GENDERFLUX_WALL_FLAG.get());
                        output.accept(ModBlocks.GENDERQUEER_WALL_FLAG.get());
                        output.accept(ModBlocks.GRAYROMANTIC_WALL_FLAG.get());
                        output.accept(ModBlocks.GRAYSEXUAL_WALL_FLAG.get());
                        output.accept(ModBlocks.INTERSEX_WALL_FLAG.get());
                        output.accept(ModBlocks.LESBIAN_WALL_FLAG.get());
                        output.accept(ModBlocks.NONBINARY_WALL_FLAG.get());
                        output.accept(ModBlocks.OMNISEXUAL_WALL_FLAG.get());
                        output.accept(ModBlocks.PANSEXUAL_WALL_FLAG.get());
                        output.accept(ModBlocks.POLYSEXUAL_WALL_FLAG.get());
                        output.accept(ModBlocks.PROGRESS_PRIDE_WALL_FLAG.get());
                        output.accept(ModBlocks.QUEER_WALL_FLAG.get());
                        output.accept(ModBlocks.RAINBOW_WALL_FLAG.get());
                        output.accept(ModBlocks.TRANSFEMININE_WALL_FLAG.get());
                        output.accept(ModBlocks.TRANSGENDER_WALL_FLAG.get());
                        output.accept(ModBlocks.TRANSMASCULINE_WALL_FLAG.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> PRIDE_CRAFT_ITEMS_TAB = CREATIVE_MODE_TABS.register("pride_craft_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PROGRESS_PRIDE_MATERIAL.get()))
                    .title(Component.translatable("creativetab.pride_craft.items"))
                    .displayItems((parameters, output) -> {
                        //Other Things
                        output.accept(ModItems.UNKNOWN_MATERIAL.get());
                        output.accept(ModItems.CORRUPTED_FLAG_MATERIAL.get());

                        //Flag Materials
                        output.accept(ModItems.ABROSEXUAL_MATERIAL.get());
                        output.accept(ModItems.AGENDER_MATERIAL.get());
                        output.accept(ModItems.AROACE_MATERIAL.get());
                        output.accept(ModItems.AROMANTIC_MATERIAL.get());
                        output.accept(ModItems.ASEXUAL_MATERIAL.get());
                        output.accept(ModItems.BIGENDER_MATERIAL.get());
                        output.accept(ModItems.BISEXUAL_MATERIAL.get());
                        output.accept(ModItems.DEMIBOY_MATERIAL.get());
                        output.accept(ModItems.DEMIGIRL_MATERIAL.get());
                        output.accept(ModItems.DEMINONBINARY_MATERIAL.get());
                        output.accept(ModItems.DEMIROMANTIC_MATERIAL.get());
                        output.accept(ModItems.DEMISEXUAL_MATERIAL.get());
                        output.accept(ModItems.GAY_MATERIAL.get());
                        output.accept(ModItems.GENDERFLUID_MATERIAL.get());
                        output.accept(ModItems.GENDERFLUX_MATERIAL.get());
                        output.accept(ModItems.GENDERQUEER_MATERIAL.get());
                        output.accept(ModItems.GRAYROMANTIC_MATERIAL.get());
                        output.accept(ModItems.GRAYSEXUAL_MATERIAL.get());
                        output.accept(ModItems.INTERSEX_MATERIAL.get());
                        output.accept(ModItems.LESBIAN_MATERIAL.get());
                        output.accept(ModItems.NONBINARY_MATERIAL.get());
                        output.accept(ModItems.OMNISEXUAL_MATERIAL.get());
                        output.accept(ModItems.PANSEXUAL_MATERIAL.get());
                        output.accept(ModItems.POLYSEXUAL_MATERIAL.get());
                        output.accept(ModItems.PROGRESS_PRIDE_MATERIAL.get());
                        output.accept(ModItems.QUEER_MATERIAL.get());
                        output.accept(ModItems.RAINBOW_MATERIAL.get());
                        output.accept(ModItems.TRANSFEMININE_MATERIAL.get());
                        output.accept(ModItems.TRANSGENDER_MATERIAL.get());
                        output.accept(ModItems.TRANSMASCULINE_MATERIAL.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
