package com.miningmark48.dimensionalores.blocks;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockDimZincOre extends BlockDOMod{

    public BlockDimZincOre(){
        super(Material.ROCK, MapColor.GRAY);
        setHardness(3.0F);
        setResistance(15.0F);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

}
