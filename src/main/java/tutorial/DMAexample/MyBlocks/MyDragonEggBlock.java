package tutorial.DMAexample.MyBlocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class MyDragonEggBlock extends Block 
	{
	 private static final String __OBFID = "CL_00000232";
	        public MyDragonEggBlock (Material material) 
	        {
	        	
	                super(material);
	                this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
	                
	        }  /**
	         * Called whenever the block is added into the world. Args: world, x, y, z
	         */
	        public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_)
	        {
	            p_149726_1_.scheduleBlockUpdate(p_149726_2_, p_149726_3_, p_149726_4_, this, this.tickRate(p_149726_1_));
	        }

	        /**
	         * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	         * their own) Args: x, y, z, neighbor Block
	         */
	        public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
	        {
	            p_149695_1_.scheduleBlockUpdate(p_149695_2_, p_149695_3_, p_149695_4_, this, this.tickRate(p_149695_1_));
	        }

	        /**
	         * Ticks the block if it's been scheduled
	         */
	        public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
	        {
	            this.func_150018_e(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_);
	        }

	        private void func_150018_e(World p_150018_1_, int p_150018_2_, int p_150018_3_, int p_150018_4_)
	        {
	            if (BlockFalling.func_149831_e(p_150018_1_, p_150018_2_, p_150018_3_ - 1, p_150018_4_) && p_150018_3_ >= 0)
	            {
	                byte b0 = 32;

	                if (!BlockFalling.fallInstantly && p_150018_1_.checkChunksExist(p_150018_2_ - b0, p_150018_3_ - b0, p_150018_4_ - b0, p_150018_2_ + b0, p_150018_3_ + b0, p_150018_4_ + b0))
	                {
	                    EntityFallingBlock entityfallingblock = new EntityFallingBlock(p_150018_1_, (double)((float)p_150018_2_ + 0.5F), (double)((float)p_150018_3_ + 0.5F), (double)((float)p_150018_4_ + 0.5F), this);
	                    p_150018_1_.spawnEntityInWorld(entityfallingblock);
	                }
	                else
	                {
	                    p_150018_1_.setBlockToAir(p_150018_2_, p_150018_3_, p_150018_4_);

	                    while (BlockFalling.func_149831_e(p_150018_1_, p_150018_2_, p_150018_3_ - 1, p_150018_4_) && p_150018_3_ > 0)
	                    {
	                        --p_150018_3_;
	                    }

	                    if (p_150018_3_ > 0)
	                    {
	                        p_150018_1_.setBlock(p_150018_2_, p_150018_3_, p_150018_4_, this, 0, 2);
	                    }
	                }
	            }
	        }

	        


	        /**
	         * How many world ticks before ticking
	         */
	        public int tickRate(World p_149738_1_)
	        {
	            return 5;
	        }

	        /**
	         * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	         * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	         */
	        public boolean isOpaqueCube()
	        {
	            return false;
	        }

	        /**
	         * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	         */
	        public boolean renderAsNormalBlock()
	        {
	            return false;
	        }

	        /**
	         * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
	         * coordinates.  Args: blockAccess, x, y, z, side
	         */
	        @SideOnly(Side.CLIENT)
	        public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
	        {
	            return true;
	        }

	        /**
	         * The type of render function that is called for this block
	         */
	        public int getRenderType()
	        {
	            return 27;
	        }

	        /**
	         * Gets an item for the block being called on. Args: world, x, y, z
	         */
	        @SideOnly(Side.CLIENT)
	        public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	        {
	            return Item.getItemById(0);
	        }
	}