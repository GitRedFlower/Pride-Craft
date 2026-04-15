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
import net.redflower.pridecraft.block.custom.FlagCarpet;
import net.redflower.pridecraft.block.custom.MiniFlag;
import net.redflower.pridecraft.block.custom.WallFlag;
import net.redflower.pridecraft.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PrideCraft.MODID);

    //Other Blocks
    public static final DeferredBlock<Block> UNKNOWN_ORE = registerBlock("unknown_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DEEPSLATE_UNKNOWN_ORE = registerBlock("deepslate_unknown_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> UNKNOWN_MATERIAL_BLOCK = registerBlock("unknown_material_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> CORRUPTED_FLAG_BLOCK = registerBlock("corrupted_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> PRIDE_ORE = registerBlock("pride_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DEEPSLATE_PRIDE_ORE = registerBlock("deepslate_pride_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

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

    public static final DeferredBlock<Block> TRANSFEMININE_FLAG_BLOCK = registerBlock("transfeminine_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> TRANSMASCULINE_FLAG_BLOCK = registerBlock("transmasculine_flag_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)));

    //Mini Flags
    public static final DeferredBlock<MiniFlag> ABROSEXUAL_MINI_FLAG = registerBlock("abrosexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> AGENDER_MINI_FLAG = registerBlock("agender_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> AROACE_MINI_FLAG = registerBlock("aroace_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> AROMANTIC_MINI_FLAG = registerBlock("aromantic_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> ASEXUAL_MINI_FLAG = registerBlock("asexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> BIGENDER_MINI_FLAG = registerBlock("bigender_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> BISEXUAL_MINI_FLAG = registerBlock("bisexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> DEMIBOY_MINI_FLAG = registerBlock("demiboy_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> DEMIGIRL_MINI_FLAG = registerBlock("demigirl_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> DEMINONBINARY_MINI_FLAG = registerBlock("deminonbinary_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> DEMIROMANTIC_MINI_FLAG = registerBlock("demiromantic_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> DEMISEXUAL_MINI_FLAG = registerBlock("demisexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> GAY_MINI_FLAG = registerBlock("gay_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> GENDERFLUID_MINI_FLAG = registerBlock("genderfluid_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> GENDERFLUX_MINI_FLAG = registerBlock("genderflux_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> GENDERQUEER_MINI_FLAG = registerBlock("genderqueer_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> GRAYROMANTIC_MINI_FLAG = registerBlock("grayromantic_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> GRAYSEXUAL_MINI_FLAG = registerBlock("graysexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> INTERSEX_MINI_FLAG = registerBlock("intersex_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> LESBIAN_MINI_FLAG = registerBlock("lesbian_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> NONBINARY_MINI_FLAG = registerBlock("nonbinary_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> OMNISEXUAL_MINI_FLAG = registerBlock("omnisexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> PANSEXUAL_MINI_FLAG = registerBlock("pansexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> POLYSEXUAL_MINI_FLAG = registerBlock("polysexual_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> PROGRESS_PRIDE_MINI_FLAG = registerBlock("progress_pride_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> QUEER_MINI_FLAG = registerBlock("queer_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag>RAINBOW_MINI_FLAG = registerBlock("rainbow_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> TRANSGENDER_MINI_FLAG = registerBlock("transgender_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> TRANSFEMININE_MINI_FLAG = registerBlock("transfeminine_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<MiniFlag> TRANSMASCULINE_MINI_FLAG = registerBlock("transmasculine_mini_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    //Wall Flags
    public static final DeferredBlock<WallFlag> ABROSEXUAL_WALL_FLAG = registerBlock("abrosexual_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> AGENDER_WALL_FLAG = registerBlock("agender_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> AROACE_WALL_FLAG = registerBlock("aroace_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> AROMANTIC_WALL_FLAG = registerBlock("aromantic_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> ASEXUAL_WALL_FLAG = registerBlock("asexual_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> BIGENDER_WALL_FLAG = registerBlock("bigender_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> BISEXUAL_WALL_FLAG = registerBlock("bisexual_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> DEMIBOY_WALL_FLAG = registerBlock("demiboy_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> DEMIGIRL_WALL_FLAG = registerBlock("demigirl_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> DEMINONBINARY_WALL_FLAG = registerBlock("deminonbinary_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> DEMIROMANTIC_WALL_FLAG = registerBlock("demiromantic_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> DEMISEXUAL_WALL_FLAG = registerBlock("demisexual_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> GAY_WALL_FLAG = registerBlock("gay_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> GENDERFLUID_WALL_FLAG = registerBlock("genderfluid_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> GENDERFLUX_WALL_FLAG = registerBlock("genderflux_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> GENDERQUEER_WALL_FLAG = registerBlock("genderqueer_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> GRAYROMANTIC_WALL_FLAG = registerBlock("grayromantic_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> GRAYSEXUAL_WALL_FLAG = registerBlock("graysexual_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> INTERSEX_WALL_FLAG = registerBlock("intersex_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> LESBIAN_WALL_FLAG = registerBlock("lesbian_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> NONBINARY_WALL_FLAG = registerBlock("nonbinary_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> OMNISEXUAL_WALL_FLAG = registerBlock("omnisexual_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> PANSEXUAL_WALL_FLAG = registerBlock("pansexual_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> POLYSEXUAL_WALL_FLAG = registerBlock("polysexual_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> PROGRESS_PRIDE_WALL_FLAG = registerBlock("progress_pride_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> QUEER_WALL_FLAG = registerBlock("queer_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> RAINBOW_WALL_FLAG = registerBlock("rainbow_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> TRANSGENDER_WALL_FLAG = registerBlock("transgender_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> TRANSFEMININE_WALL_FLAG = registerBlock("transfeminine_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<WallFlag> TRANSMASCULINE_WALL_FLAG = registerBlock("transmasculine_wall_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    //Flag Carpets
    public static final DeferredBlock<FlagCarpet> ABROSEXUAL_FLAG_CARPET = registerBlock("abrosexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> AGENDER_FLAG_CARPET = registerBlock("agender_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> AROACE_FLAG_CARPET = registerBlock("aroace_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> AROMANTIC_FLAG_CARPET = registerBlock("aromantic_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> ASEXUAL_FLAG_CARPET = registerBlock("asexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> BIGENDER_FLAG_CARPET = registerBlock("bigender_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> BISEXUAL_FLAG_CARPET = registerBlock("bisexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> DEMIBOY_FLAG_CARPET = registerBlock("demiboy_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> DEMIGIRL_FLAG_CARPET = registerBlock("demigirl_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> DEMINONBINARY_FLAG_CARPET = registerBlock("deminonbinary_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> DEMIROMANTIC_FLAG_CARPET = registerBlock("demiromantic_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> DEMISEXUAL_FLAG_CARPET = registerBlock("demisexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> GAY_FLAG_CARPET = registerBlock("gay_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> GENDERFLUID_FLAG_CARPET = registerBlock("genderfluid_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> GENDERFLUX_FLAG_CARPET = registerBlock("genderflux_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> GENDERQUEER_FLAG_CARPET = registerBlock("genderqueer_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> GRAYROMANTIC_FLAG_CARPET = registerBlock("grayromantic_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> GRAYSEXUAL_FLAG_CARPET = registerBlock("graysexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> INTERSEX_FLAG_CARPET = registerBlock("intersex_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> LESBIAN_FLAG_CARPET = registerBlock("lesbian_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> NONBINARY_FLAG_CARPET = registerBlock("nonbinary_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> OMNISEXUAL_FLAG_CARPET = registerBlock("omnisexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> PANSEXUAL_FLAG_CARPET = registerBlock("pansexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> POLYSEXUAL_FLAG_CARPET = registerBlock("polysexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> PROGRESS_PRIDE_FLAG_CARPET = registerBlock("progress_pride_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> QUEER_FLAG_CARPET = registerBlock("queer_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> RAINBOW_FLAG_CARPET = registerBlock("rainbow_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> TRANSGENDER_FLAG_CARPET = registerBlock("transgender_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> TRANSFEMININE_FLAG_CARPET = registerBlock("transfeminine_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<FlagCarpet> TRANSMASCULINE_FLAG_CARPET = registerBlock("transmasculine_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));




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
