package com.archer2o2x.darksark.items;

import com.archer2o2x.darksark.DarksArk;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DarksArk.MODID);

    public static final RegistryObject<Item> MOLA_MOLA_MEAT = ITEMS.register("mola_mola_meat",
            () -> new Item(new Item.Properties().food(Foods.COOKED_SALMON)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
