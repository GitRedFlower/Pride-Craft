package net.redflower.pridecraft.item;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.block.PrideCraftBlocks;
import net.redflower.pridecraft.item.custom.BlahajItem;
import net.redflower.pridecraft.item.custom.PrideFlowerItem;

public class PrideCraftItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PrideCraft.MODID);

    public static final DeferredItem<Item> UNKNOWN_MATERIAL = ITEMS.register("unknown_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CORRUPTED_FLAG_MATERIAL = ITEMS.register("corrupted_flag_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PRIDE_INGOT = ITEMS.register("pride_ingot",
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

    public static final DeferredItem<Item> TRANSFEMININE_MATERIAL = ITEMS.register("transfeminine_material",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TRANSMASCULINE_MATERIAL = ITEMS.register("transmasculine_material",
            () -> new Item(new Item.Properties()));

    //Other Items
    public static final DeferredItem<Item> BLAHAJ = ITEMS.register("blahaj",
            () -> new BlahajItem(new Item.Properties().rarity(Rarity.RARE).stacksTo(1), MobEffects.DAMAGE_RESISTANCE, 0));

    public static final DeferredItem<Item> GOLDEN_BLAHAJ = ITEMS.register("golden_blahaj",
            () -> new BlahajItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1), MobEffects.DAMAGE_RESISTANCE, 1));

    public static final DeferredItem<Item> ORANGE_BLAHAJ = ITEMS.register("orange_blahaj",
            () -> new BlahajItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1), MobEffects.FIRE_RESISTANCE, 0));

    public static final DeferredItem<Item> BLUE_BLAHAJ = ITEMS.register("blue_blahaj",
            () -> new BlahajItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1), MobEffects.WATER_BREATHING, 0));

    public static final DeferredItem<Item> RED_BLAHAJ = ITEMS.register("red_blahaj",
            () -> new BlahajItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1), MobEffects.HEALTH_BOOST, 0));

    public static final DeferredItem<Item> GREEN_BLAHAJ = ITEMS.register("green_blahaj",
            () -> new BlahajItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1), MobEffects.MOVEMENT_SPEED, 0));

    public static final DeferredItem<Item> PURPLE_BLAHAJ = ITEMS.register("purple_blahaj",
            () -> new BlahajItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1), MobEffects.DIG_SPEED, 0));

    //Flower Items
    public static final DeferredItem<Item> FLOWER_TEST = ITEMS.register("flower_test",
            () -> new PrideFlowerItem(PrideCraftBlocks.FLOWER_TEST.get(), new Item.Properties()));


    //Registers The Items. DO NOT TOUCH!!!
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
