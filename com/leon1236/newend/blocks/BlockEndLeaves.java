package com.leon1236.newend.blocks;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEndLeaves extends BlockLeavesBase implements IShearable {


	public BlockEndLeaves(int id) {
		
		    super(id, Material.leaves, false);
			this.setStepSound(Block.soundGrassFootstep);
			this.setHardness(0.7F);
			this.setTickRandomly(true);
			this.setResistance(100.0F);
			setCreativeTab(NewEnd_Main.Tab_newend); //place in creative tabs
			this.setUnlocalizedName(Strings.BlockEndLeaves_NAME); //name of the block in texture folder
			}
	
	//Color of the leaves
	@SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
        double d0 = -1.0D;
        return ColorizerFoliage.getFoliageColor(d0, d0);
    }
	
	// Returns the color this block should be rendered. Used by leaves
    @SideOnly(Side.CLIENT)
        public int getRenderColor(int par1)
    {
        return (par1 & 3) == 1 ? ColorizerFoliage.getFoliageColorPine() : ((par1 & 3) == 2 ? ColorizerFoliage.getFoliageColorBirch() : ColorizerFoliage.getFoliageColorBasic());
    }
	
    //Returns the quantity of items to drop on block destruction.
    public int quantityDropped(Random par1Random)
   {
       return par1Random.nextInt(20) == 0 ? 1 : 0;
   }
   
   //Returns the ID of the items to drop on destruction.
    public int idDropped(int par1, Random par2Random, int par3)
    {
      return Block.sapling.blockID;
    }
  
    /*Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
    block and l is the block's subtype/damage.
    */
    public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
    {
     super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
    }
 
    /* Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
    * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
    */
    public boolean isOpaqueCube()
    {
    return false;
    }
    
    //Something
    @Override
    public boolean isShearable(ItemStack item, World world, int x, int y, int z)
    {
    return true;
    }

    //Something
    @Override
    public void beginLeavesDecay(World world, int x, int y, int z)
    {
    world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
    }
    
    //Something
    @Override
    public boolean isLeaves(World world, int x, int y, int z)
    {
    return true;
    }
    
    //Loads texture for the block
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){

    	blockIcon = iconRegister.registerIcon(String.format("%s:%s", References.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){

    	return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
    
    //Something
    @Override
    public ArrayList<ItemStack> onSheared(ItemStack item, World world, int x,
		int y, int z, int fortune) {
	
	return null;
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