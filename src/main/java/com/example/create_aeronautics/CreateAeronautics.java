package com.example.create_aeronautics;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("create_aeronautics")
public class CreateAeronautics {
    public CreateAeronautics() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register mod content here
    }
}