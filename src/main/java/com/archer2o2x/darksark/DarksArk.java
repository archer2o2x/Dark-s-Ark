package com.archer2o2x.darksark;

import com.archer2o2x.darksark.creative_tabs.ModCreativeTabs;
import com.archer2o2x.darksark.entities.ModEntityTypes;
import com.archer2o2x.darksark.entities.client.SeahorseRenderer;
import com.archer2o2x.darksark.items.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

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

        ModEntityTypes.register(modEventBus);

        GeckoLib.initialize();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        modEventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

        EntityRenderers.register(ModEntityTypes.SEAHORSE.get(), SeahorseRenderer::new);

    }

}
