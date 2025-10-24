package net.redflower.pridecraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PrideCraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //Needs Hoe
        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.ABROSEXUAL_FLAG_BLOCK.get())
                .add(ModBlocks.AGENDER_FLAG_BLOCK.get())
                .add(ModBlocks.AROACE_FLAG_BLOCK.get())
                .add(ModBlocks.AROMANTIC_FLAG_BLOCK.get())
                .add(ModBlocks.ASEXUAL_FLAG_BLOCK.get())
                .add(ModBlocks.BIGENDER_FLAG_BLOCK.get())
                .add(ModBlocks.BISEXUAL_FLAG_BLOCK.get())
                .add(ModBlocks.DEMIBOY_FLAG_BLOCK.get())
                .add(ModBlocks.DEMIGIRL_FLAG_BLOCK.get())
                .add(ModBlocks.DEMIROMANTIC_FLAG_BLOCK.get())
                .add(ModBlocks.DEMISEXUAL_FLAG_BLOCK.get())
                .add(ModBlocks.GAY_FLAG_BLOCK.get())
                .add(ModBlocks.GENDERFLUID_FLAG_BLOCK.get())
                .add(ModBlocks.GENDERFLUX_FLAG_BLOCK.get())
                .add(ModBlocks.GENDERQUEER_FLAG_BLOCK.get())
                .add(ModBlocks.GRAYSEXUAL_FLAG_BLOCK.get())
                .add(ModBlocks.INTERSEX_FLAG_BLOCK.get())
                .add(ModBlocks.LESBIAN_FLAG_BLOCK.get())
                .add(ModBlocks.NONBINARY_FLAG_BLOCK.get())
                .add(ModBlocks.OMNISEXUAL_FLAG_BLOCK.get())
                .add(ModBlocks.PANSEXUAL_FLAG_BLOCK.get())
                .add(ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK.get())
                .add(ModBlocks.QUEER_FLAG_BLOCK.get())
                .add(ModBlocks.RAINBOW_FLAG_BLOCK.get())
                .add(ModBlocks.TRANSGENDER_FLAG_BLOCK.get())
                .add(ModBlocks.DEMINONBINARY_FLAG_BLOCK.get())
                .add(ModBlocks.GRAYROMANTIC_FLAG_BLOCK.get())
                .add(ModBlocks.POLYSEXUAL_FLAG_BLOCK.get());

        //Needs Pickaxe
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.UNKNOWN_ORE.get())
                .add(ModBlocks.DEEPSLATE_UNKNOWN_ORE.get())
                .add(ModBlocks.UNKNOWN_MATERIAL_BLOCK.get())
                .add(ModBlocks.CORRUPTED_FLAG_BLOCK.get())
                .add(ModBlocks.ABROSEXUAL_MINI_FLAG.get())
                .add(ModBlocks.AGENDER_MINI_FLAG.get())
                .add(ModBlocks.AROACE_MINI_FLAG.get())
                .add(ModBlocks.AROMANTIC_MINI_FLAG.get())
                .add(ModBlocks.ASEXUAL_MINI_FLAG.get())
                .add(ModBlocks.BIGENDER_MINI_FLAG.get())
                .add(ModBlocks.BISEXUAL_MINI_FLAG.get())
                .add(ModBlocks.DEMIBOY_MINI_FLAG.get())
                .add(ModBlocks.DEMIGIRL_MINI_FLAG.get())
                .add(ModBlocks.DEMINONBINARY_MINI_FLAG.get())
                .add(ModBlocks.DEMIROMANTIC_MINI_FLAG.get())
                .add(ModBlocks.DEMISEXUAL_MINI_FLAG.get())
                .add(ModBlocks.GAY_MINI_FLAG.get())
                .add(ModBlocks.GENDERFLUID_MINI_FLAG.get())
                .add(ModBlocks.GENDERFLUX_MINI_FLAG.get())
                .add(ModBlocks.GENDERQUEER_MINI_FLAG.get())
                .add(ModBlocks.GRAYROMANTIC_MINI_FLAG.get())
                .add(ModBlocks.GRAYSEXUAL_MINI_FLAG.get())
                .add(ModBlocks.INTERSEX_MINI_FLAG.get())
                .add(ModBlocks.LESBIAN_MINI_FLAG.get())
                .add(ModBlocks.NONBINARY_MINI_FLAG.get())
                .add(ModBlocks.OMNISEXUAL_MINI_FLAG.get())
                .add(ModBlocks.PANSEXUAL_MINI_FLAG.get())
                .add(ModBlocks.POLYSEXUAL_MINI_FLAG.get())
                .add(ModBlocks.PROGRESS_PRIDE_MINI_FLAG.get())
                .add(ModBlocks.QUEER_MINI_FLAG.get())
                .add(ModBlocks.RAINBOW_MINI_FLAG.get())
                .add(ModBlocks.TRANSGENDER_MINI_FLAG.get())
                .add(ModBlocks.ABROSEXUAL_WALL_FLAG.get())
                .add(ModBlocks.AGENDER_WALL_FLAG.get())
                .add(ModBlocks.AROACE_WALL_FLAG.get())
                .add(ModBlocks.AROMANTIC_WALL_FLAG.get())
                .add(ModBlocks.ASEXUAL_WALL_FLAG.get())
                .add(ModBlocks.BIGENDER_WALL_FLAG.get())
                .add(ModBlocks.BISEXUAL_WALL_FLAG.get())
                .add(ModBlocks.DEMIBOY_WALL_FLAG.get())
                .add(ModBlocks.DEMIGIRL_WALL_FLAG.get())
                .add(ModBlocks.DEMINONBINARY_WALL_FLAG.get())
                .add(ModBlocks.DEMIROMANTIC_WALL_FLAG.get())
                .add(ModBlocks.DEMISEXUAL_WALL_FLAG.get())
                .add(ModBlocks.GAY_WALL_FLAG.get())
                .add(ModBlocks.GENDERFLUID_WALL_FLAG.get())
                .add(ModBlocks.GENDERFLUX_WALL_FLAG.get())
                .add(ModBlocks.GENDERQUEER_WALL_FLAG.get())
                .add(ModBlocks.GRAYROMANTIC_WALL_FLAG.get())
                .add(ModBlocks.GRAYSEXUAL_WALL_FLAG.get())
                .add(ModBlocks.INTERSEX_WALL_FLAG.get())
                .add(ModBlocks.LESBIAN_WALL_FLAG.get())
                .add(ModBlocks.NONBINARY_WALL_FLAG.get())
                .add(ModBlocks.OMNISEXUAL_WALL_FLAG.get())
                .add(ModBlocks.PANSEXUAL_WALL_FLAG.get())
                .add(ModBlocks.POLYSEXUAL_WALL_FLAG.get())
                .add(ModBlocks.PROGRESS_PRIDE_WALL_FLAG.get())
                .add(ModBlocks.QUEER_WALL_FLAG.get())
                .add(ModBlocks.RAINBOW_WALL_FLAG.get())
                .add(ModBlocks.TRANSGENDER_WALL_FLAG.get());


        //Stone Level
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.UNKNOWN_ORE.get())
                .add(ModBlocks.DEEPSLATE_UNKNOWN_ORE.get())
                .add(ModBlocks.UNKNOWN_MATERIAL_BLOCK.get())
                .add(ModBlocks.CORRUPTED_FLAG_BLOCK.get());

        //Iron Level
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ABROSEXUAL_MINI_FLAG.get())
                .add(ModBlocks.AGENDER_MINI_FLAG.get())
                .add(ModBlocks.AROACE_MINI_FLAG.get())
                .add(ModBlocks.AROMANTIC_MINI_FLAG.get())
                .add(ModBlocks.ASEXUAL_MINI_FLAG.get())
                .add(ModBlocks.BIGENDER_MINI_FLAG.get())
                .add(ModBlocks.BISEXUAL_MINI_FLAG.get())
                .add(ModBlocks.DEMIBOY_MINI_FLAG.get())
                .add(ModBlocks.DEMIGIRL_MINI_FLAG.get())
                .add(ModBlocks.DEMINONBINARY_MINI_FLAG.get())
                .add(ModBlocks.DEMIROMANTIC_MINI_FLAG.get())
                .add(ModBlocks.DEMISEXUAL_MINI_FLAG.get())
                .add(ModBlocks.GAY_MINI_FLAG.get())
                .add(ModBlocks.GENDERFLUID_MINI_FLAG.get())
                .add(ModBlocks.GENDERFLUX_MINI_FLAG.get())
                .add(ModBlocks.GENDERQUEER_MINI_FLAG.get())
                .add(ModBlocks.GRAYROMANTIC_MINI_FLAG.get())
                .add(ModBlocks.GRAYSEXUAL_MINI_FLAG.get())
                .add(ModBlocks.INTERSEX_MINI_FLAG.get())
                .add(ModBlocks.LESBIAN_MINI_FLAG.get())
                .add(ModBlocks.NONBINARY_MINI_FLAG.get())
                .add(ModBlocks.OMNISEXUAL_MINI_FLAG.get())
                .add(ModBlocks.PANSEXUAL_MINI_FLAG.get())
                .add(ModBlocks.POLYSEXUAL_MINI_FLAG.get())
                .add(ModBlocks.PROGRESS_PRIDE_MINI_FLAG.get())
                .add(ModBlocks.QUEER_MINI_FLAG.get())
                .add(ModBlocks.RAINBOW_MINI_FLAG.get())
                .add(ModBlocks.TRANSGENDER_MINI_FLAG.get())
                .add(ModBlocks.ABROSEXUAL_WALL_FLAG.get())
                .add(ModBlocks.AGENDER_WALL_FLAG.get())
                .add(ModBlocks.AROACE_WALL_FLAG.get())
                .add(ModBlocks.AROMANTIC_WALL_FLAG.get())
                .add(ModBlocks.ASEXUAL_WALL_FLAG.get())
                .add(ModBlocks.BIGENDER_WALL_FLAG.get())
                .add(ModBlocks.BISEXUAL_WALL_FLAG.get())
                .add(ModBlocks.DEMIBOY_WALL_FLAG.get())
                .add(ModBlocks.DEMIGIRL_WALL_FLAG.get())
                .add(ModBlocks.DEMINONBINARY_WALL_FLAG.get())
                .add(ModBlocks.DEMIROMANTIC_WALL_FLAG.get())
                .add(ModBlocks.DEMISEXUAL_WALL_FLAG.get())
                .add(ModBlocks.GAY_WALL_FLAG.get())
                .add(ModBlocks.GENDERFLUID_WALL_FLAG.get())
                .add(ModBlocks.GENDERFLUX_WALL_FLAG.get())
                .add(ModBlocks.GENDERQUEER_WALL_FLAG.get())
                .add(ModBlocks.GRAYROMANTIC_WALL_FLAG.get())
                .add(ModBlocks.GRAYSEXUAL_WALL_FLAG.get())
                .add(ModBlocks.INTERSEX_WALL_FLAG.get())
                .add(ModBlocks.LESBIAN_WALL_FLAG.get())
                .add(ModBlocks.NONBINARY_WALL_FLAG.get())
                .add(ModBlocks.OMNISEXUAL_WALL_FLAG.get())
                .add(ModBlocks.PANSEXUAL_WALL_FLAG.get())
                .add(ModBlocks.POLYSEXUAL_WALL_FLAG.get())
                .add(ModBlocks.PROGRESS_PRIDE_WALL_FLAG.get())
                .add(ModBlocks.QUEER_WALL_FLAG.get())
                .add(ModBlocks.RAINBOW_WALL_FLAG.get())
                .add(ModBlocks.TRANSGENDER_WALL_FLAG.get());
    }

}
