package net.redflower.pridecraft.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PrideCraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Flag Block
        blockWIthItem(ModBlocks.ABROSEXUAL_FLAG_BLOCK);
        blockWIthItem(ModBlocks.AGENDER_FLAG_BLOCK);
        blockWIthItem(ModBlocks.AROACE_FLAG_BLOCK);
        blockWIthItem(ModBlocks.AROMANTIC_FLAG_BLOCK);
        blockWIthItem(ModBlocks.ASEXUAL_FLAG_BLOCK);
        blockWIthItem(ModBlocks.BIGENDER_FLAG_BLOCK);
        blockWIthItem(ModBlocks.BISEXUAL_FLAG_BLOCK);
        blockWIthItem(ModBlocks.DEMIBOY_FLAG_BLOCK);
        blockWIthItem(ModBlocks.DEMIGIRL_FLAG_BLOCK);
        blockWIthItem(ModBlocks.DEMIROMANTIC_FLAG_BLOCK);
        blockWIthItem(ModBlocks.DEMISEXUAL_FLAG_BLOCK);
        blockWIthItem(ModBlocks.GAY_FLAG_BLOCK);
        blockWIthItem(ModBlocks.GENDERFLUID_FLAG_BLOCK);
        blockWIthItem(ModBlocks.GENDERFLUX_FLAG_BLOCK);
        blockWIthItem(ModBlocks.GENDERQUEER_FLAG_BLOCK);
        blockWIthItem(ModBlocks.GRAYSEXUAL_FLAG_BLOCK);
        blockWIthItem(ModBlocks.INTERSEX_FLAG_BLOCK);
        blockWIthItem(ModBlocks.LESBIAN_FLAG_BLOCK);
        blockWIthItem(ModBlocks.NONBINARY_FLAG_BLOCK);
        blockWIthItem(ModBlocks.OMNISEXUAL_FLAG_BLOCK);
        blockWIthItem(ModBlocks.PANSEXUAL_FLAG_BLOCK);
        blockWIthItem(ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK);
        blockWIthItem(ModBlocks.QUEER_FLAG_BLOCK);
        blockWIthItem(ModBlocks.RAINBOW_FLAG_BLOCK);
        blockWIthItem(ModBlocks.TRANSGENDER_FLAG_BLOCK);
        blockWIthItem(ModBlocks.DEMINONBINARY_FLAG_BLOCK);
        blockWIthItem(ModBlocks.GRAYROMANTIC_FLAG_BLOCK);
        blockWIthItem(ModBlocks.POLYSEXUAL_FLAG_BLOCK);

        //Other Blocks
        blockWIthItem(ModBlocks.UNKNOWN_ORE);
        blockWIthItem(ModBlocks.DEEPSLATE_UNKNOWN_ORE);
    }

    private void blockWIthItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
