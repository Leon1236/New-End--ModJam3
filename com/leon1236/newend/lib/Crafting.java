package com.leon1236.newend.lib;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.leon1236.newend.blocks.EndBlocks;
import com.leon1236.newend.blocks.EndVanillaBlocks;
import com.leon1236.newend.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;


public class Crafting 
{

	public static void loadrecipe()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.endarmor_Boots, 1),
                new Object[] {"# #","# #", Character.valueOf('#'), ModItems.ItemEndIngot});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.endarmor_Leggings, 1),
                new Object[] {"###","# #","# #", Character.valueOf('#'), ModItems.ItemEndIngot});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.endarmor_Chestplate, 1),
                new Object[] {"# #","###","###", Character.valueOf('#'), ModItems.ItemEndIngot});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.endarmor_Helmet, 1),
                new Object[] {"###","# #", Character.valueOf('#'), ModItems.ItemEndIngot});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.EndAxe, 1),
                new Object[] {" ##"," S#"," S ", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
       
		GameRegistry.addRecipe(new ItemStack(ModItems.EndAxe, 1),
                new Object[] {"## ","#S "," S ", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.EndHoe, 1),
                new Object[] {" ##"," S "," S ", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
       
		GameRegistry.addRecipe(new ItemStack(ModItems.EndHoe, 1),
                new Object[] {"## "," S "," S ", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.EndPickaxe, 1),
                new Object[] {"###"," S "," S ", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
       
		GameRegistry.addRecipe(new ItemStack(ModItems.EndShovel, 1),
                new Object[] {"#","S","S", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
       
		GameRegistry.addRecipe(new ItemStack(ModItems.EndSword, 1),
                new Object[] {"#","#","S", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
       
		GameRegistry.addRecipe(new ItemStack(ModItems.ItemEndStick, 4),
                new Object[] {"#","#", Character.valueOf('#'), EndBlocks.BlockEndPlank,});
		
		GameRegistry.addRecipe(new ItemStack(EndBlocks.BlockEndPlank, 2),
                new Object[] {"#", Character.valueOf('#'), EndBlocks.BlockEndWood,});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.ItemEndString, 3),
                new Object[] {"#S","#S","#S", Character.valueOf('#'), ModItems.ItemEndIngot,Character.valueOf('S'), Item.silk});
		
		GameRegistry.addRecipe(new ItemStack(EndBlocks.BlockEndBlock, 3),
                new Object[] {"###","###","###", Character.valueOf('#'), ModItems.ItemEndIngot});
		
		GameRegistry.addRecipe(new ItemStack(EndBlocks.BlockEndBrick, 3),
                new Object[] {"##","##", Character.valueOf('#'), Block.whiteStone});
		
		
       
	}
	
	public static void loadSmelting()
	{

		GameRegistry.addSmelting(EndBlocks.BlockEndOre.blockID, new ItemStack(ModItems.ItemEndIngot), 5.0F);
		GameRegistry.addSmelting(EndBlocks.BlockEndWood.blockID, new ItemStack(ModItems.ItemEndCharcoal), 3.0F);
		GameRegistry.addSmelting(EndVanillaBlocks.BlockEndGoldOre.blockID, new ItemStack(Item.ingotGold), 3.0F);
		
	}
}
