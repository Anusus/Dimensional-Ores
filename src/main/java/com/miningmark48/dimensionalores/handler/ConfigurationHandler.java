package com.miningmark48.dimensionalores.handler;

import com.miningmark48.dimensionalores.reference.Reference;
import com.miningmark48.dimensionalores.utility.Translate;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static boolean add_nether_ores;
    public static boolean add_end_ores;
    public static boolean add_overworld_ores;

    public static void init(File configFile){

        //Create the configuration object from the given configuration file
        if (configuration == null){
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){

        if (event.getModID().equalsIgnoreCase(Reference.MOD_ID)){
            loadConfiguration();
        }

    }

    private static void loadConfiguration(){


        configuration.addCustomCategoryComment(Translate.toLocal("config.category.nether_ores.title"), Translate.toLocal("config.category.nether_ores.desc"));
        configuration.addCustomCategoryComment(Translate.toLocal("config.category.end_ores.title"), Translate.toLocal("config.category.end_ores.desc"));
        configuration.addCustomCategoryComment(Translate.toLocal("config.category.overworld_ores.title"), Translate.toLocal("config.category.overworld_ores.desc"));

        configuration.setCategoryRequiresMcRestart(Translate.toLocal("config.category.nether_ores.title"), true);
        configuration.setCategoryRequiresMcRestart(Translate.toLocal("config.category.end_ores.title"), true);
        configuration.setCategoryRequiresMcRestart(Translate.toLocal("config.category.overworld_ores.title"), true);

        add_nether_ores = configuration.getBoolean(Translate.toLocal("config.add_nether_ores.title"), Translate.toLocal("config.category.nether_ores.title"), true, Translate.toLocal("config.add_nether_ores.desc"));
        add_end_ores = configuration.getBoolean(Translate.toLocal("config.add_end_ores.title"), Translate.toLocal("config.category.end_ores.title"), true, Translate.toLocal("config.add_end_ores.desc"));
        add_overworld_ores = configuration.getBoolean(Translate.toLocal("config.add_overworld_ores.title"), Translate.toLocal("config.category.overworld_ores.title"), true, Translate.toLocal("config.add_overworld_ores.desc"));


        if (configuration.hasChanged()){
            configuration.save();
        }

    }

}
