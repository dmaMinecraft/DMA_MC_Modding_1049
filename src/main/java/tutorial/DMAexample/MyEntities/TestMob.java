
package tutorial.DMAexample.MyEntities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class TestMob extends EntityMob{

public TestMob(World par1World) {
super(par1World);





this.tasks.addTask(1, new EntityAISwimming(this));
this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.2D, false));
this.tasks.addTask(3, new EntityAIWander(this, 1.0D));
this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
this.tasks.addTask(5, new EntityAILookIdle(this));

this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));

}

@Override
protected void applyEntityAttributes()
{
	 super.applyEntityAttributes();
this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
}



public boolean isAIEnabled()
{
	 return true;
}
}