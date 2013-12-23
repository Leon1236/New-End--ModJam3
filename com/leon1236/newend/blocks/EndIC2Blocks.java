package com.leon1236.newend.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.leon1236.newend.lib.Block_ID;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class EndIC2Blocks {
	
	public static Block BlockEndCopperOre;
	public static Block BlockEndTinOre;
	public static Block BlockEndLeadOre;
	public static Block BlockEndBronzeOre;
	public static Block BlockEndUraniumOre;

	public static void init() {
		
	//Spreading all blocks to different classes. They carry the blockID
		BlockEndCopperOre = new BlockEndCopperOre(Block_ID.BlockEndCopperOre_ID);
		BlockEndTinOre = new BlockEndTinOre(Block_ID.BlockEndTinOre_ID);
		BlockEndLeadOre = new BlockEndLeadOre(Block_ID.BlockEndLeadOre_ID);
		BlockEndBronzeOre = new BlockEndBronzeOre(Block_ID.BlockEndBronzeOre_ID);
		BlockEndUraniumOre = new BlockEndUraniumOre(Block_ID.BlockEndUraniumOre_ID);
		
	//Registering all the blocks. Args: block, name 
		GameRegistry.registerBlock(BlockEndCopperOre, Strings.BlockEndCopperOre_NAME);
		GameRegistry.registerBlock(BlockEndTinOre, Strings.BlockEndTinOre_NAME);
		GameRegistry.registerBlock(BlockEndLeadOre, Strings.BlockEndLeadOre_NAME);
		GameRegistry.registerBlock(BlockEndBronzeOre, Strings.BlockEndBronzeOre_NAME);
		GameRegistry.registerBlock(BlockEndUraniumOre, Strings.BlockEndUraniumOre_NAME);
		
	//Registers all of the materials into forge ore dictionary 
		OreDictionary.registerOre("oreCopper", new ItemStack(BlockEndCopperOre));
		OreDictionary.registerOre("oreTin", new ItemStack(BlockEndTinOre));
		OreDictionary.registerOre("oreLead", new ItemStack(BlockEndLeadOre));
		OreDictionary.registerOre("oreBronze", new ItemStack(BlockEndBronzeOre));
		OreDictionary.registerOre("oreUranium", new ItemStack(BlockEndUraniumOre));
		
		
	}

}
