package com.shirkit;

import com.shirkit.entity.Options;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = "Todo", name = "Todo mod", version = "0.1", dependencies = "after:NotEnoughItems")
public class Todo {

	/** Forge configuration **/
	@Instance
	public static Todo instance;
	
	/** Mod **/

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Options.load(event);

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	@Mod.EventHandler
	public void onServerStarting(FMLServerStartingEvent event) {

	}

}