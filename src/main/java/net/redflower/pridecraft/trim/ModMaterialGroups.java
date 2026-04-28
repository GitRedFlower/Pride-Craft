package net.redflower.pridecraft.trim;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;

import java.util.Map;

public record ModMaterialGroups(MaterialAssetGroup.AssetInfo base, Map<ResourceKey<EquipmentAsset>, MaterialAssetGroup.AssetInfo> overrides) {
    public static final String SEPARATOR = "_";
    public static final MapCodec<MaterialAssetGroup> MAP_CODEC = RecordCodecBuilder.mapCodec(
            (p_400278_) -> p_400278_.group(MaterialAssetGroup.AssetInfo.CODEC.fieldOf("asset_name")
                            .forGetter(MaterialAssetGroup::base), Codec.unboundedMap(ResourceKey.codec(EquipmentAssets.ROOT_ID), MaterialAssetGroup.AssetInfo.CODEC)
                            .optionalFieldOf("override_armor_assets", Map.of()).forGetter(MaterialAssetGroup::overrides))
                    .apply(p_400278_, MaterialAssetGroup::new));
    public static final StreamCodec<ByteBuf, MaterialAssetGroup> STREAM_CODEC;

    //Custom Trim Material
    public static final MaterialAssetGroup ABROSEXUAL = create("abrosexual");
    public static final MaterialAssetGroup AGENDER = create("agender");
    public static final MaterialAssetGroup AROACE = create("aroace");
    public static final MaterialAssetGroup AROMANTIC = create("aromantic");
    public static final MaterialAssetGroup ASEXUAL = create("asexual");
    public static final MaterialAssetGroup BIGENDER = create("bigender");
    public static final MaterialAssetGroup BISEXUAL = create("bisexual");
    public static final MaterialAssetGroup DEMIBOY = create("demiboy");
    public static final MaterialAssetGroup DEMIGIRL = create("demigirl");
    public static final MaterialAssetGroup DEMINONBINARY = create("deminonbinary");
    public static final MaterialAssetGroup DEMIROMANTIC = create("demiromantic");
    public static final MaterialAssetGroup DEMISEXUAL = create("demisexual");
    public static final MaterialAssetGroup GAY = create("gay");
    public static final MaterialAssetGroup GENDERFLUID = create("genderfluid");
    public static final MaterialAssetGroup GENDERFLUX = create("genderflux");
    public static final MaterialAssetGroup GENDERQUEER = create("genderqueer");
    public static final MaterialAssetGroup GRAYROMANTIC = create("grayromantic");
    public static final MaterialAssetGroup GRAYSEXUAL = create("graysexual");
    public static final MaterialAssetGroup INTERSEX = create("intersex");
    public static final MaterialAssetGroup LESBIAN = create("lesbian");
    public static final MaterialAssetGroup NONBINARY = create("nonbinary");
    public static final MaterialAssetGroup OMNISEXUAL = create("omnisexual");
    public static final MaterialAssetGroup PANSEXUAL = create("pansexual");
    public static final MaterialAssetGroup POLYSEXUAL = create("polysexual");
    public static final MaterialAssetGroup PROGRESS_PRIDE = create("progress_pride");
    public static final MaterialAssetGroup QUEER = create("queer");
    public static final MaterialAssetGroup RAINBOW = create("rainbow");
    public static final MaterialAssetGroup TRANSFEMININE = create("transfeminine");
    public static final MaterialAssetGroup TRANSGENDER = create("transgender");
    public static final MaterialAssetGroup TRANSMASCULINE = create("transmasculine");

    public static MaterialAssetGroup create(String name) {
        return new MaterialAssetGroup(new MaterialAssetGroup.AssetInfo(name), Map.of());
    }

    static {
        STREAM_CODEC = StreamCodec.composite(MaterialAssetGroup.AssetInfo.STREAM_CODEC, MaterialAssetGroup::base, ByteBufCodecs.map(Object2ObjectOpenHashMap::new, ResourceKey.streamCodec(EquipmentAssets.ROOT_ID), MaterialAssetGroup.AssetInfo.STREAM_CODEC), MaterialAssetGroup::overrides, MaterialAssetGroup::new);
    }
}
