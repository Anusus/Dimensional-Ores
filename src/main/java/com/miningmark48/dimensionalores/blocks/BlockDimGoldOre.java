package com.miningmark48.dimensionalores.blocks;

import com.miningmark48.mininglib.base.block.ModBaseBlock;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockDimGoldOre extends ModBaseBlock {
    public BlockDimGoldOre() {
        super(Material.ROCK, MapColor.GRAY);
        setHardness(3);
        setResistance(15);
        setHarvestLevel("pickaxe", 2);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

}
