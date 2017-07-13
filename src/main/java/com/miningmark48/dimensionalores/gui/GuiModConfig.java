package com.miningmark48.dimensionalores.gui;

import com.miningmark48.dimensionalores.handler.ConfigurationHandler;
import com.miningmark48.dimensionalores.reference.Reference;
import com.miningmark48.mininglib.utility.ModTranslate;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import scala.actors.threadpool.Arrays;

public class GuiModConfig extends GuiConfig {
    public GuiModConfig(GuiScreen guiScreen){
        super(guiScreen,
                Arrays.asList(new IConfigElement[]{
                        new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)),
                        new ConfigElement(ConfigurationHandler.configuration.getCategory(ModTranslate.toLocal("config.category.nether_ores.title").toLowerCase())),
                        new ConfigElement(ConfigurationHandler.configuration.getCategory(ModTranslate.toLocal("config.category.end_ores.title").toLowerCase())),
                        new ConfigElement(ConfigurationHandler.configuration.getCategory(ModTranslate.toLocal("config.category.overworld_ores.title").toLowerCase())),
                        new ConfigElement(ConfigurationHandler.configuration.getCategory(ModTranslate.toLocal("config.category.overworld_ores_world_gen.title").toLowerCase())),
                        new ConfigElement(ConfigurationHandler.configuration.getCategory(ModTranslate.toLocal("config.category.end_ores_world_gen.title").toLowerCase())),
                        new ConfigElement(ConfigurationHandler.configuration.getCategory(ModTranslate.toLocal("config.category.nether_ores_world_gen.title").toLowerCase()))
                }),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
