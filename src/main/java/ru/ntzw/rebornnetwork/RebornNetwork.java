package ru.ntzw.rebornnetwork;

import net.fabricmc.api.ModInitializer;
import reborncore.RebornCore;

public class RebornNetwork implements ModInitializer {
    @Override
    public void onInitialize() {
        RebornCore.getSide();
    }
}
