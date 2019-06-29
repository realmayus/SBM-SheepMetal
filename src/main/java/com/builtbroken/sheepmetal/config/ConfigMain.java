package com.builtbroken.sheepmetal.config;

import com.builtbroken.sheepmetal.SheepMetal;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.fml.common.Mod;

/**
 * Created by Dark(DarkGuardsman, Robert) on 6/29/2019.
 */
@Config(modid = SheepMetal.DOMAIN, name = "sheepmetal/main")
@Config.LangKey("config.sheepmetal:main.title")
@Mod.EventBusSubscriber(modid = SheepMetal.DOMAIN)
public class ConfigMain
{
    @Config.Name("enable_spawn_weight_debug")
    @Config.Comment("Enabled a file to export to the main game directly with spawning weights and chances for sheep")
    @Config.RequiresMcRestart
    public static boolean ENABLE_SPAWN_WEIGHT_DEBUG = true;

    @Config.Name("coal_fuel_item")
    @Config.Comment("Fuel value of the coal wool item")
    @Config.RangeInt(min = 1)
    public static int COAL_ITEM_FUEL = 160; //Coal item is 1600

    @Config.Name("coal_fuel_block")
    @Config.Comment("Fuel value of the coal wool block")
    @Config.RangeInt(min = 1)
    public static int COAL_BLOCK_FUEL = 1600; //Coal item is 1600
}