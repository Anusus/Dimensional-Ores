package com.miningmark48.dimensionalores.blocks;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockDimGoldOre extends BlockDOMod{
    public BlockDimGoldOre() {
        super(Material.ROCK, MapColor.GRAY);
        setHardness(3);
        setResistance(15);
        setHarvestLevel("pickaxe", 2);
    }
}
