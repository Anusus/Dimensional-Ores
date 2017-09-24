package com.miningmark48.dimensionalores.init;

import com.miningmark48.dimensionalores.handler.ConfigurationHandler;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDict{

    public static void registerOreNames(){

        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_nether_coal)       OreDictionary.registerOre("oreCoal", ModBlocks.nether_coal);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_end_coal)             OreDictionary.registerOre("oreCoal", ModBlocks.end_coal);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_nether_iron)       OreDictionary.registerOre("oreIron", ModBlocks.nether_iron);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_end_iron)             OreDictionary.registerOre("oreIron", ModBlocks.end_iron);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_nether_gold)       OreDictionary.registerOre("oreGold", ModBlocks.nether_gold);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_end_gold)             OreDictionary.registerOre("oreGold", ModBlocks.end_gold);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_nether_redstone)   OreDictionary.registerOre("oreRedstone", ModBlocks.nether_redstone);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_end_redstone)         OreDictionary.registerOre("oreRedstone", ModBlocks.end_redstone);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_nether_diamond)    OreDictionary.registerOre("oreDiamond", ModBlocks.nether_diamond);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_end_diamond)          OreDictionary.registerOre("oreDiamond", ModBlocks.end_diamond);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_nether_emerald)    OreDictionary.registerOre("oreEmerald", ModBlocks.nether_emerald);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_end_emerald)          OreDictionary.registerOre("oreEmerald", ModBlocks.end_emerald);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_nether_lapis)      OreDictionary.registerOre("oreLapis", ModBlocks.nether_lapis);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_end_lapis)            OreDictionary.registerOre("oreLapis", ModBlocks.end_lapis);

        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_end_aluminum)             OreDictionary.registerOre("oreAluminum", ModBlocks.nether_aluminium);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_nether_aluminum)             OreDictionary.registerOre("oreAluminum", ModBlocks.end_aluminium);
        if (ConfigurationHandler.add_overworld_ores && ConfigurationHandler.add_overworld_aluminum)    OreDictionary.registerOre("oreAluminum", ModBlocks.overworld_aluminium);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_end_cobalt)                OreDictionary.registerOre("oreCobalt", ModBlocks.nether_cobalt);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_nether_cobalt)                OreDictionary.registerOre("oreCobalt", ModBlocks.end_cobalt);
        if (ConfigurationHandler.add_overworld_ores && ConfigurationHandler.add_overworld_cobalt)       OreDictionary.registerOre("oreCobalt", ModBlocks.overworld_cobalt);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_end_copper)                OreDictionary.registerOre("oreCopper", ModBlocks.nether_copper);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_nether_copper)                OreDictionary.registerOre("oreCopper", ModBlocks.end_copper);
        if (ConfigurationHandler.add_overworld_ores && ConfigurationHandler.add_overworld_copper)       OreDictionary.registerOre("oreCopper", ModBlocks.overworld_copper);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_end_lead)                  OreDictionary.registerOre("oreLead", ModBlocks.nether_lead);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_nether_lead)                  OreDictionary.registerOre("oreLead", ModBlocks.end_lead);
        if (ConfigurationHandler.add_overworld_ores && ConfigurationHandler.add_overworld_lead)         OreDictionary.registerOre("oreLead", ModBlocks.overworld_lead);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_end_quartz)                OreDictionary.registerOre("oreQuartz", ModBlocks.end_quartz);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_overworld_quartz)             OreDictionary.registerOre("oreQuartz", ModBlocks.overworld_quartz);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_end_silver)                OreDictionary.registerOre("oreSilver", ModBlocks.nether_silver);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_nether_silver)                OreDictionary.registerOre("oreSilver", ModBlocks.end_silver);
        if (ConfigurationHandler.add_overworld_ores && ConfigurationHandler.add_overworld_silver)       OreDictionary.registerOre("oreSilver", ModBlocks.overworld_silver);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_end_sulfur)                OreDictionary.registerOre("oreSulfur", ModBlocks.nether_sulfur);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_nether_sulfur)                OreDictionary.registerOre("oreSulfur", ModBlocks.end_sulfur);
        if (ConfigurationHandler.add_overworld_ores && ConfigurationHandler.add_overworld_sulfur)       OreDictionary.registerOre("oreSulfur", ModBlocks.overworld_sulfur);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_end_tin)                   OreDictionary.registerOre("oreTin", ModBlocks.nether_tin);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_nether_tin)                   OreDictionary.registerOre("oreTin", ModBlocks.end_tin);
        if (ConfigurationHandler.add_overworld_ores && ConfigurationHandler.add_overworld_tin)          OreDictionary.registerOre("oreTin", ModBlocks.overworld_tin);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_end_titanium)              OreDictionary.registerOre("oreTitanium", ModBlocks.nether_titanium);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_nether_titanium)              OreDictionary.registerOre("oreTitanium", ModBlocks.end_titanium);
        if (ConfigurationHandler.add_overworld_ores && ConfigurationHandler.add_overworld_titanium)     OreDictionary.registerOre("oreTitanium", ModBlocks.overworld_titanium);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_end_uranium)               OreDictionary.registerOre("oreUranium", ModBlocks.nether_uranium);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_nether_uranium)               OreDictionary.registerOre("oreUranium", ModBlocks.end_uranium);
        if (ConfigurationHandler.add_overworld_ores && ConfigurationHandler.add_overworld_uranium)      OreDictionary.registerOre("oreUranium", ModBlocks.overworld_uranium);
        if (ConfigurationHandler.add_nether_ores && ConfigurationHandler.add_end_zinc)                  OreDictionary.registerOre("oreZinc", ModBlocks.nether_zinc);
        if (ConfigurationHandler.add_end_ores && ConfigurationHandler.add_nether_zinc)                  OreDictionary.registerOre("oreZinc", ModBlocks.end_zinc);
        if (ConfigurationHandler.add_overworld_ores && ConfigurationHandler.add_overworld_zinc)         OreDictionary.registerOre("oreZinc", ModBlocks.overworld_zinc);

        if ((ConfigurationHandler.add_overworld_ores || ConfigurationHandler.add_nether_ores || ConfigurationHandler.add_end_ores) && (ConfigurationHandler.add_overworld_aluminum || ConfigurationHandler.add_nether_aluminum || ConfigurationHandler.add_end_aluminum)) OreDictionary.registerOre("ingotAluminum", ModItems.ingot_aluminium);
        if ((ConfigurationHandler.add_overworld_ores || ConfigurationHandler.add_nether_ores || ConfigurationHandler.add_end_ores) && (ConfigurationHandler.add_overworld_cobalt || ConfigurationHandler.add_nether_cobalt || ConfigurationHandler.add_end_cobalt)) OreDictionary.registerOre("ingotCobalt", ModItems.ingot_cobalt);
        if ((ConfigurationHandler.add_overworld_ores || ConfigurationHandler.add_nether_ores || ConfigurationHandler.add_end_ores) && (ConfigurationHandler.add_overworld_copper || ConfigurationHandler.add_nether_copper || ConfigurationHandler.add_end_copper)) OreDictionary.registerOre("ingotCopper", ModItems.ingot_copper);
        if ((ConfigurationHandler.add_overworld_ores || ConfigurationHandler.add_nether_ores || ConfigurationHandler.add_end_ores) && (ConfigurationHandler.add_overworld_lead || ConfigurationHandler.add_nether_lead || ConfigurationHandler.add_end_lead)) OreDictionary.registerOre("ingotLead", ModItems.ingot_lead);
        if ((ConfigurationHandler.add_overworld_ores || ConfigurationHandler.add_nether_ores || ConfigurationHandler.add_end_ores) && (ConfigurationHandler.add_overworld_silver || ConfigurationHandler.add_nether_silver || ConfigurationHandler.add_end_silver)) OreDictionary.registerOre("ingotSilver", ModItems.ingot_silver);
        if ((ConfigurationHandler.add_overworld_ores || ConfigurationHandler.add_nether_ores || ConfigurationHandler.add_end_ores) && (ConfigurationHandler.add_overworld_tin || ConfigurationHandler.add_nether_tin || ConfigurationHandler.add_end_tin)) OreDictionary.registerOre("ingotTin", ModItems.ingot_tin);
        if ((ConfigurationHandler.add_overworld_ores || ConfigurationHandler.add_nether_ores || ConfigurationHandler.add_end_ores) && (ConfigurationHandler.add_overworld_titanium || ConfigurationHandler.add_nether_titanium || ConfigurationHandler.add_end_titanium)) OreDictionary.registerOre("ingotTitanium", ModItems.ingot_titanium);
        if ((ConfigurationHandler.add_overworld_ores || ConfigurationHandler.add_nether_ores || ConfigurationHandler.add_end_ores) && (ConfigurationHandler.add_overworld_uranium || ConfigurationHandler.add_nether_uranium || ConfigurationHandler.add_end_uranium)) OreDictionary.registerOre("ingotUranium", ModItems.ingot_uranium);
        if ((ConfigurationHandler.add_overworld_ores || ConfigurationHandler.add_nether_ores || ConfigurationHandler.add_end_ores) && (ConfigurationHandler.add_overworld_zinc || ConfigurationHandler.add_nether_zinc || ConfigurationHandler.add_end_zinc)) OreDictionary.registerOre("ingotZinc", ModItems.ingot_zinc);

    }

}
