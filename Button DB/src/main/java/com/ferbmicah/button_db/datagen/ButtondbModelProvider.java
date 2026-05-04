package com.ferbmicah.button_db.datagen;

import com.ferbmicah.button_db.items.ButtonDoorbellItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ButtondbModelProvider extends FabricModelProvider {
    public ButtondbModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
itemModelGenerators.generateFlatItem(ButtonDoorbellItems.JUKEBOX_BUTTON, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
