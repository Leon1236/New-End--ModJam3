package com.leon1236.newend.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.leon1236.newend.NewEnd_Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



public class EndArmor extends ItemArmor {
	
	
private String texturePath = "newend:models/armor/";
private String iconPath = "newend:";

	public EndArmor(int par1,
			EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String type) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		
		this.setMaxStackSize(1);
		this.setCreativeTab(NewEnd_Main.Tab_newend);
		this.SetArmorType(type.toLowerCase(), par4);
	}
	
	private void SetArmorType(String type, int par4){
		switch(par4){
		
		case 0:
			this.setUnlocalizedName(type + "Helmet");
		    this.texturePath += type + "_layer_1.png";
			this.iconPath += type + "_helmet";
			break;
		case 1:
			this.setUnlocalizedName(type + "Chestplate");
		    this.texturePath += type + "_layer_1.png";
			this.iconPath += type + "_chestplate";
			break;
		case 2:
			this.setUnlocalizedName(type + "Leggings");
		    this.texturePath += type + "_layer_2.png";
			this.iconPath += type + "_leggings";
			break;
		case 3:
			this.setUnlocalizedName(type + "Boots");
		    this.texturePath += type + "_layer_1.png";
			this.iconPath += type + "_boots";
			break;
	
		}
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon(this.iconPath);
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer){
		return this.texturePath;
		
	}
	
}