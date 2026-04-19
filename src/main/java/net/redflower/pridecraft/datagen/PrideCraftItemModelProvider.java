package net.redflower.pridecraft.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.item.PrideCraftItems;

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
    }
}
