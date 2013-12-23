package com.leon1236.newend.items;

import com.leon1236.newend.lib.Item_ID;

import net.minecraft.item.Item;

public class EndIC2Items {
	
	public static Item IC_EndCrushedOre;
	public static Item IC_EndPurifiedChrushedOre;
	public static Item IC_EndDustSmall;
	public static Item IC_EndDust;
	public static Item IC_EndPlate;
	public static Item IC_EndDensePlate;
	public static Item IC_EndMixedMetalIngot;
	public static Item IC_EndCasing;

	
	public static void init(){
		
		IC_EndCrushedOre = new IC_EndCrushedOre(Item_ID.IC_EndCrushedOre_ID -256);
		IC_EndPurifiedChrushedOre = new IC_EndPurifiedChrushedOre(Item_ID.IC_EndPurifiedChrushedOre_ID -256);
		IC_EndDustSmall = new IC_EndDustSmall(Item_ID.IC_EndDustSmall_ID -256);
		IC_EndDust = new IC_EndDust(Item_ID.IC_EndDust_ID -256);
		IC_EndPlate = new IC_EndPlate(Item_ID.IC_EndPlate_ID -256);
		IC_EndDensePlate = new IC_EndDensePlate(Item_ID.IC_EndDensePlate_ID -256);
		IC_EndMixedMetalIngot = new IC_EndMixedMetalIngot(Item_ID.IC_EndMixedMetalIngot_ID -256);
		IC_EndCasing = new IC_EndCasing(Item_ID.IC_EndCasing_ID -256);
		
	}

}
