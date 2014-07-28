package tutorial.DMAexample.render;

import tutorial.DMAexample.YourModsName;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class renderTestEntity extends RenderBiped {

private static final ResourceLocation textureLocation = new ResourceLocation(YourModsName.MODID + ":" + "textures/models/entityTest.png");

public renderTestEntity(ModelBiped model, float shadowSize) {
super(model, shadowSize);
}

@Override
protected ResourceLocation getEntityTexture(Entity par1Entity)
{
return textureLocation;
}
}