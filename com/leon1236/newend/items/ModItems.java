package com.leon1236.newend.items;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import com.leon1236.newend.lib.Item_ID;
import com.leon1236.newend.lib.Strings;

public class ModItems {
	
	//Tool material
	public static EnumToolMaterial EndToolMaterial;
	public static EnumArmorMaterial EndArmorMaterial;
	
	//Item reg
	public static Item ItemEndIngot;
	public static Item ItemEndCoal;
	public static Item ItemEndCharcoal;
	public static Item ItemEndStick;	
	public static Item ItemEndString;
	public static Item EndSword;
	public static Item EndHoe;
	public static Item EndAxe;
	public static Item EndPickaxe;
	public static Item EndShovel;
	public static Item endarmor_Helmet;
	public static Item endarmor_Chestplate;
	public static Item endarmor_Leggings;
	public static Item endarmor_Boots;
	
	public static void init(){
		
		EndToolMaterial = EnumHelper.addToolMaterial(Strings.EndToolMaterial, 3, 2000, 8F, 3, 30);
		EndArmorMaterial = EnumHelper.addArmorMaterial(Strings.EndArmorMaterial, 66, new int[] { 6, 9, 9, 6 }, 30);
		
		ItemEndIngot = new ItemEndIngot(Item_ID.ItemEndIngot_ID -256);
		ItemEndCoal = new ItemEndCoal(Item_ID.ItemEndCoal_ID -256);
		ItemEndCharcoal = new ItemEndCharcoal(Item_ID.ItemEndCharcoal_ID -256);
		ItemEndStick = new ItemEndStick(Item_ID.ItemEndStick_ID -256);
		ItemEndString = new ItemEndString(Item_ID.ItemEndString_ID -256);
		EndSword = new EndSword(Item_ID.EndSword_ID -256, EndToolMaterial);
		EndHoe = new EndHoe(Item_ID.EndHoe_ID -256, EndToolMaterial);
		EndAxe = new EndAxe(Item_ID.EndAxe_ID -256, EndToolMaterial);
		EndPickaxe = new EndPickaxe(Item_ID.EndPickaxe_ID -256, EndToolMaterial);
		EndShovel = new EndShovel(Item_ID.EndShovel_ID -256, EndToolMaterial);
		
		//Armor
		endarmor_Helmet = new EndArmor(Item_ID.ItemEndArmor_Helmet_ID, EndArmorMaterial, 0, 0, "newendarmor");
		endarmor_Chestplate = new EndArmor(Item_ID.ItemEndArmor_Chestplate_ID, EndArmorMaterial, 0, 1, "newendarmor");
		endarmor_Leggings = new EndArmor(Item_ID.ItemEndArmor_Leggings_ID, EndArmorMaterial, 0, 2, "newendarmor");
		endarmor_Boots = new EndArmor(Item_ID.ItemEndArmor_Boots_ID, EndArmorMaterial, 0, 3, "newendarmor");
		
		
	}
	
	//Registers all of the materials into forge ore dictionary 
	public static void oreRegistration()
    {
            OreDictionary.registerOre("ingotEnd", new ItemStack(ItemEndIngot)); 
            OreDictionary.registerOre("stickWood", new ItemStack(ItemEndStick));
    }
	
	

}
