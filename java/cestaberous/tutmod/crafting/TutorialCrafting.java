package cestaberous.tutmod.crafting;

import cestaberous.tutmod.blocks.TutmodBlocks;
import cestaberous.tutmod.items.TutmodItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TutorialCrafting {
	
	public static void init(){
		
		// Recipes here
		GameRegistry.addSmelting(Items.baked_potato, new ItemStack(TutmodItems.tutorialItem), 0.5F); // iron: 0.7F // diamond: 1.0F
		
		GameRegistry.addShapelessRecipe(new ItemStack(TutmodItems.tutorialItem), new Object[]{ Items.baked_potato, Items.coal });
		
		GameRegistry.addRecipe(new ItemStack(TutmodBlocks.tutorialBlock), new Object[]{ "IB", "II", 'I', TutmodItems.tutorialItem, 'B', Items.baked_potato });
	}
	
}
