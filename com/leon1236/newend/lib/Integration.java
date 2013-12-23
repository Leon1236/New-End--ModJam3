package com.leon1236.newend.lib;

import net.minecraft.item.ItemStack;
import ic2.api.item.Items;
import ic2.api.recipe.Recipes;

import com.leon1236.newend.items.EndIC2Items;
import com.leon1236.newend.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Integration {
	
	
	public static void IndustrialCraft(){
		/*
		Recipes.advRecipes.addShapelessRecipe((new ItemStack(EndIC2Items.IC_EndPlate)),
				new Object[] {"I","E", Character.valueOf('I'), ModItems.ItemEndIngot, Character.valueOf('E'), Items.getItem("ForgeHammer")});
		
		Recipes.advRecipes.addShapelessRecipe((new ItemStack(EndIC2Items.IC_EndCasing)),
				new Object[] {"I","E", Character.valueOf('I'), EndIC2Items.IC_EndPlate, Character.valueOf('E'), Items.getItem("ForgeHammer")});
	
		Recipes.advRecipes.addRecipe(new ItemStack(EndIC2Items.IC_EndDust),
				new Object[] {"III","III","III", Character.valueOf('I'), EndIC2Items.IC_EndDustSmall});
	
		Recipes.advRecipes.addRecipe(Items.getItem("mixedMetalIngot"), 
				new Object[] {"III","EEE","RRR", Character.valueOf('I'), Items.getItem("plateiron"), Character.valueOf('E'), ModItems.ItemEndIngot, Character.valueOf('R'), Items.getItem("platetin")});
	
		Recipes.advRecipes.addRecipe(Items.getItem("cesuUnit"), 
				new Object[] {"ICI","EEE","III", Character.valueOf('I'), ModItems.ItemEndIngot, Character.valueOf('E'), Items.getItem("advBattery"), Character.valueOf('C'), Items.getItem("insulatedCopperCableItem")});
		
		*/
		GameRegistry.addSmelting(EndIC2Items.IC_EndDust.itemID, new ItemStack(ModItems.ItemEndIngot), 3.0F);
	}
	
    public static void BuildCraft(){
		
    }
    
    public static void Thaumcraft(){
		
    }
    
    public static void RailCraft(){
		
    }
        
    public static void Stevescarts(){
		
    }
    
    public static void TinkersConstruct(){
		
    }
    
    public static void Forestry(){
		
    }
    
    public static void ThermalExpention(){
		
    }
	
}


