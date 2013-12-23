package com.leon1236.newend.items;
 
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class IC_EndCrushedOre extends Item
{
    public IC_EndCrushedOre(int i)
    {
        super(i);
        maxStackSize = 64;
		setCreativeTab(NewEnd_Main.Tab_newend); //place in creative tabs
		this.setUnlocalizedName(Strings.IC_EndCrushedOre_NAME); //name of the block in texture folder
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
    
   

