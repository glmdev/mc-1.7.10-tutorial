package cestaberous.tutmod.blocks;

import cestaberous.tutmod.lib.ModVars;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TutorialBlock extends Block {

	protected TutorialBlock(Material material, String name) {
		super(material);
		
		this.setBlockName(name);
		this.setBlockTextureName(ModVars.MOD_ID+":"+this.getUnlocalizedName().substring(5)); // tutmod:block
		this.setCreativeTab(CreativeTabs.tabMisc);
		
		this.setHardness(3.0F); // stone: 1.5F // obsidian: 50.0F
		this.setLightLevel(0.5F); // glowstone: 1.0F // stone: 0.0F
		this.setHarvestLevel("pickaxe", 2); // wood: 0 // stone: 1 // iron: 2 // diamond: 3
		this.setResistance(30.0F); // stone: 10.0F // obsidian: 2000.0F
		this.setStepSound(soundTypeStone);
	}

}
