package com.salradahn.scmod.blocks;

import com.salradahn.scmod.Main;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class LargeFigureCase extends BlockBase 
{
	protected static final AxisAlignedBB STEP_ONE_NORTH_AABB = new AxisAlignedBB(1.0D, 0.12D, 0.18D, 0.0D, 0.06D, 0.06D);

	public static final PropertyDirection FACING = BlockHorizontal.FACING;
		
	public int blockState = 0;
	
	
	public LargeFigureCase(String name, Material material) 
	{
		super(name, material);
			
		setSoundType(SoundType.METAL);
		setHardness(3.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Main.CreativeTabFigureCases);
	}
	@Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
        
    }

	 @Override
	    public BlockRenderLayer getBlockLayer()
	    {
	        return BlockRenderLayer.CUTOUT;
	    }
	  public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos)
		 {
			 return true;
		 }

	@Deprecated
	    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.CENTER;
	    }
	 public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }
	 
	 public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
	    {
		 IBlockState north = worldIn.getBlockState(pos.north());
      IBlockState south = worldIn.getBlockState(pos.south());
      IBlockState west = worldIn.getBlockState(pos.west());
      IBlockState east = worldIn.getBlockState(pos.east());
      EnumFacing face = (EnumFacing)state.getValue(FACING);

      if 
      (face == EnumFacing.NORTH && north.isFullBlock() && !south.isFullBlock()) { face = EnumFacing.SOUTH;}
      else if (face == EnumFacing.SOUTH && south.isFullBlock() && !north.isFullBlock()) { face = EnumFacing.NORTH;}
      else if (face == EnumFacing.WEST && west.isFullBlock() && !east.isFullBlock()) { face = EnumFacing.EAST;}
      else if (face == EnumFacing.EAST && east.isFullBlock() && !west.isFullBlock()) { face = EnumFacing.WEST;}
      worldIn.setBlockState(pos, state.withProperty(FACING, face), 2);
	    }
		 
	 @Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY,
			float hitZ, int meta, EntityLivingBase placer, EnumHand hand) 
	{
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}
	 
	 @Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
			ItemStack stack) 
	{
		worldIn.setBlockState(pos, this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
	}
	 
	 @Override
	public EnumBlockRenderType getRenderType(IBlockState state) 
	{
		 return EnumBlockRenderType.MODEL;
	}
	 
	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot) 
	{
		return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
	}
	
	@Override
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn) 
	{
		return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {FACING});
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		EnumFacing facing = EnumFacing.getFront(meta);
		if(facing.getAxis()  == EnumFacing.Axis.Y) facing = EnumFacing.NORTH;
		return this.getDefaultState().withProperty(FACING, facing);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return ((EnumFacing)state.getValue(FACING)).getIndex();
	}
  }

