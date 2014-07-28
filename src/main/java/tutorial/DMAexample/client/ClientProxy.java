package tutorial.DMAexample.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import tutorial.DMAexample.CommonProxy;
import tutorial.DMAexample.MyCode;
import tutorial.DMAexample.MyEntities.DeathBallEntity;
import tutorial.DMAexample.render.renderDeathBall;


public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                // This is for rendering entities and so forth later on
        	
        	/*EntityRegistry.registerGlobalEntityID(DeathBallEntity.class, "DeathBall", EntityRegistry.findGlobalUniqueEntityId());
    		System.out.println("Entity Reged");
        	RenderingRegistry.registerEntityRenderingHandler(DeathBallEntity.class, new renderDeathBall(MyCode.MyLauncher));
    		System.out.println("Renderer Reged");
    		RenderingRegistry.registerEntityRenderingHandler(EntityTest.class, new RenderTest(new ModelBiped(), 0.5F));
    		*/
        }
        
}