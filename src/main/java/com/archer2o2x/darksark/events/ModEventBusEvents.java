package com.archer2o2x.darksark.events;

import com.archer2o2x.darksark.DarksArk;
import com.archer2o2x.darksark.entities.ModEntityTypes;
import com.archer2o2x.darksark.entities.custom.SeahorseEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DarksArk.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.SEAHORSE.get(), SeahorseEntity.setAttributes());
    }

}
