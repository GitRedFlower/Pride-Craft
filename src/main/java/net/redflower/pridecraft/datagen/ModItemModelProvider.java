package net.redflower.pridecraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PrideCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Flag Materials
        basicItem(ModItems.ABROSEXUAL_MATERIAL.get());
        basicItem(ModItems.AGENDER_MATERIAL.get());
        basicItem(ModItems.AROACE_MATERIAL.get());
        basicItem(ModItems.AROMANTIC_MATERIAL.get());
        basicItem(ModItems.ASEXUAL_MATERIAL.get());
        basicItem(ModItems.BIGENDER_MATERIAL.get());
        basicItem(ModItems.BISEXUAL_MATERIAL.get());
        basicItem(ModItems.DEMIBOY_MATERIAL.get());
        basicItem(ModItems.DEMIGIRL_MATERIAL.get());
        basicItem(ModItems.DEMIROMANTIC_MATERIAL.get());
        basicItem(ModItems.DEMISEXUAL_MATERIAL.get());
        basicItem(ModItems.GAY_MATERIAL.get());
        basicItem(ModItems.GENDERFLUID_MATERIAL.get());
        basicItem(ModItems.GENDERFLUX_MATERIAL.get());
        basicItem(ModItems.GENDERQUEER_MATERIAL.get());
        basicItem(ModItems.GRAYSEXUAL_MATERIAL.get());
        basicItem(ModItems.INTERSEX_MATERIAL.get());
        basicItem(ModItems.LESBIAN_MATERIAL.get());
        basicItem(ModItems.NONBINARY_MATERIAL.get());
        basicItem(ModItems.OMNISEXUAL_MATERIAL.get());
        basicItem(ModItems.PANSEXUAL_MATERIAL.get());
        basicItem(ModItems.PROGRESS_PRIDE_MATERIAL.get());
        basicItem(ModItems.QUEER_MATERIAL.get());
        basicItem(ModItems.RAINBOW_MATERIAL.get());
        basicItem(ModItems.TRANSGENDER_MATERIAL.get());
        basicItem(ModItems.DEMINONBINARY_MATERIAL.get());
        basicItem(ModItems.GRAYROMANTIC_MATERIAL.get());
        basicItem(ModItems.POLYSEXUAL_MATERIAL.get());

        //Other Items
        basicItem(ModItems.UNKNOWN_MATERIAL.get());
        basicItem(ModItems.CORRUPTED_FLAG_MATERIAL.get());
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "item/" + item.getId().getPath()));
    }
}
