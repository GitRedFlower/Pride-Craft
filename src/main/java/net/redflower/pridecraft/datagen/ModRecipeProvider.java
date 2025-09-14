package net.redflower.pridecraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.redflower.pridecraft.block.ModBlocks;
import net.redflower.pridecraft.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {


    protected ModRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
    }

    //Helper Method
    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider) {
            super(packOutput, provider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "Pride Craft Recipes"; //Whatever name you want
        }
    }

    @Override
    protected void buildRecipes() {
        //Lists
        List<ItemLike> UNKNOWN_SMELTABLES = List.of(ModItems.UNKNOWN_MATERIAL, ModBlocks.UNKNOWN_ORE, ModBlocks.DEEPSLATE_UNKNOWN_ORE);

        //Shaped
        shaped(RecipeCategory.MISC, ModBlocks.ABROSEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ABROSEXUAL_MATERIAL.get())
                .unlockedBy("has_abrosexual_material", has(ModItems.ABROSEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.AGENDER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AGENDER_MATERIAL.get())
                .unlockedBy("has_agender_material", has(ModItems.AGENDER_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.AROACE_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AROACE_MATERIAL.get())
                .unlockedBy("has_aroace_material", has(ModItems.AROACE_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.AROMANTIC_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AROMANTIC_MATERIAL.get())
                .unlockedBy("has_aromantic_material", has(ModItems.AROMANTIC_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.ASEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ASEXUAL_MATERIAL.get())
                .unlockedBy("has_asexual_material", has(ModItems.ASEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.BIGENDER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BIGENDER_MATERIAL.get())
                .unlockedBy("has_bigender_material", has(ModItems.BIGENDER_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.BISEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BISEXUAL_MATERIAL.get())
                .unlockedBy("has_bisexual_material", has(ModItems.BISEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.DEMIBOY_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DEMIBOY_MATERIAL.get())
                .unlockedBy("has_demiboy_material", has(ModItems.DEMIBOY_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.DEMIGIRL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DEMIGIRL_MATERIAL.get())
                .unlockedBy("has_demigirl_material", has(ModItems.DEMIGIRL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.DEMIROMANTIC_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DEMIROMANTIC_MATERIAL.get())
                .unlockedBy("has_demiromantic_material", has(ModItems.DEMIROMANTIC_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.DEMISEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DEMISEXUAL_MATERIAL.get())
                .unlockedBy("has_demisexual_material", has(ModItems.DEMISEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GAY_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GAY_MATERIAL.get())
                .unlockedBy("has_gay_material", has(ModItems.GAY_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GENDERFLUID_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GENDERFLUID_MATERIAL.get())
                .unlockedBy("has_genderfluid_material", has(ModItems.GENDERFLUID_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GENDERFLUX_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GENDERFLUX_MATERIAL.get())
                .unlockedBy("has_genderflux_material", has(ModItems.GENDERFLUX_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GENDERQUEER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GENDERQUEER_MATERIAL.get())
                .unlockedBy("has_genderqueer_material", has(ModItems.GENDERQUEER_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GRAYSEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GRAYSEXUAL_MATERIAL.get())
                .unlockedBy("has_graysexual_material", has(ModItems.GRAYSEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.INTERSEX_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.INTERSEX_MATERIAL.get())
                .unlockedBy("has_intersex_material", has(ModItems.INTERSEX_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.LESBIAN_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LESBIAN_MATERIAL.get())
                .unlockedBy("has_lesbian_material", has(ModItems.LESBIAN_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.NONBINARY_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.NONBINARY_MATERIAL.get())
                .unlockedBy("has_nonbinary_material", has(ModItems.NONBINARY_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.OMNISEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.OMNISEXUAL_MATERIAL.get())
                .unlockedBy("has_omnisexual_material", has(ModItems.OMNISEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.PANSEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PANSEXUAL_MATERIAL.get())
                .unlockedBy("has_pansexual_material", has(ModItems.PANSEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PROGRESS_PRIDE_MATERIAL.get())
                .unlockedBy("has_progress_pride_material", has(ModItems.PROGRESS_PRIDE_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.QUEER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.QUEER_MATERIAL.get())
                .unlockedBy("has_queer_material", has(ModItems.QUEER_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.RAINBOW_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAINBOW_MATERIAL.get())
                .unlockedBy("has_rainbow_material", has(ModItems.RAINBOW_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.TRANSGENDER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TRANSGENDER_MATERIAL.get())
                .unlockedBy("has_transgender_material", has(ModItems.TRANSGENDER_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.DEMINONBINARY_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DEMINONBINARY_MATERIAL.get())
                .unlockedBy("has_deminonbinary_material", has(ModItems.DEMINONBINARY_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GRAYROMANTIC_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GRAYROMANTIC_MATERIAL.get())
                .unlockedBy("has_grayromantic_material", has(ModItems.GRAYROMANTIC_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.POLYSEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.POLYSEXUAL_MATERIAL.get())
                .unlockedBy("has_polysexual_material", has(ModItems.POLYSEXUAL_MATERIAL))
                .save(this.output);

        //Shaped Mini Flags

        shaped(RecipeCategory.MISC, ModBlocks.ABROSEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.ABROSEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_abrosexual_material", has(ModItems.ABROSEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.AGENDER_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.AGENDER_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_agender_material", has(ModItems.AGENDER_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.AROACE_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.AROACE_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_aroace_material", has(ModItems.AROACE_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.AROMANTIC_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.AROMANTIC_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_aromantic_material", has(ModItems.AROMANTIC_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.ASEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.ASEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_asexual_material", has(ModItems.ASEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.BIGENDER_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.BIGENDER_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_bigender_material", has(ModItems.BIGENDER_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.BISEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.BISEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_bisexual_material", has(ModItems.BISEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.DEMIBOY_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.DEMIBOY_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_demiboy_material", has(ModItems.DEMIBOY_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.DEMIGIRL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.DEMIGIRL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_demigirl_material", has(ModItems.DEMIGIRL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.DEMINONBINARY_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.DEMINONBINARY_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_deminonbinary_material", has(ModItems.DEMINONBINARY_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.DEMIROMANTIC_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.DEMIROMANTIC_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_demiromatic_material", has(ModItems.DEMIROMANTIC_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.DEMISEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.DEMISEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_demisexual_material", has(ModItems.DEMISEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GAY_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.GAY_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_gay_material", has(ModItems.GAY_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GENDERFLUID_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.GENDERFLUID_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_genderfluid_material", has(ModItems.GENDERFLUID_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GENDERFLUX_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.GENDERFLUX_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_genderflux_material", has(ModItems.GENDERFLUX_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GENDERQUEER_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.GENDERQUEER_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_genderqueer_material", has(ModItems.GENDERQUEER_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GRAYROMANTIC_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.GRAYROMANTIC_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_grayromantic_material", has(ModItems.GRAYROMANTIC_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.GRAYSEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.GRAYSEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_graysexual_material", has(ModItems.GRAYSEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.INTERSEX_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.INTERSEX_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_intersex_material", has(ModItems.INTERSEX_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.LESBIAN_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.LESBIAN_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_lesbian_material", has(ModItems.LESBIAN_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.NONBINARY_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.NONBINARY_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_nonbinary_material", has(ModItems.NONBINARY_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.OMNISEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.OMNISEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_nonbinary_material", has(ModItems.OMNISEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.PANSEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.PANSEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_pansexual_material", has(ModItems.PANSEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.POLYSEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.POLYSEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_polysexual_material", has(ModItems.POLYSEXUAL_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.PROGRESS_PRIDE_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.PROGRESS_PRIDE_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_progress_pride_material", has(ModItems.PROGRESS_PRIDE_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.QUEER_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.QUEER_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_queer_material", has(ModItems.QUEER_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.RAINBOW_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.RAINBOW_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_rainbow_material", has(ModItems.RAINBOW_MATERIAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModBlocks.TRANSGENDER_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', ModItems.TRANSGENDER_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_`transgender_material", has(ModItems.TRANSGENDER_MATERIAL))
                .save(this.output);

        //Shapeless
        shapeless(RecipeCategory.MISC, ModItems.ABROSEXUAL_MATERIAL.get(), 9)
                .requires(ModBlocks.ABROSEXUAL_FLAG_BLOCK)
                .unlockedBy("has_abrosexual_flag_block", has(ModBlocks.ABROSEXUAL_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.AGENDER_MATERIAL.get(), 9)
                .requires(ModBlocks.AGENDER_FLAG_BLOCK)
                .unlockedBy("has_agender_flag_block", has(ModBlocks.AGENDER_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.AROACE_MATERIAL.get(), 9)
                .requires(ModBlocks.AROACE_FLAG_BLOCK)
                .unlockedBy("has_aroace_flag_block", has(ModBlocks.AROACE_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.AROMANTIC_MATERIAL.get(), 9)
                .requires(ModBlocks.AROMANTIC_FLAG_BLOCK)
                .unlockedBy("has_aromantic_flag_block", has(ModBlocks.AROMANTIC_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.ASEXUAL_MATERIAL.get(), 9)
                .requires(ModBlocks.ASEXUAL_FLAG_BLOCK)
                .unlockedBy("has_asexual_flag_block", has(ModBlocks.ASEXUAL_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.BIGENDER_MATERIAL.get(), 9)
                .requires(ModBlocks.BIGENDER_FLAG_BLOCK)
                .unlockedBy("has_bigender_flag_block", has(ModBlocks.BIGENDER_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.BISEXUAL_MATERIAL.get(), 9)
                .requires(ModBlocks.BISEXUAL_FLAG_BLOCK)
                .unlockedBy("has_bisexual_flag_block", has(ModBlocks.BISEXUAL_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.DEMIBOY_MATERIAL.get(), 9)
                .requires(ModBlocks.DEMIBOY_FLAG_BLOCK)
                .unlockedBy("has_demiboy_flag_block", has(ModBlocks.DEMIBOY_FLAG_BLOCK))
                .save(this.output);


        shapeless(RecipeCategory.MISC, ModItems.DEMIGIRL_MATERIAL.get(), 9)
                .requires(ModBlocks.DEMIGIRL_FLAG_BLOCK)
                .unlockedBy("has_demigirl_flag_block", has(ModBlocks.DEMIGIRL_FLAG_BLOCK))
                .save(this.output);


        shapeless(RecipeCategory.MISC, ModItems.DEMINONBINARY_MATERIAL.get(), 9)
                .requires(ModBlocks.DEMINONBINARY_FLAG_BLOCK)
                .unlockedBy("has_deminonbinary_flag_block", has(ModBlocks.DEMINONBINARY_FLAG_BLOCK))
                .save(this.output);


        shapeless(RecipeCategory.MISC, ModItems.DEMIROMANTIC_MATERIAL.get(), 9)
                .requires(ModBlocks.DEMIROMANTIC_FLAG_BLOCK)
                .unlockedBy("has_demiromantic_flag_block", has(ModBlocks.DEMIROMANTIC_FLAG_BLOCK))
                .save(this.output);


        shapeless(RecipeCategory.MISC, ModItems.DEMISEXUAL_MATERIAL.get(), 9)
                .requires(ModBlocks.DEMISEXUAL_FLAG_BLOCK)
                .unlockedBy("has_demisexual_flag_block", has(ModBlocks.DEMISEXUAL_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.GAY_MATERIAL.get(), 9)
                .requires(ModBlocks.GAY_FLAG_BLOCK)
                .unlockedBy("has_gay_flag_block", has(ModBlocks.GAY_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.GENDERFLUID_MATERIAL.get(), 9)
                .requires(ModBlocks.GENDERFLUID_FLAG_BLOCK)
                .unlockedBy("has_genderfluid_flag_block", has(ModBlocks.GENDERFLUID_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.GENDERFLUX_MATERIAL.get(), 9)
                .requires(ModBlocks.GENDERFLUX_FLAG_BLOCK)
                .unlockedBy("has_genderflux_flag_block", has(ModBlocks.GENDERFLUX_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.GENDERQUEER_MATERIAL.get(), 9)
                .requires(ModBlocks.GENDERQUEER_FLAG_BLOCK)
                .unlockedBy("has_genderqueer_flag_block", has(ModBlocks.GENDERQUEER_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.GRAYROMANTIC_MATERIAL.get(), 9)
                .requires(ModBlocks.GRAYROMANTIC_FLAG_BLOCK)
                .unlockedBy("has_grayromantic_flag_block", has(ModBlocks.GRAYROMANTIC_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.GRAYSEXUAL_MATERIAL.get(), 9)
                .requires(ModBlocks.GRAYSEXUAL_FLAG_BLOCK)
                .unlockedBy("has_graysexual_flag_block", has(ModBlocks.GRAYSEXUAL_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.INTERSEX_MATERIAL.get(), 9)
                .requires(ModBlocks.INTERSEX_FLAG_BLOCK)
                .unlockedBy("has_intersex_flag_block", has(ModBlocks.INTERSEX_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.LESBIAN_MATERIAL.get(), 9)
                .requires(ModBlocks.LESBIAN_FLAG_BLOCK)
                .unlockedBy("has_lesbian_flag_block", has(ModBlocks.LESBIAN_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.NONBINARY_MATERIAL.get(), 9)
                .requires(ModBlocks.NONBINARY_FLAG_BLOCK)
                .unlockedBy("has_nonbinary_flag_block", has(ModBlocks.NONBINARY_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.OMNISEXUAL_MATERIAL.get(), 9)
                .requires(ModBlocks.OMNISEXUAL_FLAG_BLOCK)
                .unlockedBy("has_omnisexual_flag_block", has(ModBlocks.OMNISEXUAL_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.PANSEXUAL_MATERIAL.get(), 9)
                .requires(ModBlocks.PANSEXUAL_FLAG_BLOCK)
                .unlockedBy("has_pansexual_flag_block", has(ModBlocks.PANSEXUAL_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.POLYSEXUAL_MATERIAL.get(), 9)
                .requires(ModBlocks.POLYSEXUAL_FLAG_BLOCK)
                .unlockedBy("has_polysexual_flag_block", has(ModBlocks.POLYSEXUAL_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.PROGRESS_PRIDE_MATERIAL.get(), 9)
                .requires(ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK)
                .unlockedBy("has_progress_pride_flag_block", has(ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.QUEER_MATERIAL.get(), 9)
                .requires(ModBlocks.QUEER_FLAG_BLOCK)
                .unlockedBy("has_queer_flag_block", has(ModBlocks.QUEER_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.RAINBOW_MATERIAL.get(), 9)
                .requires(ModBlocks.RAINBOW_FLAG_BLOCK)
                .unlockedBy("has_rainbow_flag_block", has(ModBlocks.RAINBOW_FLAG_BLOCK))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.TRANSGENDER_MATERIAL.get(), 9)
                .requires(ModBlocks.TRANSGENDER_FLAG_BLOCK)
                .unlockedBy("has_transgender_flag_block", has(ModBlocks.TRANSGENDER_FLAG_BLOCK))
                .save(this.output);



        //Smelting
        oreSmelting(UNKNOWN_SMELTABLES, RecipeCategory.MISC, ModItems.CORRUPTED_FLAG_MATERIAL, 0.25f, 200, "rainbow");

        //Blasting
        oreBlasting(UNKNOWN_SMELTABLES, RecipeCategory.MISC, ModItems.CORRUPTED_FLAG_MATERIAL, 0.25f, 100, "rainbow");

        //Stone Cutting
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.ABROSEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.AGENDER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.AROACE_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.AROMANTIC_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.ASEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.BIGENDER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.BISEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.DEMIBOY_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.DEMIGIRL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.DEMIROMANTIC_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.DEMISEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.GAY_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.GENDERFLUID_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.GENDERFLUX_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.GENDERQUEER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.GRAYSEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.INTERSEX_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.LESBIAN_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.NONBINARY_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.OMNISEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.PANSEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.PROGRESS_PRIDE_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.QUEER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.RAINBOW_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.TRANSGENDER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.DEMINONBINARY_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.GRAYROMANTIC_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(RecipeCategory.MISC, ModItems.POLYSEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 8);
    }
}
