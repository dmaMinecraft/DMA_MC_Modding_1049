package tutorial.DMAexample.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import tutorial.DMAexample.CommonProxy;
import tutorial.DMAexample.MyCode;
import tutorial.DMAexample.MyEntities.DeathBallEntity;


public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                // This is for rendering entities and so forth later on
        	
        	/*EntityRegistry.registerGlobalEntityID(DeathBallEntity.class, "DeathBall", EntityRegistry.findGlobalUniqueEntityId());
    		System.out.println("Entity Reged");
        	RenderingRegistry.registerEntityRenderingHandler(DeathBallEntity.class, new RenderDeathBall(MyCode.MyLauncher));
    		//System.out.println("Renderer Reged");*/
        }
        
}