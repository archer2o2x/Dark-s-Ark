package com.archer2o2x.darksark.data;

import com.archer2o2x.darksark.DarksArk;
import com.archer2o2x.darksark.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class EnglishLanguageGenerator extends LanguageProvider {
    public EnglishLanguageGenerator(PackOutput output, String locale) {
        super(output, DarksArk.MODID, locale);
    }

    @Override
    protected void addTranslations() {

        add(ModItems.MOLA_MOLA_MEAT.get(), "Mola Mola Meat");

        add("tab.darksark.main_tab", "Dark's Ark");

    }
}
