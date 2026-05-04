package com.ferbmicah.button_db;

import com.ferbmicah.button_db.items.ButtonDoorbellItems;
import net.fabricmc.api.ModInitializer;

public class ButtonDB implements ModInitializer {

    public static final String MOD_ID = "button_db";

    @Override
    public void onInitialize() {
        ButtonDoorbellItems.initialize();
    }
}
