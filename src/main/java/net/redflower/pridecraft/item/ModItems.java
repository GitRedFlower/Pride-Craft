package net.redflower.pridecraft.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.pridecraft.PrideCraft;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PrideCraft.MODID);

    public static final DeferredItem<Item> UNKNOWN_MATERIAL = ITEMS.register("unknown_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CORRUPTED_FLAG_MATERIAL = ITEMS.register("corrupted_flag_material",
            () -> new Item(new Item.Properties()));

    //Flag Materials
    public static final DeferredItem<Item> ABROSEXUAL_MATERIAL = ITEMS.register("abrosexual_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> AGENDER_MATERIAL = ITEMS.register("agender_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> AROACE_MATERIAL = ITEMS.register("aroace_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> AROMANTIC_MATERIAL = ITEMS.register("aromantic_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ASEXUAL_MATERIAL = ITEMS.register("asexual_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BIGENDER_MATERIAL = ITEMS.register("bigender_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BISEXUAL_MATERIAL = ITEMS.register("bisexual_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DEMIBOY_MATERIAL = ITEMS.register("demiboy_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DEMIGIRL_MATERIAL = ITEMS.register("demigirl_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DEMIROMANTIC_MATERIAL = ITEMS.register("demiromantic_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DEMISEXUAL_MATERIAL = ITEMS.register("demisexual_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GAY_MATERIAL = ITEMS.register("gay_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GENDERFLUID_MATERIAL = ITEMS.register("genderfluid_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GENDERFLUX_MATERIAL = ITEMS.register("genderflux_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GENDERQUEER_MATERIAL = ITEMS.register("genderqueer_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GRAYSEXUAL_MATERIAL = ITEMS.register("graysexual_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> INTERSEX_MATERIAL = ITEMS.register("intersex_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LESBIAN_MATERIAL = ITEMS.register("lesbian_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NONBINARY_MATERIAL = ITEMS.register("nonbinary_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OMNISEXUAL_MATERIAL = ITEMS.register("omnisexual_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PANSEXUAL_MATERIAL = ITEMS.register("pansexual_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PROGRESS_PRIDE_MATERIAL = ITEMS.register("progress_pride_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> QUEER_MATERIAL = ITEMS.register("queer_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAINBOW_MATERIAL = ITEMS.register("rainbow_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TRANSGENDER_MATERIAL = ITEMS.register("transgender_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DEMINONBINARY_MATERIAL = ITEMS.register("deminonbinary_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GRAYROMANTIC_MATERIAL = ITEMS.register("grayromantic_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POLYSEXUAL_MATERIAL = ITEMS.register("polysexual_material",
            () -> new Item(new Item.Properties()));



    //Registers The Items. DO NOT TOUCH!!!
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
