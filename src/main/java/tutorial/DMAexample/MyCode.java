package tutorial.DMAexample;

//Recipes - Very important imports for creating recipes
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

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
	
	public static void MyBlocks(){
		
		
		
		
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
		
		public class DMAItem extends Item {
			

		}

		
	}
	
 

}
