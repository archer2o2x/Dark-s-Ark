package com.archer2o2x.darksark.data;

import com.archer2o2x.darksark.DarksArk;
import com.archer2o2x.darksark.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DarksArk.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.MOLA_MOLA_MEAT);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return simpleItem(item, item.getId());
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item, ResourceLocation path) {
        return withExistingParent(
                item.getId().getPath(),
                new ResourceLocation("item/generated")
        ).texture(
                "layer0",
                new ResourceLocation(DarksArk.MODID, "item/" + path.getPath())
        );
    }
}
