package net.redflower.pride_craft.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redflower.pride_craft.PrideCraft;
import net.redflower.pride_craft.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PrideCraft.MODID);

    //Other Blocks
    public static final RegistryObject<Block> UNKNOWN_ORE = registerBlock("unknown_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_UNKNOWN_ORE = registerBlock("deepslate_unknown_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> UNKNOWN_MATERIAL_BLOCK = registerBlock("unknown_material_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> CORRUPTED_FLAG_BLOCK = registerBlock("corrupted_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.STONE)));

    //Flag Blocks
    public static final RegistryObject<Block> ABROSEXUAL_FLAG_BLOCK = registerBlock("abrosexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> AGENDER_FLAG_BLOCK = registerBlock("agender_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> AROACE_FLAG_BLOCK = registerBlock("aroace_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> AROMANTIC_FLAG_BLOCK = registerBlock("aromantic_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> ASEXUAL_FLAG_BLOCK = registerBlock("asexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> BIGENDER_FLAG_BLOCK = registerBlock("bigender_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> BISEXUAL_FLAG_BLOCK = registerBlock("bisexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> DEMIBOY_FLAG_BLOCK = registerBlock("demiboy_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> DEMIGIRL_FLAG_BLOCK = registerBlock("demigirl_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> DEMIROMANTIC_FLAG_BLOCK = registerBlock("demiromantic_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> DEMISEXUAL_FLAG_BLOCK = registerBlock("demisexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> GAY_FLAG_BLOCK = registerBlock("gay_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> GENDERFLUID_FLAG_BLOCK = registerBlock("genderfluid_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> GENDERFLUX_FLAG_BLOCK = registerBlock("genderflux_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> GENDERQUEER_FLAG_BLOCK = registerBlock("genderqueer_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> GRAYSEXUAL_FLAG_BLOCK = registerBlock("graysexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> INTERSEX_FLAG_BLOCK = registerBlock("intersex_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> LESBIAN_FLAG_BLOCK = registerBlock("lesbian_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> NONBINARY_FLAG_BLOCK = registerBlock("nonbinary_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> OMNISEXUAL_FLAG_BLOCK = registerBlock("omnisexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PANSEXUAL_FLAG_BLOCK = registerBlock("pansexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PROGRESS_PRIDE_FLAG_BLOCK = registerBlock("progress_pride_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> QUEER_FLAG_BLOCK = registerBlock("queer_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> RAINBOW_FLAG_BLOCK = registerBlock("rainbow_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> TRANSGENDER_FLAG_BLOCK = registerBlock("transgender_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> DEMINONBINARY_FLAG_BLOCK = registerBlock("deminonbinary_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> GRAYROMANTIC_FLAG_BLOCK = registerBlock("grayromantic_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> POLYSEXUAL_FLAG_BLOCK = registerBlock("polysexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> TRANSFEMININE_FLAG_BLOCK = registerBlock("transfeminine_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> TRANSMASCULINE_FLAG_BLOCK = registerBlock("transmasculine_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
