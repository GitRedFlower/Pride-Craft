package net.redflower.pride_craft.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class WallFlag extends HorizontalDirectionalBlock {

    private static final VoxelShape NORTH_SHAPE = Block.box(0.0,0.0,0.0,16.0,16.0,4.0);
    private static final VoxelShape SOUTH_SHAPE = Block.box(0.0,0.0,12.0,16.0,16.0,16.0);
    private static final VoxelShape EAST_SHAPE = Block.box(12.0,0.0,0.0,16.0,16.0,16.0);
    private static final VoxelShape WEST_SHAPE = Block.box(0.0,0.0,0.0,4.0,16.0,16.0);

    public WallFlag(Properties properties) {
        super(properties);
    }

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
}
