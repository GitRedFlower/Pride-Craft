package net.redflower.pridecraft;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.redflower.pridecraft.block.ModBlocks;
import net.redflower.pridecraft.item.ModItems;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrideCraft.MODID);

    public static final RegistryObject<CreativeModeTab> PRIDE_CRAFT_BLOCKS_TAB = CREATIVE_MODE_TABS.register("pride_craft_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK.get()))
                    .title(Component.translatable("creativetab.pridecraft.blocks"))
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
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> PRIDE_CRAFT_ITEMS_TAB = CREATIVE_MODE_TABS.register("pride_craft_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PROGRESS_PRIDE_MATERIAL.get()))
                    .title(Component.translatable("creativetab.pridecraft.items"))
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
