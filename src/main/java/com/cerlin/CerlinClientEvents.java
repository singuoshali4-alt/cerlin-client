package com.cerlin;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class CerlinClientEvents implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger(CerlinClient.MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Cerlin Client Events initialized!");
    }
}
