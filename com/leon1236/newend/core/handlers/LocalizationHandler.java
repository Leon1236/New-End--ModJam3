package com.leon1236.newend.core.handlers;

import com.leon1236.newend.core.helper.LocalizationHelper;
import com.leon1236.newend.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
        
        public static void init(){
        
                /* For every file in Localizations.java, do*/
                for(String LocalizationFile : Localizations.localeFiles){
                        
                        LanguageRegistry.instance().loadLocalization(LocalizationFile, LocalizationHelper.getLocaleFromFileName(LocalizationFile), LocalizationHelper.isXMLFile(LocalizationFile));
                }
        }
}