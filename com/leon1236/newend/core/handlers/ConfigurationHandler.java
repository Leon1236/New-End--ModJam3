package com.leon1236.newend.core.handlers;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.leon1236.newend.core.helper.WorldGenHelper;
import com.leon1236.newend.lib.Block_ID;
import com.leon1236.newend.lib.Item_ID;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {

        static Configuration config = new Configuration();
        
        public static void init (File file){
        
                config = new Configuration(file);
                
                try{
                        
                        config.load();
                        
                        //Blocks
                        Block_ID.BlockEndBlock_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndBlock_NAME, Block_ID.BlockEndBlock_ID_DEFAULT).getInt(Block_ID.BlockEndBlock_ID_DEFAULT);
                        Block_ID.BlockEndBrick_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndBrick_NAME, Block_ID.BlockEndBrick_ID_DEFAULT).getInt(Block_ID.BlockEndBrick_ID_DEFAULT);
                        Block_ID.BlockEndLeaves_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndLeaves_NAME, Block_ID.BlockEndLeaves_ID_DEFAULT).getInt(Block_ID.BlockEndLeaves_ID_DEFAULT);
                        Block_ID.BlockEndOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndOre_NAME, Block_ID.BlockEndOre_ID_DEFAULT).getInt(Block_ID.BlockEndOre_ID_DEFAULT);
                        Block_ID.BlockEndPlank_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndPlank_NAME, Block_ID.BlockEndPlank_ID_DEFAULT).getInt(Block_ID.BlockEndPlank_ID_DEFAULT);
                        Block_ID.BlockEndWood_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndWood_NAME, Block_ID.BlockEndWood_ID_DEFAULT).getInt(Block_ID.BlockEndWood_ID_DEFAULT);
                        
                        
                        //End Vanilla ores
                        Block_ID.BlockEndCoalOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndCoalOre_NAME, Block_ID.BlockEndCoalOre_ID_DEFAULT).getInt(Block_ID.BlockEndCoalOre_ID_DEFAULT);
                        Block_ID.BlockEndRedstoneOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndRedstoneOre_NAME, Block_ID.BlockEndRedstoneOre_ID_DEFAULT).getInt(Block_ID.BlockEndRedstoneOre_ID_DEFAULT);
                        Block_ID.BlockEndLapisOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndLapisOre_NAME, Block_ID.BlockEndLapisOre_ID_DEFAULT).getInt(Block_ID.BlockEndLapisOre_ID_DEFAULT);
                        Block_ID.BlockEndQuartzOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndQuartzOre_NAME, Block_ID.BlockEndQuartzOre_ID_DEFAULT).getInt(Block_ID.BlockEndQuartzOre_ID_DEFAULT);
                        Block_ID.BlockEndIronOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndIronOre_NAME, Block_ID.BlockEndIronOre_ID_DEFAULT).getInt(Block_ID.BlockEndIronOre_ID_DEFAULT);
                        Block_ID.BlockEndGoldOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndGoldOre_NAME, Block_ID.BlockEndGoldOre_ID_DEFAULT).getInt(Block_ID.BlockEndGoldOre_ID_DEFAULT);
                        Block_ID.BlockEndDiamondOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndDiamondOre_NAME, Block_ID.BlockEndDiamondOre_ID_DEFAULT).getInt(Block_ID.BlockEndDiamondOre_ID_DEFAULT);
                        Block_ID.BlockEndEmeraldOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndEmeraldOre_NAME, Block_ID.BlockEndEmeraldOre_ID_DEFAULT).getInt(Block_ID.BlockEndEmeraldOre_ID_DEFAULT);
                        
                        //End IC2 Ores
                        Block_ID.BlockEndCopperOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndCopperOre_NAME, Block_ID.BlockEndCopperOre_ID_DEFAULT).getInt(Block_ID.BlockEndCopperOre_ID_DEFAULT);
                        Block_ID.BlockEndTinOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndTinOre_NAME, Block_ID.BlockEndTinOre_ID_DEFAULT).getInt(Block_ID.BlockEndTinOre_ID_DEFAULT);
                        Block_ID.BlockEndLeadOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndLeadOre_NAME, Block_ID.BlockEndLeadOre_ID_DEFAULT).getInt(Block_ID.BlockEndLeadOre_ID_DEFAULT);
                        Block_ID.BlockEndBronzeOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndBronzeOre_NAME, Block_ID.BlockEndBronzeOre_ID_DEFAULT).getInt(Block_ID.BlockEndBronzeOre_ID_DEFAULT);
                        Block_ID.BlockEndUraniumOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndUraniumOre_NAME, Block_ID.BlockEndUraniumOre_ID_DEFAULT).getInt(Block_ID.BlockEndUraniumOre_ID_DEFAULT);
                     
                        //End Forestry Ores
                        Block_ID.BlockEndApatiteOre_ID = config.get(config.CATEGORY_BLOCK, Strings.BlockEndApatiteOre_NAME, Block_ID.BlockEndApatiteOre_ID_DEFAULT).getInt(Block_ID.BlockEndApatiteOre_ID_DEFAULT);
 
                        //Tools
                        Item_ID.EndAxe_ID = config.get(config.CATEGORY_ITEM, Strings.EndAxe_NAME, Item_ID.EndAxe_ID_DEFAULT).getInt(Item_ID.EndAxe_ID_DEFAULT);
                        Item_ID.EndHoe_ID = config.get(config.CATEGORY_ITEM, Strings.EndHoe_NAME, Item_ID.EndHoe_ID_DEFAULT).getInt(Item_ID.EndHoe_ID_DEFAULT);
                        Item_ID.EndPickaxe_ID = config.get(config.CATEGORY_ITEM, Strings.EndPickaxe_NAME, Item_ID.EndPickaxe_ID_DEFAULT).getInt(Item_ID.EndPickaxe_ID_DEFAULT);
                        Item_ID.EndShovel_ID = config.get(config.CATEGORY_ITEM, Strings.EndShovel_NAME, Item_ID.EndShovel_ID_DEFAULT).getInt(Item_ID.EndShovel_ID_DEFAULT);
                        Item_ID.EndSword_ID = config.get(config.CATEGORY_ITEM, Strings.EndSword_NAME, Item_ID.EndSword_ID_DEFAULT).getInt(Item_ID.EndSword_ID_DEFAULT);
                      
                        //Items
                        Item_ID.ItemEndCoal_ID = config.get(config.CATEGORY_ITEM, Strings.ItemEndCoal_NAME, Item_ID.ItemEndCoal_ID_DEFAULT).getInt(Item_ID.ItemEndCoal_ID_DEFAULT);
                        Item_ID.ItemEndIngot_ID = config.get(config.CATEGORY_ITEM, Strings.ItemEndIngot_NAME, Item_ID.ItemEndIngot_ID_DEFAULT).getInt(Item_ID.ItemEndIngot_ID_DEFAULT);
                        Item_ID.ItemEndStick_ID = config.get(config.CATEGORY_ITEM, Strings.ItemEndStick_NAME, Item_ID.ItemEndStick_ID_DEFAULT).getInt(Item_ID.ItemEndStick_ID_DEFAULT);
                        Item_ID.ItemEndString_ID = config.get(config.CATEGORY_ITEM, Strings.ItemEndString_NAME, Item_ID.ItemEndString_ID_DEFAULT).getInt(Item_ID.ItemEndString_ID_DEFAULT);
                        Item_ID.ItemEndCharcoal_ID = config.get(config.CATEGORY_ITEM, Strings.ItemEndCharcoal_NAME, Item_ID.ItemEndCharcoal_ID_DEFAULT).getInt(Item_ID.ItemEndCharcoal_ID_DEFAULT);
                        
                        //Armor
                        Item_ID.ItemEndArmor_Helmet_ID = config.get(config.CATEGORY_ITEM, Strings.ItemEndArmor_Helmet_NAME, Item_ID.ItemEndArmor_Helmet_ID_DEFAULT).getInt(Item_ID.ItemEndArmor_Helmet_ID_DEFAULT);
                        Item_ID.ItemEndArmor_Chestplate_ID = config.get(config.CATEGORY_ITEM, Strings.ItemEndArmor_Chestplate_NAME, Item_ID.ItemEndArmor_Chestplate_ID_DEFAULT).getInt(Item_ID.ItemEndArmor_Chestplate_ID_DEFAULT);
                        Item_ID.ItemEndArmor_Leggings_ID = config.get(config.CATEGORY_ITEM, Strings.ItemEndArmor_Leggings_NAME, Item_ID.ItemEndArmor_Leggings_ID_DEFAULT).getInt(Item_ID.ItemEndArmor_Leggings_ID_DEFAULT);
                        Item_ID.ItemEndArmor_Boots_ID = config.get(config.CATEGORY_ITEM, Strings.ItemEndArmor_Boots_NAME, Item_ID.ItemEndArmor_Boots_ID_DEFAULT).getInt(Item_ID.ItemEndArmor_Boots_ID_DEFAULT);
                        
                        
                      //WORLD GEN
            			WorldGenHelper.WORLDGEN_BlockEndCoalOre = config.get("End World Generation", "End Coal Ore", WorldGenHelper.WORLDGEN_BlockEndCoalOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndCoalOre_DEFAULT);
            			WorldGenHelper.WORLDGEN_BlockEndRedstoneOre = config.get("End World Generation", "End Redstone Ore", WorldGenHelper.WORLDGEN_BlockEndRedstoneOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndRedstoneOre_DEFAULT);
            			WorldGenHelper.WORLDGEN_BlockEndLapisOre = config.get("End World Generation", "End Lapis Ore", WorldGenHelper.WORLDGEN_BlockEndLapisOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndLapisOre_DEFAULT);
            			WorldGenHelper.WORLDGEN_BlockEndQuartzOre = config.get("End World Generation", "End Quartz Ore", WorldGenHelper.WORLDGEN_BlockEndQuartzOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndQuartzOre_DEFAULT);
            			WorldGenHelper.WORLDGEN_BlockEndIronOre = config.get("End World Generation", "End Iron Ore", WorldGenHelper.WORLDGEN_BlockEndIronOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndIronOre_DEFAULT);
            			WorldGenHelper.WORLDGEN_BlockEndGoldOre = config.get("End World Generation", "End Gold Ore", WorldGenHelper.WORLDGEN_BlockEndGoldOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndGoldOre_DEFAULT);
            			WorldGenHelper.WORLDGEN_BlockEndDiamondOre = config.get("End World Generation", "End Diamond Ore", WorldGenHelper.WORLDGEN_BlockEndDiamondOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndDiamondOre_DEFAULT);
            			WorldGenHelper.WORLDGEN_BlockEndEmeraldOre = config.get("End World Generation", "End Emerald Ore", WorldGenHelper.WORLDGEN_BlockEndEmeraldOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndEmeraldOre_DEFAULT);
            			
            			WorldGenHelper.WORLDGEN_BlockEndCopperOre = config.get("IC2 End World Generation", "End Copper Ore", WorldGenHelper.WORLDGEN_BlockEndCopperOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndCopperOre_DEFAULT);
            			WorldGenHelper.WORLDGEN_BlockEndTinOre = config.get("IC2 End World Generation", "End Tin Ore", WorldGenHelper.WORLDGEN_BlockEndTinOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndTinOre_DEFAULT);
            			WorldGenHelper.WORLDGEN_BlockEndLeadOre = config.get("IC2 End World Generation", "End Lead Ore", WorldGenHelper.WORLDGEN_BlockEndLeadOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndLeadOre_DEFAULT);
            			WorldGenHelper.WORLDGEN_BlockEndBronzeOre = config.get("IC2 End World Generation", "End Bronze Ore", WorldGenHelper.WORLDGEN_BlockEndBronzeOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndBronzeOre_DEFAULT);
            			WorldGenHelper.WORLDGEN_BlockEndUraniumOre = config.get("IC2 End World Generation", "End Uranium Ore", WorldGenHelper.WORLDGEN_BlockEndUraniumOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndUraniumOre_DEFAULT);
                        
            			WorldGenHelper.WORLDGEN_BlockEndApatiteOre = config.get("Forestry End World Generation", "End Apatite Ore", WorldGenHelper.WORLDGEN_BlockEndApatiteOre_DEFAULT).getBoolean(WorldGenHelper.WORLDGEN_BlockEndApatiteOre_DEFAULT);
                        
                        
                }
                
                catch(Exception e){
                        
                        FMLLog.log(Level.SEVERE, e, References.MOD_ID + " has trouble loading the config");
                }
                
                finally{
                        
                        config.save();
                }
        }
}