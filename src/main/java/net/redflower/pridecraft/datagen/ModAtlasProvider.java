package net.redflower.pridecraft.datagen;

import net.minecraft.client.data.AtlasProvider;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.renderer.MaterialMapper;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.texture.atlas.SpriteSource;
import net.minecraft.client.renderer.texture.atlas.SpriteSources;
import net.minecraft.client.renderer.texture.atlas.sources.DirectoryLister;
import net.minecraft.client.renderer.texture.atlas.sources.PalettedPermutations;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.data.AtlasIds;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimPattern;
import net.minecraft.world.item.equipment.trim.TrimPatterns;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.trim.ModMaterialGroups;
import net.redflower.pridecraft.trim.ModTrimMaterials;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModAtlasProvider extends AtlasProvider {
    private final PackOutput.PathProvider path;
    public static final List<ModTrimMaterialData> MOD_TRIM_MATERIAL_MODELS = List.of(
            new ModTrimMaterialData(ModMaterialGroups.ABROSEXUAL, ModTrimMaterials.ABROSEXUAL),
            new ModTrimMaterialData(ModMaterialGroups.AGENDER, ModTrimMaterials.AGENDER),
            new ModTrimMaterialData(ModMaterialGroups.AROACE, ModTrimMaterials.AROACE),
            new ModTrimMaterialData(ModMaterialGroups.AROMANTIC, ModTrimMaterials.AROMANTIC),
            new ModTrimMaterialData(ModMaterialGroups.ASEXUAL, ModTrimMaterials.ASEXUAL),
            new ModTrimMaterialData(ModMaterialGroups.BIGENDER, ModTrimMaterials.BIGENDER),
            new ModTrimMaterialData(ModMaterialGroups.BISEXUAL, ModTrimMaterials.BISEXUAL),
            new ModTrimMaterialData(ModMaterialGroups.DEMIBOY, ModTrimMaterials.DEMIBOY),
            new ModTrimMaterialData(ModMaterialGroups.DEMIGIRL, ModTrimMaterials.DEMIGIRL),
            new ModTrimMaterialData(ModMaterialGroups.DEMINONBINARY, ModTrimMaterials.DEMINONBINARY),
            new ModTrimMaterialData(ModMaterialGroups.DEMIROMANTIC, ModTrimMaterials.DEMIROMANTIC),
            new ModTrimMaterialData(ModMaterialGroups.DEMISEXUAL, ModTrimMaterials.DEMISEXUAL),
            new ModTrimMaterialData(ModMaterialGroups.GAY, ModTrimMaterials.GAY),
            new ModTrimMaterialData(ModMaterialGroups.GENDERFLUID, ModTrimMaterials.GENDERFLUID),
            new ModTrimMaterialData(ModMaterialGroups.GENDERFLUX, ModTrimMaterials.GENDERFLUX),
            new ModTrimMaterialData(ModMaterialGroups.GENDERQUEER, ModTrimMaterials.GENDERQUEER),
            new ModTrimMaterialData(ModMaterialGroups.GRAYROMANTIC, ModTrimMaterials.GRAYROMANTIC),
            new ModTrimMaterialData(ModMaterialGroups.GRAYSEXUAL, ModTrimMaterials.GRAYSEXUAL),
            new ModTrimMaterialData(ModMaterialGroups.INTERSEX, ModTrimMaterials.INTERSEX),
            new ModTrimMaterialData(ModMaterialGroups.LESBIAN, ModTrimMaterials.LESBIAN),
            new ModTrimMaterialData(ModMaterialGroups.NONBINARY, ModTrimMaterials.NONBINARY),
            new ModTrimMaterialData(ModMaterialGroups.OMNISEXUAL, ModTrimMaterials.OMNISEXUAL),
            new ModTrimMaterialData(ModMaterialGroups.PANSEXUAL, ModTrimMaterials.PANSEXUAL),
            new ModTrimMaterialData(ModMaterialGroups.POLYSEXUAL, ModTrimMaterials.POLYSEXUAL),
            new ModTrimMaterialData(ModMaterialGroups.PROGRESS_PRIDE, ModTrimMaterials.PROGRESS_PRIDE),
            new ModTrimMaterialData(ModMaterialGroups.QUEER, ModTrimMaterials.QUEER),
            new ModTrimMaterialData(ModMaterialGroups.RAINBOW, ModTrimMaterials.RAINBOW),
            new ModTrimMaterialData(ModMaterialGroups.TRANSFEMININE, ModTrimMaterials.TRANSFEMININE),
            new ModTrimMaterialData(ModMaterialGroups.TRANSGENDER, ModTrimMaterials.TRANSGENDER),
            new ModTrimMaterialData(ModMaterialGroups.TRANSMASCULINE, ModTrimMaterials.TRANSMASCULINE)
    );

    public ModAtlasProvider(PackOutput output) {
        super(output);
        this.path = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, "atlases");
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cachedOutput) {
        return CompletableFuture.allOf(
                storeAtlas(cachedOutput, AtlasIds.ARMOR_TRIMS, List.of(new PalettedPermutations(patternTextures(), Identifier.withDefaultNamespace("trims/color_palettes/trim_palette"), TRIM_PALETTE_VALUES))),
                storeAtlas(cachedOutput, AtlasIds.ITEMS, itemsList())
        );
    }

    private static List<Identifier> patternTextures() {
        List<Identifier> list = new ArrayList<>(VANILLA_PATTERNS.size() * HUMANOID_LAYERS.size());

        for (ResourceKey<TrimPattern> resourcekey : VANILLA_PATTERNS) {
            Identifier identifier = TrimPatterns.defaultAssetId(resourcekey);

            for (EquipmentClientInfo.LayerType equipmentclientinfo$layertype : HUMANOID_LAYERS) {
                list.add(identifier.withPath(p_399824_ -> equipmentclientinfo$layertype.trimAssetPrefix() + "/" + p_399824_));
            }
        }

        return list;
    }

    private static SpriteSource forMapper(MaterialMapper mapper) {
        return new DirectoryLister(mapper.prefix(), mapper.prefix() + "/");
    }

    private static List<SpriteSource> itemsList() {
        return List.of(forMapper(Sheets.ITEMS_MAPPER), new PalettedPermutations(List.of(ItemModelGenerators.TRIM_PREFIX_HELMET, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, ItemModelGenerators.TRIM_PREFIX_BOOTS), Identifier.withDefaultNamespace("trims/color_palettes/trim_palette"), TRIM_PALETTE_VALUES));
    }

    private static Stream<MaterialAssetGroup.AssetInfo> extractAllMaterialAssets() {
        return ItemModelGenerators.TRIM_MATERIAL_MODELS
                .stream()
                .map(ItemModelGenerators.TrimMaterialData::assets)
                .flatMap(p_400261_ -> Stream.concat(Stream.of(p_400261_.base()), p_400261_.overrides().values().stream()))
                .sorted(Comparator.comparing(MaterialAssetGroup.AssetInfo::suffix));
    }
    private static Stream<MaterialAssetGroup.AssetInfo> extractModMaterialAssets() {
        return MOD_TRIM_MATERIAL_MODELS
                .stream()
                .map(ModTrimMaterialData::assets)
                .flatMap(p_400261_ -> Stream.concat(Stream.of(p_400261_.base()), p_400261_.overrides().values().stream()))
                .sorted(Comparator.comparing(MaterialAssetGroup.AssetInfo::suffix));
    }

    private static final Map<String, Identifier> TRIM_PALETTE_VALUES =
            Stream.concat(
                            extractAllMaterialAssets().map(info -> Map.entry("minecraft", info)),
                            extractModMaterialAssets().map(info -> Map.entry(PrideCraft.MODID, info))
                    )
                    .collect(Collectors.toMap(
                            e -> e.getValue().suffix(),
                            e -> Identifier.fromNamespaceAndPath(e.getKey(), "trims/color_palettes/" + e.getValue().suffix())
                    ));

    private static final List<ResourceKey<TrimPattern>> VANILLA_PATTERNS = List.of(
            TrimPatterns.SENTRY,
            TrimPatterns.DUNE,
            TrimPatterns.COAST,
            TrimPatterns.WILD,
            TrimPatterns.WARD,
            TrimPatterns.EYE,
            TrimPatterns.VEX,
            TrimPatterns.TIDE,
            TrimPatterns.SNOUT,
            TrimPatterns.RIB,
            TrimPatterns.SPIRE,
            TrimPatterns.WAYFINDER,
            TrimPatterns.SHAPER,
            TrimPatterns.SILENCE,
            TrimPatterns.RAISER,
            TrimPatterns.HOST,
            TrimPatterns.FLOW,
            TrimPatterns.BOLT
    );
    private static final List<EquipmentClientInfo.LayerType> HUMANOID_LAYERS = List.of(
            EquipmentClientInfo.LayerType.HUMANOID, EquipmentClientInfo.LayerType.HUMANOID_LEGGINGS
    );



    public static record ModTrimMaterialData(MaterialAssetGroup assets, ResourceKey<TrimMaterial> materialKey) {
    }

    private CompletableFuture<?> storeAtlas(CachedOutput p_399787_, Identifier p_468894_, List<SpriteSource> p_399735_) {
        return DataProvider.saveStable(p_399787_, SpriteSources.FILE_CODEC, p_399735_, this.path.json(p_468894_));
    }
}
