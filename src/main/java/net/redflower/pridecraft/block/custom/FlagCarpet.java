package net.redflower.pridecraft.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class FlagCarpet extends HorizontalDirectionalBlock {

    public static final MapCodec<FlagCarpet> CODEC = simpleCodec(FlagCarpet::new);

    private static final VoxelShape SHAPE = Block.box(0.0,0.0,0.0, 16.0, 1.0, 16.0);

    public FlagCarpet(Properties properties) {
        super(properties);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    protected BlockState updateShape(BlockState p_152926_, LevelReader p_374550_, ScheduledTickAccess p_374188_, BlockPos p_152930_, Direction p_152927_, BlockPos p_152931_, BlockState p_152928_, RandomSource p_374375_) {
        return !p_152926_.canSurvive(p_374550_, p_152930_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_152926_, p_374550_, p_374188_, p_152930_, p_152927_, p_152931_, p_152928_, p_374375_);
    }

    @Override
    protected boolean canSurvive(BlockState p_152922_, LevelReader p_152923_, BlockPos p_152924_) {
        return !p_152923_.isEmptyBlock(p_152924_.below());
    }
}
