package com.archer2o2x.darksark.entities.client;

import com.archer2o2x.darksark.DarksArk;
import com.archer2o2x.darksark.entities.custom.SeahorseEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SeahorseModel extends GeoModel<SeahorseEntity> {
    @Override
    public ResourceLocation getModelResource(SeahorseEntity animatable) {
        return new ResourceLocation(DarksArk.MODID, "geo/entity/seahorse.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SeahorseEntity animatable) {
        return new ResourceLocation(DarksArk.MODID, "textures/entity/seahorse.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SeahorseEntity animatable) {
        return new ResourceLocation(DarksArk.MODID, "animations/entity/seahorse.animation.json");
    }
}
