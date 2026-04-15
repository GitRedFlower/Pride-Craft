package net.redflower.pridecraft.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.item.PrideCraftItems;
import net.redflower.pridecraft.util.PrideCraftTextInfo;

@JeiPlugin
public class JEIPrideCraftPlugin implements IModPlugin {

    private static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(new ItemStack(PrideCraftItems.BLAHAJ.get()), VanillaTypes.ITEM_STACK, PrideCraftTextInfo.getInformation("jei.info.blahaj"));
        registration.addIngredientInfo(new ItemStack(PrideCraftItems.GOLDEN_BLAHAJ.get()), VanillaTypes.ITEM_STACK, PrideCraftTextInfo.getInformation("jei.info.golden_blahaj"));
        registration.addIngredientInfo(new ItemStack(PrideCraftItems.ORANGE_BLAHAJ.get()), VanillaTypes.ITEM_STACK, PrideCraftTextInfo.getInformation("jei.info.orange_blahaj"));
        registration.addIngredientInfo(new ItemStack(PrideCraftItems.BLUE_BLAHAJ.get()), VanillaTypes.ITEM_STACK, PrideCraftTextInfo.getInformation("jei.info.blue_blahaj"));
        registration.addIngredientInfo(new ItemStack(PrideCraftItems.RED_BLAHAJ.get()), VanillaTypes.ITEM_STACK, PrideCraftTextInfo.getInformation("jei.info.red_blahaj"));
        registration.addIngredientInfo(new ItemStack(PrideCraftItems.GREEN_BLAHAJ.get()), VanillaTypes.ITEM_STACK, PrideCraftTextInfo.getInformation("jei.info.green_blahaj"));
        registration.addIngredientInfo(new ItemStack(PrideCraftItems.PURPLE_BLAHAJ.get()), VanillaTypes.ITEM_STACK, PrideCraftTextInfo.getInformation("jei.info.purple_blahaj"));
    }
}
