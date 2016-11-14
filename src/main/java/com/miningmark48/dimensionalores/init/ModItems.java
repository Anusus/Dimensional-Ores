package com.miningmark48.dimensionalores.init;

import com.miningmark48.dimensionalores.creativetabs.CreativeTabDimensionalOres;
import com.miningmark48.dimensionalores.items.ItemIngot;
import com.miningmark48.dimensionalores.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item ingot_aluminium;
    public static Item ingot_cobalt;
    public static Item ingot_copper;
    public static Item ingot_lead;
    public static Item ingot_silver;
    public static Item ingot_tin;
    public static Item ingot_titanium;
    public static Item ingot_uranium;
    public static Item ingot_zinc;

    public static void init(){
        ingot_aluminium = new ItemIngot().setUnlocalizedName("ingot_aluminium").setRegistryName("ingot_aluminium").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        ingot_cobalt = new ItemIngot().setUnlocalizedName("ingot_cobalt").setRegistryName("ingot_cobalt").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        ingot_copper = new ItemIngot().setUnlocalizedName("ingot_copper").setRegistryName("ingot_copper").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        ingot_lead = new ItemIngot().setUnlocalizedName("ingot_lead").setRegistryName("ingot_lead").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        ingot_silver = new ItemIngot().setUnlocalizedName("ingot_silver").setRegistryName("ingot_silver").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        ingot_tin = new ItemIngot().setUnlocalizedName("ingot_tin").setRegistryName("ingot_tin").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        ingot_titanium = new ItemIngot().setUnlocalizedName("ingot_titanium").setRegistryName("ingot_titanium").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        ingot_uranium = new ItemIngot().setUnlocalizedName("ingot_uranium").setRegistryName("ingot_uranium").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
        ingot_zinc = new ItemIngot().setUnlocalizedName("ingot_zinc").setRegistryName("ingot_zinc").setCreativeTab(CreativeTabDimensionalOres.DO_Tab);
    }

    public static void register(){
        GameRegistry.register(ingot_aluminium);
        GameRegistry.register(ingot_cobalt);
        GameRegistry.register(ingot_copper);
        GameRegistry.register(ingot_lead);
        GameRegistry.register(ingot_silver);
        GameRegistry.register(ingot_tin);
        GameRegistry.register(ingot_titanium);
        GameRegistry.register(ingot_uranium);
        GameRegistry.register(ingot_zinc);
    }

    public static void registerRenders(){
        registerRender(ingot_aluminium);
        registerRender(ingot_cobalt);
        registerRender(ingot_copper);
        registerRender(ingot_lead);
        registerRender(ingot_silver);
        registerRender(ingot_tin);
        registerRender(ingot_titanium);
        registerRender(ingot_uranium);
        registerRender(ingot_zinc);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerRender(Item item, int meta, String name){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + name, "inventory"));
    }

}
