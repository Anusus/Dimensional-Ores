package com.miningmark48.dimensionalores.init;

import net.minecraftforge.oredict.OreDictionary;

public class ModOreDict{

    public static void registerOreNames(){

        OreDictionary.registerOre("oreAluminium", ModBlocks.nether_aluminium);
        OreDictionary.registerOre("oreAluminium", ModBlocks.end_aluminium);
        OreDictionary.registerOre("oreAluminium", ModBlocks.overworld_aluminium);
        OreDictionary.registerOre("oreCobalt", ModBlocks.nether_cobalt);
        OreDictionary.registerOre("oreCobalt", ModBlocks.end_cobalt);
        OreDictionary.registerOre("oreCobalt", ModBlocks.overworld_cobalt);

    }

}
