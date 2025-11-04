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

public class MiniFlag extends HorizontalDirectionalBlock {

    public static final MapCodec<MiniFlag> CODEC = simpleCodec(MiniFlag::new);

    private static final VoxelShape NORTH_SHAPE = Block.box(0.0,0.0,6.0,16.0,16.0,10.0);
    private static final VoxelShape SOUTH_SHAPE = Block.box(0.0,0.0,6.0,16.0,16.0,10.0);
    private static final VoxelShape EAST_SHAPE = Block.box(6.0,0.0,0.0,10.0,16.0,16.0);
    private static final VoxelShape WEST_SHAPE = Block.box(6.0,0.0,0.0,10.0,16.0,16.0);

    public MiniFlag(Properties properties) {super(properties);}

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case NORTH -> {
                return NORTH_SHAPE;
            }
            case SOUTH -> {
                return SOUTH_SHAPE;
            }
            case WEST -> {
                return WEST_SHAPE;
            }
            default ->  {
                return EAST_SHAPE;
            }
        }
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
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() { return CODEC;}

    @Override
    protected BlockState updateShape(BlockState p_152926_, LevelReader p_374550_, ScheduledTickAccess p_374188_, BlockPos p_152930_, Direction p_152927_, BlockPos p_152931_, BlockState p_152928_, RandomSource p_374375_) {
        return !p_152926_.canSurvive(p_374550_, p_152930_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_152926_, p_374550_, p_374188_, p_152930_, p_152927_, p_152931_, p_152928_, p_374375_);
    }

    @Override
    protected boolean canSurvive(BlockState p_152922_, LevelReader p_152923_, BlockPos p_152924_) {
        return !p_152923_.isEmptyBlock(p_152924_.below());
    }
}
