package com.salradahn.scmod.creativetabs;

import com.salradahn.scmod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LandscapeOW extends CreativeTabs 
{
	public LandscapeOW() {
		super("landscape_ow_tab");
		setBackgroundImageName("structures.png");
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.ZOMBIE_FIGURE_CASE);
	}
}