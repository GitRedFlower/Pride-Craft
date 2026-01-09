package net.redflower.pride_craft.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.redflower.pride_craft.PrideCraft;
import net.redflower.pride_craft.item.ModItems;
import net.redflower.pride_craft.util.ModTextInfo;

@JeiPlugin
public class JEIPrideCraftPlugin implements IModPlugin {

    private static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(new ItemStack(ModItems.BLAHAJ.get()), VanillaTypes.ITEM_STACK, ModTextInfo.getInformation("jei.info.blahaj"));
        registration.addIngredientInfo(new ItemStack(ModItems.GOLDEN_BLAHAJ.get()), VanillaTypes.ITEM_STACK, ModTextInfo.getInformation("jei.info.golden_blahaj"));
        registration.addIngredientInfo(new ItemStack(ModItems.ORANGE_BLAHAJ.get()), VanillaTypes.ITEM_STACK, ModTextInfo.getInformation("jei.info.orange_blahaj"));
        registration.addIngredientInfo(new ItemStack(ModItems.BLUE_BLAHAJ.get()), VanillaTypes.ITEM_STACK, ModTextInfo.getInformation("jei.info.blue_blahaj"));
        registration.addIngredientInfo(new ItemStack(ModItems.RED_BLAHAJ.get()), VanillaTypes.ITEM_STACK, ModTextInfo.getInformation("jei.info.red_blahaj"));
        registration.addIngredientInfo(new ItemStack(ModItems.GREEN_BLAHAJ.get()), VanillaTypes.ITEM_STACK, ModTextInfo.getInformation("jei.info.green_blahaj"));
        registration.addIngredientInfo(new ItemStack(ModItems.PURPLE_BLAHAJ.get()), VanillaTypes.ITEM_STACK, ModTextInfo.getInformation("jei.info.purple_blahaj"));
    }
}
