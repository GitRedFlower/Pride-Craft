package net.redflower.pridecraft.WorldGen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.redflower.pridecraft.PrideCraft;

import java.util.List;

public class PrideCraftPlacedFeatures {

    public static final ResourceKey<PlacedFeature> UNKNOWN_ORE_PLACED_KEY = registerKey("unknown_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, UNKNOWN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(PrideCraftConfiguredFeatures.UNKNOWN_ORE_KEY),
                PrideCraftOrePlacement.commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.absolute(-15), VerticalAnchor.absolute(95))));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

