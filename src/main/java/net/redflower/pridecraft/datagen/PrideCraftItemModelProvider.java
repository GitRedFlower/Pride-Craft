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

        //Mini Flags
        customBlock(PrideCraftBlocks.ABROSEXUAL_MINI_FLAG);
        customBlock(PrideCraftBlocks.AGENDER_MINI_FLAG);
        customBlock(PrideCraftBlocks.AROACE_MINI_FLAG);
        customBlock(PrideCraftBlocks.AROMANTIC_MINI_FLAG);
        customBlock(PrideCraftBlocks.ASEXUAL_MINI_FLAG);
        customBlock(PrideCraftBlocks.BIGENDER_MINI_FLAG);
        customBlock(PrideCraftBlocks.BISEXUAL_MINI_FLAG);
        customBlock(PrideCraftBlocks.DEMIBOY_MINI_FLAG);
        customBlock(PrideCraftBlocks.DEMIGIRL_MINI_FLAG);
        customBlock(PrideCraftBlocks.DEMINONBINARY_MINI_FLAG);
        customBlock(PrideCraftBlocks.DEMIROMANTIC_MINI_FLAG);
        customBlock(PrideCraftBlocks.DEMISEXUAL_MINI_FLAG);
        customBlock(PrideCraftBlocks.GAY_MINI_FLAG);
        customBlock(PrideCraftBlocks.GENDERFLUID_MINI_FLAG);
        customBlock(PrideCraftBlocks.GENDERFLUX_MINI_FLAG);
        customBlock(PrideCraftBlocks.GENDERQUEER_MINI_FLAG);
        customBlock(PrideCraftBlocks.GRAYROMANTIC_MINI_FLAG);
        customBlock(PrideCraftBlocks.GRAYSEXUAL_MINI_FLAG);
        customBlock(PrideCraftBlocks.INTERSEX_MINI_FLAG);
        customBlock(PrideCraftBlocks.LESBIAN_MINI_FLAG);
        customBlock(PrideCraftBlocks.NONBINARY_MINI_FLAG);
        customBlock(PrideCraftBlocks.OMNISEXUAL_MINI_FLAG);
        customBlock(PrideCraftBlocks.PANSEXUAL_MINI_FLAG);
        customBlock(PrideCraftBlocks.POLYSEXUAL_MINI_FLAG);
        customBlock(PrideCraftBlocks.PROGRESS_PRIDE_MINI_FLAG);
        customBlock(PrideCraftBlocks.OMNISEXUAL_MINI_FLAG);
        customBlock(PrideCraftBlocks.QUEER_MINI_FLAG);
        customBlock(PrideCraftBlocks.RAINBOW_MINI_FLAG);
        customBlock(PrideCraftBlocks.TRANSFEMININE_MINI_FLAG);
        customBlock(PrideCraftBlocks.TRANSGENDER_MINI_FLAG);
        customBlock(PrideCraftBlocks.TRANSMASCULINE_MINI_FLAG);

        //Wall Flag
        customBlock(PrideCraftBlocks.ABROSEXUAL_WALL_FLAG);
        customBlock(PrideCraftBlocks.AGENDER_WALL_FLAG);
        customBlock(PrideCraftBlocks.AROACE_WALL_FLAG);
        customBlock(PrideCraftBlocks.AROMANTIC_WALL_FLAG);
        customBlock(PrideCraftBlocks.ASEXUAL_WALL_FLAG);
        customBlock(PrideCraftBlocks.BIGENDER_WALL_FLAG);
        customBlock(PrideCraftBlocks.BISEXUAL_WALL_FLAG);
        customBlock(PrideCraftBlocks.DEMIBOY_WALL_FLAG);
        customBlock(PrideCraftBlocks.DEMIGIRL_WALL_FLAG);
        customBlock(PrideCraftBlocks.DEMINONBINARY_WALL_FLAG);
        customBlock(PrideCraftBlocks.DEMIROMANTIC_WALL_FLAG);
        customBlock(PrideCraftBlocks.DEMISEXUAL_WALL_FLAG);
        customBlock(PrideCraftBlocks.GAY_WALL_FLAG);
        customBlock(PrideCraftBlocks.GENDERFLUID_WALL_FLAG);
        customBlock(PrideCraftBlocks.GENDERFLUX_WALL_FLAG);
        customBlock(PrideCraftBlocks.GENDERQUEER_WALL_FLAG);
        customBlock(PrideCraftBlocks.GRAYROMANTIC_WALL_FLAG);
        customBlock(PrideCraftBlocks.GRAYSEXUAL_WALL_FLAG);
        customBlock(PrideCraftBlocks.INTERSEX_WALL_FLAG);
        customBlock(PrideCraftBlocks.LESBIAN_WALL_FLAG);
        customBlock(PrideCraftBlocks.NONBINARY_WALL_FLAG);
        customBlock(PrideCraftBlocks.OMNISEXUAL_WALL_FLAG);
        customBlock(PrideCraftBlocks.PANSEXUAL_WALL_FLAG);
        customBlock(PrideCraftBlocks.POLYSEXUAL_WALL_FLAG);
        customBlock(PrideCraftBlocks.PROGRESS_PRIDE_WALL_FLAG);
        customBlock(PrideCraftBlocks.OMNISEXUAL_WALL_FLAG);
        customBlock(PrideCraftBlocks.QUEER_WALL_FLAG);
        customBlock(PrideCraftBlocks.RAINBOW_WALL_FLAG);
        customBlock(PrideCraftBlocks.TRANSFEMININE_WALL_FLAG);
        customBlock(PrideCraftBlocks.TRANSGENDER_WALL_FLAG);
        customBlock(PrideCraftBlocks.TRANSMASCULINE_WALL_FLAG);

        //Flag Carpet
        customBlock(PrideCraftBlocks.ABROSEXUAL_FLAG_CARPET);
        customBlock(PrideCraftBlocks.AGENDER_FLAG_CARPET);
        customBlock(PrideCraftBlocks.AROACE_FLAG_CARPET);
        customBlock(PrideCraftBlocks.AROMANTIC_FLAG_CARPET);
        customBlock(PrideCraftBlocks.ASEXUAL_FLAG_CARPET);
        customBlock(PrideCraftBlocks.BIGENDER_FLAG_CARPET);
        customBlock(PrideCraftBlocks.BISEXUAL_FLAG_CARPET);
        customBlock(PrideCraftBlocks.DEMIBOY_FLAG_CARPET);
        customBlock(PrideCraftBlocks.DEMIGIRL_FLAG_CARPET);
        customBlock(PrideCraftBlocks.DEMINONBINARY_FLAG_CARPET);
        customBlock(PrideCraftBlocks.DEMIROMANTIC_FLAG_CARPET);
        customBlock(PrideCraftBlocks.DEMISEXUAL_FLAG_CARPET);
        customBlock(PrideCraftBlocks.GAY_FLAG_CARPET);
        customBlock(PrideCraftBlocks.GENDERFLUID_FLAG_CARPET);
        customBlock(PrideCraftBlocks.GENDERFLUX_FLAG_CARPET);
        customBlock(PrideCraftBlocks.GENDERQUEER_FLAG_CARPET);
        customBlock(PrideCraftBlocks.GRAYROMANTIC_FLAG_CARPET);
        customBlock(PrideCraftBlocks.GRAYSEXUAL_FLAG_CARPET);
        customBlock(PrideCraftBlocks.INTERSEX_FLAG_CARPET);
        customBlock(PrideCraftBlocks.LESBIAN_FLAG_CARPET);
        customBlock(PrideCraftBlocks.NONBINARY_FLAG_CARPET);
        customBlock(PrideCraftBlocks.OMNISEXUAL_FLAG_CARPET);
        customBlock(PrideCraftBlocks.PANSEXUAL_FLAG_CARPET);
        customBlock(PrideCraftBlocks.POLYSEXUAL_FLAG_CARPET);
        customBlock(PrideCraftBlocks.PROGRESS_PRIDE_FLAG_CARPET);
        customBlock(PrideCraftBlocks.OMNISEXUAL_FLAG_CARPET);
        customBlock(PrideCraftBlocks.QUEER_FLAG_CARPET);
        customBlock(PrideCraftBlocks.RAINBOW_FLAG_CARPET);
        customBlock(PrideCraftBlocks.TRANSFEMININE_FLAG_CARPET);
        customBlock(PrideCraftBlocks.TRANSGENDER_FLAG_CARPET);
        customBlock(PrideCraftBlocks.TRANSMASCULINE_FLAG_CARPET);

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
    private ItemModelBuilder simpleBlockItemBlockTexture(DeferredBlock<?> block) {
        return withExistingParent(block.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID,"block/" + block.getId().getPath())
        );
    }

    private ItemModelBuilder customBlock(DeferredBlock<?> block) {
        return withExistingParent(block.getId().getPath(),
                ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID,"block/" + block.getId().getPath()));
    }
}