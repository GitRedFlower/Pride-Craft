package net.redflower.pridecraft.trim;

import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.item.ModItems;

import java.util.Map;

public class ModTrimMaterials {

    public static final ResourceKey<TrimMaterial> ABROSEXUAL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "abrosexual"));

    public static final ResourceKey<TrimMaterial> AGENDER =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "agender"));

    public static final ResourceKey<TrimMaterial> AROACE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "aroace"));

    public static final ResourceKey<TrimMaterial> AROMANTIC =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "aromantic"));

    public static final ResourceKey<TrimMaterial> ASEXUAL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "asexual"));

    public static final ResourceKey<TrimMaterial> BIGENDER =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "bigender"));

    public static final ResourceKey<TrimMaterial> BISEXUAL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "bisexual"));

    public static final ResourceKey<TrimMaterial> DEMIBOY =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "demiboy"));

    public static final ResourceKey<TrimMaterial> DEMIGIRL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "demigirl"));

    public static final ResourceKey<TrimMaterial> DEMIROMANTIC =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "demiromantic"));

    public static final ResourceKey<TrimMaterial> DEMISEXUAL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "demisexual"));

    public static final ResourceKey<TrimMaterial> GAY =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "gay"));

    public static final ResourceKey<TrimMaterial> GENDERFLUID =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "genderfluid"));

    public static final ResourceKey<TrimMaterial> GENDERFLUX =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "genderflux"));

    public static final ResourceKey<TrimMaterial> GENDERQUEER =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "genderqueer"));

    public static final ResourceKey<TrimMaterial> GRAYSEXUAL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "graysexual"));

    public static final ResourceKey<TrimMaterial> INTERSEX =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "intersex"));

    public static final ResourceKey<TrimMaterial> LESBIAN =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "lesbian"));

    public static final ResourceKey<TrimMaterial> NONBINARY =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "nonbinary"));

    public static final ResourceKey<TrimMaterial> OMNISEXUAL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "omnisexual"));

    public static final ResourceKey<TrimMaterial> PANSEXUAL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "pansexual"));

    public static final ResourceKey<TrimMaterial> PROGRESS_PRIDE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "progress_pride"));

    public static final ResourceKey<TrimMaterial> QUEER =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "queer"));

    public static final ResourceKey<TrimMaterial> RAINBOW =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "rainbow"));

    public static final ResourceKey<TrimMaterial> TRANSGENDER =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "transgender"));

    public static final ResourceKey<TrimMaterial> DEMINONBINARY =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "deminonbinary"));

    public static final ResourceKey<TrimMaterial> GRAYROMANTIC =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "grayromantic"));

    public static final ResourceKey<TrimMaterial> POLYSEXUAL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "polysexual"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, ABROSEXUAL, ModItems.ABROSEXUAL_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#76CB92").getOrThrow()), 0.7f);
        register(context, AGENDER, ModItems.AGENDER_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#B8F483").getOrThrow()), 0.7f);
        register(context, AROACE, ModItems.AROACE_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#E28C00").getOrThrow()), 0.7f);
        register(context, AROMANTIC, ModItems.AROMANTIC_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#3DA542").getOrThrow()), 0.7f);
        register(context, ASEXUAL, ModItems.ASEXUAL_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#8D0085").getOrThrow()), 0.7f);
        register(context, BIGENDER, ModItems.BIGENDER_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#C479A2").getOrThrow()), 0.7f);
        register(context, BISEXUAL, ModItems.BISEXUAL_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#D70271").getOrThrow()), 0.7f);
        register(context, DEMIBOY, ModItems.DEMIBOY_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#9AD9EB").getOrThrow()), 0.7f);
        register(context, DEMIGIRL, ModItems.DEMIGIRL_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#FFAEC9").getOrThrow()), 0.7f);
        register(context, DEMIROMANTIC, ModItems.DEMIROMANTIC_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#3DA542").getOrThrow()), 0.7f);
        register(context, DEMISEXUAL, ModItems.DEMISEXUAL_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#6E0070").getOrThrow()), 0.7f);
        register(context, GAY, ModItems.GAY_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#088D71").getOrThrow()), 0.7f);
        register(context, GENDERFLUID, ModItems.GENDERFLUID_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#FF75A2").getOrThrow()), 0.7f);
        register(context, GENDERFLUX, ModItems.GENDERFLUX_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#F47694").getOrThrow()), 0.7f);
        register(context, GENDERQUEER, ModItems.GENDERQUEER_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#B899DD").getOrThrow()), 0.7f);
        register(context, GRAYSEXUAL, ModItems.GRAYSEXUAL_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#B2B2B2").getOrThrow()), 0.7f);
        register(context, INTERSEX, ModItems.INTERSEX_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#FFD800").getOrThrow()), 0.7f);
        register(context, LESBIAN, ModItems.LESBIAN_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#D62C01").getOrThrow()), 0.7f);
        register(context, NONBINARY, ModItems.NONBINARY_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#FEF436").getOrThrow()), 0.7f);
        register(context, OMNISEXUAL, ModItems.OMNISEXUAL_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#FF9BCF").getOrThrow()), 0.7f);
        register(context, PANSEXUAL, ModItems.PANSEXUAL_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#FF218D").getOrThrow()), 0.7f);
        register(context, PROGRESS_PRIDE, ModItems.PROGRESS_PRIDE_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#603917").getOrThrow()), 0.7f);
        register(context, QUEER, ModItems.QUEER_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#FFFFFF").getOrThrow()), 0.7f);
        register(context, RAINBOW, ModItems.RAINBOW_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#E50204").getOrThrow()), 0.7f);
        register(context, TRANSGENDER, ModItems.TRANSGENDER_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#F6A8B9").getOrThrow()), 0.7f);
        register(context, DEMINONBINARY, ModItems.DEMINONBINARY_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#FBFF74").getOrThrow()), 0.7f);
        register(context, GRAYROMANTIC, ModItems.GRAYROMANTIC_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#087D16").getOrThrow()), 0.7f);
        register(context, POLYSEXUAL, ModItems.POLYSEXUAL_MATERIAL.get(), Style.EMPTY.withColor(TextColor.parseColor("#F61CB9").getOrThrow()), 0.7f);
    }



    public static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimMaterialResourceKey, Item item,
                                Style style, float itemModelIndex) {
        TrimMaterial trimMaterial = TrimMaterial.create(trimMaterialResourceKey.location().getPath(), item, itemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", trimMaterialResourceKey.location())).withStyle(style), Map.of());
        context.register(trimMaterialResourceKey, trimMaterial);
    }
}
