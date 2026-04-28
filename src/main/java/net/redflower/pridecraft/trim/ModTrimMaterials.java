package net.redflower.pridecraft.trim;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.redflower.pridecraft.PrideCraft;

public class ModTrimMaterials {

    public static final ResourceKey<TrimMaterial> ABROSEXUAL = registerMaterial("abrosexual");
    public static final ResourceKey<TrimMaterial> AGENDER = registerMaterial("agender");
    public static final ResourceKey<TrimMaterial> AROACE = registerMaterial("aroace");
    public static final ResourceKey<TrimMaterial> AROMANTIC = registerMaterial("aromantic");
    public static final ResourceKey<TrimMaterial> ASEXUAL = registerMaterial("asexual");
    public static final ResourceKey<TrimMaterial> BIGENDER = registerMaterial("bigender");
    public static final ResourceKey<TrimMaterial> BISEXUAL = registerMaterial("bisexual");
    public static final ResourceKey<TrimMaterial> DEMIBOY = registerMaterial("demiboy");
    public static final ResourceKey<TrimMaterial> DEMIGIRL = registerMaterial("demigirl");
    public static final ResourceKey<TrimMaterial> DEMINONBINARY = registerMaterial("deminonbinary");
    public static final ResourceKey<TrimMaterial> DEMIROMANTIC = registerMaterial("demiromantic");
    public static final ResourceKey<TrimMaterial> DEMISEXUAL = registerMaterial("demisexual");
    public static final ResourceKey<TrimMaterial> GAY = registerMaterial("gay");
    public static final ResourceKey<TrimMaterial> GENDERFLUID = registerMaterial("genderfluid");
    public static final ResourceKey<TrimMaterial> GENDERFLUX = registerMaterial("genderflux");
    public static final ResourceKey<TrimMaterial> GENDERQUEER = registerMaterial("genderqueer");
    public static final ResourceKey<TrimMaterial> GRAYROMANTIC = registerMaterial("grayromantic");
    public static final ResourceKey<TrimMaterial> GRAYSEXUAL = registerMaterial("graysexual");
    public static final ResourceKey<TrimMaterial> INTERSEX = registerMaterial("intersex");
    public static final ResourceKey<TrimMaterial> LESBIAN = registerMaterial("lesbian");
    public static final ResourceKey<TrimMaterial> NONBINARY = registerMaterial("nonbinary");
    public static final ResourceKey<TrimMaterial> OMNISEXUAL = registerMaterial("omnisexual");
    public static final ResourceKey<TrimMaterial> PANSEXUAL = registerMaterial("pansexual");
    public static final ResourceKey<TrimMaterial> POLYSEXUAL = registerMaterial("polysexual");
    public static final ResourceKey<TrimMaterial> PROGRESS_PRIDE = registerMaterial("progress_pride");
    public static final ResourceKey<TrimMaterial> QUEER = registerMaterial("queer");
    public static final ResourceKey<TrimMaterial> RAINBOW = registerMaterial("rainbow");
    public static final ResourceKey<TrimMaterial> TRANSFEMININE = registerMaterial("transfeminine");
    public static final ResourceKey<TrimMaterial> TRANSGENDER = registerMaterial("transgender");
    public static final ResourceKey<TrimMaterial> TRANSMASCULINE = registerMaterial("transmasculine");


    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, ABROSEXUAL, Style.EMPTY.withColor(TextColor.parseColor("#76CB92").getOrThrow()), ModMaterialGroups.ABROSEXUAL);
        register(context, AGENDER, Style.EMPTY.withColor(TextColor.parseColor("#B8F483").getOrThrow()), ModMaterialGroups.AGENDER);
        register(context, AROACE, Style.EMPTY.withColor(TextColor.parseColor("#E28C00").getOrThrow()), ModMaterialGroups.AROACE);
        register(context, AROMANTIC, Style.EMPTY.withColor(TextColor.parseColor("#3DA542").getOrThrow()), ModMaterialGroups.AROMANTIC);
        register(context, ASEXUAL, Style.EMPTY.withColor(TextColor.parseColor("#8D0085").getOrThrow()), ModMaterialGroups.ASEXUAL);
        register(context, BIGENDER, Style.EMPTY.withColor(TextColor.parseColor("#C479A2").getOrThrow()), ModMaterialGroups.BIGENDER);
        register(context, BISEXUAL, Style.EMPTY.withColor(TextColor.parseColor("#D70271").getOrThrow()), ModMaterialGroups.BISEXUAL);
        register(context, DEMIBOY, Style.EMPTY.withColor(TextColor.parseColor("#9AD9EB").getOrThrow()), ModMaterialGroups.DEMIBOY);
        register(context, DEMIGIRL, Style.EMPTY.withColor(TextColor.parseColor("#FFAEC9").getOrThrow()), ModMaterialGroups.DEMIGIRL);
        register(context, DEMINONBINARY, Style.EMPTY.withColor(TextColor.parseColor("#FBFF74").getOrThrow()), ModMaterialGroups.DEMINONBINARY);
        register(context, DEMIROMANTIC, Style.EMPTY.withColor(TextColor.parseColor("#3DA542").getOrThrow()), ModMaterialGroups.DEMIROMANTIC);
        register(context, DEMISEXUAL, Style.EMPTY.withColor(TextColor.parseColor("#6E0070").getOrThrow()), ModMaterialGroups.DEMISEXUAL);
        register(context, GAY, Style.EMPTY.withColor(TextColor.parseColor("#088D71").getOrThrow()), ModMaterialGroups.GAY);
        register(context, GENDERFLUID, Style.EMPTY.withColor(TextColor.parseColor("#FF75A2").getOrThrow()), ModMaterialGroups.GENDERFLUID);
        register(context, GENDERFLUX, Style.EMPTY.withColor(TextColor.parseColor("#F47694").getOrThrow()), ModMaterialGroups.GENDERFLUX);
        register(context, GENDERQUEER, Style.EMPTY.withColor(TextColor.parseColor("#B899DD").getOrThrow()), ModMaterialGroups.GENDERQUEER);
        register(context, GRAYROMANTIC, Style.EMPTY.withColor(TextColor.parseColor("#087D16").getOrThrow()), ModMaterialGroups.GRAYROMANTIC);
        register(context, GRAYSEXUAL, Style.EMPTY.withColor(TextColor.parseColor("#B2B2B2").getOrThrow()), ModMaterialGroups.GRAYSEXUAL);
        register(context, INTERSEX, Style.EMPTY.withColor(TextColor.parseColor("#FFD800").getOrThrow()), ModMaterialGroups.INTERSEX);
        register(context, LESBIAN, Style.EMPTY.withColor(TextColor.parseColor("#D62C01").getOrThrow()), ModMaterialGroups.LESBIAN);
        register(context, NONBINARY, Style.EMPTY.withColor(TextColor.parseColor("#FEF436").getOrThrow()), ModMaterialGroups.NONBINARY);
        register(context, OMNISEXUAL, Style.EMPTY.withColor(TextColor.parseColor("#FF9BCF").getOrThrow()), ModMaterialGroups.OMNISEXUAL);
        register(context, PANSEXUAL, Style.EMPTY.withColor(TextColor.parseColor("#FF218D").getOrThrow()), ModMaterialGroups.PANSEXUAL);
        register(context, POLYSEXUAL, Style.EMPTY.withColor(TextColor.parseColor("#F61CB9").getOrThrow()), ModMaterialGroups.POLYSEXUAL);
        register(context, PROGRESS_PRIDE, Style.EMPTY.withColor(TextColor.parseColor("#603917").getOrThrow()), ModMaterialGroups.PROGRESS_PRIDE);
        register(context, QUEER, Style.EMPTY.withColor(TextColor.parseColor("#FFFFFF").getOrThrow()), ModMaterialGroups.QUEER);
        register(context, RAINBOW, Style.EMPTY.withColor(TextColor.parseColor("#E50204").getOrThrow()), ModMaterialGroups.RAINBOW);
        register(context, TRANSFEMININE, Style.EMPTY.withColor(TextColor.parseColor("#087D16").getOrThrow()), ModMaterialGroups.TRANSFEMININE);
        register(context, TRANSGENDER, Style.EMPTY.withColor(TextColor.parseColor("#F6A8B9").getOrThrow()), ModMaterialGroups.TRANSGENDER);
        register(context, TRANSMASCULINE, Style.EMPTY.withColor(TextColor.parseColor("#087D16").getOrThrow()), ModMaterialGroups.TRANSMASCULINE);
    }

    public static ResourceKey<TrimMaterial> registerMaterial(String name) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(PrideCraft.MODID, name));
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> key, Style style, MaterialAssetGroup group) {
        Component component = Component.translatable(Util.makeDescriptionId("trim_material", key.identifier())).withStyle(style);
        context.register(key, new TrimMaterial(group, component));
    }
}
