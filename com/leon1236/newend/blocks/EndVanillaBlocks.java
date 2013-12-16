package com.leon1236.newend.blocks;

import net.minecraft.block.Block;

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
		
		
	}
	
	
	
}

