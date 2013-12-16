package com.leon1236.newend;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import com.leon1236.newend.blocks.EndBlocks;
import com.leon1236.newend.blocks.EndIC2Blocks;
import com.leon1236.newend.blocks.EndVanillaBlocks;
import com.leon1236.newend.core.handlers.ConfigurationHandler;
import com.leon1236.newend.core.handlers.FuelHandler;
import com.leon1236.newend.core.handlers.LocalizationHandler;
import com.leon1236.newend.items.ModItems;
import com.leon1236.newend.lib.Crafting;
import com.leon1236.newend.lib.EndClientProxy;
import com.leon1236.newend.lib.EndCommonProxy;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Tab_newend;
import com.leon1236.newend.world.NewEnd_oregen;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;


//Basic stuff Forge needs
     @Mod( 	
		
    		 name 				= References.MOD_NAME,
			 modid 				= References.MOD_ID,
			 version 			= References.VERSION
		)

     @NetworkMod(
		
    		 clientSideRequired 	= true, 
    		 serverSideRequired 	= false,
    		 channels            =(References.CHANNEL_NAME)
		)


public class NewEnd_Main {
	@SidedProxy(

			clientSide 		= References.CLIENT_PROXY_LOCATION,
			serverSide 		= References.COMMON_PROXY_LOCATION)
            public static     EndCommonProxy proxy;
	
	//Creative tab
    public static CreativeTabs Tab_newend = new Tab_newend(CreativeTabs.getNextID(), References.MOD_ID);
   
    // World gen 
    NewEnd_oregen eventmanager = new NewEnd_oregen();
	
    
//preInit loads all blocks, items, configurations and more
  	@EventHandler
  	public void preInit(FMLPreInitializationEvent event){	
  	
  		// Loads config
  		ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath()+ File.separator + References.MOD_ID + File.separator + References.MOD_ID + ".cfg"));
  		
  		// Adds the localizations
        LocalizationHandler.init();
        
  	    // Loads all blocks 
  		EndBlocks.init();
  		
     	// Loads all items 
  		ModItems.init();
  		
  		//Crafting
  		Crafting.loadrecipe();
  		
  		//Smelting
  		Crafting.loadSmelting();
  		
  		//Loads ore gen
  		GameRegistry.registerWorldGenerator(eventmanager);
  		
  		//Loads fuel handler
  		GameRegistry.registerFuelHandler(new FuelHandler());
  		
  		//Vanilla End Ores
  		EndVanillaBlocks.init();
  		
  		//IC2 End Ores
  		EndIC2Blocks.init();
  	}
  	
//init loads all gui's, listeners and more
  	@EventHandler
  	public void init(FMLInitializationEvent event){
  		
  /*	//IC2 integration
	    if (Loader.isModLoaded("IC2")) 
	    {
			Integration.loadIndustrialCraft();
			System.out.println("IC2 macerator recipe enabled");
	    }
   */ 
  		
  	}
//postInit loads everything that has to load after all mods have been loaded
  	@EventHandler
  	public void postInit(FMLPostInitializationEvent event){
  		
  		
  	}
  	
}
