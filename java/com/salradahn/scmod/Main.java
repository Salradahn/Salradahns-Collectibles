package com.salradahn.scmod;

import com.salradahn.scmod.creativetabs.FigureCase;
import com.salradahn.scmod.creativetabs.LandscapeOW;
import com.salradahn.scmod.creativetabs.Loot;
import com.salradahn.scmod.proxy.CommonProxy;
import com.salradahn.scmod.util.Reference;
import com.salradahn.scmod.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	public static final CreativeTabs CreativeTabFigureCases = new FigureCase();
	
	public static final CreativeTabs CreativeTabloot = new Loot();
	

	public static final CreativeTabs CreativeTabLandscapeOW = new LandscapeOW();

	
	@Instance
	
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		{RegistryHandler.preInitRegistries();}
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		{RegistryHandler.initRegistries();}
	}		
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		 {RegistryHandler.postInitRegistries();}
	}
	
}
