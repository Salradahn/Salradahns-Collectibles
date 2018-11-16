package com.salradahn.scmod.creativetabs;

import com.salradahn.scmod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Loot extends CreativeTabs 
{
	public Loot() {
		super("loot_tab");
		setBackgroundImageName("figure_cases.png");
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.FIGURE_MYSTERY_BOX);
	}
}