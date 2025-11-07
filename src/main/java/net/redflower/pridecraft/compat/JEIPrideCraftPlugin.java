package net.redflower.pridecraft.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.item.ModItems;
import net.redflower.pridecraft.util.ModTextInfo;

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
    }
}
