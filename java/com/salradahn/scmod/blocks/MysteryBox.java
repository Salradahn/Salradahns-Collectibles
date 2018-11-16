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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;



public class MysteryBox  extends BlockBase 
{
	
	public MysteryBox (String name, Material material) 
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
        return true;
    }

    public boolean isFullCube(IBlockState state)
    {
        return true;
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
	 
	 
	 @Override
	public EnumBlockRenderType getRenderType(IBlockState state) 
	{
		 return EnumBlockRenderType.MODEL;
	}
	}

  
  
  
  
  
  