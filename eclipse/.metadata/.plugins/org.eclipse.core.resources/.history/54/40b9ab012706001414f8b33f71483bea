package tutorial.DMAexample.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;
import net.minecraft.util.IIcon;


public class MyCustomSword extends ItemSword{

	public MyCustomSword( ToolMaterial material){
		super(material);
	}
	 
	//Load Icons and Textures Properly
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
    @SideOnly(Side.CLIENT) 
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("mycode:" 
        + (this.getUnlocalizedName().substring(5)));
    }
}

