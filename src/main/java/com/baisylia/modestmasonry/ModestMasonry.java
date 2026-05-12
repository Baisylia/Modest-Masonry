package com.baisylia.modestmasonry;

import com.mojang.logging.LogUtils;
import com.baisylia.modestmasonry.block.ModBlocks;
import com.baisylia.modestmasonry.integration.everycompat.EveryCompatIntegration;
import com.baisylia.modestmasonry.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.io.IOException;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ModestMasonry.MOD_ID)
public class ModestMasonry
{
    public static final String MOD_ID = "modestmasonry";
    private static final Logger LOGGER = LogUtils.getLogger();


    public ModestMasonry()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::commonSetup);

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);

        if (ModList.get().isLoaded("everycomp"))
            EveryCompatIntegration.register();
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        ;
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }


}
