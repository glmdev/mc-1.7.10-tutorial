package cestaberous.tutmod.blocks;

import java.util.List;

import cestaberous.tutmod.lib.ModVars;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class TutorialMetaBlock extends Block {

	public IIcon[] textures = new IIcon[6];
	
	protected TutorialMetaBlock(Material material, String name) {
		super(material);
		
		this.setBlockName(name);
		this.setBlockTextureName(ModVars.MOD_ID+":"+this.getUnlocalizedName().substring(5)); // tutmod:tutorialMetaBlock
		this.setCreativeTab(CreativeTabs.tabMisc);
		
		this.setHardness(3.0F); // stone: 1.5F // obsidian: 50.0F
		this.setLightLevel(0.5F); // glowstone: 1.0F // stone: 0.0F
		this.setHarvestLevel("pickaxe", 2); // wood: 0 // stone: 1 // iron: 2 // diamond: 3
		this.setResistance(30.0F); // stone: 10.0F // obsidian: 2000.0F
		this.setStepSound(soundTypeStone);
	}
	
	public void registerBlockIcons( IIconRegister reg ){
		for ( int count = 0; count < 5; count++ ){
			
			this.textures[count] = reg.registerIcon(this.textureName+"_"+count);
			
		}
	}
	
	
	public IIcon getIcon ( int side, int meta ){
		if ( meta > 4 ) meta = 0;
		return this.textures[meta];
	}
	
	
	public int damageDropped( int oldMeta ){
		return oldMeta;
	}
	
	
	public void getSubBlocks(Item item, CreativeTabs tab, List list){
		for ( int count = 0; count < 5; count++ ){
			
			list.add(new ItemStack(item, 1, count));
			
		}
	}

}
