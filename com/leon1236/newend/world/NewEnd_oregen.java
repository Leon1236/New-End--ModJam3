package com.leon1236.newend.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.leon1236.newend.blocks.EndBlocks;
import com.leon1236.newend.blocks.EndVanillaBlocks;

import cpw.mods.fml.common.IWorldGenerator;

public class NewEnd_oregen implements IWorldGenerator
{
       public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
       {
    	   switch(world.provider.dimensionId)
           {
                  case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
                  case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
                  case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
           }
     }
       
     //Ore generation in End
     private void generateEnd(World world, Random random, int x, int z){
    	 
    	 int Xcoord = x + random.nextInt(16);
    	 int Ycoord = 10 + random.nextInt(128);
    	 int Zcoord = z + random.nextInt(16);
    	 
    	 (new NewEnd_oregenhelper(EndBlocks.BlockEndOre.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
    	 
    	 (new NewEnd_oregenhelper(EndVanillaBlocks.BlockEndCoalOre.blockID, 15)).generate(world, random, Xcoord, Ycoord, Zcoord);
    	 (new NewEnd_oregenhelper(EndVanillaBlocks.BlockEndRedstoneOre.blockID, 15)).generate(world, random, Xcoord, Ycoord, Zcoord);
    	 (new NewEnd_oregenhelper(EndVanillaBlocks.BlockEndLapisOre.blockID, 13)).generate(world, random, Xcoord, Ycoord, Zcoord);
    	 (new NewEnd_oregenhelper(EndVanillaBlocks.BlockEndQuartzOre.blockID, 15)).generate(world, random, Xcoord, Ycoord, Zcoord);
    	 (new NewEnd_oregenhelper(EndVanillaBlocks.BlockEndIronOre.blockID, 15)).generate(world, random, Xcoord, Ycoord, Zcoord);
    	 (new NewEnd_oregenhelper(EndVanillaBlocks.BlockEndGoldOre.blockID, 15)).generate(world, random, Xcoord, Ycoord, Zcoord);
    	 (new NewEnd_oregenhelper(EndVanillaBlocks.BlockEndDiamondOre.blockID, 15)).generate(world, random, Xcoord, Ycoord, Zcoord);
    	 (new NewEnd_oregenhelper(EndVanillaBlocks.BlockEndEmeraldOre.blockID, 15)).generate(world, random, Xcoord, Ycoord, Zcoord);
    	 
    	 
          
    	 for (int i = 0; i < 4; i++){
             int Xcoord1 = x + random.nextInt(16); //where in chuck it generates
             int Ycoord1 = 10 + random.nextInt(128); //how high it generates
             int Zcoord1 = z + random.nextInt(16); //where in chunk it generates
            
             new WorldEndTreeGen(false, 4, 0, 0, false).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
            
     }
     }
     
      //Ore generation in Overworld
     private void generateSurface(World world, Random random, int x, int z) {
    	
     }
     
     //Ore generation in Nether
     private void generateNether(World world, Random random, int x, int z){
    	
          
     }
     
    
     public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
     {
           int maxPossY = minY + (maxY - 1);
           assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
           assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
           assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
           assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
           assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
          
           int diffBtwnMinMaxY = maxY - minY;
           for(int x = 0; x < chancesToSpawn; x++)
           {
                  int posX = blockXPos + random.nextInt(maxX);
                  int posY = minY + random.nextInt(diffBtwnMinMaxY);
                  int posZ = blockZPos + random.nextInt(maxZ);
                  (new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
           }
     }
}
