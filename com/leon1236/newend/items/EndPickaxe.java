package com.leon1236.newend.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EndPickaxe extends ItemPickaxe {

	public EndPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setUnlocalizedName(Strings.EndPickaxe_NAME);
		this.setCreativeTab(NewEnd_Main.Tab_newend);

	}
	
	
	//How much damage has left
		@SuppressWarnings({ "unchecked", "rawtypes" })
	    @Override
	    public void addInformation(ItemStack itemStack, EntityPlayer player,
	            List infoList, boolean bool)
	    {
	        int max = itemStack.getMaxDamage();
	        infoList.add("Damage Left: " + (max - itemStack.getItemDamage()) + "/"
	                + max);
	    }
		
		//Loads texture
	  	@Override
	  	@SideOnly(Side.CLIENT)
	  	public void registerIcons(IconRegister iconRegister){

	  	itemIcon = iconRegister.registerIcon(String.format("%s:%s", References.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	  	}

	  	protected String getUnwrappedUnlocalizedName(String unlocalizedName){

	  	return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	  	}
}

