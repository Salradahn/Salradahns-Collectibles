package com.salradahn.scmod.tools;

import java.util.Random;

import com.salradahn.scmod.Main;
import com.salradahn.scmod.init.ModBlocks;
import com.salradahn.scmod.init.ModItems;
import com.salradahn.scmod.util.IHasModel;
import com.salradahn.scmod.util.handlers.SoundsHandler;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class Crowbar  extends ItemSword implements IHasModel
{

	public Crowbar(ToolMaterial material, String name) 
	{
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.CreativeTabloot);
		
		ModItems.ITEMS.add(this);
		
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");	
	}
	
	 public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
	        ItemStack itemstack = player.getHeldItem(hand);

	        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            IBlockState iblockstate = worldIn.getBlockState(pos);
	            Block block = iblockstate.getBlock();

	            if (facing != EnumFacing.DOWN && block == ModBlocks.FIGURE_MYSTERY_BOX)
	            {
	                IBlockState iblockstate1 = ModBlocks.FIGURE_MYSTERY_BOX_OPEN.getDefaultState();
	                worldIn.playSound(player, pos, SoundsHandler.BLOCK_BOX_OPENING, SoundCategory.BLOCKS, 1.0F, 1.0F);

	                if (!worldIn.isRemote)
	                {
	                    worldIn.setBlockState(pos, iblockstate1, 11);
	                    itemstack.damageItem(1, player);     
	                    
	                    {	
		            		
		            		
		            		Random r = new Random();
		               
		                	
		                	Block[] common = {ModBlocks.SHEEP_WHITE_FIGURE_CASE, ModBlocks.BUTCHER_FIGURE_CASE, ModBlocks.BLACKSMITH_FIGURE_CASE, ModBlocks.NITWIT_FIGURE_CASE, ModBlocks.LIBRARIAN_FIGURE_CASE, ModBlocks.PRIEST_FIGURE_CASE, ModBlocks.FARMER_FIGURE_CASE, ModBlocks.COW_FIGURE_CASE, ModBlocks.PIG_FIGURE_CASE, ModBlocks.CHICKEN_FIGURE_CASE, ModBlocks.WOLF_FIGURE_CASE, ModBlocks.CAT_BLACK_FIGURE_CASE, ModBlocks.CAT_RED_FIGURE_CASE, ModBlocks.CAT_SIAMESE_FIGURE_CASE, ModBlocks.OCELOT_FIGURE_CASE, ModBlocks.BAT_FIGURE_CASE, ModBlocks.HORSE_BLACK_FIGURE_CASE, ModBlocks.HORSE_BROWN_FIGURE_CASE, ModBlocks.HORSE_GREY_FIGURE_CASE, ModBlocks.HORSE_WHITE_FIGURE_CASE, ModBlocks.LLAMA_BROWN_FIGURE_CASE, ModBlocks.LLAMA_WHITE_FIGURE_CASE, ModBlocks.DONKEY_FIGURE_CASE, ModBlocks.RABBIT_BLACK_FIGURE_CASE, ModBlocks.RABBIT_BROWN_FIGURE_CASE, ModBlocks.RABBIT_WHITE_FIGURE_CASE, ModBlocks.POLAR_BEAR_FIGURE_CASE, ModBlocks.PARROT_BLUE_FIGURE_CASE, ModBlocks.PARROT_GREEN_FIGURE_CASE, ModBlocks.PARROT_GREY_FIGURE_CASE, ModBlocks.PARROT_RED_FIGURE_CASE, ModBlocks.PARROT_TEAL_FIGURE_CASE, ModBlocks.ZOMBIE_FIGURE_CASE, ModBlocks.CREEPER_FIGURE_CASE, ModBlocks.SKELETON_FIGURE_CASE, ModBlocks.SPIDER_FIGURE_CASE, ModBlocks.CAVE_SPIDER_FIGURE_CASE, ModBlocks.SNOWMAN_FIGURE_CASE, ModBlocks.SQUID_FIGURE_CASE};
		                
		                	Block[] uncommon = {ModBlocks.MULE_FIGURE_CASE, ModBlocks.RABBIT_TOAST_FIGURE_CASE, ModBlocks.HORSE_ZOMBIE_FIGURE_CASE, ModBlocks.MUSHROOM_COW_FIGURE_CASE, ModBlocks.GUARDIAN_FIGURE_CASE, ModBlocks.IRON_GOLEM_FIGURE_CASE, ModBlocks.ALEX_FIGURE_CASE, ModBlocks.STEVE_FIGURE_CASE, ModBlocks.ZOMBIE_BLACKSMITH_FIGURE_CASE, ModBlocks.ZOMBIE_BUTCHER_FIGURE_CASE, ModBlocks.ZOMBIE_NITWIT_FIGURE_CASE, ModBlocks.ZOMBIE_FARMER_FIGURE_CASE, ModBlocks.ZOMBIE_LIBRARIAN_FIGURE_CASE, ModBlocks.ZOMBIE_PRIEST_FIGURE_CASE};
		                	
		                	Block[] rare = {ModBlocks.MAGMA_CUBE_FIGURE_CASE, ModBlocks.HUSK_FIGURE_CASE, ModBlocks.SILVERFISH_FIGURE_CASE, ModBlocks.STRAY_FIGURE_CASE, ModBlocks.WITHER_SKELETON_FIGURE_CASE, ModBlocks.BLAZE_FIGURE_CASE, ModBlocks.ZOMBIE_PIGMAN_FIGURE_CASE, ModBlocks.VINDICATOR_FIGURE_CASE, ModBlocks.EVOKER_FIGURE_CASE, ModBlocks.VEX_FIGURE_CASE, ModBlocks.ILLUSIONIST_FIGURE_CASE, ModBlocks.WITCH_FIGURE_CASE};
		                	
		                	Block[] epic = {ModBlocks.GHAST_FIGURE_CASE, ModBlocks.ENDERMAN_FIGURE_CASE, ModBlocks.SHULKER_PURPLE_FIGURE_CASE, ModBlocks.ELDER_GUARDIAN_FIGURE_CASE, ModBlocks.ENDERMITE_FIGURE_CASE};
		                	
		                	Block[] legendary = {ModBlocks.WITHER_FIGURE_CASE, ModBlocks.ENDER_DRAGON_FIGURE_CASE};
		                	
		                	Block[] strange = {ModBlocks.SALRADAHN_FIGURE_CASE, ModBlocks.KORLIMANN_FIGURE_CASE, ModBlocks.KAPTAINWUTAX_FIGURE_CASE, ModBlocks.MREDOG_FIGURE_CASE, ModBlocks.TURTYWURTY_FIGURE_CASE};
		                	
		                    int chance = r.nextInt(100)+1;
		                    	 if(chance<58 && chance>0) {
		                    		 
		                    	Block drop = common[r.nextInt(common.length-1)];
		                    	ItemStack blockitem = new ItemStack(drop);
		                    	drop.spawnAsEntity(worldIn, pos, blockitem);
		                    }
		                    else if(chance<81 && chance>57) {
	                    		 
                			    Block drop = uncommon[r.nextInt(uncommon.length-1)];
                			    ItemStack blockitem = new ItemStack(drop);
		                    	drop.spawnAsEntity(worldIn, pos, blockitem);
		                    }
		                    else if(chance<90 && chance>80) {
	                    		 
                			    Block drop = rare[r.nextInt(rare.length-1)];
                			    ItemStack blockitem = new ItemStack(drop);
		                    	drop.spawnAsEntity(worldIn, pos, blockitem);
		                    }                 
		                    else if(chance<95 && chance>89)  {
	                    		 
                			    Block drop = epic[r.nextInt(epic.length-1)];
                			    ItemStack blockitem = new ItemStack(drop);
		                    	drop.spawnAsEntity(worldIn, pos, blockitem);
		                    }
		                    else if(chance<97 && chance>94)  {
	                    		 
                			    Block drop = legendary[r.nextInt(legendary.length-1)];
                			    ItemStack blockitem = new ItemStack(drop);
		                    	drop.spawnAsEntity(worldIn, pos, blockitem);
		                    }
		                    else if(chance<101 && chance>96)  {
	                    		 
                			    Block drop = strange[r.nextInt(strange.length-1)];
                			    ItemStack blockitem = new ItemStack(drop);
		                    	drop.spawnAsEntity(worldIn, pos, blockitem);
		                    }
		                    
		                    
		               	}
	               	}         
	               	
	                
	                
	                return EnumActionResult.SUCCESS;
	            }
	           
	            
	            else
	            	if (facing != EnumFacing.DOWN && block == ModBlocks.LANDSCAPE_MYSTERY_BOX)
		            {
		                IBlockState iblockstate1 = ModBlocks.LANDSCAPE_MYSTERY_BOX_OPEN.getDefaultState();
		                worldIn.playSound(player, pos, SoundsHandler.BLOCK_BOX_OPENING, SoundCategory.BLOCKS, 1.0F, 1.0F);

		                if (!worldIn.isRemote)
		                {
		                    worldIn.setBlockState(pos, iblockstate1, 11);
		                    itemstack.damageItem(1, player);     
		                    
		                    {	
			            		
			            		
			            		Random r = new Random();
			               
			                	
			                	Block[] common = {ModBlocks.FOREST_A_I,ModBlocks.FOREST_A_II,ModBlocks.FOREST_B_I,ModBlocks.FOREST_B_II,ModBlocks.FOREST_C_I,ModBlocks.FOREST_C_II};
			                
			                	Block[] uncommon = {ModBlocks.VILLAGE_A_I,ModBlocks.VILLAGE_A_II,ModBlocks.VILLAGE_B_I,ModBlocks.VILLAGE_B_II,ModBlocks.DESERT_A_I,ModBlocks.DESERT_A_II,ModBlocks.DESERT_B_I,ModBlocks.DESERT_B_II};
			                	
			                	Block[] rare = {};
			                	
			                	Block[] epic = {};
			                	
			                	Block[] legendary = {};
			                	
			                	Block[] strange = {};
			                	
			                    int chance = r.nextInt(100)+1;
			                    	 if(chance<58 && chance>0) {
			                    		 
			                    	Block drop = common[r.nextInt(common.length-1)];
			                    	ItemStack blockitem = new ItemStack(drop);
			                    	drop.spawnAsEntity(worldIn, pos, blockitem);
			                    }
			                    else if(chance<81 && chance>57) {
		                    		 
	                			    Block drop = uncommon[r.nextInt(uncommon.length-1)];
	                			    ItemStack blockitem = new ItemStack(drop);
			                    	drop.spawnAsEntity(worldIn, pos, blockitem);
			                    }
			                    else if(chance<90 && chance>80) {
		                    		 
	                			    Block drop = rare[r.nextInt(rare.length-1)];
	                			    ItemStack blockitem = new ItemStack(drop);
			                    	drop.spawnAsEntity(worldIn, pos, blockitem);
			                    }                 
			                    else if(chance<95 && chance>89)  {
		                    		 
	                			    Block drop = epic[r.nextInt(epic.length-1)];
	                			    ItemStack blockitem = new ItemStack(drop);
			                    	drop.spawnAsEntity(worldIn, pos, blockitem);
			                    }
			                    else if(chance<97 && chance>94)  {
		                    		 
	                			    Block drop = legendary[r.nextInt(legendary.length-1)];
	                			    ItemStack blockitem = new ItemStack(drop);
			                    	drop.spawnAsEntity(worldIn, pos, blockitem);
			                    }
			                    else if(chance<101 && chance>96)  {
		                    		 
	                			    Block drop = strange[r.nextInt(strange.length-1)];
	                			    ItemStack blockitem = new ItemStack(drop);
			                    	drop.spawnAsEntity(worldIn, pos, blockitem);
			                    }
			                    
			                    
			               	}
		               	}         
		               	
		                
		                
		                return EnumActionResult.SUCCESS;
		            }
	            
	            	
	            
	            {
	                return EnumActionResult.PASS;
	            }
	        }
	    }
	 
	

}

	 








