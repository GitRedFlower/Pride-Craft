package net.redflower.pridecraft.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.block.PrideCraftBlocks;
import net.redflower.pridecraft.item.PrideCraftItems;

import java.rmi.registry.Registry;
import java.util.Objects;

public class PrideCraftItemModelProvider extends ItemModelProvider {

    public PrideCraftItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PrideCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Flag Materials
        basicItem(PrideCraftItems.ABROSEXUAL_MATERIAL.get());
        basicItem(PrideCraftItems.AGENDER_MATERIAL.get());
        basicItem(PrideCraftItems.AROACE_MATERIAL.get());
        basicItem(PrideCraftItems.AROMANTIC_MATERIAL.get());
        basicItem(PrideCraftItems.ASEXUAL_MATERIAL.get());
        basicItem(PrideCraftItems.BIGENDER_MATERIAL.get());
        basicItem(PrideCraftItems.BISEXUAL_MATERIAL.get());
        basicItem(PrideCraftItems.DEMIBOY_MATERIAL.get());
        basicItem(PrideCraftItems.DEMIGIRL_MATERIAL.get());
        basicItem(PrideCraftItems.DEMIROMANTIC_MATERIAL.get());
        basicItem(PrideCraftItems.DEMISEXUAL_MATERIAL.get());
        basicItem(PrideCraftItems.GAY_MATERIAL.get());
        basicItem(PrideCraftItems.GENDERFLUID_MATERIAL.get());
        basicItem(PrideCraftItems.GENDERFLUX_MATERIAL.get());
        basicItem(PrideCraftItems.GENDERQUEER_MATERIAL.get());
        basicItem(PrideCraftItems.GRAYSEXUAL_MATERIAL.get());
        basicItem(PrideCraftItems.INTERSEX_MATERIAL.get());
        basicItem(PrideCraftItems.LESBIAN_MATERIAL.get());
        basicItem(PrideCraftItems.NONBINARY_MATERIAL.get());
        basicItem(PrideCraftItems.OMNISEXUAL_MATERIAL.get());
        basicItem(PrideCraftItems.PANSEXUAL_MATERIAL.get());
        basicItem(PrideCraftItems.PROGRESS_PRIDE_MATERIAL.get());
        basicItem(PrideCraftItems.QUEER_MATERIAL.get());
        basicItem(PrideCraftItems.RAINBOW_MATERIAL.get());
        basicItem(PrideCraftItems.TRANSGENDER_MATERIAL.get());
        basicItem(PrideCraftItems.DEMINONBINARY_MATERIAL.get());
        basicItem(PrideCraftItems.GRAYROMANTIC_MATERIAL.get());
        basicItem(PrideCraftItems.POLYSEXUAL_MATERIAL.get());
        basicItem(PrideCraftItems.TRANSFEMININE_MATERIAL.get());
        basicItem(PrideCraftItems.TRANSMASCULINE_MATERIAL.get());

        //Other Items
        basicItem(PrideCraftItems.UNKNOWN_MATERIAL.get());
        basicItem(PrideCraftItems.CORRUPTED_FLAG_MATERIAL.get());
        basicItem(PrideCraftItems.PRIDE_INGOT.get());

        //Flowers
        simpleBlockItemBlockTexture(PrideCraftBlocks.ABROSEXUAL_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.AGENDER_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.AROACE_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.AROMANTIC_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.ASEXUAL_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.BIGENDER_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.BISEXUAL_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.DEMIBOY_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.DEMIGIRL_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.DEMINONBINARY_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.DEMIROMANTIC_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.DEMISEXUAL_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.GAY_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.GENDERFLUID_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.GENDERFLUX_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.GENDERQUEER_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.GRAYROMANTIC_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.GRAYSEXUAL_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.INTERSEX_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.LESBIAN_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.NONBINARY_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.OMNISEXUAL_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.PANSEXUAL_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.POLYSEXUAL_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.PROGRESS_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.QUEER_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.RAINBOW_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.TRANSFEMININE_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.TRANSGENDER_PRIDE_FLOWER);
        simpleBlockItemBlockTexture(PrideCraftBlocks.TRANSMASCULINE_PRIDE_FLOWER);
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(DeferredBlock<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID,"block/" + item.getId().getPath())
        );
    }
}
