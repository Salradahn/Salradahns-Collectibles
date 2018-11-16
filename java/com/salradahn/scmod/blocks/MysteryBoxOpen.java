package com.salradahn.scmod.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.salradahn.scmod.Main;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
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



public class MysteryBoxOpen  extends BlockBase 
{
	protected static final AxisAlignedBB BOTTOM_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 1.0D);
	protected static final AxisAlignedBB SIDE1_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D);
	protected static final AxisAlignedBB SIDE2_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.0D);
	protected static final AxisAlignedBB SIDE3_AABB = new AxisAlignedBB(1.0D, 1.0D, 1.0D, 0.0D, 0.0D, 1.0D);
	protected static final AxisAlignedBB SIDE4_AABB = new AxisAlignedBB(1.0D, 1.0D, 1.0D, 1.0D, 0.0D, 0.0D);
	
	
	 public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
	    {
	        addCollisionBoxToList(pos, entityBox, collidingBoxes, BOTTOM_AABB);
	        addCollisionBoxToList(pos, entityBox, collidingBoxes, SIDE1_AABB);
	        addCollisionBoxToList(pos, entityBox, collidingBoxes, SIDE2_AABB);
	        addCollisionBoxToList(pos, entityBox, collidingBoxes, SIDE3_AABB);
	        addCollisionBoxToList(pos, entityBox, collidingBoxes, SIDE4_AABB);
	    }
	
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return FULL_BLOCK_AABB;
    }
	
	public MysteryBoxOpen (String name, Material material) 
	{
		super(name, material);
			
		setSoundType(SoundType.WOOD);
		setHardness(3.0F);
		setResistance(10.0F);
		setHarvestLevel("axe", 2);
		setCreativeTab(Main.CreativeTabloot);
	}
	
    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
	 @Override
	    public BlockRenderLayer getBlockLayer()
	    {
	        return BlockRenderLayer.CUTOUT;
	    }
	  public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos)
		 {
			 return false;
		 }

	@Deprecated
	    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.CENTER;
	    }
	 
	 @Override
	public EnumBlockRenderType getRenderType(IBlockState state) 
	{
		 return EnumBlockRenderType.MODEL;
	}
	}

  
  
  
  
  
  