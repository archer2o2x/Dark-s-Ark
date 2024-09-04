package com.archer2o2x.darksark.entities.client;

import com.archer2o2x.darksark.DarksArk;
import com.archer2o2x.darksark.entities.custom.SeahorseEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SeahorseRenderer extends GeoEntityRenderer<SeahorseEntity> {
    public SeahorseRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SeahorseModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(SeahorseEntity animatable) {
        return new ResourceLocation(DarksArk.MODID, "textures/entity/seahorse.png");
    }

    @Override
    protected void applyRotations(SeahorseEntity animatable, PoseStack poseStack, float ageInTicks, float rotationYaw, float partialTick) {
        super.applyRotations(animatable, poseStack, ageInTicks, rotationYaw, partialTick);

        float f = 1.0F;
        float f1 = 1.0F;
        if (!animatable.isInWater()) {
            f = 1.3F;
            f1 = 1.7F;
        }

        float f2 = f * 4.3F * Mth.sin(f1 * 0.6F * ageInTicks);
        poseStack.mulPose(Axis.YP.rotationDegrees(f2));
        //poseStack.translate(0.0F, 0.0F, -0.4F);

        if (!animatable.isInWater()) {
            poseStack.translate(0.0F, -0.1F, -0.3F);
            poseStack.mulPose(Axis.YP.rotationDegrees(90));
            poseStack.mulPose(Axis.ZP.rotationDegrees(90));
        }

    }

    @Override
    public RenderType getRenderType(SeahorseEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
