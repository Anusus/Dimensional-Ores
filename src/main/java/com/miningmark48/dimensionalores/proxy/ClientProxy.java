package com.miningmark48.dimensionalores.proxy;

import com.miningmark48.dimensionalores.init.ModBlocks;
import com.miningmark48.dimensionalores.init.ModItems;

public class ClientProxy extends CommonProxy{

    @Override
    public void registerRenders(){
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }

}
