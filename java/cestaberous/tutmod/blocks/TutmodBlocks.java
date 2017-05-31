package cestaberous.tutmod.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class TutmodBlocks {
	
	public static TutorialBlock tutorialBlock;
	
	public static final void init(){
		
		tutorialBlock = new TutorialBlock(Material.rock, "tutorialBlock");
		GameRegistry.registerBlock(tutorialBlock, tutorialBlock.getUnlocalizedName());
		
	}
	
}
