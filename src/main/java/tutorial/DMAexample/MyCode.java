package tutorial.DMAexample;

//Recipes - Very important imports for creating recipes
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
//import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.util.EnumHelper;

//MyBlocks

import tutorial.DMAexample.MyBlocks.HardOre;
import tutorial.DMAexample.MyBlocks.BaseBlock;

import tutorial.DMAexample.MyEntities.DeathBallEntity;

//MyItems
import tutorial.DMAexample.MyItems.BaseItem;
import tutorial.DMAexample.MyItems.MyLauncherItem;


//MyCreative Tab
import net.minecraft.creativetab.CreativeTabs;



//Blocks
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//Items
import net.minecraft.util.MathHelper;

public class MyCode {
	
	//Custom Creative Tab
	public static CreativeTabs tabMyMod = new MyCreativeTab("MyMod");
	
	//List Blocks and Items Here
	
	//Blocks
	public static Block hardOre;
	public static Block harderDirt;
	
	//Items
	public static Item MyLauncher;
	public static Item MyFood;
	
	//Tool
	//public static Item axeTutorial;
	//public static Item.ToolMaterial PLA = EnumHelper.addToolMaterial("PLA", 3, 192, 5.0F, 1.5F, 12);

	
	//Tool Material
	//public static Item.ToolMaterial exampleMaterial = EnumHelper.addToolMaterial("examplematerial",  2, 1000, 6.0F, 2.0F, 5);	
	//public static final ArmorMaterial CUS TOM_MATERIAL= EnumHelper.addArmorMaterial("Custom", 5, new int[] {1,3,2,1}, 5);
	
	public static void MyBlocks(){

		//Harderened Dirt
		 harderDirt = new BaseBlock(Material.ground)
         .setHardness(12.0F)
         .setStepSound(Block.soundTypeGravel)
         .setBlockName("harderDirt")
         .setCreativeTab(CreativeTabs.tabBlock)
         .setBlockTextureName("ice");
		 
		 //Harden Ore
		 hardOre = new HardOre(Material.iron)
		 .setHardness(0.9F)
         .setStepSound(Block.soundTypeGravel)
         .setBlockName("hardOre")
         .setCreativeTab(CreativeTabs.tabBlock)
         .setBlockTextureName("yourmodsname:hardore_pumpkinore");
		 
		 //Harvest Level
		 harderDirt.setHarvestLevel("shovel", 1);
		 hardOre.setHarvestLevel("pickaxe", 3);		 
		 
		 //Register Items
		 GameRegistry.registerBlock(hardOre, "HardOre");
		 GameRegistry.registerBlock(harderDirt, "HarderDirt");
		 
		 
		 //MyOreGenerator ore_gen = new MyOreGenerator();
		 //GameRegistry.registerWorldGenerator(ore_gen, 0);
		 //For Generating Ores in Game - Day 5
		
	}
	
	public static void MyRecipes()
	{
		
	//Shapeless - First Shapeless Recipe (CommandBlock from Red Stone Torch)
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.command_block), new Object[] { new ItemStack(Blocks.redstone_torch) });
				
		
	//Shaped 
		
		//Comment Every Recipe!!!!!!!!!!!!!!!!!!! Hard Ore from cactus, gold, cocoa beans.
		//This recipe is so expensive for no good reason
		 GameRegistry.addRecipe(new ItemStack(hardOre, 10), new Object[] 
					{
				    "AAA", "BBB", "C C",
					'A', Blocks.gold_block,
					'B', new ItemStack(Items.dye, 1, 3),
				    'C', Blocks.cactus,
					});
		 
		 ItemStack sharpLauncher = new ItemStack(MyLauncher);
		 sharpLauncher.addEnchantment(Enchantment.sharpness, 300);
		 //sharpSteak.addEnchantment(Enchantment.sharpness, 3);
		 
		 //Make Pumpkin Pie - Really messed up pumpkin pie recipe 
		 GameRegistry.addRecipe(sharpLauncher, new Object[] 
					{
				    " A", "AB",
					'A', Blocks.gold_block,
				    'B', Blocks.dirt,
					});
			
		
	//Smelting
		
		//Cookie Cooked Steak
			GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 3), new ItemStack(hardOre, 8), 1.0F);
		
		
		
		
	}
	
	public static void MyItems()
	{
		
		MyLauncher = new MyLauncherItem()
		.setMaxStackSize(1)
		.setUnlocalizedName("launcher_item");
		
		 MyFood = new ItemFood(6, 0.6F, false)
		 .setUnlocalizedName("potatoBaked")
		 .setTextureName("potato_baked");
        	
		 GameRegistry.registerItem(MyLauncher, "MyLauncher");
         GameRegistry.registerItem(MyFood, "MyFood");
		 
		 
		 
		 
		 
         //Custom Sword
         //myCustomSword = new CustomSword(PLA)
         //.setUnlocalizedName("customsword");
		//GameRegistry.registerItem(myCustomSword, "CustomSword");
         
		 //Custom Axe
         // myCustomAxe = new CustomAxe(PLA)
         // 	.setUnlocalizedName("mycustomaxe");
		//GameRegistry.registerItem(myCustomAxe, "CustomAxe");
         
         
        
         
         
         
         
         
         
         CreativeTabs tabCustom = new CreativeTabs("tabName") {
        	    @Override
        	    @SideOnly(Side.CLIENT)
        	    public Item getTabIconItem() {
        	    	
        	        return Items.ender_eye;
        	    }
        	};
         
         
       
         
         // GameRegistry.registerItem(axeTutorial, "axeTutorial");
   
		
	}
	
 

}
