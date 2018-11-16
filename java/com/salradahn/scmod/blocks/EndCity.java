package com.salradahn.scmod.blocks;

import com.salradahn.scmod.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class EndCity extends BlockBase
{

	public EndCity (String name, Material material) 
	{
		super(name, material);
			
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Main.CreativeTabLandscapeOW);
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
