package tutorial.DMAexample.MyBlocks;

import java.util.Random;

import tutorial.DMAexample.MyCode;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class MyIceBlock extends Block 
	{

	        public MyIceBlock (Material material) 
	        {
	        	
	                super(material);
	                
	                this.slipperiness = 7.0F;
	                this.setTickRandomly(true);
	                this.setCreativeTab(CreativeTabs.tabBlock);
	        }
	        //If the block's drop is a block.
	        @Override
	        public Item getItemDropped(int metadata, Random random, int fortune) {
	           
	        	int d = 0, rh;
	            rh = random.nextInt(99);
	        	
	        	
	        	if(rh > 25){
	        	return MyCode.myCustomSword;
	        	} else {
	        		return MyCode.MyBow;
	        	}
	        	
	        	}
	        }
	