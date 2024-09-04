package com.archer2o2x.darksark.entities;

import com.archer2o2x.darksark.DarksArk;
import com.archer2o2x.darksark.entities.custom.SeahorseEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DarksArk.MODID);

    public static final RegistryObject<EntityType<SeahorseEntity>> SEAHORSE = ENTITY_TYPES.register("seahorse", () ->
            EntityType.Builder.of(SeahorseEntity::new, MobCategory.WATER_CREATURE)
                    .sized(0.2f, 0.6f)
                    .build(new ResourceLocation(DarksArk.MODID, "seahorse").toString()));

    public static void register(IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }

}
