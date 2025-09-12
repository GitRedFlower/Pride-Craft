package net.redflower.pridecraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.pridecraft.PrideCraft;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PrideCraft.MODID);

    //Crafting Material
    public static final DeferredItem<Item> UNKNOWN_MATERIAL = ITEMS.register("unknown_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "unknown_material")))));

    public static final DeferredItem<Item> CORRUPTED_FLAG_MATERIAL = ITEMS.register("corrupted_flag_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "corrupted_flag_material")))));

    //Flag Materials
    public static final DeferredItem<Item> ABROSEXUAL_MATERIAL = ITEMS.register("abrosexual_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "abrosexual_material")))));

    public static final DeferredItem<Item> AGENDER_MATERIAL = ITEMS.register("agender_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "agender_material")))));

    public static final DeferredItem<Item> AROACE_MATERIAL = ITEMS.register("aroace_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "aroace_material")))));

    public static final DeferredItem<Item> AROMANTIC_MATERIAL = ITEMS.register("aromantic_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "aromantic_material")))));

    public static final DeferredItem<Item> ASEXUAL_MATERIAL = ITEMS.register("asexual_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "asexual_material")))));

    public static final DeferredItem<Item> BIGENDER_MATERIAL = ITEMS.register("bigender_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "bigender_material")))));

    public static final DeferredItem<Item> BISEXUAL_MATERIAL = ITEMS.register("bisexual_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "bisexual_material")))));

    public static final DeferredItem<Item> DEMIBOY_MATERIAL = ITEMS.register("demiboy_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "demiboy_material")))));

    public static final DeferredItem<Item> DEMIGIRL_MATERIAL = ITEMS.register("demigirl_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "demigirl_material")))));

    public static final DeferredItem<Item> DEMIROMANTIC_MATERIAL = ITEMS.register("demiromantic_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "demiromantic_material")))));

    public static final DeferredItem<Item> DEMISEXUAL_MATERIAL = ITEMS.register("demisexual_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "demisexual_material")))));

    public static final DeferredItem<Item> GAY_MATERIAL = ITEMS.register("gay_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "gay_material")))));

    public static final DeferredItem<Item> GENDERFLUID_MATERIAL = ITEMS.register("genderfluid_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "genderfluid_material")))));

    public static final DeferredItem<Item> GENDERFLUX_MATERIAL = ITEMS.register("genderflux_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "genderflux_material")))));

    public static final DeferredItem<Item> GENDERQUEER_MATERIAL = ITEMS.register("genderqueer_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "genderqueer_material")))));

    public static final DeferredItem<Item> GRAYSEXUAL_MATERIAL = ITEMS.register("graysexual_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "graysexual_material")))));

    public static final DeferredItem<Item> INTERSEX_MATERIAL = ITEMS.register("intersex_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "intersex_material")))));

    public static final DeferredItem<Item> LESBIAN_MATERIAL = ITEMS.register("lesbian_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "lesbian_material")))));

    public static final DeferredItem<Item> NONBINARY_MATERIAL = ITEMS.register("nonbinary_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "nonbinary_material")))));

    public static final DeferredItem<Item> OMNISEXUAL_MATERIAL = ITEMS.register("omnisexual_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "omnisexual_material")))));

    public static final DeferredItem<Item> PANSEXUAL_MATERIAL = ITEMS.register("pansexual_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "pansexual_material")))));

    public static final DeferredItem<Item> PROGRESS_PRIDE_MATERIAL = ITEMS.register("progress_pride_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "progress_pride_material")))));

    public static final DeferredItem<Item> QUEER_MATERIAL = ITEMS.register("queer_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "queer_material")))));

    public static final DeferredItem<Item> RAINBOW_MATERIAL = ITEMS.register("rainbow_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "rainbow_material")))));

    public static final DeferredItem<Item> TRANSGENDER_MATERIAL = ITEMS.register("transgender_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "transgender_material")))));

    public static final DeferredItem<Item> DEMINONBINARY_MATERIAL = ITEMS.register("deminonbinary_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "deminonbinary_material")))));

    public static final DeferredItem<Item> GRAYROMANTIC_MATERIAL = ITEMS.register("grayromantic_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "grayromantic_material")))));

    public static final DeferredItem<Item> POLYSEXUAL_MATERIAL = ITEMS.register("polysexual_material",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrideCraft.MODID, "polysexual_material")))));


    //Registers The Items. DO NOT TOUCH!!!
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
