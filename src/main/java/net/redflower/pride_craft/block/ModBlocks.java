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
import net.redflower.pride_craft.block.custom.FlagCarpet;
import net.redflower.pride_craft.block.custom.WallFlag;
import net.redflower.pride_craft.block.custom.MiniFlag;
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

    //Mini Flags
    public static final RegistryObject<MiniFlag> ABROSEXUAL_MINI_FLAG = registerBlock("mini_abrosexual_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> AGENDER_MINI_FLAG = registerBlock("mini_agender_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> AROACE_MINI_FLAG = registerBlock("mini_aroace_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> AROMANTIC_MINI_FLAG = registerBlock("mini_aromantic_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> ASEXUAL_MINI_FLAG = registerBlock("mini_asexual_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> BIGENDER_MINI_FLAG = registerBlock("mini_bigender_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> BISEXUAL_MINI_FLAG = registerBlock("mini_bisexual_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> DEMIBOY_MINI_FLAG = registerBlock("mini_demiboy_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> DEMIGIRL_MINI_FLAG = registerBlock("mini_demigirl_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> DEMINONBINARY_MINI_FLAG = registerBlock("mini_deminonbinary_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> DEMIROMANTIC_MINI_FLAG = registerBlock("mini_demiromantic_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> DEMISEXUAL_MINI_FLAG = registerBlock("mini_demisexual_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> GAY_MINI_FLAG = registerBlock("mini_gay_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> GENDERFLUID_MINI_FLAG = registerBlock("mini_genderfluid_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> GENDERFLUX_MINI_FLAG = registerBlock("mini_genderflux_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> GENDERQUEER_MINI_FLAG = registerBlock("mini_genderqueer_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> GRAYROMANTIC_MINI_FLAG = registerBlock("mini_grayromantic_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> GRAYSEXUAL_MINI_FLAG = registerBlock("mini_graysexual_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> INTERSEX_MINI_FLAG = registerBlock("mini_intersex_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> LESBIAN_MINI_FLAG = registerBlock("mini_lesbian_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> NONBINARY_MINI_FLAG = registerBlock("mini_nonbinary_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> OMNISEXUAL_MINI_FLAG = registerBlock("mini_omnisexual_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> PANSEXUAL_MINI_FLAG = registerBlock("mini_pansexual_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> POLYSEXUAL_MINI_FLAG = registerBlock("mini_polysexual_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> PROGRESS_PRIDE_MINI_FLAG = registerBlock("mini_progress_pride_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> QUEER_MINI_FLAG = registerBlock("mini_queer_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag>RAINBOW_MINI_FLAG = registerBlock("mini_rainbow_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> TRANSGENDER_MINI_FLAG = registerBlock("mini_transgender_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> TRANSFEMININE_MINI_FLAG = registerBlock("mini_transfeminine_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<MiniFlag> TRANSMASCULINE_MINI_FLAG = registerBlock("mini_transmasculine_flag",
            () -> new MiniFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    //Wall Flags
    public static final RegistryObject<WallFlag> ABROSEXUAL_WALL_FLAG = registerBlock("wall_abrosexual_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> AGENDER_WALL_FLAG = registerBlock("wall_agender_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> AROACE_WALL_FLAG = registerBlock("wall_aroace_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> AROMANTIC_WALL_FLAG = registerBlock("wall_aromantic_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> ASEXUAL_WALL_FLAG = registerBlock("wall_asexual_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> BIGENDER_WALL_FLAG = registerBlock("wall_bigender_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> BISEXUAL_WALL_FLAG = registerBlock("wall_bisexual_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> DEMIBOY_WALL_FLAG = registerBlock("wall_demiboy_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> DEMIGIRL_WALL_FLAG = registerBlock("wall_demigirl_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> DEMINONBINARY_WALL_FLAG = registerBlock("wall_deminonbinary_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> DEMIROMANTIC_WALL_FLAG = registerBlock("wall_demiromantic_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> DEMISEXUAL_WALL_FLAG = registerBlock("wall_demisexual_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> GAY_WALL_FLAG = registerBlock("wall_gay_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> GENDERFLUID_WALL_FLAG = registerBlock("wall_genderfluid_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> GENDERFLUX_WALL_FLAG = registerBlock("wall_genderflux_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> GENDERQUEER_WALL_FLAG = registerBlock("wall_genderqueer_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> GRAYROMANTIC_WALL_FLAG = registerBlock("wall_grayromantic_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> GRAYSEXUAL_WALL_FLAG = registerBlock("wall_graysexual_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> INTERSEX_WALL_FLAG = registerBlock("wall_intersex_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> LESBIAN_WALL_FLAG = registerBlock("wall_lesbian_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> NONBINARY_WALL_FLAG = registerBlock("wall_nonbinary_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> OMNISEXUAL_WALL_FLAG = registerBlock("wall_omnisexual_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> PANSEXUAL_WALL_FLAG = registerBlock("wall_pansexual_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> POLYSEXUAL_WALL_FLAG = registerBlock("wall_polysexual_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> PROGRESS_PRIDE_WALL_FLAG = registerBlock("wall_progress_pride_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> QUEER_WALL_FLAG = registerBlock("wall_queer_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> RAINBOW_WALL_FLAG = registerBlock("wall_rainbow_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> TRANSGENDER_WALL_FLAG = registerBlock("wall_transgender_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> TRANSFEMININE_WALL_FLAG = registerBlock("wall_transfeminine_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<WallFlag> TRANSMASCULINE_WALL_FLAG = registerBlock("wall_transmasculine_flag",
            () -> new WallFlag(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f)
                    .sound(SoundType.METAL)));

    //Flag Carpets
    public static final RegistryObject<FlagCarpet> ABROSEXUAL_FLAG_CARPET = registerBlock("abrosexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> AGENDER_FLAG_CARPET = registerBlock("agender_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> AROACE_FLAG_CARPET = registerBlock("aroace_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> AROMANTIC_FLAG_CARPET = registerBlock("aromantic_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> ASEXUAL_FLAG_CARPET = registerBlock("asexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> BIGENDER_FLAG_CARPET = registerBlock("bigender_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> BISEXUAL_FLAG_CARPET = registerBlock("bisexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> DEMIBOY_FLAG_CARPET = registerBlock("demiboy_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> DEMIGIRL_FLAG_CARPET = registerBlock("demigirl_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> DEMINONBINARY_FLAG_CARPET = registerBlock("deminonbinary_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> DEMIROMANTIC_FLAG_CARPET = registerBlock("demiromantic_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> DEMISEXUAL_FLAG_CARPET = registerBlock("demisexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> GAY_FLAG_CARPET = registerBlock("gay_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> GENDERFLUID_FLAG_CARPET = registerBlock("genderfluid_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> GENDERFLUX_FLAG_CARPET = registerBlock("genderflux_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> GENDERQUEER_FLAG_CARPET = registerBlock("genderqueer_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> GRAYROMANTIC_FLAG_CARPET = registerBlock("grayromantic_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> GRAYSEXUAL_FLAG_CARPET = registerBlock("graysexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> INTERSEX_FLAG_CARPET = registerBlock("intersex_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> LESBIAN_FLAG_CARPET = registerBlock("lesbian_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> NONBINARY_FLAG_CARPET = registerBlock("nonbinary_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> OMNISEXUAL_FLAG_CARPET = registerBlock("omnisexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> PANSEXUAL_FLAG_CARPET = registerBlock("pansexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> POLYSEXUAL_FLAG_CARPET = registerBlock("polysexual_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> PROGRESS_PRIDE_FLAG_CARPET = registerBlock("progress_pride_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> QUEER_FLAG_CARPET = registerBlock("queer_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> RAINBOW_FLAG_CARPET = registerBlock("rainbow_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> TRANSGENDER_FLAG_CARPET = registerBlock("transgender_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> TRANSFEMININE_FLAG_CARPET = registerBlock("transfeminine_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<FlagCarpet> TRANSMASCULINE_FLAG_CARPET = registerBlock("transmasculine_flag_carpet",
            () -> new FlagCarpet(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(0.2f)
                    .sound(SoundType.WOOL)));


    //Extra Stuff
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
