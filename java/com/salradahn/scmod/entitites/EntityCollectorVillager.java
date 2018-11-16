package com.salradahn.scmod.entitites;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapDecoration;

public class EntityCollectorVillager extends EntityVillager
{

	public EntityCollectorVillager(World worldIn)
	{
		super(worldIn);
	}

	@Override
	public EntityVillager createChild(EntityAgeable ageable) 
	{
		return new EntityCollectorVillager(world);
	}
	
}


