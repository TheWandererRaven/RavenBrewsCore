package com.thewandererraven.ravenbrewscore;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("ravenbrewscore")
public class RavenBrewsCore
{
    // Directly reference a log4j logger.
    public static final String MOD_ID = "ravenbrewscore";
    private static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public RavenBrewsCore() {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
