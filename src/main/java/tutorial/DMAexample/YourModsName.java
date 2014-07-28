package tutorial.DMAexample;

import java.util.Random;

import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
//Import MyCode to Boiler Plate
import tutorial.DMAexample.MyCode;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
//import cpw.mods.fml.common.Mod.PreInit;    // used in 1.5.2
//import cpw.mods.fml.common.Mod.Init;       // used in 1.5.2
//import cpw.mods.fml.common.Mod.PostInit;   // used in 1.5.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = YourModsName.MODID, version = YourModsName.VERSION)

public class YourModsName {
		
		//List Items and Blocks Here!
    public static final String MODID = "yourmodsname";
    public static final String VERSION = "1.0";
		

        // The instance of your mod that Forge uses.
        @Instance(MODID)
        public static YourModsName instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="tutorial.DMAexample.client.ClientProxy", serverSide="tutorial.DMAexample.CommonProxy")
        public static CommonProxy proxy;
        
        @EventHandler // used in 1.6.2
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        	
        		//#MyCode Block Properties
        	MyCode.MyItems();    
        	MyCode.MyBlocks();
        	
        	    //Mob Code
        	//registerEntity(EntityTest.class, "entityTest");
        }
        
        @EventHandler // used in 1.6.2
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                //#MyCode Recipes
                MyCode.MyRecipes();
                //GameRegistry.registerWorldGenerator(new MyOreGenerator(),1);
        }
        
        
        @EventHandler // used in 1.6.2
        //@PostInit   // used in 1.5.2
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
        
        
        public static void registerEntity(Class entityClass, String name)
        {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        long seed = name.hashCode();
        Random rand = new Random(seed);
        int primaryColor = rand.nextInt() * 16777215;
        int secondaryColor = rand.nextInt() * 16777215;

        EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
        EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
        }
        
        
}
