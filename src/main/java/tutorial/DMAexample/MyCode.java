package tutorial.DMAexample;

//Recipes - Very important imports for creating recipes
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


//MyBlocks
import tutorial.DMAexample.MyBlocks.HardDirtBlock;
import tutorial.DMAexample.MyBlocks.HardOre;

//Blocks
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//Items
import net.minecraft.util.MathHelper;

public class MyCode {
	
	//List Blocks and Items Here
	public static Block hardDirt;
	public static Block hardOre;
	
	
	public static void MyBlocks(){
		
		//Harden Dirt
		 hardDirt = new HardDirtBlock(Material.ground)
         .setHardness(2.0F)
         .setStepSound(Block.soundTypeGravel)
         .setBlockName("hardDirt")
         .setCreativeTab(CreativeTabs.tabBlock)
         .setBlockTextureName("dirt");
		 
		 //Harden Ore
		 hardOre = new HardOre(Material.rock)
		 .setHardness(0.9F)
         .setStepSound(Block.soundTypeGravel)
         .setBlockName("hardOre")
         .setCreativeTab(CreativeTabs.tabBlock)
         .setBlockTextureName("stone");
		 
		 //Harvest Level
		 hardDirt.setHarvestLevel("shovel", 1);
		 hardOre.setHarvestLevel("pickaxe", 3);		 
		 
		 //Register Items
		 GameRegistry.registerBlock(hardDirt, "HardDirt");
		 GameRegistry.registerBlock(hardOre, "HardOre");
		
		
	}
	
	public static void MyRecipes(){
		
		 
		 GameRegistry.addRecipe(new ItemStack(Items.cookie), new Object[] {
			    "ABA",
				'A', Items.wheat,
				'B', new ItemStack(Items.dye, 1, 3) 
				});
		 
		GameRegistry.addShapelessRecipe( new ItemStack(Blocks.brown_mushroom),  new Object[] {new ItemStack(Items.cookie)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 3), new Object[] { new ItemStack(Blocks.sapling) });
		
	}
	
	public static void MyItems(){
		
		
		
	}
	
 

}
