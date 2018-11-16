package com.salradahn.scmod.entitites.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelVillager - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelCollector extends ModelBase 
{
    public ModelRenderer head;
    public ModelRenderer armr;
    public ModelRenderer arml;
    public ModelRenderer armmid;
    public ModelRenderer legl;
    public ModelRenderer body;
    public ModelRenderer robe;
    public ModelRenderer legr;
    public ModelRenderer nose;

    public ModelCollector() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.arml = new ModelRenderer(this, 44, 22);
        this.arml.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.arml.addBox(4.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(arml, -0.7499679795819634F, 0.0F, 0.0F);
        this.robe = new ModelRenderer(this, 0, 38);
        this.robe.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.robe.addBox(-4.0F, 0.0F, -3.0F, 8, 18, 6, 0.5F);
        this.body = new ModelRenderer(this, 16, 20);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.0F, 0.0F, -3.0F, 8, 12, 6, 0.0F);
        this.armr = new ModelRenderer(this, 44, 22);
        this.armr.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.armr.addBox(-8.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(armr, -0.7499679795819634F, 0.0F, 0.0F);
        this.armmid = new ModelRenderer(this, 40, 38);
        this.armmid.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.armmid.addBox(-4.0F, 2.0F, -2.0F, 8, 4, 4, 0.0F);
        this.setRotateAngle(armmid, -0.7499679795819634F, 0.0F, 0.0F);
        this.legr = new ModelRenderer(this, 0, 22);
        this.legr.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.legr.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, 0.0F);
        this.legl = new ModelRenderer(this, 0, 22);
        this.legl.mirror = true;
        this.legl.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.legl.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.nose = new ModelRenderer(this, 24, 0);
        this.nose.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.nose.addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F);
        this.head.addChild(this.nose);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
        this.arml.render(f5);
        this.robe.render(f5);
        this.body.render(f5);
        this.armr.render(f5);
        this.armmid.render(f5);
        this.legr.render(f5);
        this.head.render(f5);
        this.legl.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
   @Override
public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
		float headPitch, float scaleFactor, Entity entityIn) 
   {
	this.legr.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	this.legl.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	
	this.head.rotateAngleY = netHeadYaw * 0.017453292F;
	this.head.rotateAngleX = headPitch * 0.017453292F;
	} 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
