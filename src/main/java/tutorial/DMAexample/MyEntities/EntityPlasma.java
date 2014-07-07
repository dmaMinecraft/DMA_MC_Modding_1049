package tutorial.DMAexample.MyEntities;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
	
public class EntityPlasma extends EntityThrowable
	{
	    private static final String __OBFID = "CL_00001722";

	    public EntityPlasma(World par1World)
	    {
	        super(par1World);
	    }

	    public EntityPlasma(World par1World, EntityLivingBase par2EntityLivingBase)
	    {
	        super(par1World, par2EntityLivingBase);
	    }

	    public EntityPlasma(World par1World, double par2, double par4, double par6)
	    {
	        super(par1World, par2, par4, par6);
	    }

	    /**
	     * Called when this EntityThrowable hits a block or entity.
	     */
	  
	    @Override
	    protected void onImpact(MovingObjectPosition movingobjectposition) 
	    {
	      //TODO - auto generated method stub
	    	System.out.println(this.chunkCoordX + ":x "+ this.chunkCoordY + ":Y "+ this.chunkCoordZ + ":Z ");
	    	
	    	this.worldObj.setBlock(this.chunkCoordX, this.chunkCoordY, this.chunkCoordZ, Blocks.bedrock);
	        this.setDead();
	    }
	}