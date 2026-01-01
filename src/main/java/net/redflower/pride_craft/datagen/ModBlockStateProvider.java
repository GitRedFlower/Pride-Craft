package net.redflower.pride_craft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.redflower.pride_craft.PrideCraft;
import net.redflower.pride_craft.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PrideCraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Flag Block
        blockWithItem(ModBlocks.ABROSEXUAL_FLAG_BLOCK);
        blockWithItem(ModBlocks.AGENDER_FLAG_BLOCK);
        blockWithItem(ModBlocks.AROACE_FLAG_BLOCK);
        blockWithItem(ModBlocks.AROMANTIC_FLAG_BLOCK);
        blockWithItem(ModBlocks.ASEXUAL_FLAG_BLOCK);
        blockWithItem(ModBlocks.BIGENDER_FLAG_BLOCK);
        blockWithItem(ModBlocks.BISEXUAL_FLAG_BLOCK);
        blockWithItem(ModBlocks.DEMIBOY_FLAG_BLOCK);
        blockWithItem(ModBlocks.DEMIGIRL_FLAG_BLOCK);
        blockWithItem(ModBlocks.DEMIROMANTIC_FLAG_BLOCK);
        blockWithItem(ModBlocks.DEMISEXUAL_FLAG_BLOCK);
        blockWithItem(ModBlocks.GAY_FLAG_BLOCK);
        blockWithItem(ModBlocks.GENDERFLUID_FLAG_BLOCK);
        blockWithItem(ModBlocks.GENDERFLUX_FLAG_BLOCK);
        blockWithItem(ModBlocks.GENDERQUEER_FLAG_BLOCK);
        blockWithItem(ModBlocks.GRAYSEXUAL_FLAG_BLOCK);
        blockWithItem(ModBlocks.INTERSEX_FLAG_BLOCK);
        blockWithItem(ModBlocks.LESBIAN_FLAG_BLOCK);
        blockWithItem(ModBlocks.NONBINARY_FLAG_BLOCK);
        blockWithItem(ModBlocks.OMNISEXUAL_FLAG_BLOCK);
        blockWithItem(ModBlocks.PANSEXUAL_FLAG_BLOCK);
        blockWithItem(ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK);
        blockWithItem(ModBlocks.QUEER_FLAG_BLOCK);
        blockWithItem(ModBlocks.RAINBOW_FLAG_BLOCK);
        blockWithItem(ModBlocks.TRANSGENDER_FLAG_BLOCK);
        blockWithItem(ModBlocks.DEMINONBINARY_FLAG_BLOCK);
        blockWithItem(ModBlocks.GRAYROMANTIC_FLAG_BLOCK);
        blockWithItem(ModBlocks.POLYSEXUAL_FLAG_BLOCK);
        blockWithItem(ModBlocks.TRANSFEMININE_FLAG_BLOCK);
        blockWithItem(ModBlocks.TRANSMASCULINE_FLAG_BLOCK);

        //Other Blocks
        //Ore Blocks
        blockWithItem(ModBlocks.UNKNOWN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_UNKNOWN_ORE);

        //Storage Blocks
        blockWithItem(ModBlocks.UNKNOWN_MATERIAL_BLOCK);
        blockWithItem(ModBlocks.CORRUPTED_FLAG_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}