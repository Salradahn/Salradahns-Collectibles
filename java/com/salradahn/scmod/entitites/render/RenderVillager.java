package com.salradahn.scmod.entitites.render;

import com.salradahn.scmod.entitites.EntityCollectorVillager;
import com.salradahn.scmod.entitites.model.ModelCollector;
import com.salradahn.scmod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVillager extends RenderLiving<EntityCollectorVillager>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/collector.png");
	
	public RenderVillager(RenderManager manager) 
	{
		super(manager, new ModelCollector(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCollectorVillager entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityCollectorVillager entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
