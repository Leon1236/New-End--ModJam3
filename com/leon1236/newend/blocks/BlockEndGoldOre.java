package com.leon1236.newend.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEndGoldOre extends Block {

	public BlockEndGoldOre(int id) {
		
			super(id, Material.rock);
			this.setStepSound(Block.soundStoneFootstep);
			this.setHardness(12.0F);
			this.setResistance(15.0F);
			setCreativeTab(NewEnd_Main.Tab_newend); //place in creative tabs
			this.setUnlocalizedName(Strings.BlockEndGoldOre_NAME); //name of the block in texture folder
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
        return com.leon1236.newend.blocks.EndVanillaBlocks.BlockEndGoldOre.blockID;
    }
    public int quantityDropped(Random random)
			{
    return 1;
   }
    

    //Determined if dragon can destroy this block
    public boolean canDragonDestroy(World world, int x, int y, int z)
    {
        return false;
    }
}