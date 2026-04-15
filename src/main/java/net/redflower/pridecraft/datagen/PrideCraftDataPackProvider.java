package net.redflower.pridecraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.WorldGen.PrideCraftBiomeModifiers;
import net.redflower.pridecraft.WorldGen.PrideCraftConfiguredFeatures;
import net.redflower.pridecraft.WorldGen.PrideCraftPlacedFeatures;
import net.redflower.pridecraft.trim.PrideCraftTrimMaterials;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class PrideCraftDataPackProvider extends DatapackBuiltinEntriesProvider {

    //Created by Kaupenjoe
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.TRIM_MATERIAL, PrideCraftTrimMaterials::bootstrap)
            .add(Registries.CONFIGURED_FEATURE, PrideCraftConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, PrideCraftPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, PrideCraftBiomeModifiers::bootstrap);

    public PrideCraftDataPackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(PrideCraft.MODID));
    }
}
