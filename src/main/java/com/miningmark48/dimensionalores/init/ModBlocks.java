package com.miningmark48.dimensionalores.init;

import com.miningmark48.dimensionalores.blocks.*;
import com.miningmark48.dimensionalores.creativetabs.CreativeTabDimensionalOres;
import com.miningmark48.dimensionalores.handler.ConfigurationHandler;
import com.miningmark48.dimensionalores.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block nether_coal;
    public static Block end_coal;
    public static Block nether_iron;
    public static Block end_iron;
    public static Block nether_gold;
    public static Block end_gold;
    public static Block nether_diamond;
    public static Block end_diamond;
    public static Block nether_emerald;
    public static Block end_emerald;
    public static Block end_quartz;
    public static Block overworld_quartz;
    public static Block nether_redstone;
    public static Block end_redstone;
    public static Block nether_lapis;
    public static Block end_lapis;

    public static void init(){
        nether_coal = new BlockDimCoalOre().setUnlocalizedName("nether_coal").setRegistryName("nether_coal").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_coal = new BlockDimCoalOre().setUnlocalizedName("end_coal").setRegistryName("end_coal").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_iron = new BlockDimIronOre().setUnlocalizedName("nether_iron").setRegistryName("nether_iron").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_iron = new BlockDimIronOre().setUnlocalizedName("end_iron").setRegistryName("end_iron").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_gold = new BlockDimGoldOre().setUnlocalizedName("nether_gold").setRegistryName("nether_gold").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_gold = new BlockDimGoldOre().setUnlocalizedName("end_gold").setRegistryName("end_gold").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_diamond = new BlockDimDiamondOre().setUnlocalizedName("nether_diamond").setRegistryName("nether_diamond").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_diamond = new BlockDimDiamondOre().setUnlocalizedName("end_diamond").setRegistryName("end_diamond").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_emerald = new BlockDimEmeraldOre().setUnlocalizedName("nether_emerald").setRegistryName("nether_emerald").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_emerald = new BlockDimEmeraldOre().setUnlocalizedName("end_emerald").setRegistryName("end_emerald").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_quartz = new BlockDimQuartzOre().setUnlocalizedName("end_quartz").setRegistryName("end_quartz").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        overworld_quartz = new BlockDimQuartzOre().setUnlocalizedName("overworld_quartz").setRegistryName("overworld_quartz").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_redstone = new BlockDimRedstoneOre().setUnlocalizedName("nether_redstone").setRegistryName("nether_redstone").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_redstone = new BlockDimRedstoneOre().setUnlocalizedName("end_redstone").setRegistryName("end_redstone").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_lapis = new BlockDimLapisOre().setUnlocalizedName("nether_lapis").setRegistryName("nether_lapis").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_lapis = new BlockDimLapisOre().setUnlocalizedName("end_lapis").setRegistryName("end_lapis").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
    }

    public static void register(){
        if (ConfigurationHandler.add_nether_ores){
            registerBlock(nether_coal);
            registerBlock(nether_iron);
            registerBlock(nether_gold);
            registerBlock(nether_diamond);
            registerBlock(nether_emerald);
            registerBlock(nether_lapis);
            registerBlock(nether_redstone);
        }
        if (ConfigurationHandler.add_end_ores){
            registerBlock(end_coal);
            registerBlock(end_iron);
            registerBlock(end_gold);
            registerBlock(end_diamond);
            registerBlock(end_emerald);
            registerBlock(end_lapis);
            registerBlock(end_redstone);
            registerBlock(end_quartz);
        }
        if (ConfigurationHandler.add_overworld_ores){
            registerBlock(overworld_quartz);
        }
    }

    public static void registerRenders(){
        registerRender(nether_coal);
        registerRender(end_coal);
        registerRender(nether_iron);
        registerRender(end_iron);
        registerRender(nether_gold);
        registerRender(end_gold);
        registerRender(nether_diamond);
        registerRender(end_diamond);
        registerRender(nether_emerald);
        registerRender(end_emerald);
        registerRender(end_quartz);
        registerRender(overworld_quartz);
        registerRender(nether_redstone);
        registerRender(end_redstone);
        registerRender(nether_lapis);
        registerRender(end_lapis);
    }

    private static void registerBlock(Block block){
        GameRegistry.register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

}
