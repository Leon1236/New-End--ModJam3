package com.leon1236.newend.blocks;

import com.leon1236.newend.lib.Block_ID;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class EndIC2Blocks {
	
	public static Block BlockEndCopperOre;
	

	public static void init() {
		
		BlockEndCopperOre = new BlockEndCopperOre(Block_ID.BlockEndCopperOre_ID);
		
		GameRegistry.registerBlock(BlockEndCopperOre, Strings.BlockEndCopperOre_NAME);
		
	}

}
