package com.archer2o2x.darksark;

import com.archer2o2x.darksark.creative_tabs.ModCreativeTabs;
import com.archer2o2x.darksark.items.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DarksArk.MODID)
public class DarksArk
{
    public static final String MODID = "darksark";

    public static final Logger LOGGER = LogUtils.getLogger();

    public DarksArk()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);


        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
