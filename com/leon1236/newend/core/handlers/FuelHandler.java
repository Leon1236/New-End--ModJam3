package com.leon1236.newend.core.handlers;

import net.minecraft.item.ItemStack;

import com.leon1236.newend.blocks.EndBlocks;
import com.leon1236.newend.items.ModItems;

import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == ModItems.ItemEndCoal.itemID){
			return 6400;
		}
		else if(fuel.itemID == ModItems.ItemEndCharcoal.itemID){
			return 3200;
		}
		else if(fuel.itemID == EndBlocks.BlockEndWood.blockID){
			return 1600;
		}
		else if(fuel.itemID == EndBlocks.BlockEndPlank.blockID){
			return 400;
		}
		else if(fuel.itemID == ModItems.ItemEndStick.itemID){
			return 200;
		}
		return 0;
	}

}
