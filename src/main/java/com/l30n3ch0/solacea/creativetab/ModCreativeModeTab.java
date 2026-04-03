package com.l30n3ch0.solacea.creativetab;

import java.util.function.Supplier;

import com.l30n3ch0.solacea.Solacea;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.l30n3ch0.solacea.block.ModBlocks;
import com.l30n3ch0.solacea.item.ModItems;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Solacea.MODID);

    public static final Supplier<CreativeModeTab> SOLACEA_TAB = CREATIVE_MODE_TABS.register("solacea_tab", 
        ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SUNSTONE_ITEM.get()))
        .title(Component.translatable("creativetab.solacea.solacea_tab"))
        .displayItems((itemDisplayParameters, output) -> {
            output.accept(ModItems.SUNSTONE_ITEM.get());
            output.accept(ModBlocks.SUNSTONE_ORE.get());
        }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }    
}
