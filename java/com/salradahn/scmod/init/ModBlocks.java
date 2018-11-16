package com.salradahn.scmod.init;

import java.util.ArrayList;
import java.util.List;

import com.salradahn.scmod.blocks.Banner;
import com.salradahn.scmod.blocks.EndCity;
import com.salradahn.scmod.blocks.FigureCase;
import com.salradahn.scmod.blocks.GuideBlock;
import com.salradahn.scmod.blocks.LandscapeOverworld;
import com.salradahn.scmod.blocks.LargeFigureCase;
import com.salradahn.scmod.blocks.MysteryBox;
import com.salradahn.scmod.blocks.MysteryBoxOpen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// players
	
	public static final Block STEVE_FIGURE_CASE = new FigureCase("steve_figure_case", Material.WOOD);
	public static final Block ALEX_FIGURE_CASE = new FigureCase("alex_figure_case", Material.WOOD);
	public static final Block KORLIMANN_FIGURE_CASE = new FigureCase("korlimann_figure_case", Material.WOOD);
	public static final Block SALRADAHN_FIGURE_CASE = new FigureCase("salradahn_figure_case", Material.WOOD);
	public static final Block TURTYWURTY_FIGURE_CASE = new FigureCase("turtywurty_figure_case", Material.WOOD);
	public static final Block KAPTAINWUTAX_FIGURE_CASE = new FigureCase("kaptainwutax_figure_case", Material.WOOD);
	public static final Block MREDOG_FIGURE_CASE = new FigureCase("mredog_figure_case", Material.WOOD);

	
	// mobs
	
	// MISC
	
	public static final Block CREEPER_FIGURE_CASE = new FigureCase("creeper_figure_case", Material.WOOD);
	public static final Block SPIDER_FIGURE_CASE = new FigureCase("spider_figure_case", Material.WOOD);
	public static final Block CAVE_SPIDER_FIGURE_CASE = new FigureCase("cave_spider_figure_case", Material.WOOD);
	public static final Block SILVERFISH_FIGURE_CASE = new FigureCase("silverfish_figure_case", Material.WOOD);
	public static final Block SLIME_FIGURE_CASE = new FigureCase("slime_figure_case", Material.WOOD);
	
	
	// UNDEAD
	
	public static final Block ZOMBIE_FIGURE_CASE = new FigureCase("zombie_figure_case", Material.WOOD);
	public static final Block HUSK_FIGURE_CASE = new FigureCase("husk_figure_case", Material.WOOD);
	public static final Block SKELETON_FIGURE_CASE = new FigureCase("skeleton_figure_case", Material.WOOD);
	public static final Block WITHER_SKELETON_FIGURE_CASE = new FigureCase("wither_skeleton_figure_case", Material.WOOD);
	public static final Block STRAY_FIGURE_CASE = new FigureCase("stray_figure_case", Material.WOOD);
	
	
	public static final Block ZOMBIE_LIBRARIAN_FIGURE_CASE = new FigureCase("zombie_librarian_figure_case", Material.WOOD);
	public static final Block ZOMBIE_FARMER_FIGURE_CASE = new FigureCase("zombie_farmer_figure_case", Material.WOOD);
	public static final Block ZOMBIE_PRIEST_FIGURE_CASE = new FigureCase("zombie_priest_figure_case", Material.WOOD);
	public static final Block ZOMBIE_BUTCHER_FIGURE_CASE = new FigureCase("zombie_butcher_figure_case", Material.WOOD);
	public static final Block ZOMBIE_NITWIT_FIGURE_CASE = new FigureCase("zombie_nitwit_figure_case", Material.WOOD);
	public static final Block ZOMBIE_BLACKSMITH_FIGURE_CASE = new FigureCase("zombie_blacksmith_figure_case", Material.WOOD);
	public static final Block ZOMBIE_COLLECTOR_FIGURE_CASE = new FigureCase("zombie_collector_figure_case", Material.WOOD);
	
	
	// NETHER
	
	public static final Block BLAZE_FIGURE_CASE = new FigureCase("blaze_figure_case", Material.WOOD);
	public static final Block MAGMA_CUBE_FIGURE_CASE = new FigureCase("magma_cube_figure_case", Material.WOOD);
	public static final Block GHAST_FIGURE_CASE = new FigureCase("ghast_figure_case", Material.WOOD);
	public static final Block ZOMBIE_PIGMAN_FIGURE_CASE = new FigureCase("zombie_pigman_figure_case", Material.WOOD);
	
	public static final Block WITHER_FIGURE_CASE = new FigureCase("wither_figure_case", Material.WOOD);
	
	
	// illagers
	
	public static final Block EVOKER_FIGURE_CASE = new FigureCase("evoker_figure_case", Material.WOOD);
	public static final Block VINDICATOR_FIGURE_CASE = new FigureCase("vindicator_figure_case", Material.WOOD);
	public static final Block ILLUSIONIST_FIGURE_CASE = new FigureCase("illusionist_figure_case", Material.WOOD);
	public static final Block WITCH_FIGURE_CASE = new FigureCase("witch_figure_case", Material.WOOD);
	public static final Block VEX_FIGURE_CASE = new FigureCase("vex_figure_case", Material.WOOD);

	
	// villagers
	
	public static final Block LIBRARIAN_FIGURE_CASE = new FigureCase("librarian_figure_case", Material.WOOD);
	public static final Block FARMER_FIGURE_CASE = new FigureCase("farmer_figure_case", Material.WOOD);
	public static final Block PRIEST_FIGURE_CASE = new FigureCase("priest_figure_case", Material.WOOD);
	public static final Block BUTCHER_FIGURE_CASE = new FigureCase("butcher_figure_case", Material.WOOD);
	public static final Block NITWIT_FIGURE_CASE = new FigureCase("nitwit_figure_case", Material.WOOD);
	public static final Block BLACKSMITH_FIGURE_CASE = new FigureCase("blacksmith_figure_case", Material.WOOD);
	public static final Block COLLECTOR_FIGURE_CASE = new FigureCase("collector_figure_case", Material.WOOD);
	
	public static final Block IRON_GOLEM_FIGURE_CASE = new FigureCase("iron_golem_figure_case", Material.WOOD);

	
	// ender
	
	public static final Block ENDERMAN_FIGURE_CASE = new FigureCase("enderman_figure_case", Material.WOOD);
	public static final Block ENDERMITE_FIGURE_CASE = new FigureCase("endermite_figure_case", Material.WOOD);
	
	public static final Block ENDER_DRAGON_FIGURE_CASE = new LargeFigureCase("ender_dragon_figure_case", Material.WOOD);
	

	// passive
	
	public static final Block PIG_FIGURE_CASE = new FigureCase("pig_figure_case", Material.WOOD);
	public static final Block COW_FIGURE_CASE = new FigureCase("cow_figure_case", Material.WOOD);
	public static final Block MUSHROOM_COW_FIGURE_CASE = new FigureCase("mushroom_cow_figure_case", Material.WOOD);
	public static final Block POLAR_BEAR_FIGURE_CASE = new FigureCase("polar_bear_figure_case", Material.WOOD);
	public static final Block BAT_FIGURE_CASE = new FigureCase("bat_figure_case", Material.WOOD);
	public static final Block SNOWMAN_FIGURE_CASE = new FigureCase("snowman_figure_case", Material.WOOD);
	public static final Block WOLF_FIGURE_CASE = new FigureCase("wolf_figure_case", Material.WOOD);
	public static final Block CHICKEN_FIGURE_CASE = new FigureCase("chicken_figure_case", Material.WOOD);
	
	
	// HORSES
	
	public static final Block HORSE_BROWN_FIGURE_CASE = new FigureCase("horse_brown_figure_case", Material.WOOD);
	public static final Block HORSE_BLACK_FIGURE_CASE = new FigureCase("horse_black_figure_case", Material.WOOD);
	public static final Block HORSE_WHITE_FIGURE_CASE = new FigureCase("horse_white_figure_case", Material.WOOD);
	public static final Block HORSE_GREY_FIGURE_CASE = new FigureCase("horse_grey_figure_case", Material.WOOD);
	public static final Block HORSE_ZOMBIE_FIGURE_CASE = new FigureCase("horse_zombie_figure_case", Material.WOOD);
	
	public static final Block DONKEY_FIGURE_CASE = new FigureCase("donkey_figure_case", Material.WOOD);
	public static final Block MULE_FIGURE_CASE = new FigureCase("mule_figure_case", Material.WOOD);
	
	
	// llama
	
	public static final Block LLAMA_BROWN_FIGURE_CASE = new FigureCase("llama_brown_figure_case", Material.WOOD);
	public static final Block LLAMA_WHITE_FIGURE_CASE = new FigureCase("llama_white_figure_case", Material.WOOD);
	
	
	// RABBITS
	
	public static final Block RABBIT_BROWN_FIGURE_CASE = new FigureCase("rabbit_brown_figure_case", Material.WOOD);
	public static final Block RABBIT_BLACK_FIGURE_CASE = new FigureCase("rabbit_black_figure_case", Material.WOOD);
	public static final Block RABBIT_WHITE_FIGURE_CASE = new FigureCase("rabbit_white_figure_case", Material.WOOD);
	public static final Block RABBIT_TOAST_FIGURE_CASE = new FigureCase("rabbit_toast_figure_case", Material.WOOD);
	
	
	// CATS
	
	public static final Block OCELOT_FIGURE_CASE = new FigureCase("ocelot_figure_case", Material.WOOD);
	public static final Block CAT_RED_FIGURE_CASE = new FigureCase("cat_red_figure_case", Material.WOOD);
	public static final Block CAT_BLACK_FIGURE_CASE = new FigureCase("cat_black_figure_case", Material.WOOD);
	public static final Block CAT_SIAMESE_FIGURE_CASE = new FigureCase("cat_siamese_figure_case", Material.WOOD);
	
	
	// oceanic
	
	public static final Block GUARDIAN_FIGURE_CASE = new FigureCase("guardian_figure_case", Material.WOOD);
	public static final Block ELDER_GUARDIAN_FIGURE_CASE = new FigureCase("elder_guardian_figure_case", Material.WOOD);
	public static final Block SQUID_FIGURE_CASE = new FigureCase("squid_figure_case", Material.WOOD);
	
	
	// parrots
	
	public static final Block PARROT_RED_FIGURE_CASE = new FigureCase("parrot_red_figure_case", Material.WOOD);
	public static final Block PARROT_GREEN_FIGURE_CASE = new FigureCase("parrot_green_figure_case", Material.WOOD);
	public static final Block PARROT_BLUE_FIGURE_CASE = new FigureCase("parrot_blue_figure_case", Material.WOOD);
	public static final Block PARROT_GREY_FIGURE_CASE = new FigureCase("parrot_grey_figure_case", Material.WOOD);
	public static final Block PARROT_TEAL_FIGURE_CASE = new FigureCase("parrot_teal_figure_case", Material.WOOD);
	

	// shulkers
	
	public static final Block SHULKER_WHITE_FIGURE_CASE = new FigureCase("shulker_white_figure_case", Material.WOOD);
	public static final Block SHULKER_GREY_FIGURE_CASE = new FigureCase("shulker_grey_figure_case", Material.WOOD);
	public static final Block SHULKER_LIGHT_GREY_FIGURE_CASE = new FigureCase("shulker_light_grey_figure_case", Material.WOOD);
	public static final Block SHULKER_BLACK_FIGURE_CASE = new FigureCase("shulker_black_figure_case", Material.WOOD);
	public static final Block SHULKER_RED_FIGURE_CASE = new FigureCase("shulker_red_figure_case", Material.WOOD);
	public static final Block SHULKER_YELLOW_FIGURE_CASE = new FigureCase("shulker_yellow_figure_case", Material.WOOD);
	public static final Block SHULKER_ORANGE_FIGURE_CASE = new FigureCase("shulker_orange_figure_case", Material.WOOD);
	public static final Block SHULKER_MAGENTA_FIGURE_CASE = new FigureCase("shulker_magenta_figure_case", Material.WOOD);
	public static final Block SHULKER_PURPLE_FIGURE_CASE = new FigureCase("shulker_purple_figure_case", Material.WOOD);	
	public static final Block SHULKER_PINK_FIGURE_CASE = new FigureCase("shulker_pink_figure_case", Material.WOOD);
	public static final Block SHULKER_LIME_FIGURE_CASE = new FigureCase("shulker_lime_figure_case", Material.WOOD);
	public static final Block SHULKER_GREEN_FIGURE_CASE = new FigureCase("shulker_green_figure_case", Material.WOOD);
	public static final Block SHULKER_BROWN_FIGURE_CASE = new FigureCase("shulker_brown_figure_case", Material.WOOD);
	public static final Block SHULKER_BLUE_FIGURE_CASE = new FigureCase("shulker_blue_figure_case", Material.WOOD);
	public static final Block SHULKER_LIGHT_BLUE_FIGURE_CASE = new FigureCase("shulker_light_blue_figure_case", Material.WOOD);
	public static final Block SHULKER_CYAN_FIGURE_CASE = new FigureCase("shulker_cyan_figure_case", Material.WOOD);
		
	// sheep
	
	public static final Block SHEEP_SHEARED_FIGURE_CASE = new FigureCase("sheep_sheared_figure_case", Material.WOOD);
	public static final Block SHEEP_WHITE_FIGURE_CASE = new FigureCase("sheep_white_figure_case", Material.WOOD);
	public static final Block SHEEP_GREY_FIGURE_CASE = new FigureCase("sheep_grey_figure_case", Material.WOOD);
	public static final Block SHEEP_LIGHT_GREY_FIGURE_CASE = new FigureCase("sheep_light_grey_figure_case", Material.WOOD);
	public static final Block SHEEP_BLACK_FIGURE_CASE = new FigureCase("sheep_black_figure_case", Material.WOOD);
	public static final Block SHEEP_RED_FIGURE_CASE = new FigureCase("sheep_red_figure_case", Material.WOOD);
	public static final Block SHEEP_YELLOW_FIGURE_CASE = new FigureCase("sheep_yellow_figure_case", Material.WOOD);
	public static final Block SHEEP_ORANGE_FIGURE_CASE = new FigureCase("sheep_orange_figure_case", Material.WOOD);
	public static final Block SHEEP_MAGENTA_FIGURE_CASE = new FigureCase("sheep_magenta_figure_case", Material.WOOD);
	public static final Block SHEEP_PURPLE_FIGURE_CASE = new FigureCase("sheep_purple_figure_case", Material.WOOD);
	public static final Block SHEEP_PINK_FIGURE_CASE = new FigureCase("sheep_pink_figure_case", Material.WOOD);
	public static final Block SHEEP_LIME_FIGURE_CASE = new FigureCase("sheep_lime_figure_case", Material.WOOD);
	public static final Block SHEEP_GREEN_FIGURE_CASE = new FigureCase("sheep_green_figure_case", Material.WOOD);
	public static final Block SHEEP_BROWN_FIGURE_CASE = new FigureCase("sheep_brown_figure_case", Material.WOOD);
	public static final Block SHEEP_BLUE_FIGURE_CASE = new FigureCase("sheep_blue_figure_case", Material.WOOD);
	public static final Block SHEEP_LIGHT_BLUE_FIGURE_CASE = new FigureCase("sheep_light_blue_figure_case", Material.WOOD);
	public static final Block SHEEP_CYAN_FIGURE_CASE = new FigureCase("sheep_cyan_figure_case", Material.WOOD);

	
	// banners
	
	public static final Block COLLECTORS_BANNER = new Banner("collectors_banner", Material.WOOD);
	
	// loot
	
	public static final Block FIGURE_MYSTERY_BOX = new MysteryBox("figure_mystery_box", Material.WOOD);
	public static final Block FIGURE_MYSTERY_BOX_OPEN = new MysteryBoxOpen("figure_mystery_box_open", Material.WOOD);
	
	public static final Block LANDSCAPE_MYSTERY_BOX = new MysteryBox("landscape_mystery_box", Material.WOOD);
	public static final Block LANDSCAPE_MYSTERY_BOX_OPEN = new MysteryBoxOpen("landscape_mystery_box_open", Material.WOOD);
	
	// LANDSCAPE
	
	public static final Block GUIDE_BLOCK = new GuideBlock("guide_block", Material.ROCK);
	
		//OVERWORLD
	
			//COMMON
				
				//FOREST
	
	 
	public static final Block FOREST_A_I = new LandscapeOverworld("forest_a_i", Material.ROCK);	
	public static final Block FOREST_A_II = new LandscapeOverworld("forest_a_ii", Material.ROCK);
	
	
	public static final Block FOREST_B_I = new LandscapeOverworld("forest_b_i", Material.ROCK);
	public static final Block FOREST_B_II = new LandscapeOverworld("forest_b_ii", Material.ROCK);

	public static final Block FOREST_C_I = new LandscapeOverworld("forest_c_i", Material.ROCK);
	public static final Block FOREST_C_II = new LandscapeOverworld("forest_c_ii", Material.ROCK);
	
			//UNCOMMON
	
				//VILLAGE
	
	public static final Block VILLAGE_A_I = new LandscapeOverworld("village_a_i", Material.ROCK);
	public static final Block VILLAGE_A_II = new LandscapeOverworld("village_a_ii", Material.ROCK);
	
	public static final Block VILLAGE_B_I = new LandscapeOverworld("village_b_i", Material.ROCK);
	public static final Block VILLAGE_B_II = new LandscapeOverworld("village_b_ii", Material.ROCK);
	
				//DESERT
	
	public static final Block DESERT_A_I = new LandscapeOverworld("desert_a_i", Material.ROCK);
	public static final Block DESERT_A_II = new LandscapeOverworld("desert_a_ii", Material.ROCK);
	
	public static final Block DESERT_B_I = new LandscapeOverworld("desert_b_i", Material.ROCK);
	public static final Block DESERT_B_II = new LandscapeOverworld("desert_b_ii", Material.ROCK);
	
	//LEGENDARY
	
		//ENDCITY
				
				//BASE
	
	public static final Block ENDCITY_BASE_BOT = new EndCity("endcity_base_bot", Material.ROCK);
	public static final Block ENDCITY_BASE_TOP = new EndCity("endcity_base_top", Material.ROCK);
	public static final Block ENDCITY_BASE_NORTH= new EndCity("endcity_base_north", Material.ROCK);
			
				//TOPAREA
	
	public static final Block ENDCITY_CENTER_BOT= new EndCity("endcity_center_bot", Material.ROCK);
	public static final Block ENDCITY_CENTER_TOP= new EndCity("endcity_center_top", Material.ROCK);
	
	public static final Block ENDCITY_SOUTH= new EndCity("endcity_south", Material.ROCK);
	
	public static final Block ENDCITY_EAST_BOT= new EndCity("endcity_east_bot", Material.ROCK);
	public static final Block ENDCITY_EAST_TOP= new EndCity("endcity_east_top", Material.ROCK);
	
	public static final Block ENDCITY_WEST= new EndCity("endcity_west", Material.ROCK);
}






