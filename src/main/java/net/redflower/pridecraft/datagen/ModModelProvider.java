package net.redflower.pridecraft.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.block.ModBlocks;
import net.redflower.pridecraft.item.ModItems;

import java.util.stream.Stream;

public class ModModelProvider extends ModelProvider {


    public ModModelProvider(PackOutput output) {
        super(output, PrideCraft.MODID);
    }

    //Now Has access to all base Minecraft model providers/ methods
    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        //Items
        //Unknown Material
        itemModels.generateFlatItem(ModItems.UNKNOWN_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CORRUPTED_FLAG_MATERIAL.get(), ModelTemplates.FLAT_ITEM);

        //Flag Material
        itemModels.generateFlatItem(ModItems.ABROSEXUAL_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.AGENDER_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.AROACE_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.AROMANTIC_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ASEXUAL_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BIGENDER_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BISEXUAL_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DEMIBOY_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DEMIGIRL_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DEMIROMANTIC_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DEMISEXUAL_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.GAY_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.GENDERFLUID_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.GENDERFLUX_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.GENDERQUEER_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.GRAYROMANTIC_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.GRAYSEXUAL_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.INTERSEX_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.LESBIAN_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.NONBINARY_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.OMNISEXUAL_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PANSEXUAL_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.POLYSEXUAL_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PROGRESS_PRIDE_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.QUEER_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAINBOW_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TRANSGENDER_MATERIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DEMINONBINARY_MATERIAL.get(), ModelTemplates.FLAT_ITEM);

        //Blocks
        //Unknown Ores
        blockModels.createTrivialCube(ModBlocks.UNKNOWN_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_UNKNOWN_ORE.get());

        //Storage Blocks
        blockModels.createTrivialCube(ModBlocks.UNKNOWN_MATERIAL_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CORRUPTED_FLAG_BLOCK.get());

        //Flag Blocks
        blockModels.createTrivialCube(ModBlocks.ABROSEXUAL_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.AGENDER_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.AROACE_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.AROMANTIC_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.ASEXUAL_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.BIGENDER_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.BISEXUAL_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DEMIBOY_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DEMIGIRL_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DEMINONBINARY_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DEMIROMANTIC_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DEMISEXUAL_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.GAY_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.GENDERFLUID_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.GENDERFLUX_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.GENDERQUEER_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.GRAYROMANTIC_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.GRAYSEXUAL_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.INTERSEX_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.LESBIAN_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.NONBINARY_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.OMNISEXUAL_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.PANSEXUAL_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.POLYSEXUAL_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.QUEER_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAINBOW_FLAG_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.TRANSGENDER_FLAG_BLOCK.get());

    }

    //Figure out how to check for the Mini Flags/ any custom-made blockstates or stuff
    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream()
                .filter(x -> !x.is(ModBlocks.ABROSEXUAL_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.AGENDER_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.AROACE_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.AROMANTIC_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.ASEXUAL_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.BIGENDER_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.BISEXUAL_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.DEMIBOY_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.DEMIGIRL_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.DEMINONBINARY_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.DEMIROMANTIC_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.DEMISEXUAL_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.GAY_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.GENDERFLUID_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.GENDERFLUX_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.GENDERQUEER_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.GRAYROMANTIC_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.GRAYSEXUAL_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.INTERSEX_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.LESBIAN_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.NONBINARY_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.OMNISEXUAL_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.PANSEXUAL_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.POLYSEXUAL_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.PROGRESS_PRIDE_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.QUEER_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.RAINBOW_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.TRANSGENDER_MINI_FLAG))
                .filter(x -> !x.is(ModBlocks.ABROSEXUAL_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.AGENDER_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.AROACE_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.AROMANTIC_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.ASEXUAL_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.BIGENDER_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.BISEXUAL_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.DEMIBOY_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.DEMIGIRL_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.DEMINONBINARY_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.DEMIROMANTIC_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.DEMISEXUAL_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.GAY_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.GENDERFLUID_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.GENDERFLUX_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.GENDERQUEER_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.GRAYROMANTIC_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.GRAYSEXUAL_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.INTERSEX_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.LESBIAN_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.NONBINARY_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.OMNISEXUAL_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.PANSEXUAL_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.POLYSEXUAL_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.PROGRESS_PRIDE_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.QUEER_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.RAINBOW_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.TRANSGENDER_WALL_FLAG))
                .filter(x -> !x.is(ModBlocks.ABROSEXUAL_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.AGENDER_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.AROACE_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.AROMANTIC_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.ASEXUAL_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.BIGENDER_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.BISEXUAL_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.DEMIBOY_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.DEMIGIRL_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.DEMINONBINARY_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.DEMIROMANTIC_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.DEMISEXUAL_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.GAY_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.GENDERFLUID_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.GENDERFLUX_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.GENDERQUEER_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.GRAYROMANTIC_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.GRAYSEXUAL_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.INTERSEX_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.LESBIAN_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.NONBINARY_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.OMNISEXUAL_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.PANSEXUAL_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.POLYSEXUAL_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.PROGRESS_PRIDE_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.QUEER_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.RAINBOW_FLAG_CARPET))
                .filter(x -> !x.is(ModBlocks.TRANSGENDER_FLAG_CARPET));
    }

    //Figure out how to check for the Mini Flags/ any custom-made blockstates or stuff
    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return ModItems.ITEMS.getEntries().stream()
                .filter(x -> x.get() != ModBlocks.ABROSEXUAL_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.AGENDER_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.AROACE_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.AROMANTIC_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.ASEXUAL_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.BIGENDER_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.BISEXUAL_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.DEMIBOY_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.DEMIGIRL_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.DEMINONBINARY_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.DEMIROMANTIC_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.DEMISEXUAL_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.GAY_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.GENDERFLUID_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.GENDERFLUX_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.GENDERQUEER_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.GRAYROMANTIC_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.GRAYSEXUAL_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.INTERSEX_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.LESBIAN_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.NONBINARY_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.OMNISEXUAL_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.PANSEXUAL_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.POLYSEXUAL_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.PROGRESS_PRIDE_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.QUEER_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.RAINBOW_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.TRANSGENDER_MINI_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.ABROSEXUAL_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.AGENDER_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.AROACE_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.AROMANTIC_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.ASEXUAL_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.BIGENDER_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.BISEXUAL_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.DEMIBOY_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.DEMIGIRL_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.DEMINONBINARY_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.DEMIROMANTIC_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.DEMISEXUAL_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.GAY_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.GENDERFLUID_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.GENDERFLUX_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.GENDERQUEER_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.GRAYROMANTIC_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.GRAYSEXUAL_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.INTERSEX_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.LESBIAN_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.NONBINARY_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.OMNISEXUAL_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.PANSEXUAL_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.POLYSEXUAL_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.PROGRESS_PRIDE_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.QUEER_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.RAINBOW_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.TRANSGENDER_WALL_FLAG.asItem())
                .filter(x -> x.get() != ModBlocks.ABROSEXUAL_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.AGENDER_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.AROACE_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.AROMANTIC_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.ASEXUAL_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.BIGENDER_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.BISEXUAL_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.DEMIBOY_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.DEMIGIRL_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.DEMINONBINARY_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.DEMIROMANTIC_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.DEMISEXUAL_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.GAY_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.GENDERFLUID_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.GENDERFLUX_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.GENDERQUEER_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.GRAYROMANTIC_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.GRAYSEXUAL_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.INTERSEX_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.LESBIAN_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.NONBINARY_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.OMNISEXUAL_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.PANSEXUAL_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.POLYSEXUAL_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.PROGRESS_PRIDE_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.QUEER_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.RAINBOW_FLAG_CARPET.asItem())
                .filter(x -> x.get() != ModBlocks.TRANSGENDER_FLAG_CARPET.asItem());
    }
}