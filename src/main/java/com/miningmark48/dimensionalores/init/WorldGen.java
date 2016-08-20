package com.miningmark48.dimensionalores.init;

import com.miningmark48.dimensionalores.handler.ConfigurationHandler;
import com.miningmark48.dimensionalores.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGen implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimension()){
            case -1: //Nether
                generateNether(world, random, chunkX, chunkZ);
                break;
            case 0: //Overworld
                generateSurface(world, random, chunkX, chunkZ);
                break;
            case 1: //End
                generateEnd(world, random, chunkX, chunkZ);
                break;
        }

    }

    private void generateNether(World world, Random rand, int x, int z)
    {
        if (ConfigurationHandler.nether_ores_world_gen){
            generateOre(ModBlocks.nether_coal, world, rand, x, z, 2, 17, 20, 0, 128, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_iron, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_gold, world, rand, x, z, 2, 9, 2, 0, 32, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_redstone, world, rand, x, z, 2, 8, 8, 0, 16, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_diamond, world, rand, x, z, 2, 8, 1, 0, 16, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_lapis, world, rand, x, z, 2, 7, 1, 0, 16, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_emerald, world, rand, x, z, 2, 3, 1, 0, 16, Blocks.NETHERRACK);

            generateOre(ModBlocks.nether_aluminium, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_cobalt, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_copper, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_lead, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_silver, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_sulfur, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_titanium, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_uranium, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.NETHERRACK);
            generateOre(ModBlocks.nether_zinc, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.NETHERRACK);
        }
    }

    private void generateSurface(World world, Random rand, int x, int z)
    {
        if (ConfigurationHandler.overworld_ores_world_gen){
            generateOre(ModBlocks.overworld_quartz, world, rand, x, z, 2, 17, 20, 0, 128, Blocks.STONE);

            generateOre(ModBlocks.overworld_aluminium, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.STONE);
            generateOre(ModBlocks.overworld_cobalt, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.STONE);
            generateOre(ModBlocks.overworld_copper, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.STONE);
            generateOre(ModBlocks.overworld_lead, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.STONE);
            generateOre(ModBlocks.overworld_silver, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.STONE);
            generateOre(ModBlocks.overworld_sulfur, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.STONE);
            generateOre(ModBlocks.overworld_titanium, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.STONE);
            generateOre(ModBlocks.overworld_uranium, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.STONE);
            generateOre(ModBlocks.overworld_zinc, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.STONE);
        }
    }


    private void generateEnd(World world, Random rand, int x, int z)
    {
        if (ConfigurationHandler.end_ores_world_gen){
            generateOre(ModBlocks.end_coal, world, rand, x, z, 2, 17, 20, 30, 158, Blocks.END_STONE);
            generateOre(ModBlocks.end_iron, world, rand, x, z, 2, 9, 20, 30, 94, Blocks.END_STONE);
            generateOre(ModBlocks.end_gold, world, rand, x, z, 2, 9, 2, 30, 62, Blocks.END_STONE);
            generateOre(ModBlocks.end_redstone, world, rand, x, z, 2, 8, 8, 30, 45, Blocks.END_STONE);
            generateOre(ModBlocks.end_diamond, world, rand, x, z, 2, 8, 1, 30, 45, Blocks.END_STONE);
            generateOre(ModBlocks.end_lapis, world, rand, x, z, 2, 7, 1, 30, 45, Blocks.END_STONE);
            generateOre(ModBlocks.end_emerald, world, rand, x, z, 2, 3, 1, 30, 45, Blocks.END_STONE);
            generateOre(ModBlocks.end_quartz, world, rand, x, z, 2, 17, 20, 0, 128, Blocks.END_STONE);

            generateOre(ModBlocks.end_aluminium, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.END_STONE);
            generateOre(ModBlocks.end_cobalt, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.END_STONE);
            generateOre(ModBlocks.end_copper, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.END_STONE);
            generateOre(ModBlocks.end_lead, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.END_STONE);
            generateOre(ModBlocks.end_silver, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.END_STONE);
            generateOre(ModBlocks.end_sulfur, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.END_STONE);
            generateOre(ModBlocks.end_titanium, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.END_STONE);
            generateOre(ModBlocks.end_uranium, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.END_STONE);
            generateOre(ModBlocks.end_zinc, world, rand, x, z, 2, 9, 20, 0, 64, Blocks.END_STONE);
        }
    }

    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chance, int minY, int maxY, Block generateIn)
    {
        int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
        int heightRange = maxY - minY;
        WorldGenMinable gen = new WorldGenMinable(block.getDefaultState(), veinSize, BlockMatcher.forBlock(generateIn));
        for (int i = 0; i < chance; i++){
            int xRand = chunkX * 16 + random.nextInt(16);
            int yRand = random.nextInt(heightRange) + minY;
            int zRand = chunkZ * 16 + random.nextInt(16);
            gen.generate(world, random, new BlockPos(xRand, yRand, zRand));
            //LogHelper.info(block.getUnlocalizedName() + " at " + xRand + " " + yRand + " " + zRand);
        }
    }

}
