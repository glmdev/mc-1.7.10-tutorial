package cestaberous.tutmod.blocks;

import cestaberous.tutmod.blocks.items.ItemBlockTutorialMetaBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class TutmodBlocks {
	
	public static TutorialBlock tutorialBlock;
	public static TutorialSidedBlock tutorialSidedBlock;
	public static TutorialMetaBlock tutorialMetaBlock;
	
	public static final void init(){
		
		tutorialBlock = new TutorialBlock(Material.rock, "tutorialBlock");
		tutorialSidedBlock = new TutorialSidedBlock(Material.rock, "tutorialSidedBlock");
		tutorialMetaBlock = new TutorialMetaBlock( Material.rock, "tutorialMetaBlock" );
		
		GameRegistry.registerBlock(tutorialBlock, tutorialBlock.getUnlocalizedName());
		GameRegistry.registerBlock(tutorialSidedBlock, tutorialSidedBlock.getUnlocalizedName());
		GameRegistry.registerBlock(tutorialMetaBlock, ItemBlockTutorialMetaBlock.class, tutorialMetaBlock.getUnlocalizedName());
		
	}
	
}
