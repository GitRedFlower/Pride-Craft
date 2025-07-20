package net.redflower.pridecraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.redflower.pridecraft.block.ModBlocks;
import net.redflower.pridecraft.item.ModItems;
import net.redflower.pridecraft.util.ModTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //Lists
        List<ItemLike> UNKNOWN_SMELTABLES = List.of(ModItems.UNKNOWN_MATERIAL);

        List<ItemLike> FLAG_MATERIALS = List.of(
                ModItems.ABROSEXUAL_MATERIAL,
                ModItems.AGENDER_MATERIAL,
                ModItems.AROACE_MATERIAL,
                ModItems.AROMANTIC_MATERIAL,
                ModItems.ASEXUAL_MATERIAL,
                ModItems.BIGENDER_MATERIAL,
                ModItems.BISEXUAL_MATERIAL,
                ModItems.DEMIBOY_MATERIAL,
                ModItems.DEMIGIRL_MATERIAL,
                ModItems.DEMIROMANTIC_MATERIAL,
                ModItems.DEMISEXUAL_MATERIAL,
                ModItems.GAY_MATERIAL,
                ModItems.GENDERFLUID_MATERIAL,
                ModItems.GENDERFLUX_MATERIAL,
                ModItems.GENDERQUEER_MATERIAL,
                ModItems.GRAYSEXUAL_MATERIAL,
                ModItems.INTERSEX_MATERIAL,
                ModItems.LESBIAN_MATERIAL,
                ModItems.NONBINARY_MATERIAL,
                ModItems.OMNISEXUAL_MATERIAL,
                ModItems.PANSEXUAL_MATERIAL,
                ModItems.PROGRESS_PRIDE_MATERIAL,
                ModItems.QUEER_MATERIAL,
                ModItems.RAINBOW_MATERIAL,
                ModItems.TRANSGENDER_MATERIAL);

        //Shaped
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ABROSEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ABROSEXUAL_MATERIAL.get())
                .unlockedBy("has_abrosexual_material", has(ModItems.ABROSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AGENDER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AGENDER_MATERIAL.get())
                .unlockedBy("has_agender_material", has(ModItems.AGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AROACE_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AROACE_MATERIAL.get())
                .unlockedBy("has_aroace_material", has(ModItems.AROACE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AROMANTIC_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AROMANTIC_MATERIAL.get())
                .unlockedBy("has_aromantic_material", has(ModItems.AROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ASEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ASEXUAL_MATERIAL.get())
                .unlockedBy("has_asexual_material", has(ModItems.ASEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BIGENDER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BIGENDER_MATERIAL.get())
                .unlockedBy("has_bigender_material", has(ModItems.BIGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BISEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BISEXUAL_MATERIAL.get())
                .unlockedBy("has_bisexual_material", has(ModItems.BISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DEMIBOY_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DEMIBOY_MATERIAL.get())
                .unlockedBy("has_demiboy_material", has(ModItems.DEMIBOY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DEMIGIRL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DEMIGIRL_MATERIAL.get())
                .unlockedBy("has_demigirl_material", has(ModItems.DEMIGIRL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DEMIROMANTIC_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DEMIROMANTIC_MATERIAL.get())
                .unlockedBy("has_demiromantic_material", has(ModItems.DEMIROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DEMISEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DEMISEXUAL_MATERIAL.get())
                .unlockedBy("has_demisexual_material", has(ModItems.DEMISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GAY_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GAY_MATERIAL.get())
                .unlockedBy("has_gay_material", has(ModItems.GAY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GENDERFLUID_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GENDERFLUID_MATERIAL.get())
                .unlockedBy("has_genderfluid_material", has(ModItems.GENDERFLUID_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GENDERFLUX_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GENDERFLUX_MATERIAL.get())
                .unlockedBy("has_genderflux_material", has(ModItems.GENDERFLUX_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GENDERQUEER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GENDERQUEER_MATERIAL.get())
                .unlockedBy("has_genderqueer_material", has(ModItems.GENDERQUEER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAYSEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GRAYSEXUAL_MATERIAL.get())
                .unlockedBy("has_graysexual_material", has(ModItems.GRAYSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.INTERSEX_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.INTERSEX_MATERIAL.get())
                .unlockedBy("has_intersex_material", has(ModItems.INTERSEX_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LESBIAN_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LESBIAN_MATERIAL.get())
                .unlockedBy("has_lesbian_material", has(ModItems.LESBIAN_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NONBINARY_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.NONBINARY_MATERIAL.get())
                .unlockedBy("has_nonbinary_material", has(ModItems.NONBINARY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OMNISEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.OMNISEXUAL_MATERIAL.get())
                .unlockedBy("has_omnisexual_material", has(ModItems.OMNISEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PANSEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PANSEXUAL_MATERIAL.get())
                .unlockedBy("has_pansexual_material", has(ModItems.PANSEXUAL_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PROGRESS_PRIDE_MATERIAL.get())
                .unlockedBy("has_progress_pride_material", has(ModItems.PROGRESS_PRIDE_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUEER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.QUEER_MATERIAL.get())
                .unlockedBy("has_queer_material", has(ModItems.QUEER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAINBOW_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAINBOW_MATERIAL.get())
                .unlockedBy("has_rainbow_material", has(ModItems.RAINBOW_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TRANSGENDER_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TRANSGENDER_MATERIAL.get())
                .unlockedBy("has_transgender_material", has(ModItems.TRANSGENDER_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DEMINONBINARY_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DEMINONBINARY_MATERIAL.get())
                .unlockedBy("has_deminonbinary_material", has(ModItems.DEMINONBINARY_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAYROMANTIC_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GRAYROMANTIC_MATERIAL.get())
                .unlockedBy("has_grayromantic_material", has(ModItems.GRAYROMANTIC_MATERIAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLYSEXUAL_FLAG_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.POLYSEXUAL_MATERIAL.get())
                .unlockedBy("has_polysexual_material", has(ModItems.POLYSEXUAL_MATERIAL))
                .save(recipeOutput);

        //Shapeless


        //Smelting
        oreSmelting(recipeOutput, UNKNOWN_SMELTABLES, RecipeCategory.MISC, ModItems.CORRUPTED_FLAG_MATERIAL, 0.25f, 200, "rainbow");

        //Blasting
        oreBlasting(recipeOutput, UNKNOWN_SMELTABLES, RecipeCategory.MISC, ModItems.CORRUPTED_FLAG_MATERIAL, 0.25f, 100, "rainbow");

        //Stone Cutting
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.ABROSEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.AGENDER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.AROACE_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.AROMANTIC_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.ASEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.BIGENDER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.BISEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.DEMIBOY_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.DEMIGIRL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.DEMIROMANTIC_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.DEMISEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.GAY_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.GENDERFLUID_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.GENDERFLUX_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.GENDERQUEER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.GRAYSEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.INTERSEX_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.LESBIAN_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.PANSEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.PROGRESS_PRIDE_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.QUEER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.RAINBOW_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.TRANSGENDER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.DEMINONBINARY_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.GRAYROMANTIC_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.POLYSEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL, 16);
    }
}
