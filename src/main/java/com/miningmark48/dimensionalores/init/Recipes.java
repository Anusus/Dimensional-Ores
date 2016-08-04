package com.miningmark48.dimensionalores.init;

import com.miningmark48.dimensionalores.handler.ConfigurationHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {

    public static void init(){
        if(ConfigurationHandler.add_nether_ores) {
            GameRegistry.addSmelting(new ItemStack(ModBlocks.nether_coal), new ItemStack(Items.COAL), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.nether_iron), new ItemStack(Items.IRON_INGOT), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.nether_gold), new ItemStack(Items.GOLD_INGOT), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.nether_diamond), new ItemStack(Items.DIAMOND), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.nether_emerald), new ItemStack(Items.EMERALD), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.nether_redstone), new ItemStack(Items.REDSTONE), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.nether_lapis), new ItemStack(Items.DYE, 1, 4), 1.25f);
        }

        if(ConfigurationHandler.add_end_ores) {
            GameRegistry.addSmelting(new ItemStack(ModBlocks.end_coal), new ItemStack(Items.COAL), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.end_iron), new ItemStack(Items.IRON_INGOT), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.end_gold), new ItemStack(Items.GOLD_INGOT), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.end_diamond), new ItemStack(Items.DIAMOND), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.end_emerald), new ItemStack(Items.EMERALD), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.end_redstone), new ItemStack(Items.REDSTONE), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.end_lapis), new ItemStack(Items.DYE, 1, 4), 1.25f);
            GameRegistry.addSmelting(new ItemStack(ModBlocks.end_quartz), new ItemStack(Items.DYE, 1, 4), 1.25f);
        }

        if(ConfigurationHandler.add_overworld_ores){
            GameRegistry.addSmelting(new ItemStack(ModBlocks.overworld_quartz), new ItemStack(Items.QUARTZ), 1.25f);
        }
        
    }

}
