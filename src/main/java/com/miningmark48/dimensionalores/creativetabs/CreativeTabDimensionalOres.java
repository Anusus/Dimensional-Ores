package com.miningmark48.dimensionalores.creativetabs;

import com.miningmark48.dimensionalores.handler.ConfigurationHandler;
import com.miningmark48.dimensionalores.init.ModBlocks;
import com.miningmark48.dimensionalores.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabDimensionalOres {

    public static final CreativeTabs DO_Tab = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            if (ConfigurationHandler.add_end_ores){
                return new ItemStack(ModBlocks.end_diamond).getItem();
            }else {
                return new ItemStack(Blocks.DIAMOND_ORE).getItem();
            }
        }
    };

}
