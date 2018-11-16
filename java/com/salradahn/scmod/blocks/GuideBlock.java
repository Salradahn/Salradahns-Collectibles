package com.salradahn.scmod.blocks;

import com.salradahn.scmod.Main;
import com.salradahn.scmod.init.ModBlocks;
import com.salradahn.scmod.init.ModItems;
import com.salradahn.scmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.network.play.client.CPacketPlayer.Rotation;
import net.minecraft.util.EnumFacing;

public class GuideBlock extends BlockBase
{
	public GuideBlock(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(1.0F);
		setResistance(1.0F);
		setHarvestLevel("axe", 1);
		setCreativeTab(Main.CreativeTabLandscapeOW);
	}
}