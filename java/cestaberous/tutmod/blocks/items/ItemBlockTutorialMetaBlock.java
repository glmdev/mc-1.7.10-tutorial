package cestaberous.tutmod.blocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockTutorialMetaBlock extends ItemBlockWithMetadata {

	public ItemBlockTutorialMetaBlock(Block block) {
		super(block, block);
	}
	
	public String getUnlocalizedName( ItemStack item ){
		return this.getUnlocalizedName() + "_" + item.getItemDamage(); // "tile.tutorialMetaBlock_3"
	}

}
