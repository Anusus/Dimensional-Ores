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
        public ItemStack getTabIconItem() {
            if (ConfigurationHandler.add_end_ores){
                return new ItemStack(ModBlocks.end_diamond);
            }else {
                return new ItemStack(Blocks.DIAMOND_ORE);
            }
        }
    };

}
