package net.redflower.pridecraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.item.custom.BlahajItem;
import net.redflower.pridecraft.trim.ModTrimMaterials;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PrideCraft.MODID);

    //Crafting Material
    public static final DeferredItem<Item> UNKNOWN_MATERIAL = ITEMS.register("unknown_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PrideCraft.MODID, "unknown_material")))));

    public static final DeferredItem<Item> CORRUPTED_FLAG_MATERIAL = ITEMS.register("corrupted_flag_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PrideCraft.MODID, "corrupted_flag_material")))));

    //Flag Materials
    public static final DeferredItem<Item> ABROSEXUAL_MATERIAL = registerTrimMaterial("abrosexual_material", ModTrimMaterials.ABROSEXUAL);

    public static final DeferredItem<Item> AGENDER_MATERIAL = registerTrimMaterial("agender_material", ModTrimMaterials.AGENDER);

    public static final DeferredItem<Item> AROACE_MATERIAL = registerTrimMaterial("aroace_material", ModTrimMaterials.AROACE);

    public static final DeferredItem<Item> AROMANTIC_MATERIAL = registerTrimMaterial("aromantic_material", ModTrimMaterials.AROMANTIC);

    public static final DeferredItem<Item> ASEXUAL_MATERIAL = registerTrimMaterial("asexual_material", ModTrimMaterials.ASEXUAL);

    public static final DeferredItem<Item> BIGENDER_MATERIAL = registerTrimMaterial("bigender_material",ModTrimMaterials.BIGENDER);

    public static final DeferredItem<Item> BISEXUAL_MATERIAL = registerTrimMaterial("bisexual_material", ModTrimMaterials.BISEXUAL);

    public static final DeferredItem<Item> DEMIBOY_MATERIAL = registerTrimMaterial("demiboy_material", ModTrimMaterials.DEMIBOY);

    public static final DeferredItem<Item> DEMIGIRL_MATERIAL = registerTrimMaterial("demigirl_material", ModTrimMaterials.DEMIGIRL);

    public static final DeferredItem<Item> DEMINONBINARY_MATERIAL = registerTrimMaterial("deminonbinary_material", ModTrimMaterials.DEMINONBINARY);

    public static final DeferredItem<Item> DEMIROMANTIC_MATERIAL = registerTrimMaterial("demiromantic_material", ModTrimMaterials.DEMIROMANTIC);

    public static final DeferredItem<Item> DEMISEXUAL_MATERIAL = registerTrimMaterial("demisexual_material", ModTrimMaterials.DEMISEXUAL);

    public static final DeferredItem<Item> GAY_MATERIAL = registerTrimMaterial("gay_material", ModTrimMaterials.GAY);

    public static final DeferredItem<Item> GENDERFLUID_MATERIAL = registerTrimMaterial("genderfluid_material", ModTrimMaterials.GENDERFLUID);

    public static final DeferredItem<Item> GENDERFLUX_MATERIAL = registerTrimMaterial("genderflux_material", ModTrimMaterials.GENDERFLUX);

    public static final DeferredItem<Item> GENDERQUEER_MATERIAL = registerTrimMaterial("genderqueer_material", ModTrimMaterials.GENDERQUEER);

    public static final DeferredItem<Item> GRAYSEXUAL_MATERIAL = registerTrimMaterial("graysexual_material", ModTrimMaterials.GRAYSEXUAL);

    public static final DeferredItem<Item> INTERSEX_MATERIAL = registerTrimMaterial("intersex_material", ModTrimMaterials.INTERSEX);

    public static final DeferredItem<Item> LESBIAN_MATERIAL = registerTrimMaterial("lesbian_material", ModTrimMaterials.LESBIAN);

    public static final DeferredItem<Item> NONBINARY_MATERIAL = registerTrimMaterial("nonbinary_material", ModTrimMaterials.NONBINARY);

    public static final DeferredItem<Item> OMNISEXUAL_MATERIAL = registerTrimMaterial("omnisexual_material", ModTrimMaterials.OMNISEXUAL);

    public static final DeferredItem<Item> PANSEXUAL_MATERIAL = registerTrimMaterial("pansexual_material", ModTrimMaterials.PANSEXUAL);

    public static final DeferredItem<Item> PROGRESS_PRIDE_MATERIAL = registerTrimMaterial("progress_pride_material", ModTrimMaterials.PROGRESS_PRIDE);

    public static final DeferredItem<Item> QUEER_MATERIAL = registerTrimMaterial("queer_material", ModTrimMaterials.QUEER);

    public static final DeferredItem<Item> RAINBOW_MATERIAL = registerTrimMaterial("rainbow_material", ModTrimMaterials.RAINBOW);

    public static final DeferredItem<Item> TRANSGENDER_MATERIAL = registerTrimMaterial("transgender_material", ModTrimMaterials.TRANSGENDER);

    public static final DeferredItem<Item> GRAYROMANTIC_MATERIAL = registerTrimMaterial("grayromantic_material", ModTrimMaterials.GRAYROMANTIC);

    public static final DeferredItem<Item> POLYSEXUAL_MATERIAL = registerTrimMaterial("polysexual_material", ModTrimMaterials.POLYSEXUAL);

    public static final DeferredItem<Item> TRANSFEMININE_MATERIAL = registerTrimMaterial("transfeminine_material", ModTrimMaterials.TRANSFEMININE);

    public static final DeferredItem<Item> TRANSMASCULINE_MATERIAL = registerTrimMaterial("transmasculine_material", ModTrimMaterials.TRANSMASCULINE);

    //Other Items
    public static final DeferredItem<Item> BLAHAJ = ITEMS.register("blahaj",
            () -> new BlahajItem(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PrideCraft.MODID, "blahaj")))
                    .rarity(Rarity.RARE).stacksTo(1), MobEffects.RESISTANCE, 0));

    public static final DeferredItem<Item> GOLDEN_BLAHAJ = ITEMS.register("golden_blahaj",
            () -> new BlahajItem(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PrideCraft.MODID, "golden_blahaj")))
                    .rarity(Rarity.EPIC).stacksTo(1), MobEffects.RESISTANCE, 1));

    public static final DeferredItem<Item> ORANGE_BLAHAJ = ITEMS.register("orange_blahaj",
            () -> new BlahajItem(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PrideCraft.MODID, "orange_blahaj")))
                    .rarity(Rarity.EPIC).stacksTo(1), MobEffects.FIRE_RESISTANCE, 0));

    public static final DeferredItem<Item> BLUE_BLAHAJ = ITEMS.register("blue_blahaj",
            () -> new BlahajItem(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PrideCraft.MODID, "blue_blahaj")))
                    .rarity(Rarity.EPIC).stacksTo(1), MobEffects.WATER_BREATHING, 0));

    public static final DeferredItem<Item> RED_BLAHAJ = ITEMS.register("red_blahaj",
            () -> new BlahajItem(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PrideCraft.MODID, "red_blahaj")))
                    .rarity(Rarity.EPIC).stacksTo(1), MobEffects.HEALTH_BOOST, 0));

    public static final DeferredItem<Item> GREEN_BLAHAJ = ITEMS.register("green_blahaj",
            () -> new BlahajItem(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PrideCraft.MODID, "green_blahaj")))
                    .rarity(Rarity.EPIC).stacksTo(1), MobEffects.SPEED, 0));

    public static final DeferredItem<Item> PURPLE_BLAHAJ = ITEMS.register("purple_blahaj",
            () -> new BlahajItem(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PrideCraft.MODID, "purple_blahaj")))
                    .rarity(Rarity.EPIC).stacksTo(1), MobEffects.HASTE, 0));


    //Registers The Items. DO NOT TOUCH!!!
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static DeferredItem<Item> registerTrimMaterial(String id, ResourceKey<TrimMaterial> trim) {
        return ITEMS.register(id,
                () -> new Item(new Item.Properties()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PrideCraft.MODID, id)))
                        .trimMaterial(trim)));
    }
}
