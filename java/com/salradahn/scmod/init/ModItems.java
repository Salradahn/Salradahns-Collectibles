package com.salradahn.scmod.init;

import java.util.ArrayList;
import java.util.List;

import com.salradahn.scmod.tools.Crowbar;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item.ToolMaterial crowbarMaterial = EnumHelper.addToolMaterial("CROWBAR", 1, 200, 1.0F, -3.0F, 0);
	
	public static ItemSword CROWBAR = new Crowbar(crowbarMaterial, "crowbar");	
}
