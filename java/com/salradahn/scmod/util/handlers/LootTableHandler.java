package com.salradahn.scmod.util.handlers;

import com.salradahn.scmod.init.ModBlocks;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class LootTableHandler 
{
	
	// POOLS
	
	 private static LootPool createDungeonLootPool(LootEntry[] lootEntries,String id)
	    {
	        LootPool lootPool=new LootPool(lootEntries,new LootCondition[]{},new RandomValueRange(2),new RandomValueRange(0),id);
	        return lootPool;
	    }
	 
	 private static LootPool createJungleLootPool(LootEntry[] lootEntries,String id)
	    {
	        LootPool lootPool=new LootPool(lootEntries,new LootCondition[]{},new RandomValueRange(3),new RandomValueRange(0),id);
	        return lootPool;
	    }
	
	private static LootPool createDefaultLootPool(LootEntry[] lootEntries,String id)
    {
        LootPool lootPool=new LootPool(lootEntries,new LootCondition[]{},new RandomValueRange(1),new RandomValueRange(0),id);
        return lootPool;
    }
	
	// LOOT ENTRIES
	
	 private static LootEntryItem createEmptyLootEntry(Item item)
	    {
	        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
	        return new LootEntryItem(item,35,0,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
	    }
	
	 private static LootEntryItem createCatLootEntry(Item item)
	    {
	        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
	        return new LootEntryItem(item,10,4,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
	    }
	 
	 private static LootEntryItem createOcelotLootEntry(Item item)
	    {
	        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
	        return new LootEntryItem(item,15,2,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
	    }
	 
	 private static LootEntryItem createParrotLootEntry(Item item)
	    {
	        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
	        return new LootEntryItem(item,5,30,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
	    }
	 
	 
	 
    private static LootEntryItem createVillagerLootEntry(Item item)
    {
        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
        return new LootEntryItem(item,5,10,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
    }
    
    private static LootEntryItem createGolemLootEntry(Item item)
    {
        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
        return new LootEntryItem(item,3,40,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
    }
    
    private static LootEntryItem createIllagerLootEntry(Item item)
    {
        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
        return new LootEntryItem(item,10,10,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
    }
    
    
    
    private static LootEntryItem createWitchLootEntry(Item item)
    {
        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
        return new LootEntryItem(item,1,30,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
    }
    
    
    
    private static LootEntryItem createMobLootEntry(Item item)
    {
        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
        return new LootEntryItem(item,5,10,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
    }
    
    private static LootEntryItem createEndermanLootEntry(Item item)
    {
        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
        return new LootEntryItem(item,1,40,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
    }
    
    private static LootEntryItem createRabbitLootEntry(Item item)
    {
        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
        return new LootEntryItem(item,10,3,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
    }
    
    //FISHING
    
    private static LootEntryItem createGuardianLootEntry(Item item)
    {
        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
        return new LootEntryItem(item,5,30,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
    }
    
    private static LootEntryItem createElderGuardianLootEntry(Item item)
    {
        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
        return new LootEntryItem(item,1,50,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
    }
    
    private static LootEntryItem createSquidLootEntry(Item item)
    {
        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
        return new LootEntryItem(item,10,20,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
    }
    


    private static LootEntryItem createBossLootEntry(Item item)
    {
        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
        return new LootEntryItem(item,2,100,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
    }
    
    private static LootEntryItem createPlayerLootEntry(Item item)
    {
        SetCount count=new SetCount(new LootCondition[]{},new RandomValueRange(1));
        return new LootEntryItem(item,1,1000,new LootFunction[]{count},new LootCondition[]{},item.getRegistryName().getResourcePath());
    }


@SubscribeEvent
public static void handleLootTables(LootTableLoadEvent lootTableLoadEvent)
{
	// VILLAGE
	
    ResourceLocation resourceLocation=lootTableLoadEvent.getName();
    LootTable lootTable=lootTableLoadEvent.getTable();
    if(resourceLocation==LootTableList.CHESTS_VILLAGE_BLACKSMITH)
    {
    	LootEntry empty=createEmptyLootEntry(Items.AIR);
    	
    	LootEntry zvillager=createVillagerLootEntry(Item.getItemFromBlock(ModBlocks.ZOMBIE_FARMER_FIGURE_CASE));
    	
    	LootEntry cow=createMobLootEntry(Item.getItemFromBlock(ModBlocks.COW_FIGURE_CASE));
    	LootEntry pig=createMobLootEntry(Item.getItemFromBlock(ModBlocks.PIG_FIGURE_CASE));
    	LootEntry chicken=createMobLootEntry(Item.getItemFromBlock(ModBlocks.CHICKEN_FIGURE_CASE));
    	LootEntry wolf=createMobLootEntry(Item.getItemFromBlock(ModBlocks.WOLF_FIGURE_CASE));
    	LootEntry sheep=createMobLootEntry(Item.getItemFromBlock(ModBlocks.WOLF_FIGURE_CASE));
    	
        LootEntry butcher=createVillagerLootEntry(Item.getItemFromBlock(ModBlocks.BUTCHER_FIGURE_CASE));
        LootEntry blacksmith=createVillagerLootEntry(Item.getItemFromBlock(ModBlocks.BLACKSMITH_FIGURE_CASE));
        LootEntry nitwit=createVillagerLootEntry(Item.getItemFromBlock(ModBlocks.NITWIT_FIGURE_CASE));
        LootEntry priest=createVillagerLootEntry(Item.getItemFromBlock(ModBlocks.PRIEST_FIGURE_CASE));
        LootEntry farmer=createVillagerLootEntry(Item.getItemFromBlock(ModBlocks.FARMER_FIGURE_CASE));
        LootEntry librarian=createVillagerLootEntry(Item.getItemFromBlock(ModBlocks.LIBRARIAN_FIGURE_CASE));
        
        LootEntry iron_golem=createGolemLootEntry(Item.getItemFromBlock(ModBlocks.IRON_GOLEM_FIGURE_CASE));
        
        LootPool lootPool=createDungeonLootPool(new LootEntry[]{empty,zvillager,cow,pig,chicken,wolf,sheep,butcher,blacksmith,nitwit,priest,farmer,librarian,iron_golem},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
    // DESERT
    
    else if(resourceLocation==LootTableList.CHESTS_DESERT_PYRAMID)
    {
    	LootEntry empty=createEmptyLootEntry(Items.AIR);
    	
    	LootEntry zvillager=createVillagerLootEntry(Item.getItemFromBlock(ModBlocks.ZOMBIE_NITWIT_FIGURE_CASE));
        
        LootEntry husk=createMobLootEntry(Item.getItemFromBlock(ModBlocks.HUSK_FIGURE_CASE));
        LootEntry horse=createMobLootEntry(Item.getItemFromBlock(ModBlocks.HORSE_BROWN_FIGURE_CASE));
        LootEntry mule=createMobLootEntry(Item.getItemFromBlock(ModBlocks.MULE_FIGURE_CASE));
        
        LootEntry enderman=createEndermanLootEntry(Item.getItemFromBlock(ModBlocks.ENDERMAN_FIGURE_CASE));
        
        LootEntry rabbit=createEndermanLootEntry(Item.getItemFromBlock(ModBlocks.RABBIT_TOAST_FIGURE_CASE));
        
        LootEntry alex=createPlayerLootEntry(Item.getItemFromBlock(ModBlocks.ALEX_FIGURE_CASE));
        
        LootEntry player=createPlayerLootEntry(Item.getItemFromBlock(ModBlocks.MREDOG_FIGURE_CASE));
        
        LootPool lootPool=createDefaultLootPool(new LootEntry[]{empty,zvillager,husk,horse,mule,enderman,rabbit,alex,player},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
    // MANSION
    
    else if(resourceLocation==LootTableList.CHESTS_WOODLAND_MANSION)
    {
    	LootEntry empty=createEmptyLootEntry(Items.AIR);
    	
    	LootEntry zvillager=createVillagerLootEntry(Item.getItemFromBlock(ModBlocks.ZOMBIE_LIBRARIAN_FIGURE_CASE));
        
        LootEntry evoker=createIllagerLootEntry(Item.getItemFromBlock(ModBlocks.EVOKER_FIGURE_CASE));
        LootEntry vindicator=createIllagerLootEntry(Item.getItemFromBlock(ModBlocks.VINDICATOR_FIGURE_CASE));
        LootEntry illusionist=createIllagerLootEntry(Item.getItemFromBlock(ModBlocks.ILLUSIONIST_FIGURE_CASE));
        LootEntry vex=createIllagerLootEntry(Item.getItemFromBlock(ModBlocks.VEX_FIGURE_CASE));
        
        LootEntry witch=createWitchLootEntry(Item.getItemFromBlock(ModBlocks.WITCH_FIGURE_CASE));
        
        LootPool lootPool=createDefaultLootPool(new LootEntry[]{empty,zvillager,evoker,vindicator,illusionist,vex,witch},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
    // DUNGEON
    
    else if(resourceLocation==LootTableList.CHESTS_SIMPLE_DUNGEON)
    {
    	LootEntry empty=createEmptyLootEntry(Items.AIR);
    	
    	LootEntry zvillager=createVillagerLootEntry(Item.getItemFromBlock(ModBlocks.ZOMBIE_BUTCHER_FIGURE_CASE));
        
        LootEntry creeper=createMobLootEntry(Item.getItemFromBlock(ModBlocks.CREEPER_FIGURE_CASE));
        LootEntry zombie=createMobLootEntry(Item.getItemFromBlock(ModBlocks.ZOMBIE_FIGURE_CASE));
        LootEntry skeleton=createMobLootEntry(Item.getItemFromBlock(ModBlocks.SKELETON_FIGURE_CASE));
        LootEntry spider=createMobLootEntry(Item.getItemFromBlock(ModBlocks.SPIDER_FIGURE_CASE));
        LootEntry bat=createMobLootEntry(Item.getItemFromBlock(ModBlocks.BAT_FIGURE_CASE));
        LootEntry horse=createMobLootEntry(Item.getItemFromBlock(ModBlocks.HORSE_ZOMBIE_FIGURE_CASE));
        
        LootEntry rabbit=createRabbitLootEntry(Item.getItemFromBlock(ModBlocks.RABBIT_BLACK_FIGURE_CASE));
        
        LootEntry enderman=createEndermanLootEntry(Item.getItemFromBlock(ModBlocks.ENDERMAN_FIGURE_CASE));
        
        LootPool lootPool=createDungeonLootPool(new LootEntry[]{empty,zvillager,creeper,zombie,skeleton,enderman,spider,bat,horse,rabbit},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
    // JUNGLE
    
    else if(resourceLocation==LootTableList.CHESTS_JUNGLE_TEMPLE)
    {
    	LootEntry empty=createEmptyLootEntry(Items.AIR);
        
    	LootEntry ocelot=createOcelotLootEntry(Item.getItemFromBlock(ModBlocks.OCELOT_FIGURE_CASE));
    	LootEntry cat_black=createCatLootEntry(Item.getItemFromBlock(ModBlocks.CAT_BLACK_FIGURE_CASE));
    	LootEntry cat_red=createCatLootEntry(Item.getItemFromBlock(ModBlocks.CAT_RED_FIGURE_CASE));
    	LootEntry cat_siamese=createCatLootEntry(Item.getItemFromBlock(ModBlocks.CAT_SIAMESE_FIGURE_CASE));
    	
    	LootEntry parrot_red=createCatLootEntry(Item.getItemFromBlock(ModBlocks.PARROT_RED_FIGURE_CASE));
    	LootEntry parrot_green=createCatLootEntry(Item.getItemFromBlock(ModBlocks.PARROT_GREEN_FIGURE_CASE));
    	LootEntry parrot_teal=createCatLootEntry(Item.getItemFromBlock(ModBlocks.PARROT_TEAL_FIGURE_CASE));
    	LootEntry parrot_blue=createCatLootEntry(Item.getItemFromBlock(ModBlocks.PARROT_BLUE_FIGURE_CASE));
    	LootEntry parrot_grey=createCatLootEntry(Item.getItemFromBlock(ModBlocks.PARROT_GREY_FIGURE_CASE));
    	
    	LootEntry rabbit=createRabbitLootEntry(Item.getItemFromBlock(ModBlocks.RABBIT_BROWN_FIGURE_CASE));
    	
        LootEntry steve=createPlayerLootEntry(Item.getItemFromBlock(ModBlocks.STEVE_FIGURE_CASE));
        
        LootEntry player=createPlayerLootEntry(Item.getItemFromBlock(ModBlocks.TURTYWURTY_FIGURE_CASE));
        
        LootPool lootPool=createJungleLootPool(new LootEntry[]{empty,ocelot,cat_black,cat_red,cat_siamese,parrot_red,parrot_green,parrot_teal,parrot_blue,parrot_grey,rabbit,steve,player},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
    // MINESHAFT
    
    else if(resourceLocation==LootTableList.CHESTS_ABANDONED_MINESHAFT)
    {
    	LootEntry empty=createEmptyLootEntry(Items.AIR);
    	
    	LootEntry zvillager=createVillagerLootEntry(Item.getItemFromBlock(ModBlocks.ZOMBIE_BLACKSMITH_FIGURE_CASE));
    	
    	LootEntry creeper=createMobLootEntry(Item.getItemFromBlock(ModBlocks.CREEPER_FIGURE_CASE));
        LootEntry zombie=createMobLootEntry(Item.getItemFromBlock(ModBlocks.ZOMBIE_FIGURE_CASE));
        LootEntry skeleton=createMobLootEntry(Item.getItemFromBlock(ModBlocks.SKELETON_FIGURE_CASE));
        LootEntry spider=createMobLootEntry(Item.getItemFromBlock(ModBlocks.CAVE_SPIDER_FIGURE_CASE));
        LootEntry bat=createMobLootEntry(Item.getItemFromBlock(ModBlocks.BAT_FIGURE_CASE));
        
        LootEntry enderman=createEndermanLootEntry(Item.getItemFromBlock(ModBlocks.ENDERMAN_FIGURE_CASE));
        
        LootPool lootPool=createDungeonLootPool(new LootEntry[]{empty,zvillager,creeper,zombie,skeleton,enderman,spider},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
    // FISHING
    
    else if(resourceLocation==LootTableList.GAMEPLAY_FISHING_TREASURE)
    {   	
    	LootEntry squid=createSquidLootEntry(Item.getItemFromBlock(ModBlocks.SQUID_FIGURE_CASE));
        LootEntry guardian=createGuardianLootEntry(Item.getItemFromBlock(ModBlocks.GUARDIAN_FIGURE_CASE));
        LootEntry guardian_elder=createElderGuardianLootEntry(Item.getItemFromBlock(ModBlocks.ELDER_GUARDIAN_FIGURE_CASE));
       
        LootPool lootPool=createDefaultLootPool(new LootEntry[]{squid,guardian_elder,guardian},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
    // NETHER
    
    else if(resourceLocation==LootTableList.CHESTS_NETHER_BRIDGE)
    {   
    	LootEntry empty=createEmptyLootEntry(Items.AIR);
  
        LootEntry wither_skeleton=createMobLootEntry(Item.getItemFromBlock(ModBlocks.WITHER_SKELETON_FIGURE_CASE));
        LootEntry pigman=createMobLootEntry(Item.getItemFromBlock(ModBlocks.ZOMBIE_PIGMAN_FIGURE_CASE));
        LootEntry blaze=createMobLootEntry(Item.getItemFromBlock(ModBlocks.BLAZE_FIGURE_CASE));
        LootEntry ghast=createMobLootEntry(Item.getItemFromBlock(ModBlocks.GHAST_FIGURE_CASE));
        
        LootEntry wither=createBossLootEntry(Item.getItemFromBlock(ModBlocks.WITHER_FIGURE_CASE));
       
        LootPool lootPool=createDefaultLootPool(new LootEntry[]{empty,wither_skeleton,pigman,blaze,ghast,wither},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
    // IGLOO
    
    else if(resourceLocation==LootTableList.CHESTS_IGLOO_CHEST)
    {   
    	LootEntry empty=createEmptyLootEntry(Items.AIR);
    	
    	LootEntry zvillager=createVillagerLootEntry(Item.getItemFromBlock(ModBlocks.ZOMBIE_PRIEST_FIGURE_CASE));
  
        LootEntry snowman=createMobLootEntry(Item.getItemFromBlock(ModBlocks.SNOWMAN_FIGURE_CASE));
        LootEntry llama=createMobLootEntry(Item.getItemFromBlock(ModBlocks.LLAMA_WHITE_FIGURE_CASE));
        LootEntry horse=createMobLootEntry(Item.getItemFromBlock(ModBlocks.HORSE_WHITE_FIGURE_CASE));
        LootEntry rabbit=createRabbitLootEntry(Item.getItemFromBlock(ModBlocks.RABBIT_WHITE_FIGURE_CASE));
        LootEntry bear=createMobLootEntry(Item.getItemFromBlock(ModBlocks.POLAR_BEAR_FIGURE_CASE));
        LootEntry stray=createMobLootEntry(Item.getItemFromBlock(ModBlocks.STRAY_FIGURE_CASE));
       
        LootPool lootPool=createDungeonLootPool(new LootEntry[]{empty,zvillager,snowman,horse,llama,rabbit,bear,stray},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
    // END
    
    else if(resourceLocation==LootTableList.CHESTS_END_CITY_TREASURE)
    {   
        LootEntry shulker=createMobLootEntry(Item.getItemFromBlock(ModBlocks.SHULKER_PURPLE_FIGURE_CASE));
        LootEntry enderman=createMobLootEntry(Item.getItemFromBlock(ModBlocks.ENDERMAN_FIGURE_CASE));
        LootEntry endermite=createMobLootEntry(Item.getItemFromBlock(ModBlocks.ENDERMITE_FIGURE_CASE));
       
        LootEntry ender_dragon=createBossLootEntry(Item.getItemFromBlock(ModBlocks.ENDER_DRAGON_FIGURE_CASE));
       
        LootPool lootPool=createDungeonLootPool(new LootEntry[]{shulker,enderman,endermite,ender_dragon},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
    // STRONGHOLD
    
    else if(resourceLocation==LootTableList.CHESTS_STRONGHOLD_CORRIDOR)
    {   
    	LootEntry empty=createEmptyLootEntry(Items.AIR);
    	
        LootEntry enderman=createEndermanLootEntry(Item.getItemFromBlock(ModBlocks.ENDERMAN_FIGURE_CASE));
        
        LootEntry silverfish=createMobLootEntry(Item.getItemFromBlock(ModBlocks.SILVERFISH_FIGURE_CASE));
        LootEntry horse=createMobLootEntry(Item.getItemFromBlock(ModBlocks.HORSE_BLACK_FIGURE_CASE));
        
        LootEntry player=createPlayerLootEntry(Item.getItemFromBlock(ModBlocks.SALRADAHN_FIGURE_CASE));
        
        LootPool lootPool=createDungeonLootPool(new LootEntry[]{empty,enderman,silverfish,horse,player},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
    else if(resourceLocation==LootTableList.CHESTS_STRONGHOLD_CROSSING)
    {   
    	LootEntry empty=createEmptyLootEntry(Items.AIR);
    	
    	LootEntry mooshroom=createMobLootEntry(Item.getItemFromBlock(ModBlocks.MUSHROOM_COW_FIGURE_CASE));
    	
        LootEntry enderman=createEndermanLootEntry(Item.getItemFromBlock(ModBlocks.ENDERMAN_FIGURE_CASE));
        
        LootEntry silverfish=createMobLootEntry(Item.getItemFromBlock(ModBlocks.SILVERFISH_FIGURE_CASE));
        LootEntry horse=createMobLootEntry(Item.getItemFromBlock(ModBlocks.HORSE_GREY_FIGURE_CASE));
        
        LootEntry player=createPlayerLootEntry(Item.getItemFromBlock(ModBlocks.KAPTAINWUTAX_FIGURE_CASE));
        
        LootPool lootPool=createDungeonLootPool(new LootEntry[]{empty,mooshroom,enderman,silverfish,horse,player},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
    else if(resourceLocation==LootTableList.CHESTS_STRONGHOLD_LIBRARY)
    {   
    	LootEntry empty=createEmptyLootEntry(Items.AIR);
    	
        LootEntry enderman=createEndermanLootEntry(Item.getItemFromBlock(ModBlocks.ENDERMAN_FIGURE_CASE));
        
        LootEntry silverfish=createMobLootEntry(Item.getItemFromBlock(ModBlocks.SILVERFISH_FIGURE_CASE));
        LootEntry llama=createMobLootEntry(Item.getItemFromBlock(ModBlocks.LLAMA_BROWN_FIGURE_CASE));
        
        LootEntry player=createPlayerLootEntry(Item.getItemFromBlock(ModBlocks.KORLIMANN_FIGURE_CASE));
        
        LootPool lootPool=createDungeonLootPool(new LootEntry[]{empty,enderman,silverfish,llama,player},"scollectibles");
        lootTable.addPool(lootPool);
    }
    
   
}

}
