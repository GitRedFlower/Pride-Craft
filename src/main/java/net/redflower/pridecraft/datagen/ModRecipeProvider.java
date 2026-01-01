package net.redflower.pridecraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.block.ModBlocks;
import net.redflower.pridecraft.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> recipeOutput) {
        //Lists
        List<ItemLike> UNKNOWN_SMELTABLES = List.of(ModItems.UNKNOWN_MATERIAL.get(), ModBlocks.UNKNOWN_ORE.get(), ModBlocks.DEEPSLATE_UNKNOWN_ORE.get());
        List<ItemLike> UNKNOWN_BLOCK_SMELTABLES = List.of(ModBlocks.UNKNOWN_MATERIAL_BLOCK.get());


        //Smelting
        oreSmelting(recipeOutput, UNKNOWN_SMELTABLES, RecipeCategory.MISC, ModItems.CORRUPTED_FLAG_MATERIAL.get(), 0.25f, 200, "rainbow");
        oreSmelting(recipeOutput, UNKNOWN_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.CORRUPTED_FLAG_BLOCK.get(), 0.25f, 200, "rainbow");

        //Blasting
        oreBlasting(recipeOutput, UNKNOWN_SMELTABLES, RecipeCategory.MISC, ModItems.CORRUPTED_FLAG_MATERIAL.get(), 0.25f, 100, "rainbow");
        oreBlasting(recipeOutput, UNKNOWN_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.CORRUPTED_FLAG_BLOCK.get(), 0.25f, 100, "rainbow");

        //Stone Cutting
        //Flag Materials
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.ABROSEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.AGENDER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.AROACE_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.AROMANTIC_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.ASEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.BIGENDER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.BISEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.DEMIBOY_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.DEMIGIRL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.DEMIROMANTIC_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.DEMISEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.GAY_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.GENDERFLUID_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.GENDERFLUX_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.GENDERQUEER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.GRAYSEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.INTERSEX_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.LESBIAN_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.NONBINARY_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.OMNISEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.PANSEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.PROGRESS_PRIDE_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.QUEER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.RAINBOW_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.TRANSGENDER_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.DEMINONBINARY_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.GRAYROMANTIC_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.POLYSEXUAL_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.TRANSFEMININE_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.MISC, ModItems.TRANSMASCULINE_MATERIAL.get(), ModItems.CORRUPTED_FLAG_MATERIAL.get(), 8);
    }

    //Custom Recipe Changes and Name Space fixes
    //Furnace
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    //Blast Furnace
    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    //Changes the minecraft namespace to the Pride Craft namespace
    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  PrideCraft.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
