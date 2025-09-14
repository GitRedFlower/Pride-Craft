package net.redflower.pridecraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.item.ModItems;
import net.redflower.pridecraft.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags, PrideCraft.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.ABROSEXUAL_MATERIAL.get())
                .add(ModItems.AGENDER_MATERIAL.get())
                .add(ModItems.AROACE_MATERIAL.get())
                .add(ModItems.AROMANTIC_MATERIAL.get())
                .add(ModItems.ASEXUAL_MATERIAL.get())
                .add(ModItems.BIGENDER_MATERIAL.get())
                .add(ModItems.BISEXUAL_MATERIAL.get())
                .add(ModItems.DEMIBOY_MATERIAL.get())
                .add(ModItems.DEMIGIRL_MATERIAL.get())
                .add(ModItems.DEMIROMANTIC_MATERIAL.get())
                .add(ModItems.DEMISEXUAL_MATERIAL.get())
                .add(ModItems.GAY_MATERIAL.get())
                .add(ModItems.GENDERFLUID_MATERIAL.get())
                .add(ModItems.GENDERFLUX_MATERIAL.get())
                .add(ModItems.GENDERQUEER_MATERIAL.get())
                .add(ModItems.GRAYSEXUAL_MATERIAL.get())
                .add(ModItems.INTERSEX_MATERIAL.get())
                .add(ModItems.LESBIAN_MATERIAL.get())
                .add(ModItems.NONBINARY_MATERIAL.get())
                .add(ModItems.OMNISEXUAL_MATERIAL.get())
                .add(ModItems.PANSEXUAL_MATERIAL.get())
                .add(ModItems.PROGRESS_PRIDE_MATERIAL.get())
                .add(ModItems.QUEER_MATERIAL.get())
                .add(ModItems.RAINBOW_MATERIAL.get())
                .add(ModItems.TRANSGENDER_MATERIAL.get())
                .add(ModItems.DEMINONBINARY_MATERIAL.get())
                .add(ModItems.GRAYROMANTIC_MATERIAL.get())
                .add(ModItems.POLYSEXUAL_MATERIAL.get());

        tag(ModTags.Items.FLAG_MATERIALS)
                .add(ModItems.ABROSEXUAL_MATERIAL.get())
                .add(ModItems.AGENDER_MATERIAL.get())
                .add(ModItems.AROACE_MATERIAL.get())
                .add(ModItems.AROMANTIC_MATERIAL.get())
                .add(ModItems.ASEXUAL_MATERIAL.get())
                .add(ModItems.BIGENDER_MATERIAL.get())
                .add(ModItems.BISEXUAL_MATERIAL.get())
                .add(ModItems.DEMIBOY_MATERIAL.get())
                .add(ModItems.DEMIGIRL_MATERIAL.get())
                .add(ModItems.DEMIROMANTIC_MATERIAL.get())
                .add(ModItems.DEMISEXUAL_MATERIAL.get())
                .add(ModItems.GAY_MATERIAL.get())
                .add(ModItems.GENDERFLUID_MATERIAL.get())
                .add(ModItems.GENDERFLUX_MATERIAL.get())
                .add(ModItems.GENDERQUEER_MATERIAL.get())
                .add(ModItems.GRAYSEXUAL_MATERIAL.get())
                .add(ModItems.INTERSEX_MATERIAL.get())
                .add(ModItems.LESBIAN_MATERIAL.get())
                .add(ModItems.NONBINARY_MATERIAL.get())
                .add(ModItems.OMNISEXUAL_MATERIAL.get())
                .add(ModItems.PANSEXUAL_MATERIAL.get())
                .add(ModItems.PROGRESS_PRIDE_MATERIAL.get())
                .add(ModItems.QUEER_MATERIAL.get())
                .add(ModItems.RAINBOW_MATERIAL.get())
                .add(ModItems.TRANSGENDER_MATERIAL.get());
    }
}
