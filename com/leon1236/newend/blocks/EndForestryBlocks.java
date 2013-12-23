package com.leon1236.newend.blocks;

import com.leon1236.newend.lib.Block_ID;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class EndForestryBlocks {
	
	public static Block BlockEndApatiteOre;
	
	public static void init(){
		
		BlockEndApatiteOre = new BlockEndApatite(Block_ID.BlockEndApatiteOre_ID);
		
		GameRegistry.registerBlock(BlockEndApatiteOre, Strings.BlockEndApatiteOre_NAME);
		
//Registers all of the materials into forge ore dictionary 
		OreDictionary.registerOre("oreApatite", new ItemStack(BlockEndApatiteOre));
	}
	
	
}


