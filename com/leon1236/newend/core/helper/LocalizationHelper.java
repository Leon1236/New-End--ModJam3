package com.leon1236.newend.core.helper;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHelper {

        /**
         * Checks if the file is a xml-file, by checking it's extention
         * @param filename
         *                         The name of the file
         * @return boolean
         *                         True when xml, false if not
         */
        public static boolean isXMLFile(String filename){
                
                return filename.endsWith(".xml");
        }
        
        /**
         * Gets the language from the file name. This will return something like en_US
         * @param filename
         *                         The name of the file
         * @return String
         *                         Substring, only the language part of the file
         */
        public static String getLocaleFromFileName(String fileName){
                
        	return fileName.substring(fileName.lastIndexOf("/") + 1, fileName.lastIndexOf("."));
        }
        
        /**
         * Get's the ingame-name from the key
         * @param key
         *                         Key inside the languagefile
         * @return String
         *                         Ingame-name
         */
        public static String getLocalizationString(String key){
                
        	return LanguageRegistry.instance().getStringLocalization(key);
        }
}