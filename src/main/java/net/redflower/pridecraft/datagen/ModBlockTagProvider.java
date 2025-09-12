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
                .add(ModBlocks.TRANSGENDER_FLAG_BLOCK.get());

        //Needs Pickaxe
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.UNKNOWN_ORE.get())
                .add(ModBlocks.DEEPSLATE_UNKNOWN_ORE.get());

        //Stone Level
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.UNKNOWN_ORE.get())
                .add(ModBlocks.DEEPSLATE_UNKNOWN_ORE.get());

    }

}
