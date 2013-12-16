package com.leon1236.newend.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEndOre extends Block {

	public BlockEndOre(int id) {
		
			super(id, Material.rock);
			this.setStepSound(Block.soundStoneFootstep);
			this.setHardness(12.0F);
			this.setResistance(15.0F);
			setCreativeTab(NewEnd_Main.Tab_newend); //place in creative tabs
			this.setUnlocalizedName(Strings.BlockEndOre_NAME); //name of the block in texture folder
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
    return com.leon1236.newend.blocks.EndBlocks.BlockEndOre.blockID;
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
    
  //The BlockEndOre ore sparkles.
    public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        this.glow(par1World, par2, par3, par4);
        super.onBlockClicked(par1World, par2, par3, par4, par5EntityPlayer);
    }
    private void glow(World par1World, int par2, int par3, int par4)
    {
        this.sparkle(par1World, par2, par3, par4);

    }
    
	@SideOnly(Side.CLIENT)

    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
            this.sparkle(par1World, par2, par3, par4);
        }
        
    private void sparkle(World par1World, int par2, int par3, int par4)
        {
            Random random = par1World.rand;
            double d0 = 0.0625D;

            for (int l = 0; l < 6; ++l)
            {
                double d1 = (double)((float)par2 + random.nextFloat());
                double d2 = (double)((float)par3 + random.nextFloat());
                double d3 = (double)((float)par4 + random.nextFloat());

                if (l == 0 && !par1World.isBlockOpaqueCube(par2, par3 + 1, par4))
                {
                    d2 = (double)(par3 + 1) + d0;
                }

                if (l == 1 && !par1World.isBlockOpaqueCube(par2, par3 - 1, par4))
                {
                    d2 = (double)(par3 + 0) - d0;
                }

                if (l == 2 && !par1World.isBlockOpaqueCube(par2, par3, par4 + 1))
                {
                    d3 = (double)(par4 + 1) + d0;
                }

                if (l == 3 && !par1World.isBlockOpaqueCube(par2, par3, par4 - 1))
                {
                    d3 = (double)(par4 + 0) - d0;
                }

                if (l == 4 && !par1World.isBlockOpaqueCube(par2 + 1, par3, par4))
                {
                    d1 = (double)(par2 + 1) + d0;
                }

                if (l == 5 && !par1World.isBlockOpaqueCube(par2 - 1, par3, par4))
                {
                    d1 = (double)(par2 + 0) - d0;
                }

                if (d1 < (double)par2 || d1 > (double)(par2 + 1) || d2 < 0.0D || d2 > (double)(par3 + 1) || d3 < (double)par4 || d3 > (double)(par4 + 1))
                {
                    par1World.spawnParticle("portal", d1, d2, d3, 0.0D, 0.0D, 0.0D);
                  
                }
            }
        }
    
    
}
 
			 
	