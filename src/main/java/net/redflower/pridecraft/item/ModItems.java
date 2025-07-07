package net.redflower.pridecraft.item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.pridecraft.PrideCraft;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PrideCraft.MODID);




    //Registers The Items. DO NOT TOUCH!!!
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
