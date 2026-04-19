package net.redflower.pridecraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.block.PrideCraftBlocks;
import net.redflower.pridecraft.item.PrideCraftItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class PrideCraftRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public PrideCraftRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //Lists
        List<ItemLike> UNKNOWN_SMELTABLES = List.of(PrideCraftItems.UNKNOWN_MATERIAL, PrideCraftBlocks.UNKNOWN_ORE, PrideCraftBlocks.DEEPSLATE_UNKNOWN_ORE);
        List<ItemLike> UNKNOWN_BLOCK_SMELTABLES = List.of(PrideCraftBlocks.UNKNOWN_MATERIAL_BLOCK);
        List<ItemLike> PRIDE_SMELTABLES = List.of(PrideCraftBlocks.PRIDE_ORE, PrideCraftBlocks.DEEPSLATE_PRIDE_ORE);

        //Shaped
        //Flag Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.ABROSEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.ABROSEXUAL_MATERIAL.get())
                .unlockedBy("has_abrosexual_material", has(PrideCraftItems.ABROSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.AGENDER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.AGENDER_MATERIAL.get())
                .unlockedBy("has_agender_material", has(PrideCraftItems.AGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.AROACE_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.AROACE_MATERIAL.get())
                .unlockedBy("has_aroace_material", has(PrideCraftItems.AROACE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.AROMANTIC_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.AROMANTIC_MATERIAL.get())
                .unlockedBy("has_aromantic_material", has(PrideCraftItems.AROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.ASEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.ASEXUAL_MATERIAL.get())
                .unlockedBy("has_asexual_material", has(PrideCraftItems.ASEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.BIGENDER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.BIGENDER_MATERIAL.get())
                .unlockedBy("has_bigender_material", has(PrideCraftItems.BIGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.BISEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.BISEXUAL_MATERIAL.get())
                .unlockedBy("has_bisexual_material", has(PrideCraftItems.BISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMIBOY_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.DEMIBOY_MATERIAL.get())
                .unlockedBy("has_demiboy_material", has(PrideCraftItems.DEMIBOY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMIGIRL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.DEMIGIRL_MATERIAL.get())
                .unlockedBy("has_demigirl_material", has(PrideCraftItems.DEMIGIRL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMIROMANTIC_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.DEMIROMANTIC_MATERIAL.get())
                .unlockedBy("has_demiromantic_material", has(PrideCraftItems.DEMIROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMISEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.DEMISEXUAL_MATERIAL.get())
                .unlockedBy("has_demisexual_material", has(PrideCraftItems.DEMISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GAY_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.GAY_MATERIAL.get())
                .unlockedBy("has_gay_material", has(PrideCraftItems.GAY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GENDERFLUID_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.GENDERFLUID_MATERIAL.get())
                .unlockedBy("has_genderfluid_material", has(PrideCraftItems.GENDERFLUID_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GENDERFLUX_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.GENDERFLUX_MATERIAL.get())
                .unlockedBy("has_genderflux_material", has(PrideCraftItems.GENDERFLUX_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GENDERQUEER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.GENDERQUEER_MATERIAL.get())
                .unlockedBy("has_genderqueer_material", has(PrideCraftItems.GENDERQUEER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GRAYSEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.GRAYSEXUAL_MATERIAL.get())
                .unlockedBy("has_graysexual_material", has(PrideCraftItems.GRAYSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.INTERSEX_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.INTERSEX_MATERIAL.get())
                .unlockedBy("has_intersex_material", has(PrideCraftItems.INTERSEX_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.LESBIAN_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.LESBIAN_MATERIAL.get())
                .unlockedBy("has_lesbian_material", has(PrideCraftItems.LESBIAN_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.NONBINARY_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.NONBINARY_MATERIAL.get())
                .unlockedBy("has_nonbinary_material", has(PrideCraftItems.NONBINARY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.OMNISEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.OMNISEXUAL_MATERIAL.get())
                .unlockedBy("has_omnisexual_material", has(PrideCraftItems.OMNISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.PANSEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.PANSEXUAL_MATERIAL.get())
                .unlockedBy("has_pansexual_material", has(PrideCraftItems.PANSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.PROGRESS_PRIDE_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.PROGRESS_PRIDE_MATERIAL.get())
                .unlockedBy("has_progress_pride_material", has(PrideCraftItems.PROGRESS_PRIDE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.QUEER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.QUEER_MATERIAL.get())
                .unlockedBy("has_queer_material", has(PrideCraftItems.QUEER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.RAINBOW_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.RAINBOW_MATERIAL.get())
                .unlockedBy("has_rainbow_material", has(PrideCraftItems.RAINBOW_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.TRANSGENDER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.TRANSGENDER_MATERIAL.get())
                .unlockedBy("has_transgender_material", has(PrideCraftItems.TRANSGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMINONBINARY_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.DEMINONBINARY_MATERIAL.get())
                .unlockedBy("has_deminonbinary_material", has(PrideCraftItems.DEMINONBINARY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GRAYROMANTIC_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.GRAYROMANTIC_MATERIAL.get())
                .unlockedBy("has_grayromantic_material", has(PrideCraftItems.GRAYROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.POLYSEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.POLYSEXUAL_MATERIAL.get())
                .unlockedBy("has_polysexual_material", has(PrideCraftItems.POLYSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.TRANSFEMININE_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.TRANSFEMININE_MATERIAL.get())
                .unlockedBy("has_transfeminine_material", has(PrideCraftItems.TRANSFEMININE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.TRANSMASCULINE_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.TRANSMASCULINE_MATERIAL.get())
                .unlockedBy("has_transmasculine_material", has(PrideCraftItems.TRANSMASCULINE_MATERIAL))
                .save(recipeOutput);

        //Mini Flags
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.ABROSEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.ABROSEXUAL_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_abrosexual_material", has(PrideCraftItems.ABROSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.AGENDER_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.AGENDER_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_agender_material", has(PrideCraftItems.AGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.AROACE_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.AROACE_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_aroace_material", has(PrideCraftItems.AROACE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.AROMANTIC_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.AROMANTIC_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_aromantic_material", has(PrideCraftItems.AROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.ASEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.ASEXUAL_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_asexual_material", has(PrideCraftItems.ASEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.BIGENDER_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.BIGENDER_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_bigender_material", has(PrideCraftItems.BIGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.BISEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.BISEXUAL_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_bisexual_material", has(PrideCraftItems.BISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMIBOY_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.DEMIBOY_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_demiboy_material", has(PrideCraftItems.DEMIBOY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMIGIRL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.DEMIGIRL_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_demigirl_material", has(PrideCraftItems.DEMIGIRL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMINONBINARY_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.DEMINONBINARY_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_deminonbinary_material", has(PrideCraftItems.DEMINONBINARY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMIROMANTIC_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.DEMIROMANTIC_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_demiromatic_material", has(PrideCraftItems.DEMIROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMISEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.DEMISEXUAL_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_demisexual_material", has(PrideCraftItems.DEMISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GAY_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.GAY_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_gay_material", has(PrideCraftItems.GAY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GENDERFLUID_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.GENDERFLUID_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_genderfluid_material", has(PrideCraftItems.GENDERFLUID_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GENDERFLUX_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.GENDERFLUX_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_genderflux_material", has(PrideCraftItems.GENDERFLUX_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GENDERQUEER_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.GENDERQUEER_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_genderqueer_material", has(PrideCraftItems.GENDERQUEER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GRAYROMANTIC_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.GRAYROMANTIC_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_grayromantic_material", has(PrideCraftItems.GRAYROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GRAYSEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.GRAYSEXUAL_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_graysexual_material", has(PrideCraftItems.GRAYSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.INTERSEX_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.INTERSEX_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_intersex_material", has(PrideCraftItems.INTERSEX_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.LESBIAN_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.LESBIAN_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_lesbian_material", has(PrideCraftItems.LESBIAN_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.NONBINARY_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.NONBINARY_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_nonbinary_material", has(PrideCraftItems.NONBINARY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.OMNISEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.OMNISEXUAL_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_nonbinary_material", has(PrideCraftItems.OMNISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.PANSEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.PANSEXUAL_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_pansexual_material", has(PrideCraftItems.PANSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.POLYSEXUAL_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.POLYSEXUAL_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_polysexual_material", has(PrideCraftItems.POLYSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.PROGRESS_PRIDE_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.PROGRESS_PRIDE_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_progress_pride_material", has(PrideCraftItems.PROGRESS_PRIDE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.QUEER_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.QUEER_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_queer_material", has(PrideCraftItems.QUEER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.RAINBOW_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.RAINBOW_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_rainbow_material", has(PrideCraftItems.RAINBOW_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.TRANSGENDER_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.TRANSGENDER_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_transgender_material", has(PrideCraftItems.TRANSGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.TRANSFEMININE_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.TRANSFEMININE_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_transfeminine_material", has(PrideCraftItems.TRANSFEMININE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.TRANSMASCULINE_MINI_FLAG.get())
                .pattern("BAA")
                .pattern("B  ")
                .pattern("B  ")
                .define('A', PrideCraftItems.TRANSMASCULINE_MATERIAL.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_transmasculine_material", has(PrideCraftItems.TRANSMASCULINE_MATERIAL))
                .save(recipeOutput);

        //Wall Flags
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.ABROSEXUAL_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.ABROSEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_abrosexual_material", has(PrideCraftItems.ABROSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.AGENDER_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.AGENDER_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_agender_material", has(PrideCraftItems.AGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.AROACE_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.AROACE_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_aroace_material", has(PrideCraftItems.AROACE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.AROMANTIC_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.AROMANTIC_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_aromantic_material", has(PrideCraftItems.AROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.ASEXUAL_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.ASEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_asexual_material", has(PrideCraftItems.ASEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.BIGENDER_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.BIGENDER_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_bigender_material", has(PrideCraftItems.BIGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.BISEXUAL_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.BISEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_bisexual_material", has(PrideCraftItems.BISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMIBOY_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.DEMIBOY_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_demiboy_material", has(PrideCraftItems.DEMIBOY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMIGIRL_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.DEMIGIRL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_demigirl_material", has(PrideCraftItems.DEMIGIRL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMINONBINARY_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.DEMINONBINARY_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_deminonbinary_material", has(PrideCraftItems.DEMINONBINARY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMIROMANTIC_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.DEMIROMANTIC_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_demiromantic_material", has(PrideCraftItems.DEMIROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMISEXUAL_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.DEMISEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_demisexual_material", has(PrideCraftItems.DEMISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GAY_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.GAY_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_gay_material", has(PrideCraftItems.GAY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GENDERFLUID_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.GENDERFLUID_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_genderfluid_material", has(PrideCraftItems.GENDERFLUID_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GENDERFLUX_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.GENDERFLUX_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_genderflux_material", has(PrideCraftItems.GENDERFLUX_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GENDERQUEER_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.GENDERQUEER_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_genderqueer_material", has(PrideCraftItems.GENDERQUEER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GRAYROMANTIC_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.GRAYROMANTIC_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_grayromantic_material", has(PrideCraftItems.GRAYROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GRAYSEXUAL_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.GRAYSEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_graysexual_material", has(PrideCraftItems.GRAYSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.INTERSEX_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.INTERSEX_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_intersex_material", has(PrideCraftItems.INTERSEX_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.LESBIAN_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.LESBIAN_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_lesbian_material", has(PrideCraftItems.LESBIAN_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.NONBINARY_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.NONBINARY_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_nonbinary_material", has(PrideCraftItems.NONBINARY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.OMNISEXUAL_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.OMNISEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_omnisexual_material", has(PrideCraftItems.OMNISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.PANSEXUAL_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.PANSEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_pansexual_material", has(PrideCraftItems.PANSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.POLYSEXUAL_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.POLYSEXUAL_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_polysexual_material", has(PrideCraftItems.POLYSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.PROGRESS_PRIDE_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.PROGRESS_PRIDE_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_progress_pride_material", has(PrideCraftItems.PROGRESS_PRIDE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.QUEER_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.QUEER_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_queer_material", has(PrideCraftItems.QUEER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.RAINBOW_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.RAINBOW_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_rainbow_material", has(PrideCraftItems.RAINBOW_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.TRANSGENDER_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.TRANSGENDER_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_transgender_material", has(PrideCraftItems.TRANSGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.TRANSFEMININE_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.TRANSFEMININE_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_transfeminine_material", has(PrideCraftItems.TRANSFEMININE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.TRANSMASCULINE_WALL_FLAG.get())
                .pattern("BB ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', PrideCraftItems.TRANSMASCULINE_MATERIAL.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_transmasculine_material", has(PrideCraftItems.TRANSMASCULINE_MATERIAL))
                .save(recipeOutput);

        //Flag Carpets
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.ABROSEXUAL_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.ABROSEXUAL_MATERIAL.get())
                .unlockedBy("has_abrosexual_material", has(PrideCraftItems.ABROSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.AGENDER_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.AGENDER_MATERIAL.get())
                .unlockedBy("has_agender_material", has(PrideCraftItems.AGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.AROACE_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.AROACE_MATERIAL.get())
                .unlockedBy("has_aroace_material", has(PrideCraftItems.AROACE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.AROMANTIC_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.AROMANTIC_MATERIAL.get())
                .unlockedBy("has_aromantic_material", has(PrideCraftItems.AROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.ASEXUAL_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.ASEXUAL_MATERIAL.get())
                .unlockedBy("has_asexual_material", has(PrideCraftItems.ASEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.BIGENDER_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.BIGENDER_MATERIAL.get())
                .unlockedBy("has_bigender_material", has(PrideCraftItems.BIGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.BISEXUAL_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.BISEXUAL_MATERIAL.get())
                .unlockedBy("has_bisexual_material", has(PrideCraftItems.BISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMIBOY_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.DEMIBOY_MATERIAL.get())
                .unlockedBy("has_demiboy_material", has(PrideCraftItems.DEMIBOY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMIGIRL_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.DEMIGIRL_MATERIAL.get())
                .unlockedBy("has_demigirl_material", has(PrideCraftItems.DEMIGIRL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMINONBINARY_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.DEMINONBINARY_MATERIAL.get())
                .unlockedBy("has_deminonbinary_material", has(PrideCraftItems.DEMINONBINARY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMIROMANTIC_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.DEMIROMANTIC_MATERIAL.get())
                .unlockedBy("has_demiromantic_material", has(PrideCraftItems.DEMIROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.DEMISEXUAL_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.DEMISEXUAL_MATERIAL.get())
                .unlockedBy("has_demisexual_material", has(PrideCraftItems.DEMISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GAY_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.GAY_MATERIAL.get())
                .unlockedBy("has_gay_material", has(PrideCraftItems.GAY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GENDERFLUID_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.GENDERFLUID_MATERIAL.get())
                .unlockedBy("has_genderfluid_material", has(PrideCraftItems.GENDERFLUID_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GENDERFLUX_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.GENDERFLUX_MATERIAL.get())
                .unlockedBy("has_genderflux_material", has(PrideCraftItems.GENDERFLUX_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GENDERQUEER_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.GENDERQUEER_MATERIAL.get())
                .unlockedBy("has_genderqueer_material", has(PrideCraftItems.GENDERQUEER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GRAYROMANTIC_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.GRAYROMANTIC_MATERIAL.get())
                .unlockedBy("has_grayromantic_material", has(PrideCraftItems.GRAYROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.GRAYSEXUAL_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.GRAYSEXUAL_MATERIAL.get())
                .unlockedBy("has_graysexual_material", has(PrideCraftItems.GRAYSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.INTERSEX_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.INTERSEX_MATERIAL.get())
                .unlockedBy("has_intersex_material", has(PrideCraftItems.INTERSEX_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.LESBIAN_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.LESBIAN_MATERIAL.get())
                .unlockedBy("has_lesbian_material", has(PrideCraftItems.LESBIAN_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.NONBINARY_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.NONBINARY_MATERIAL.get())
                .unlockedBy("has_nonbinary_material", has(PrideCraftItems.NONBINARY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.OMNISEXUAL_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.OMNISEXUAL_MATERIAL.get())
                .unlockedBy("has_omnisexual_material", has(PrideCraftItems.OMNISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.PANSEXUAL_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.PANSEXUAL_MATERIAL.get())
                .unlockedBy("has_pansexual_material", has(PrideCraftItems.PANSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.POLYSEXUAL_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.POLYSEXUAL_MATERIAL.get())
                .unlockedBy("has_polysexual_material", has(PrideCraftItems.POLYSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.PROGRESS_PRIDE_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.PROGRESS_PRIDE_MATERIAL.get())
                .unlockedBy("has_progress_pride_material", has(PrideCraftItems.PROGRESS_PRIDE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.QUEER_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.QUEER_MATERIAL.get())
                .unlockedBy("has_queer_material", has(PrideCraftItems.QUEER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.RAINBOW_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.RAINBOW_MATERIAL.get())
                .unlockedBy("has_rainbow_material", has(PrideCraftItems.RAINBOW_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.TRANSGENDER_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.TRANSGENDER_MATERIAL.get())
                .unlockedBy("has_transgender_material", has(PrideCraftItems.TRANSGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.TRANSFEMININE_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.TRANSFEMININE_MATERIAL.get())
                .unlockedBy("has_transfeminine_material", has(PrideCraftItems.TRANSFEMININE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.TRANSMASCULINE_FLAG_CARPET.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', PrideCraftItems.TRANSMASCULINE_MATERIAL.get())
                .unlockedBy("has_transmasculine_material", has(PrideCraftItems.TRANSMASCULINE_MATERIAL))
                .save(recipeOutput);


        //Other Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.UNKNOWN_MATERIAL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.UNKNOWN_MATERIAL.get())
                .unlockedBy("has_unknown_material", has(PrideCraftItems.UNKNOWN_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftBlocks.CORRUPTED_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', PrideCraftItems.CORRUPTED_FLAG_MATERIAL.get())
                .unlockedBy("has_corrupted_flag_material", has(PrideCraftItems.CORRUPTED_FLAG_MATERIAL))
                .save(recipeOutput);

        //Other Items
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftItems.GOLDEN_BLAHAJ.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .define('A', PrideCraftItems.BLAHAJ.get())
                .define('B', Items.GOLD_BLOCK)
                .define('C', Items.GOLD_INGOT)
                .unlockedBy("has_blahaj", has(PrideCraftItems.BLAHAJ))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftItems.ORANGE_BLAHAJ.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .define('A', PrideCraftItems.BLAHAJ.get())
                .define('B', Items.MAGMA_BLOCK)
                .define('C', Items.MAGMA_CREAM)
                .unlockedBy("has_blahaj", has(PrideCraftItems.BLAHAJ))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftItems.BLUE_BLAHAJ.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .define('A', PrideCraftItems.BLAHAJ.get())
                .define('B', Items.NAUTILUS_SHELL)
                .define('C', Items.SPONGE)
                .unlockedBy("has_blahaj", has(PrideCraftItems.BLAHAJ))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftItems.RED_BLAHAJ.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .define('A', PrideCraftItems.BLAHAJ.get())
                .define('B', Items.GHAST_TEAR)
                .define('C', Items.NETHER_WART_BLOCK)
                .unlockedBy("has_blahaj", has(PrideCraftItems.BLAHAJ))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftItems.GREEN_BLAHAJ.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .define('A', PrideCraftItems.BLAHAJ.get())
                .define('B', Items.SUGAR)
                .define('C', Items.EMERALD_BLOCK)
                .unlockedBy("has_blahaj", has(PrideCraftItems.BLAHAJ))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PrideCraftItems.PURPLE_BLAHAJ.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .define('A', PrideCraftItems.BLAHAJ.get())
                .define('B', Items.AMETHYST_CLUSTER)
                .define('C', Items.AMETHYST_BLOCK)
                .unlockedBy("has_blahaj", has(PrideCraftItems.BLAHAJ))
                .save(recipeOutput);

        //Shapeless
        //Flag Blocks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.ABROSEXUAL_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.ABROSEXUAL_FLAG_BLOCK)
                .unlockedBy("has_abrosexual_flag_block", has(PrideCraftBlocks.ABROSEXUAL_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.AGENDER_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.AGENDER_FLAG_BLOCK)
                .unlockedBy("has_agender_flag_block", has(PrideCraftBlocks.AGENDER_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.AROACE_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.AROACE_FLAG_BLOCK)
                .unlockedBy("has_aroace_flag_block", has(PrideCraftBlocks.AROACE_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.AROMANTIC_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.AROMANTIC_FLAG_BLOCK)
                .unlockedBy("has_aromantic_flag_block", has(PrideCraftBlocks.AROMANTIC_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.ASEXUAL_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.ASEXUAL_FLAG_BLOCK)
                .unlockedBy("has_asexual_flag_block", has(PrideCraftBlocks.ASEXUAL_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.BIGENDER_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.BIGENDER_FLAG_BLOCK)
                .unlockedBy("has_bigender_flag_block", has(PrideCraftBlocks.BIGENDER_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.BISEXUAL_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.BISEXUAL_FLAG_BLOCK)
                .unlockedBy("has_bisexual_flag_block", has(PrideCraftBlocks.BISEXUAL_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.DEMIBOY_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.DEMIBOY_FLAG_BLOCK)
                .unlockedBy("has_demiboy_flag_block", has(PrideCraftBlocks.DEMIBOY_FLAG_BLOCK))
                .save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.DEMIGIRL_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.DEMIGIRL_FLAG_BLOCK)
                .unlockedBy("has_demigirl_flag_block", has(PrideCraftBlocks.DEMIGIRL_FLAG_BLOCK))
                .save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.DEMINONBINARY_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.DEMINONBINARY_FLAG_BLOCK)
                .unlockedBy("has_deminonbinary_flag_block", has(PrideCraftBlocks.DEMINONBINARY_FLAG_BLOCK))
                .save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.DEMIROMANTIC_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.DEMIROMANTIC_FLAG_BLOCK)
                .unlockedBy("has_demiromantic_flag_block", has(PrideCraftBlocks.DEMIROMANTIC_FLAG_BLOCK))
                .save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.DEMISEXUAL_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.DEMISEXUAL_FLAG_BLOCK)
                .unlockedBy("has_demisexual_flag_block", has(PrideCraftBlocks.DEMISEXUAL_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.GAY_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.GAY_FLAG_BLOCK)
                .unlockedBy("has_gay_flag_block", has(PrideCraftBlocks.GAY_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.GENDERFLUID_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.GENDERFLUID_FLAG_BLOCK)
                .unlockedBy("has_genderfluid_flag_block", has(PrideCraftBlocks.GENDERFLUID_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.GENDERFLUX_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.GENDERFLUX_FLAG_BLOCK)
                .unlockedBy("has_genderflux_flag_block", has(PrideCraftBlocks.GENDERFLUX_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.GENDERQUEER_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.GENDERQUEER_FLAG_BLOCK)
                .unlockedBy("has_genderqueer_flag_block", has(PrideCraftBlocks.GENDERQUEER_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.GRAYROMANTIC_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.GRAYROMANTIC_FLAG_BLOCK)
                .unlockedBy("has_grayromantic_flag_block", has(PrideCraftBlocks.GRAYROMANTIC_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.GRAYSEXUAL_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.GRAYSEXUAL_FLAG_BLOCK)
                .unlockedBy("has_graysexual_flag_block", has(PrideCraftBlocks.GRAYSEXUAL_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.INTERSEX_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.INTERSEX_FLAG_BLOCK)
                .unlockedBy("has_intersex_flag_block", has(PrideCraftBlocks.INTERSEX_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.LESBIAN_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.LESBIAN_FLAG_BLOCK)
                .unlockedBy("has_lesbian_flag_block", has(PrideCraftBlocks.LESBIAN_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.NONBINARY_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.NONBINARY_FLAG_BLOCK)
                .unlockedBy("has_nonbinary_flag_block", has(PrideCraftBlocks.NONBINARY_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.OMNISEXUAL_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.OMNISEXUAL_FLAG_BLOCK)
                .unlockedBy("has_omnisexual_flag_block", has(PrideCraftBlocks.OMNISEXUAL_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.PANSEXUAL_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.PANSEXUAL_FLAG_BLOCK)
                .unlockedBy("has_pansexual_flag_block", has(PrideCraftBlocks.PANSEXUAL_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.POLYSEXUAL_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.POLYSEXUAL_FLAG_BLOCK)
                .unlockedBy("has_polysexual_flag_block", has(PrideCraftBlocks.POLYSEXUAL_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.PROGRESS_PRIDE_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.PROGRESS_PRIDE_FLAG_BLOCK)
                .unlockedBy("has_progress_pride_flag_block", has(PrideCraftBlocks.PROGRESS_PRIDE_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.QUEER_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.QUEER_FLAG_BLOCK)
                .unlockedBy("has_queer_flag_block", has(PrideCraftBlocks.QUEER_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.RAINBOW_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.RAINBOW_FLAG_BLOCK)
                .unlockedBy("has_rainbow_flag_block", has(PrideCraftBlocks.RAINBOW_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.TRANSGENDER_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.TRANSGENDER_FLAG_BLOCK)
                .unlockedBy("has_transgender_flag_block", has(PrideCraftBlocks.TRANSGENDER_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.TRANSFEMININE_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.TRANSFEMININE_FLAG_BLOCK)
                .unlockedBy("has_transfeminine_flag_block", has(PrideCraftBlocks.TRANSFEMININE_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.TRANSMASCULINE_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.TRANSMASCULINE_FLAG_BLOCK)
                .unlockedBy("has_transmasculine_flag_block", has(PrideCraftBlocks.TRANSMASCULINE_FLAG_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftBlocks.CORRUPTED_FLAG_BLOCK.get(), 8)
                .requires(PrideCraftItems.PRIDE_INGOT)
                .unlockedBy("has_pride_ingot", has(PrideCraftItems.PRIDE_INGOT))
                .save(recipeOutput);

        //Other Blocks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.UNKNOWN_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.UNKNOWN_MATERIAL_BLOCK)
                .unlockedBy("has_unknown_material_block", has(PrideCraftBlocks.UNKNOWN_MATERIAL_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PrideCraftItems.CORRUPTED_FLAG_MATERIAL.get(), 9)
                .requires(PrideCraftBlocks.CORRUPTED_FLAG_BLOCK)
                .unlockedBy("has_corrupted_flag_block", has(PrideCraftBlocks.CORRUPTED_FLAG_BLOCK))
                .save(recipeOutput);


        //Smelting
        oreSmelting(recipeOutput, UNKNOWN_SMELTABLES, RecipeCategory.MISC, PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 0.25f, 200, "rainbow");
        oreSmelting(recipeOutput, UNKNOWN_BLOCK_SMELTABLES, RecipeCategory.MISC, PrideCraftBlocks.CORRUPTED_FLAG_BLOCK, 0.25f, 200, "rainbow");
        oreSmelting(recipeOutput, PRIDE_SMELTABLES, RecipeCategory.MISC, PrideCraftItems.PRIDE_INGOT, 0.25f, 200, "rainbow");

        //Blasting
        oreBlasting(recipeOutput, UNKNOWN_SMELTABLES, RecipeCategory.MISC, PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 0.25f, 100, "rainbow");
        oreBlasting(recipeOutput, UNKNOWN_BLOCK_SMELTABLES, RecipeCategory.MISC, PrideCraftBlocks.CORRUPTED_FLAG_BLOCK, 0.25f, 100, "rainbow");
        oreBlasting(recipeOutput, PRIDE_SMELTABLES, RecipeCategory.MISC, PrideCraftItems.PRIDE_INGOT, 0.25f, 100, "rainbow");

        //Stone Cutting
        //Flag Materials
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.ABROSEXUAL_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.AGENDER_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.AROACE_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.AROMANTIC_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.ASEXUAL_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.BIGENDER_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.BISEXUAL_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.DEMIBOY_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.DEMIGIRL_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.DEMIROMANTIC_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.DEMISEXUAL_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.GAY_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.GENDERFLUID_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.GENDERFLUX_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.GENDERQUEER_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.GRAYSEXUAL_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.INTERSEX_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.LESBIAN_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.NONBINARY_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.OMNISEXUAL_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.PANSEXUAL_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.PROGRESS_PRIDE_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.QUEER_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.RAINBOW_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.TRANSGENDER_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.DEMINONBINARY_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.GRAYROMANTIC_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.POLYSEXUAL_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.TRANSFEMININE_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, PrideCraftItems.TRANSMASCULINE_MATERIAL.get(), PrideCraftItems.CORRUPTED_FLAG_MATERIAL, 8);
    }

    //Custom Recipe Changes and Name Space fixes
    //Furnace
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, ingredients, category, result, experience, cookingTime, group, "_from_smelting");
    }

    //Blast Furnace
    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, ingredients, category, result, experience, cookingTime, group, "_from_blasting");
    }

    //Changes the minecraft namespace to the Pride Craft namespace
    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, PrideCraft.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
