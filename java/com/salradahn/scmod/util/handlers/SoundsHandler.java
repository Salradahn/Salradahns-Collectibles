package com.salradahn.scmod.util.handlers;

import com.salradahn.scmod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler 
{
	
	public static SoundEvent BLOCK_BOX_OPENING;
	
	public static void registerSounds()
	{
		BLOCK_BOX_OPENING = registerSound("block.box.opening");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
