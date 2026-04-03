package com.l30n3ch0.solacea.item;

import com.l30n3ch0.solacea.Solacea;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Solacea.MODID);
    
    public static final DeferredItem<Item> SUNSTONE = ITEMS.registerItem("sunstone", Item::new, Item.Properties::new);
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
