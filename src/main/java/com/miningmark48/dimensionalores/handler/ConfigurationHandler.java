package com.miningmark48.dimensionalores.handler;

import com.miningmark48.dimensionalores.reference.Reference;
import com.miningmark48.mininglib.utility.ModTranslate;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static boolean add_nether_ores;
    public static boolean add_end_ores;
    public static boolean add_overworld_ores;
    
    public static boolean add_nether_aluminum;
    public static boolean add_nether_coal;
    public static boolean add_nether_cobalt;
    public static boolean add_nether_copper;
    public static boolean add_nether_diamond;
    public static boolean add_nether_emerald;
    public static boolean add_nether_gold;
    public static boolean add_nether_iron;
    public static boolean add_nether_lapis;
    public static boolean add_nether_lead;
    public static boolean add_nether_redstone;
    public static boolean add_nether_silver;
    public static boolean add_nether_sulfur;
    public static boolean add_nether_tin;
    public static boolean add_nether_titanium;
    public static boolean add_nether_uranium;
    public static boolean add_nether_zinc;
    
    public static boolean nether_ores_world_gen;
    

    public static boolean add_end_aluminum;
    public static boolean add_end_coal;
    public static boolean add_end_cobalt;
    public static boolean add_end_copper;
    public static boolean add_end_diamond;
    public static boolean add_end_emerald;
    public static boolean add_end_gold;
    public static boolean add_end_iron;
    public static boolean add_end_lapis;
    public static boolean add_end_lead;
    public static boolean add_end_quartz;
    public static boolean add_end_redstone;
    public static boolean add_end_silver;
    public static boolean add_end_sulfur;
    public static boolean add_end_tin;
    public static boolean add_end_titanium;
    public static boolean add_end_uranium;
    public static boolean add_end_zinc;

    public static boolean end_ores_world_gen;
    

    public static boolean add_overworld_aluminum;
    public static boolean add_overworld_cobalt;
    public static boolean add_overworld_copper;
    public static boolean add_overworld_lead;
    public static boolean add_overworld_quartz;
    public static boolean add_overworld_silver;
    public static boolean add_overworld_sulfur;
    public static boolean add_overworld_tin;
    public static boolean add_overworld_titanium;
    public static boolean add_overworld_uranium;
    public static boolean add_overworld_zinc;

    public static boolean overworld_ores_world_gen;

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


        configuration.addCustomCategoryComment(ModTranslate.toLocal("config.category.nether_ores.title"), ModTranslate.toLocal("config.category.nether_ores.desc"));
        configuration.addCustomCategoryComment(ModTranslate.toLocal("config.category.end_ores.title"), ModTranslate.toLocal("config.category.end_ores.desc"));
        configuration.addCustomCategoryComment(ModTranslate.toLocal("config.category.overworld_ores.title"), ModTranslate.toLocal("config.category.overworld_ores.desc"));
        configuration.addCustomCategoryComment(ModTranslate.toLocal("config.category.nether_ores_world_gen.title"), ModTranslate.toLocal("config.category.nether_ores_world_gen.desc"));
        configuration.addCustomCategoryComment(ModTranslate.toLocal("config.category.end_ores_world_gen.title"), ModTranslate.toLocal("config.category.end_ores_world_gen.desc"));
        configuration.addCustomCategoryComment(ModTranslate.toLocal("config.category.overworld_ores_world_gen.title"), ModTranslate.toLocal("config.category.overworld_ores_world_gen.desc"));



        configuration.setCategoryRequiresMcRestart(ModTranslate.toLocal("config.category.nether_ores.title"), true);
        configuration.setCategoryRequiresMcRestart(ModTranslate.toLocal("config.category.end_ores.title"), true);
        configuration.setCategoryRequiresMcRestart(ModTranslate.toLocal("config.category.overworld_ores.title"), true);
        
        //Nether
        add_nether_ores = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_ores.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_ores.desc"));
        add_nether_aluminum = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_aluminum.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_aluminum.desc"));
        add_nether_coal = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_coal.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_coal.desc"));
        add_nether_cobalt = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_cobalt.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_cobalt.desc"));
        add_nether_copper = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_copper.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_copper.desc"));
        add_nether_diamond = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_diamond.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_diamond.desc"));
        add_nether_emerald = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_emerald.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_emerald.desc"));
        add_nether_gold = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_gold.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_gold.desc"));
        add_nether_iron = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_iron.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_iron.desc"));
        add_nether_lapis = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_lapis.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_lapis.desc"));
        add_nether_lead = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_lead.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_lead.desc"));
        add_nether_redstone = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_redstone.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_redstone.desc"));
        add_nether_silver = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_silver.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_silver.desc"));
        add_nether_sulfur = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_sulfur.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_sulfur.desc"));
        add_nether_tin = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_tin.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_tin.desc"));
        add_nether_titanium = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_titanium.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_titanium.desc"));
        add_nether_uranium = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_uranium.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_uranium.desc"));
        add_nether_zinc = configuration.getBoolean(ModTranslate.toLocal("config.add_nether_zinc.title"), ModTranslate.toLocal("config.category.nether_ores.title"), true, ModTranslate.toLocal("config.add_nether_zinc.desc"));

        nether_ores_world_gen = configuration.getBoolean(ModTranslate.toLocal("config.nether_ores_world_gen.title"), ModTranslate.toLocal("config.category.nether_ores_world_gen.title"), true, ModTranslate.toLocal("config.nether_ores_world_gen.desc"));
        
        //End
        add_end_ores = configuration.getBoolean(ModTranslate.toLocal("config.add_end_ores.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_ores.desc"));
        add_end_aluminum = configuration.getBoolean(ModTranslate.toLocal("config.add_end_aluminum.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_aluminum.desc"));
        add_end_coal = configuration.getBoolean(ModTranslate.toLocal("config.add_end_coal.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_coal.desc"));
        add_end_cobalt = configuration.getBoolean(ModTranslate.toLocal("config.add_end_cobalt.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_cobalt.desc"));
        add_end_copper = configuration.getBoolean(ModTranslate.toLocal("config.add_end_copper.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_copper.desc"));
        add_end_diamond = configuration.getBoolean(ModTranslate.toLocal("config.add_end_diamond.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_diamond.desc"));
        add_end_emerald = configuration.getBoolean(ModTranslate.toLocal("config.add_end_emerald.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_emerald.desc"));
        add_end_gold = configuration.getBoolean(ModTranslate.toLocal("config.add_end_gold.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_gold.desc"));
        add_end_iron = configuration.getBoolean(ModTranslate.toLocal("config.add_end_iron.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_iron.desc"));
        add_end_lapis = configuration.getBoolean(ModTranslate.toLocal("config.add_end_lapis.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_lapis.desc"));
        add_end_lead = configuration.getBoolean(ModTranslate.toLocal("config.add_end_lead.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_lead.desc"));
        add_end_quartz = configuration.getBoolean(ModTranslate.toLocal("config.add_end_quartz.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_quartz.desc"));
        add_end_redstone = configuration.getBoolean(ModTranslate.toLocal("config.add_end_redstone.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_redstone.desc"));
        add_end_silver = configuration.getBoolean(ModTranslate.toLocal("config.add_end_silver.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_silver.desc"));
        add_end_sulfur = configuration.getBoolean(ModTranslate.toLocal("config.add_end_sulfur.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_sulfur.desc"));
        add_end_tin = configuration.getBoolean(ModTranslate.toLocal("config.add_end_tin.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_tin.desc"));
        add_end_titanium = configuration.getBoolean(ModTranslate.toLocal("config.add_end_titanium.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_titanium.desc"));
        add_end_uranium = configuration.getBoolean(ModTranslate.toLocal("config.add_end_uranium.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_uranium.desc"));
        add_end_zinc = configuration.getBoolean(ModTranslate.toLocal("config.add_end_zinc.title"), ModTranslate.toLocal("config.category.end_ores.title"), true, ModTranslate.toLocal("config.add_end_zinc.desc"));

        end_ores_world_gen = configuration.getBoolean(ModTranslate.toLocal("config.end_ores_world_gen.title"), ModTranslate.toLocal("config.category.end_ores_world_gen.title"), true, ModTranslate.toLocal("config.end_ores_world_gen.desc"));
        
        //Overworld
        add_overworld_ores = configuration.getBoolean(ModTranslate.toLocal("config.add_overworld_ores.title"), ModTranslate.toLocal("config.category.overworld_ores.title"), true, ModTranslate.toLocal("config.add_overworld_ores.desc"));
        add_overworld_aluminum = configuration.getBoolean(ModTranslate.toLocal("config.add_overworld_aluminum.title"), ModTranslate.toLocal("config.category.overworld_ores.title"), true, ModTranslate.toLocal("config.add_overworld_aluminum.desc"));
        add_overworld_cobalt = configuration.getBoolean(ModTranslate.toLocal("config.add_overworld_cobalt.title"), ModTranslate.toLocal("config.category.overworld_ores.title"), true, ModTranslate.toLocal("config.add_overworld_cobalt.desc"));
        add_overworld_copper = configuration.getBoolean(ModTranslate.toLocal("config.add_overworld_copper.title"), ModTranslate.toLocal("config.category.overworld_ores.title"), true, ModTranslate.toLocal("config.add_overworld_copper.desc"));
        add_overworld_lead = configuration.getBoolean(ModTranslate.toLocal("config.add_overworld_lead.title"), ModTranslate.toLocal("config.category.overworld_ores.title"), true, ModTranslate.toLocal("config.add_overworld_lead.desc"));
        add_overworld_quartz = configuration.getBoolean(ModTranslate.toLocal("config.add_overworld_quartz.title"), ModTranslate.toLocal("config.category.overworld_ores.title"), true, ModTranslate.toLocal("config.add_overworld_quartz.desc"));
        add_overworld_silver = configuration.getBoolean(ModTranslate.toLocal("config.add_overworld_silver.title"), ModTranslate.toLocal("config.category.overworld_ores.title"), true, ModTranslate.toLocal("config.add_overworld_silver.desc"));
        add_overworld_sulfur = configuration.getBoolean(ModTranslate.toLocal("config.add_overworld_sulfur.title"), ModTranslate.toLocal("config.category.overworld_ores.title"), true, ModTranslate.toLocal("config.add_overworld_sulfur.desc"));
        add_overworld_tin = configuration.getBoolean(ModTranslate.toLocal("config.add_overworld_tin.title"), ModTranslate.toLocal("config.category.overworld_ores.title"), true, ModTranslate.toLocal("config.add_overworld_tin.desc"));
        add_overworld_titanium = configuration.getBoolean(ModTranslate.toLocal("config.add_overworld_titanium.title"), ModTranslate.toLocal("config.category.overworld_ores.title"), true, ModTranslate.toLocal("config.add_overworld_titanium.desc"));
        add_overworld_uranium = configuration.getBoolean(ModTranslate.toLocal("config.add_overworld_uranium.title"), ModTranslate.toLocal("config.category.overworld_ores.title"), true, ModTranslate.toLocal("config.add_overworld_uranium.desc"));
        add_overworld_zinc = configuration.getBoolean(ModTranslate.toLocal("config.add_overworld_zinc.title"), ModTranslate.toLocal("config.category.overworld_ores.title"), true, ModTranslate.toLocal("config.add_overworld_zinc.desc"));

        overworld_ores_world_gen = configuration.getBoolean(ModTranslate.toLocal("config.overworld_ores_world_gen.title"), ModTranslate.toLocal("config.category.overworld_ores_world_gen.title"), true, ModTranslate.toLocal("config.overworld_ores_world_gen.desc"));
        
        
        
        if (configuration.hasChanged()){
            configuration.save();
        }

    }

}
