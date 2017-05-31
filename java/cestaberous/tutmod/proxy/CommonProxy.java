package cestaberous.tutmod.proxy;

import cestaberous.tutmod.blocks.TutmodBlocks;
import cestaberous.tutmod.crafting.TutorialCrafting;
import cestaberous.tutmod.items.TutmodItems;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit( FMLPreInitializationEvent e ){
		TutmodItems.init();
		TutmodBlocks.init();
		
		
	}
	
	public void init( FMLInitializationEvent e ){
		TutorialCrafting.init();
		
		
	}
	
	public void postInit( FMLPostInitializationEvent e ){
		
		
		
	}
	
}
