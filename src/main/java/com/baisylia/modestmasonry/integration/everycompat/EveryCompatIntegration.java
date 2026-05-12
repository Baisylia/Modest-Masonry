package com.baisylia.modestmasonry.integration.everycompat;

import com.baisylia.modestmasonry.ModestMasonry;
import net.mehvahdjukaar.every_compat.api.EveryCompatAPI;

public class EveryCompatIntegration {
    public static void register() {
        EveryCompatAPI.registerModule(new MMEveryCompatModule(ModestMasonry.MOD_ID));
    }
}
