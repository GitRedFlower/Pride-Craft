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
import net.redflower.pridecraft.block.PrideCraftBlocks;

public class PrideCraftBlockModelProvider extends BlockStateProvider {

    public PrideCraftBlockModelProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PrideCraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Flag Block
        blockWIthItem(PrideCraftBlocks.ABROSEXUAL_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.AGENDER_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.AROACE_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.AROMANTIC_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.ASEXUAL_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.BIGENDER_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.BISEXUAL_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.DEMIBOY_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.DEMIGIRL_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.DEMIROMANTIC_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.DEMISEXUAL_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.GAY_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.GENDERFLUID_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.GENDERFLUX_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.GENDERQUEER_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.GRAYSEXUAL_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.INTERSEX_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.LESBIAN_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.NONBINARY_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.OMNISEXUAL_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.PANSEXUAL_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.PROGRESS_PRIDE_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.QUEER_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.RAINBOW_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.TRANSGENDER_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.DEMINONBINARY_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.GRAYROMANTIC_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.POLYSEXUAL_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.TRANSFEMININE_FLAG_BLOCK);
        blockWIthItem(PrideCraftBlocks.TRANSMASCULINE_FLAG_BLOCK);

        //Mini Flags
        customBlockItem(PrideCraftBlocks.ABROSEXUAL_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.AGENDER_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.AROACE_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.AROMANTIC_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.ASEXUAL_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.BIGENDER_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.BISEXUAL_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.DEMIBOY_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.DEMIGIRL_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.DEMINONBINARY_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.DEMIROMANTIC_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.DEMISEXUAL_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.GAY_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.GENDERFLUID_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.GENDERFLUX_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.GENDERQUEER_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.GRAYROMANTIC_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.GRAYSEXUAL_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.INTERSEX_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.LESBIAN_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.NONBINARY_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.OMNISEXUAL_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.PANSEXUAL_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.POLYSEXUAL_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.PROGRESS_PRIDE_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.QUEER_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.RAINBOW_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.TRANSGENDER_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.TRANSFEMININE_MINI_FLAG);
        customBlockItem(PrideCraftBlocks.TRANSMASCULINE_MINI_FLAG);


        //Wall Flags
        customBlockItem(PrideCraftBlocks.ABROSEXUAL_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.AGENDER_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.AROACE_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.AROMANTIC_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.ASEXUAL_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.BIGENDER_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.BISEXUAL_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.DEMIBOY_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.DEMIGIRL_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.DEMINONBINARY_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.DEMIROMANTIC_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.DEMISEXUAL_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.GAY_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.GENDERFLUID_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.GENDERFLUX_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.GENDERQUEER_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.GRAYROMANTIC_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.GRAYSEXUAL_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.INTERSEX_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.LESBIAN_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.NONBINARY_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.OMNISEXUAL_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.PANSEXUAL_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.POLYSEXUAL_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.PROGRESS_PRIDE_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.QUEER_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.RAINBOW_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.TRANSGENDER_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.TRANSFEMININE_WALL_FLAG);
        customBlockItem(PrideCraftBlocks.TRANSMASCULINE_WALL_FLAG);


        //Flag Carpets
        customBlockItem(PrideCraftBlocks.ABROSEXUAL_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.AGENDER_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.AROACE_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.AROMANTIC_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.ASEXUAL_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.BIGENDER_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.BISEXUAL_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.DEMIBOY_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.DEMIGIRL_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.DEMINONBINARY_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.DEMIROMANTIC_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.DEMISEXUAL_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.GAY_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.GENDERFLUID_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.GENDERFLUX_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.GENDERQUEER_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.GRAYROMANTIC_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.GRAYSEXUAL_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.INTERSEX_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.LESBIAN_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.NONBINARY_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.OMNISEXUAL_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.PANSEXUAL_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.POLYSEXUAL_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.PROGRESS_PRIDE_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.QUEER_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.RAINBOW_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.TRANSGENDER_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.TRANSFEMININE_FLAG_CARPET);
        customBlockItem(PrideCraftBlocks.TRANSMASCULINE_FLAG_CARPET);

        //Flowers
        flowerBlock(PrideCraftBlocks.ABROSEXUAL_PRIDE_FLOWER, PrideCraftBlocks.POTTED_ABROSEXUAL_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.AGENDER_PRIDE_FLOWER, PrideCraftBlocks.POTTED_AGENDER_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.AROACE_PRIDE_FLOWER, PrideCraftBlocks.POTTED_AROACE_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.AROMANTIC_PRIDE_FLOWER, PrideCraftBlocks.POTTED_AROMANTIC_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.ASEXUAL_PRIDE_FLOWER, PrideCraftBlocks.POTTED_ASEXUAL_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.BIGENDER_PRIDE_FLOWER, PrideCraftBlocks.POTTED_BIGENDER_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.BISEXUAL_PRIDE_FLOWER, PrideCraftBlocks.POTTED_BISEXUAL_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.DEMIBOY_PRIDE_FLOWER, PrideCraftBlocks.POTTED_DEMIBOY_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.DEMIGIRL_PRIDE_FLOWER, PrideCraftBlocks.POTTED_DEMIGIRL_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.DEMINONBINARY_PRIDE_FLOWER, PrideCraftBlocks.POTTED_DEMINONBINARY_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.DEMIROMANTIC_PRIDE_FLOWER, PrideCraftBlocks.POTTED_DEMIROMANTIC_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.DEMISEXUAL_PRIDE_FLOWER, PrideCraftBlocks.POTTED_DEMISEXUAL_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.GAY_PRIDE_FLOWER, PrideCraftBlocks.POTTED_GAY_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.GENDERFLUID_PRIDE_FLOWER, PrideCraftBlocks.POTTED_GENDERFLUID_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.GENDERFLUX_PRIDE_FLOWER, PrideCraftBlocks.POTTED_GENDERFLUX_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.GENDERQUEER_PRIDE_FLOWER, PrideCraftBlocks.POTTED_GENDERQUEER_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.GRAYROMANTIC_PRIDE_FLOWER, PrideCraftBlocks.POTTED_GRAYROMANTIC_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.GRAYSEXUAL_PRIDE_FLOWER, PrideCraftBlocks.POTTED_GRAYSEXUAL_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.INTERSEX_PRIDE_FLOWER, PrideCraftBlocks.POTTED_INTERSEX_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.LESBIAN_PRIDE_FLOWER, PrideCraftBlocks.POTTED_LESBIAN_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.NONBINARY_PRIDE_FLOWER, PrideCraftBlocks.POTTED_NONBINARY_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.OMNISEXUAL_PRIDE_FLOWER, PrideCraftBlocks.POTTED_OMNISEXUAL_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.PANSEXUAL_PRIDE_FLOWER, PrideCraftBlocks.POTTED_PANSEXUAL_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.POLYSEXUAL_PRIDE_FLOWER, PrideCraftBlocks.POTTED_POLYSEXUAL_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.PROGRESS_PRIDE_FLOWER, PrideCraftBlocks.POTTED_PROGRESS_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.QUEER_PRIDE_FLOWER, PrideCraftBlocks.POTTED_QUEER_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.RAINBOW_PRIDE_FLOWER, PrideCraftBlocks.POTTED_RAINBOW_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.TRANSFEMININE_PRIDE_FLOWER, PrideCraftBlocks.POTTED_TRANSFEMININE_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.TRANSGENDER_PRIDE_FLOWER, PrideCraftBlocks.POTTED_TRANSGENDER_PRIDE_FLOWER);
        flowerBlock(PrideCraftBlocks.TRANSMASCULINE_PRIDE_FLOWER, PrideCraftBlocks.POTTED_TRANSMASCULINE_PRIDE_FLOWER);

        //Other Blocks
        //Ore Blocks
        blockWIthItem(PrideCraftBlocks.UNKNOWN_ORE);
        blockWIthItem(PrideCraftBlocks.DEEPSLATE_UNKNOWN_ORE);
        blockWIthItem(PrideCraftBlocks.PRIDE_ORE);
        blockWIthItem(PrideCraftBlocks.DEEPSLATE_PRIDE_ORE);

        //Storage Blocks
        blockWIthItem(PrideCraftBlocks.UNKNOWN_MATERIAL_BLOCK);
        blockWIthItem(PrideCraftBlocks.CORRUPTED_FLAG_BLOCK);
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

    //Creates Custom Flower Block Model + Pot Model
    private void flowerBlock(DeferredBlock<?> flower, DeferredBlock<?> pot) {
        simpleBlockWithItem(flower.get(), models().cross(blockTexture(flower.get()).getPath(), blockTexture(flower.get())).renderType("cutout"));
        simpleBlockWithItem(pot.get(), models().singleTexture(pot.getId().getPath(),
                        ResourceLocation.withDefaultNamespace("block/flower_pot_cross"), "plant",
                        blockTexture(flower.get())).renderType("cutout"));
    }
}

