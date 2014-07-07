package tutorial.DMAexample.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

//SNOWBALL IMPORTS
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import tutorial.DMAexample.MyEntities.DeathBallEntity;
import net.minecraft.world.World;



public class MyLauncherItem extends Item 
	{
	        public MyLauncherItem() 
	        {
	              super();
	              this.setHasSubtypes(true);
	      		  this.setCreativeTab(CreativeTabs.tabMaterials);
	        }
	        
	        //SNOWBALL CODE ***
	        /**
	         * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	         */
	        @Override
			public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	        {
	            if (!par3EntityPlayer.capabilities.isCreativeMode)
	            {
	                --par1ItemStack.stackSize;
	            }

	            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	            if (!par2World.isRemote)
	            {
	            	par2World.spawnEntityInWorld(new EntitySnowball(par2World, par3EntityPlayer));
	                //par2World.spawnEntityInWorld(new DeathBallEntity(par2World, par3EntityPlayer));
	            }

	            return par1ItemStack;
	        }
	        //Load Icons and Textures Properly
	    	@SideOnly(Side.CLIENT)
	    	private IIcon[] icons;
	        @Override
			@SideOnly(Side.CLIENT) 
	        public void registerIcons(IIconRegister par1IconRegister)
	        {
	            this.itemIcon = par1IconRegister.registerIcon("yourmodsname:" 
	            + (this.getUnlocalizedName().substring(5)));
	        }
	      }


	