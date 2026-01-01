package net.redflower.pride_craft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redflower.pride_craft.PrideCraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PrideCraft.MODID);

    public static final RegistryObject<Item> UNKNOWN_MATERIAL = ITEMS.register("unknown_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CORRUPTED_FLAG_MATERIAL = ITEMS.register("corrupted_flag_material",
            () -> new Item(new Item.Properties()));

    //Flag Materials
    public static final RegistryObject<Item> ABROSEXUAL_MATERIAL = ITEMS.register("abrosexual_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AGENDER_MATERIAL = ITEMS.register("agender_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AROACE_MATERIAL = ITEMS.register("aroace_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AROMANTIC_MATERIAL = ITEMS.register("aromantic_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ASEXUAL_MATERIAL = ITEMS.register("asexual_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BIGENDER_MATERIAL = ITEMS.register("bigender_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BISEXUAL_MATERIAL = ITEMS.register("bisexual_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEMIBOY_MATERIAL = ITEMS.register("demiboy_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEMIGIRL_MATERIAL = ITEMS.register("demigirl_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEMIROMANTIC_MATERIAL = ITEMS.register("demiromantic_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEMISEXUAL_MATERIAL = ITEMS.register("demisexual_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GAY_MATERIAL = ITEMS.register("gay_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GENDERFLUID_MATERIAL = ITEMS.register("genderfluid_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GENDERFLUX_MATERIAL = ITEMS.register("genderflux_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GENDERQUEER_MATERIAL = ITEMS.register("genderqueer_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRAYSEXUAL_MATERIAL = ITEMS.register("graysexual_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INTERSEX_MATERIAL = ITEMS.register("intersex_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LESBIAN_MATERIAL = ITEMS.register("lesbian_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NONBINARY_MATERIAL = ITEMS.register("nonbinary_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OMNISEXUAL_MATERIAL = ITEMS.register("omnisexual_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PANSEXUAL_MATERIAL = ITEMS.register("pansexual_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PROGRESS_PRIDE_MATERIAL = ITEMS.register("progress_pride_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> QUEER_MATERIAL = ITEMS.register("queer_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAINBOW_MATERIAL = ITEMS.register("rainbow_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TRANSGENDER_MATERIAL = ITEMS.register("transgender_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEMINONBINARY_MATERIAL = ITEMS.register("deminonbinary_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRAYROMANTIC_MATERIAL = ITEMS.register("grayromantic_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POLYSEXUAL_MATERIAL = ITEMS.register("polysexual_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TRANSFEMININE_MATERIAL = ITEMS.register("transfeminine_material",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TRANSMASCULINE_MATERIAL = ITEMS.register("transmasculine_material",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
