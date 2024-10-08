package com.thewandererraven.ravenbrewscore;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Constants.MOD_ID)
public class RavenBrewsCoreForge
{
    public RavenBrewsCoreForge() {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        RavenBrewsCommon.init();
    }
}
