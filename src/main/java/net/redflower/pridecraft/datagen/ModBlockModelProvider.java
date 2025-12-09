package net.redflower.pridecraft.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.block.ModBlocks;

public class ModBlockModelProvider extends BlockStateProvider {

    public ModBlockModelProvider(PackOutput output, ExistingFileHelper exFileHelper) {
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
        blockWIthItem(ModBlocks.TRANSFEMININE_FLAG_BLOCK);
        blockWIthItem(ModBlocks.TRANSMASCULINE_FLAG_BLOCK);

        //Mini Flags
        customBlockItem(ModBlocks.ABROSEXUAL_MINI_FLAG);
        customBlockItem(ModBlocks.AGENDER_MINI_FLAG);
        customBlockItem(ModBlocks.AROACE_MINI_FLAG);
        customBlockItem(ModBlocks.AROMANTIC_MINI_FLAG);
        customBlockItem(ModBlocks.ASEXUAL_MINI_FLAG);
        customBlockItem(ModBlocks.BIGENDER_MINI_FLAG);
        customBlockItem(ModBlocks.BISEXUAL_MINI_FLAG);
        customBlockItem(ModBlocks.DEMIBOY_MINI_FLAG);
        customBlockItem(ModBlocks.DEMIGIRL_MINI_FLAG);
        customBlockItem(ModBlocks.DEMINONBINARY_MINI_FLAG);
        customBlockItem(ModBlocks.DEMIROMANTIC_MINI_FLAG);
        customBlockItem(ModBlocks.DEMISEXUAL_MINI_FLAG);
        customBlockItem(ModBlocks.GAY_MINI_FLAG);
        customBlockItem(ModBlocks.GENDERFLUID_MINI_FLAG);
        customBlockItem(ModBlocks.GENDERFLUX_MINI_FLAG);
        customBlockItem(ModBlocks.GENDERQUEER_MINI_FLAG);
        customBlockItem(ModBlocks.GRAYROMANTIC_MINI_FLAG);
        customBlockItem(ModBlocks.GRAYSEXUAL_MINI_FLAG);
        customBlockItem(ModBlocks.INTERSEX_MINI_FLAG);
        customBlockItem(ModBlocks.LESBIAN_MINI_FLAG);
        customBlockItem(ModBlocks.NONBINARY_MINI_FLAG);
        customBlockItem(ModBlocks.OMNISEXUAL_MINI_FLAG);
        customBlockItem(ModBlocks.PANSEXUAL_MINI_FLAG);
        customBlockItem(ModBlocks.POLYSEXUAL_MINI_FLAG);
        customBlockItem(ModBlocks.PROGRESS_PRIDE_MINI_FLAG);
        customBlockItem(ModBlocks.QUEER_MINI_FLAG);
        customBlockItem(ModBlocks.RAINBOW_MINI_FLAG);
        customBlockItem(ModBlocks.TRANSGENDER_MINI_FLAG);
        customBlockItem(ModBlocks.TRANSFEMININE_MINI_FLAG);
        customBlockItem(ModBlocks.TRANSMASCULINE_MINI_FLAG);


        //Wall Flags
        customBlockItem(ModBlocks.ABROSEXUAL_WALL_FLAG);
        customBlockItem(ModBlocks.AGENDER_WALL_FLAG);
        customBlockItem(ModBlocks.AROACE_WALL_FLAG);
        customBlockItem(ModBlocks.AROMANTIC_WALL_FLAG);
        customBlockItem(ModBlocks.ASEXUAL_WALL_FLAG);
        customBlockItem(ModBlocks.BIGENDER_WALL_FLAG);
        customBlockItem(ModBlocks.BISEXUAL_WALL_FLAG);
        customBlockItem(ModBlocks.DEMIBOY_WALL_FLAG);
        customBlockItem(ModBlocks.DEMIGIRL_WALL_FLAG);
        customBlockItem(ModBlocks.DEMINONBINARY_WALL_FLAG);
        customBlockItem(ModBlocks.DEMIROMANTIC_WALL_FLAG);
        customBlockItem(ModBlocks.DEMISEXUAL_WALL_FLAG);
        customBlockItem(ModBlocks.GAY_WALL_FLAG);
        customBlockItem(ModBlocks.GENDERFLUID_WALL_FLAG);
        customBlockItem(ModBlocks.GENDERFLUX_WALL_FLAG);
        customBlockItem(ModBlocks.GENDERQUEER_WALL_FLAG);
        customBlockItem(ModBlocks.GRAYROMANTIC_WALL_FLAG);
        customBlockItem(ModBlocks.GRAYSEXUAL_WALL_FLAG);
        customBlockItem(ModBlocks.INTERSEX_WALL_FLAG);
        customBlockItem(ModBlocks.LESBIAN_WALL_FLAG);
        customBlockItem(ModBlocks.NONBINARY_WALL_FLAG);
        customBlockItem(ModBlocks.OMNISEXUAL_WALL_FLAG);
        customBlockItem(ModBlocks.PANSEXUAL_WALL_FLAG);
        customBlockItem(ModBlocks.POLYSEXUAL_WALL_FLAG);
        customBlockItem(ModBlocks.PROGRESS_PRIDE_WALL_FLAG);
        customBlockItem(ModBlocks.QUEER_WALL_FLAG);
        customBlockItem(ModBlocks.RAINBOW_WALL_FLAG);
        customBlockItem(ModBlocks.TRANSGENDER_WALL_FLAG);
        customBlockItem(ModBlocks.TRANSFEMININE_WALL_FLAG);
        customBlockItem(ModBlocks.TRANSMASCULINE_WALL_FLAG);


        //Flag Carpets
        customBlockItem(ModBlocks.ABROSEXUAL_FLAG_CARPET);
        customBlockItem(ModBlocks.AGENDER_FLAG_CARPET);
        customBlockItem(ModBlocks.AROACE_FLAG_CARPET);
        customBlockItem(ModBlocks.AROMANTIC_FLAG_CARPET);
        customBlockItem(ModBlocks.ASEXUAL_FLAG_CARPET);
        customBlockItem(ModBlocks.BIGENDER_FLAG_CARPET);
        customBlockItem(ModBlocks.BISEXUAL_FLAG_CARPET);
        customBlockItem(ModBlocks.DEMIBOY_FLAG_CARPET);
        customBlockItem(ModBlocks.DEMIGIRL_FLAG_CARPET);
        customBlockItem(ModBlocks.DEMINONBINARY_FLAG_CARPET);
        customBlockItem(ModBlocks.DEMIROMANTIC_FLAG_CARPET);
        customBlockItem(ModBlocks.DEMISEXUAL_FLAG_CARPET);
        customBlockItem(ModBlocks.GAY_FLAG_CARPET);
        customBlockItem(ModBlocks.GENDERFLUID_FLAG_CARPET);
        customBlockItem(ModBlocks.GENDERFLUX_FLAG_CARPET);
        customBlockItem(ModBlocks.GENDERQUEER_FLAG_CARPET);
        customBlockItem(ModBlocks.GRAYROMANTIC_FLAG_CARPET);
        customBlockItem(ModBlocks.GRAYSEXUAL_FLAG_CARPET);
        customBlockItem(ModBlocks.INTERSEX_FLAG_CARPET);
        customBlockItem(ModBlocks.LESBIAN_FLAG_CARPET);
        customBlockItem(ModBlocks.NONBINARY_FLAG_CARPET);
        customBlockItem(ModBlocks.OMNISEXUAL_FLAG_CARPET);
        customBlockItem(ModBlocks.PANSEXUAL_FLAG_CARPET);
        customBlockItem(ModBlocks.POLYSEXUAL_FLAG_CARPET);
        customBlockItem(ModBlocks.PROGRESS_PRIDE_FLAG_CARPET);
        customBlockItem(ModBlocks.QUEER_FLAG_CARPET);
        customBlockItem(ModBlocks.RAINBOW_FLAG_CARPET);
        customBlockItem(ModBlocks.TRANSGENDER_FLAG_CARPET);
        customBlockItem(ModBlocks.TRANSFEMININE_FLAG_CARPET);
        customBlockItem(ModBlocks.TRANSMASCULINE_FLAG_CARPET);


        //Other Blocks
        //Ore Blocks
        blockWIthItem(ModBlocks.UNKNOWN_ORE);
        blockWIthItem(ModBlocks.DEEPSLATE_UNKNOWN_ORE);

        //Storage Blocks
        blockWIthItem(ModBlocks.UNKNOWN_MATERIAL_BLOCK);
        blockWIthItem(ModBlocks.CORRUPTED_FLAG_BLOCK);
    }

    private void blockWIthItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    //Works if in assets/minecraft/models/block
    //Needs To be worked on to use Pride Craft Model File Instead of minecraft
    //All 3 Methods Below Help With it
    private void customBlockItem(DeferredBlock<?> deferredBlock) {
        ModelFile model = models().withExistingParent(name(deferredBlock.get()), name(deferredBlock.get()));
        simpleBlockItem(deferredBlock.get(), model);
    }

    private String name(Block block) {
        return this.customKey(block).getPath();
    }

    private ResourceLocation customKey(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }
    //Maybe Fix in future
}

