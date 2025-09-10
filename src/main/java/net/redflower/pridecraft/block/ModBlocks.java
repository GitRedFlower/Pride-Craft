package net.redflower.pridecraft.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.pridecraft.PrideCraft;
import net.redflower.pridecraft.block.custom.MiniFlag;
import net.redflower.pridecraft.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PrideCraft.MODID);

    public static final DeferredBlock<Block> UNKNOWN_ORE = registerBlock("unknown_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DEEPSLATE_UNKNOWN_ORE = registerBlock("deepslate_unknown_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4.5f)
                    .sound(SoundType.STONE)));

    //Flag Blocks
    public static final DeferredBlock<Block> ABROSEXUAL_FLAG_BLOCK = registerBlock("abrosexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                            .strength(0.4f)
                            .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> AGENDER_FLAG_BLOCK = registerBlock("agender_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> AROACE_FLAG_BLOCK = registerBlock("aroace_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> AROMANTIC_FLAG_BLOCK = registerBlock("aromantic_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> ASEXUAL_FLAG_BLOCK = registerBlock("asexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> BIGENDER_FLAG_BLOCK = registerBlock("bigender_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> BISEXUAL_FLAG_BLOCK = registerBlock("bisexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> DEMIBOY_FLAG_BLOCK = registerBlock("demiboy_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> DEMIGIRL_FLAG_BLOCK = registerBlock("demigirl_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> DEMIROMANTIC_FLAG_BLOCK = registerBlock("demiromantic_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> DEMISEXUAL_FLAG_BLOCK = registerBlock("demisexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> GAY_FLAG_BLOCK = registerBlock("gay_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> GENDERFLUID_FLAG_BLOCK = registerBlock("genderfluid_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> GENDERFLUX_FLAG_BLOCK = registerBlock("genderflux_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> GENDERQUEER_FLAG_BLOCK = registerBlock("genderqueer_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> GRAYSEXUAL_FLAG_BLOCK = registerBlock("graysexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> INTERSEX_FLAG_BLOCK = registerBlock("intersex_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> LESBIAN_FLAG_BLOCK = registerBlock("lesbian_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> NONBINARY_FLAG_BLOCK = registerBlock("nonbinary_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> OMNISEXUAL_FLAG_BLOCK = registerBlock("omnisexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> PANSEXUAL_FLAG_BLOCK = registerBlock("pansexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> PROGRESS_PRIDE_FLAG_BLOCK = registerBlock("progress_pride_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> QUEER_FLAG_BLOCK = registerBlock("queer_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> RAINBOW_FLAG_BLOCK = registerBlock("rainbow_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> TRANSGENDER_FLAG_BLOCK = registerBlock("transgender_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> DEMINONBINARY_FLAG_BLOCK = registerBlock("deminonbinary_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> GRAYROMANTIC_FLAG_BLOCK = registerBlock("grayromantic_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> POLYSEXUAL_FLAG_BLOCK = registerBlock("polysexual_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    //Mini Flags
    public static final DeferredBlock<Block> ABROSEXUAL_MINI_FLAG = registerBlock("abrosexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> AGENDER_MINI_FLAG = registerBlock("agender_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> AROACE_MINI_FLAG = registerBlock("aroace_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> AROMANTIC_MINI_FLAG = registerBlock("aromantic_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> ASEXUAL_MINI_FLAG = registerBlock("asexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> BIGENDER_MINI_FLAG = registerBlock("bigender_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> BISEXUAL_MINI_FLAG = registerBlock("bisexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> DEMIBOY_MINI_FLAG = registerBlock("demiboy_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> DEMIGIRL_MINI_FLAG = registerBlock("demigirl_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> DEMINONBINARY_MINI_FLAG = registerBlock("deminonbinary_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> DEMIROMANTIC_MINI_FLAG = registerBlock("demiromantic_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> DEMISEXUAL_MINI_FLAG = registerBlock("demisexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> GAY_MINI_FLAG = registerBlock("gay_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> GENDERFLUID_MINI_FLAG = registerBlock("genderfluid_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> GENDERFLUX_MINI_FLAG = registerBlock("genderflux_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> GENDERQUEER_MINI_FLAG = registerBlock("genderqueer_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> GRAYROMANTIC_MINI_FLAG = registerBlock("grayromantic_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> GRAYSEXUAL_MINI_FLAG = registerBlock("graysexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> INTERSEX_MINI_FLAG = registerBlock("intersex_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> LESBIAN_MINI_FLAG = registerBlock("lesbian_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> NONBINARY_MINI_FLAG = registerBlock("nonbinary_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> OMNISEXUAL_MINI_FLAG = registerBlock("omnisexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> PANSEXUAL_MINI_FLAG = registerBlock("pansexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> POLYSEXUAL_MINI_FLAG = registerBlock("polysexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> PROGRESS_PRIDE_MINI_FLAG = registerBlock("progress_pride_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> QUEER_MINI_FLAG = registerBlock("queer_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> RAINBOW_MINI_FLAG = registerBlock("rainbow_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> TRANSGENDER_MINI_FLAG = registerBlock("transgender_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()));


    //Registers The Blocks. DO NOT TOUCH!!!!
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
