package cestaberous.tutmod.items;

import cestaberous.tutmod.lib.ModVars;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutmodItems {
	
	public static Item tutorialItem;
	
	public static final void init(){
		
		tutorialItem = new Item().setUnlocalizedName("tutorialItem").setCreativeTab(CreativeTabs.tabRedstone);
		tutorialItem.setTextureName(ModVars.MOD_ID+":"+tutorialItem.getUnlocalizedName().substring(5)); // tutmod:tutorialItem
		GameRegistry.registerItem(tutorialItem, tutorialItem.getUnlocalizedName());
		
	}
	
}