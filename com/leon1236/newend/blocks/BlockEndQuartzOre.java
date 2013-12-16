package com.leon1236.newend.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEndQuartzOre extends Block {

	public BlockEndQuartzOre(int id) {
		
			super(id, Material.rock);
			this.setStepSound(Block.soundStoneFootstep);
			this.setHardness(12.0F);
			this.setResistance(15.0F);
			setCreativeTab(NewEnd_Main.Tab_newend); //place in creative tabs
			this.setUnlocalizedName(Strings.BlockEndQuartzOre_NAME); //name of the block in texture folder
			}

	//Loads texture
		@Override
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister iconRegister){

		blockIcon = iconRegister.registerIcon(String.format("%s:%s", References.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
		}

		protected String getUnwrappedUnlocalizedName(String unlocalizedName){

		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
		}
    
	//drops when broken with pickaxe
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return Item.netherQuartz.itemID;
    }

    
     //Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        return this.quantityDropped(par2Random) + par2Random.nextInt(par1 + 1);
    }

     //Returns the quantity of items to drop on block destruction.
    public int quantityDropped(Random par1Random)
    {
        return 4 + par1Random.nextInt(2);
    }
    

    //Determined if dragon can destroy this block
    public boolean canDragonDestroy(World world, int x, int y, int z)
    {
        return false;
    }
}