package com.leon1236.newend.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.leon1236.newend.lib.Block_ID;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class EndVanillaBlocks {

	public static Block BlockEndCoalOre;
	public static Block BlockEndRedstoneOre;
	public static Block BlockEndLapisOre;
	public static Block BlockEndQuartzOre;
	public static Block BlockEndIronOre;
	public static Block BlockEndGoldOre;
	public static Block BlockEndDiamondOre;
	public static Block BlockEndEmeraldOre;

	
	public static void init(){
		
		BlockEndCoalOre = new BlockEndCoalOre(Block_ID.BlockEndCoalOre_ID);
		BlockEndRedstoneOre = new BlockEndRedstoneOre(Block_ID.BlockEndRedstoneOre_ID);
		BlockEndLapisOre = new BlockEndLapisOre(Block_ID.BlockEndLapisOre_ID);
		BlockEndQuartzOre = new BlockEndQuartzOre(Block_ID.BlockEndQuartzOre_ID);
		BlockEndIronOre = new BlockEndIronOre(Block_ID.BlockEndIronOre_ID);
		BlockEndGoldOre = new BlockEndGoldOre(Block_ID.BlockEndGoldOre_ID);
		BlockEndDiamondOre = new BlockEndDiamondOre(Block_ID.BlockEndDiamondOre_ID);
		BlockEndEmeraldOre = new BlockEndEmeraldOre(Block_ID.BlockEndEmeraldOre_ID);
		
		GameRegistry.registerBlock(BlockEndCoalOre, Strings.BlockEndCoalOre_NAME);
		GameRegistry.registerBlock(BlockEndRedstoneOre, Strings.BlockEndRedstoneOre_NAME);
		GameRegistry.registerBlock(BlockEndLapisOre, Strings.BlockEndLapisOre_NAME);
		GameRegistry.registerBlock(BlockEndQuartzOre, Strings.BlockEndQuartzOre_NAME);
		GameRegistry.registerBlock(BlockEndIronOre, Strings.BlockEndIronOre_NAME);
		GameRegistry.registerBlock(BlockEndGoldOre, Strings.BlockEndGoldOre_NAME);
		GameRegistry.registerBlock(BlockEndDiamondOre, Strings.BlockEndDiamondOre_NAME);
		
	//Registers all of the materials into forge ore dictionary 
		OreDictionary.registerOre("oreCoal", new ItemStack(BlockEndCoalOre));
		OreDictionary.registerOre("oreRedstone", new ItemStack(BlockEndRedstoneOre));
		OreDictionary.registerOre("oreLapis", new ItemStack(BlockEndLapisOre));
		OreDictionary.registerOre("oreQuartz", new ItemStack(BlockEndQuartzOre));
		OreDictionary.registerOre("oreIron", new ItemStack(BlockEndIronOre));
		OreDictionary.registerOre("oreGold", new ItemStack(BlockEndGoldOre));
		OreDictionary.registerOre("oreDiamond", new ItemStack(BlockEndDiamondOre));
		OreDictionary.registerOre("oreEmerald", new ItemStack(BlockEndEmeraldOre));
		
		
	}
	
	
	
}

