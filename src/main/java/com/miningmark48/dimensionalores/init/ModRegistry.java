package com.miningmark48.dimensionalores.init;

import com.miningmark48.dimensionalores.handler.ConfigurationHandler;
import com.miningmark48.mininglib.base.item.ModItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.LinkedList;
import java.util.List;

public class ModRegistry {

    private static List<Item> itemsToRegister = new LinkedList<>();
    private static List<Block> blocksToRegister = new LinkedList<>();

    public static void init(){
        registerItems();
        registerBlocks();
    }

    private static void registerItems(){
        registerItem(ModItems.ingot_aluminium);
        registerItem(ModItems.ingot_cobalt);
        registerItem(ModItems.ingot_copper);
        registerItem(ModItems.ingot_lead);
        registerItem(ModItems.ingot_silver);
        registerItem(ModItems.ingot_tin);
        registerItem(ModItems.ingot_titanium);
        registerItem(ModItems.ingot_uranium);
        registerItem(ModItems.ingot_zinc);
    }

    private static void registerBlocks(){
        if (ConfigurationHandler.add_nether_ores){
            if(ConfigurationHandler.add_nether_coal) {
                registerBlock(ModBlocks.nether_coal);
            }
            if(ConfigurationHandler.add_nether_iron) {
                registerBlock(ModBlocks.nether_iron);
            }
            if(ConfigurationHandler.add_nether_gold) {
                registerBlock(ModBlocks.nether_gold);
            }
            if(ConfigurationHandler.add_nether_diamond) {
                registerBlock(ModBlocks.nether_diamond);
            }
            if(ConfigurationHandler.add_nether_emerald) {
                registerBlock(ModBlocks.nether_emerald);
            }
            if(ConfigurationHandler.add_nether_lapis) {
                registerBlock(ModBlocks.nether_lapis);
            }
            if(ConfigurationHandler.add_nether_redstone) {
                registerBlock(ModBlocks.nether_redstone);
            }

            if(ConfigurationHandler.add_nether_aluminum) {
                registerBlock(ModBlocks.nether_aluminium);
            }
            if(ConfigurationHandler.add_nether_cobalt) {
                registerBlock(ModBlocks.nether_cobalt);
            }
            if(ConfigurationHandler.add_nether_copper) {
                registerBlock(ModBlocks.nether_copper);
            }
            if(ConfigurationHandler.add_nether_lead) {
                registerBlock(ModBlocks.nether_lead);
            }
            if(ConfigurationHandler.add_nether_silver) {
                registerBlock(ModBlocks.nether_silver);
            }
            if(ConfigurationHandler.add_nether_sulfur) {
                registerBlock(ModBlocks.nether_sulfur);
            }
            if(ConfigurationHandler.add_nether_tin) {
                registerBlock(ModBlocks.nether_tin);
            }
            if(ConfigurationHandler.add_nether_titanium) {
                registerBlock(ModBlocks.nether_titanium);
            }
            if(ConfigurationHandler.add_nether_uranium) {
                registerBlock(ModBlocks.nether_uranium);
            }
            if(ConfigurationHandler.add_nether_zinc) {
                registerBlock(ModBlocks.nether_zinc);
            }
        }
        if (ConfigurationHandler.add_end_ores){
            if(ConfigurationHandler.add_end_coal) {
                registerBlock(ModBlocks.end_coal);
            }
            if(ConfigurationHandler.add_end_iron) {
                registerBlock(ModBlocks.end_iron);
            }
            if(ConfigurationHandler.add_end_gold) {
                registerBlock(ModBlocks.end_gold);
            }
            if(ConfigurationHandler.add_end_diamond) {
                registerBlock(ModBlocks.end_diamond);
            }
            if(ConfigurationHandler.add_end_emerald) {
                registerBlock(ModBlocks.end_emerald);
            }
            if(ConfigurationHandler.add_end_lapis) {
                registerBlock(ModBlocks.end_lapis);
            }
            if(ConfigurationHandler.add_end_redstone) {
                registerBlock(ModBlocks.end_redstone);
            }

            if(ConfigurationHandler.add_end_aluminum) {
                registerBlock(ModBlocks.end_aluminium);
            }
            if(ConfigurationHandler.add_end_cobalt) {
                registerBlock(ModBlocks.end_cobalt);
            }
            if(ConfigurationHandler.add_end_copper) {
                registerBlock(ModBlocks.end_copper);
            }
            if(ConfigurationHandler.add_end_lead) {
                registerBlock(ModBlocks.end_lead);
            }
            if(ConfigurationHandler.add_end_quartz) {
                registerBlock(ModBlocks.end_quartz);
            }
            if(ConfigurationHandler.add_end_silver) {
                registerBlock(ModBlocks.end_silver);
            }
            if(ConfigurationHandler.add_end_sulfur) {
                registerBlock(ModBlocks.end_sulfur);
            }
            if(ConfigurationHandler.add_end_tin) {
                registerBlock(ModBlocks.end_tin);
            }
            if(ConfigurationHandler.add_end_titanium) {
                registerBlock(ModBlocks.end_titanium);
            }
            if(ConfigurationHandler.add_end_uranium) {
                registerBlock(ModBlocks.end_uranium);
            }
            if(ConfigurationHandler.add_end_zinc) {
                registerBlock(ModBlocks.end_zinc);
            }
        }
        if (ConfigurationHandler.add_overworld_ores){
            if(ConfigurationHandler.add_overworld_quartz) {
                registerBlock(ModBlocks.overworld_quartz);
            }

            if(ConfigurationHandler.add_overworld_aluminum) {
                registerBlock(ModBlocks.overworld_aluminium);
            }
            if(ConfigurationHandler.add_overworld_cobalt) {
                registerBlock(ModBlocks.overworld_cobalt);
            }
            if(ConfigurationHandler.add_overworld_copper) {
                registerBlock(ModBlocks.overworld_copper);
            }
            if(ConfigurationHandler.add_overworld_lead) {
                registerBlock(ModBlocks.overworld_lead);
            }
            if(ConfigurationHandler.add_overworld_silver) {
                registerBlock(ModBlocks.overworld_silver);
            }
            if(ConfigurationHandler.add_overworld_sulfur) {
                registerBlock(ModBlocks.overworld_sulfur);
            }
            if(ConfigurationHandler.add_overworld_tin) {
                registerBlock(ModBlocks.overworld_tin);
            }
            if(ConfigurationHandler.add_overworld_titanium) {
                registerBlock(ModBlocks.overworld_titanium);
            }
            if(ConfigurationHandler.add_overworld_uranium) {
                registerBlock(ModBlocks.overworld_uranium);
            }
            if(ConfigurationHandler.add_overworld_zinc) {
                registerBlock(ModBlocks.overworld_zinc);
            }
        }
    }
    
    //Items
    @SubscribeEvent
    public void onItemRegistry(RegistryEvent.Register<Item> event){
        itemsToRegister.forEach(event.getRegistry()::register);
    }
    
    @SubscribeEvent
    public void onBlockRegistry(RegistryEvent.Register<Block> event){
        blocksToRegister.forEach(event.getRegistry()::register);
    }

    private static void registerBlock(Block block){
        blocksToRegister.add(block);
        registerItem(new ModItemBlock(block));
    }

    private static void registerItem(Item item){
        itemsToRegister.add(item);
    }

}
