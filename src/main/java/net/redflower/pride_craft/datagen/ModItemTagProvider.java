package net.redflower.pride_craft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.redflower.pride_craft.PrideCraft;
import net.redflower.pride_craft.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, PrideCraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
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
                .add(ModItems.TRANSFEMININE_MATERIAL.get())
                .add(ModItems.TRANSGENDER_MATERIAL.get())
                .add(ModItems.TRANSMASCULINE_MATERIAL.get())
                .add(ModItems.DEMINONBINARY_MATERIAL.get())
                .add(ModItems.GRAYROMANTIC_MATERIAL.get())
                .add(ModItems.POLYSEXUAL_MATERIAL.get());
    }
}
