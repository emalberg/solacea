package com.l30n3ch0.solacea.datagen;

import java.util.concurrent.CompletableFuture;

import com.l30n3ch0.solacea.Solacea;
import com.l30n3ch0.solacea.block.ModBlocks;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<Provider> lookupProvider) {
        super(output, lookupProvider, Solacea.MODID);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected void addTags(Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.SUNSTONE_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.SUNSTONE_ORE.get());
    }
    
}
