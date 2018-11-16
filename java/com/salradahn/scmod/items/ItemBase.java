package com.salradahn.scmod.items;

import com.salradahn.scmod.Main;
import com.salradahn.scmod.init.ModItems;
import com.salradahn.scmod.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.CreativeTabFigureCases);
		
		ModItems.ITEMS.add(this);		
	}
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}