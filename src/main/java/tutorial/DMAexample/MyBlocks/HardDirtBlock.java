package tutorial.DMAexample.MyBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;


public class HardDirtBlock extends Block 
	{
    
   @SideOnly(Side.CLIENT)
   private IIcon field_150116_a;
   @SideOnly(Side.CLIENT)
   private IIcon field_150115_b;

	        public HardDirtBlock (Material material) 
	        {
	        	
	                super(material);
	                
	                
	        }
	        
	        @Override
			@SideOnly(Side.CLIENT)
	        public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	        {
	            return p_149691_1_ == 0 ? this.field_150115_b : (p_149691_1_ == 1 ? this.field_150116_a : this.blockIcon);
	        }

	        
	         @Override
			@SideOnly(Side.CLIENT)
		        public void registerBlockIcons(IIconRegister p_149651_1_)
		        {
		            this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
		            this.field_150116_a = p_149651_1_.registerIcon(this.getTextureName() + "_top");
		            this.field_150115_b = p_149651_1_.registerIcon(this.getTextureName() + "_bottom");
		        }

	}