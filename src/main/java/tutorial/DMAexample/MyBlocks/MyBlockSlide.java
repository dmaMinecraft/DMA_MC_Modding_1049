package tutorial.DMAexample.MyBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class MyBlockSlide extends Block 
	{

	        public MyBlockSlide (Material material) 
	        {
	        	
	        	super(Material.ice);
	            this.slipperiness = 7.98F;
	            this.setTickRandomly(true);
	                
	                
	        }
	       
	}