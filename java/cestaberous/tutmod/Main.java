package cestaberous.tutmod;

import cestaberous.tutmod.lib.ModVars;
import cestaberous.tutmod.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModVars.MOD_ID, name = ModVars.MOD_Name, version = ModVars.MOD_Version)
public class Main {
	
	@Instance
	public static Main instance = new Main();
	
	@SidedProxy(clientSide = "cestaberous.tutmod.proxy.ClientProxy", serverSide = "cestaberous.tutmod.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit( FMLPreInitializationEvent e ){
		proxy.preInit(e);
		
		
	}
	
	@EventHandler
	public void init( FMLInitializationEvent e ){
		proxy.init(e);
		
		
	}
	
	@EventHandler
	public void postInit( FMLPostInitializationEvent e ){
		proxy.postInit(e);
		
		
	}
	
}
