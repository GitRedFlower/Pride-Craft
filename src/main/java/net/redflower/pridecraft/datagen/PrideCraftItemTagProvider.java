package net.redflower.pridecraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.item.PrideCraftItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class PrideCraftItemTagProvider extends ItemTagsProvider {

    public PrideCraftItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, PrideCraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIM_MATERIALS)
                .add(PrideCraftItems.ABROSEXUAL_MATERIAL.get())
                .add(PrideCraftItems.AGENDER_MATERIAL.get())
                .add(PrideCraftItems.AROACE_MATERIAL.get())
                .add(PrideCraftItems.AROMANTIC_MATERIAL.get())
                .add(PrideCraftItems.ASEXUAL_MATERIAL.get())
                .add(PrideCraftItems.BIGENDER_MATERIAL.get())
                .add(PrideCraftItems.BISEXUAL_MATERIAL.get())
                .add(PrideCraftItems.DEMIBOY_MATERIAL.get())
                .add(PrideCraftItems.DEMIGIRL_MATERIAL.get())
                .add(PrideCraftItems.DEMIROMANTIC_MATERIAL.get())
                .add(PrideCraftItems.DEMISEXUAL_MATERIAL.get())
                .add(PrideCraftItems.GAY_MATERIAL.get())
                .add(PrideCraftItems.GENDERFLUID_MATERIAL.get())
                .add(PrideCraftItems.GENDERFLUX_MATERIAL.get())
                .add(PrideCraftItems.GENDERQUEER_MATERIAL.get())
                .add(PrideCraftItems.GRAYSEXUAL_MATERIAL.get())
                .add(PrideCraftItems.INTERSEX_MATERIAL.get())
                .add(PrideCraftItems.LESBIAN_MATERIAL.get())
                .add(PrideCraftItems.NONBINARY_MATERIAL.get())
                .add(PrideCraftItems.OMNISEXUAL_MATERIAL.get())
                .add(PrideCraftItems.PANSEXUAL_MATERIAL.get())
                .add(PrideCraftItems.PROGRESS_PRIDE_MATERIAL.get())
                .add(PrideCraftItems.QUEER_MATERIAL.get())
                .add(PrideCraftItems.RAINBOW_MATERIAL.get())
                .add(PrideCraftItems.TRANSFEMININE_MATERIAL.get())
                .add(PrideCraftItems.TRANSGENDER_MATERIAL.get())
                .add(PrideCraftItems.TRANSMASCULINE_MATERIAL.get())
                .add(PrideCraftItems.DEMINONBINARY_MATERIAL.get())
                .add(PrideCraftItems.GRAYROMANTIC_MATERIAL.get())
                .add(PrideCraftItems.POLYSEXUAL_MATERIAL.get());
    }
}
