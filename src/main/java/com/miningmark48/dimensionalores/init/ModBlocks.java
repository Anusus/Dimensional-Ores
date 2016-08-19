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

    public static Block nether_aluminium;
    public static Block end_aluminium;
    public static Block overworld_aluminium;
    public static Block nether_cobalt;
    public static Block end_cobalt;
    public static Block overworld_cobalt;
    public static Block nether_copper;
    public static Block end_copper;
    public static Block overworld_copper;
    public static Block nether_lead;
    public static Block end_lead;
    public static Block overworld_lead;
    public static Block nether_silver;
    public static Block end_silver;
    public static Block overworld_silver;
    public static Block nether_sulfur;
    public static Block end_sulfur;
    public static Block overworld_sulfur;
    public static Block nether_titanium;
    public static Block end_titanium;
    public static Block overworld_titanium;
    public static Block nether_uranium;
    public static Block end_uranium;
    public static Block overworld_uranium;
    public static Block nether_zinc;
    public static Block end_zinc;
    public static Block overworld_zinc;

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
        nether_aluminium = new BlockDimAluminiumOre().setUnlocalizedName("nether_aluminium").setRegistryName("nether_aluminium").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_aluminium = new BlockDimAluminiumOre().setUnlocalizedName("end_aluminium").setRegistryName("end_aluminium").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        overworld_aluminium = new BlockDimAluminiumOre().setUnlocalizedName("overworld_aluminium").setRegistryName("overworld_aluminium").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_cobalt = new BlockDimCobaltOre().setUnlocalizedName("nether_cobalt").setRegistryName("nether_cobalt").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_cobalt = new BlockDimCobaltOre().setUnlocalizedName("end_cobalt").setRegistryName("end_cobalt").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        overworld_cobalt = new BlockDimCobaltOre().setUnlocalizedName("overworld_cobalt").setRegistryName("overworld_cobalt").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_copper = new BlockDimCopperOre().setUnlocalizedName("nether_copper").setRegistryName("nether_copper").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_copper = new BlockDimCopperOre().setUnlocalizedName("end_copper").setRegistryName("end_copper").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        overworld_copper = new BlockDimCopperOre().setUnlocalizedName("overworld_copper").setRegistryName("overworld_copper").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_lead = new BlockDimLeadOre().setUnlocalizedName("nether_lead").setRegistryName("nether_lead").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_lead = new BlockDimLeadOre().setUnlocalizedName("end_lead").setRegistryName("end_lead").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        overworld_lead = new BlockDimLeadOre().setUnlocalizedName("overworld_lead").setRegistryName("overworld_lead").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_silver = new BlockDimSilverOre().setUnlocalizedName("nether_silver").setRegistryName("nether_silver").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_silver = new BlockDimSilverOre().setUnlocalizedName("end_silver").setRegistryName("end_silver").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        overworld_silver = new BlockDimSilverOre().setUnlocalizedName("overworld_silver").setRegistryName("overworld_silver").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_sulfur = new BlockDimSulfurOre().setUnlocalizedName("nether_sulfur").setRegistryName("nether_sulfur").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_sulfur = new BlockDimSulfurOre().setUnlocalizedName("end_sulfur").setRegistryName("end_sulfur").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        overworld_sulfur = new BlockDimSulfurOre().setUnlocalizedName("overworld_sulfur").setRegistryName("overworld_sulfur").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_titanium = new BlockDimTitaniumOre().setUnlocalizedName("nether_titanium").setRegistryName("nether_titanium").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_titanium = new BlockDimTitaniumOre().setUnlocalizedName("end_titanium").setRegistryName("end_titanium").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        overworld_titanium = new BlockDimTitaniumOre().setUnlocalizedName("overworld_titanium").setRegistryName("overworld_titanium").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_uranium = new BlockDimUraniumOre().setUnlocalizedName("nether_uranium").setRegistryName("nether_uranium").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_uranium = new BlockDimUraniumOre().setUnlocalizedName("end_uranium").setRegistryName("end_uranium").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        overworld_uranium = new BlockDimUraniumOre().setUnlocalizedName("overworld_uranium").setRegistryName("overworld_uranium").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        nether_zinc = new BlockDimZincOre().setUnlocalizedName("nether_zinc").setRegistryName("nether_zinc").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        end_zinc = new BlockDimZincOre().setUnlocalizedName("end_zinc").setRegistryName("end_zinc").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        overworld_zinc = new BlockDimZincOre().setUnlocalizedName("overworld_zinc").setRegistryName("overworld_zinc").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
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

            registerBlock(nether_aluminium);
            registerBlock(nether_cobalt);
            registerBlock(nether_copper);
            registerBlock(nether_lead);
            registerBlock(nether_silver);
            registerBlock(nether_sulfur);
            registerBlock(nether_titanium);
            registerBlock(nether_uranium);
            registerBlock(nether_zinc);
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

            registerBlock(end_aluminium);
            registerBlock(end_cobalt);
            registerBlock(end_copper);
            registerBlock(end_lead);
            registerBlock(end_silver);
            registerBlock(end_sulfur);
            registerBlock(end_titanium);
            registerBlock(end_uranium);
            registerBlock(end_zinc);
        }
        if (ConfigurationHandler.add_overworld_ores){
            registerBlock(overworld_quartz);

            registerBlock(overworld_aluminium);
            registerBlock(overworld_cobalt);
            registerBlock(overworld_copper);
            registerBlock(overworld_lead);
            registerBlock(overworld_silver);
            registerBlock(overworld_sulfur);
            registerBlock(overworld_titanium);
            registerBlock(overworld_uranium);
            registerBlock(overworld_zinc);
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

        registerRender(nether_aluminium);
        registerRender(end_aluminium);
        registerRender(overworld_aluminium);
        registerRender(nether_cobalt);
        registerRender(end_cobalt);
        registerRender(overworld_cobalt);
        registerRender(nether_copper);
        registerRender(end_copper);
        registerRender(overworld_copper);
        registerRender(nether_lead);
        registerRender(end_lead);
        registerRender(overworld_lead);
        registerRender(nether_silver);
        registerRender(end_silver);
        registerRender(overworld_silver);
        registerRender(nether_sulfur);
        registerRender(end_sulfur);
        registerRender(overworld_sulfur);
        registerRender(nether_titanium);
        registerRender(end_titanium);
        registerRender(overworld_titanium);
        registerRender(nether_uranium);
        registerRender(end_uranium);
        registerRender(overworld_uranium);
        registerRender(nether_zinc);
        registerRender(end_zinc);
        registerRender(overworld_zinc);

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
