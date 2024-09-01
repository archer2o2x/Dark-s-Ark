package com.archer2o2x.darksark.creative_tabs;

import com.archer2o2x.darksark.DarksArk;
import com.archer2o2x.darksark.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DarksArk.MODID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_TABS.register("main_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(Items.PRISMARINE_CRYSTALS::getDefaultInstance)
            .title(Component.translatable("tab.darksark.main_tab"))
            .displayItems((parameters, output) -> {

                output.accept(Items.PRISMARINE_CRYSTALS);
                output.accept(Items.PRISMARINE_SHARD);
                output.accept(Items.HEART_OF_THE_SEA);
                output.accept(ModItems.MOLA_MOLA_MEAT.get());

            }).build());

    public static void register(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }

}
