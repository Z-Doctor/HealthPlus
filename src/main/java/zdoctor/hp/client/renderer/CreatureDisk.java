package zdoctor.hp.client.renderer;

import static zdoctor.hp.client.renderer.HelperRender.calcRenderPos;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class CreatureDisk {
  protected static float test = 0f;
  protected static ResourceLocation cDisk = new ResourceLocation("ZDoctorHP:textures/CreatureDisk.png");
  
  public static void renderDisk(EntityPlayer player, EntityCreature entity) {
    Tessellator tessellator = Tessellator.instance;
    
    if(test > 1f)
      test = 0f;
    else
      test += .1f;
    
    double diffX = calcRenderPos(entity.posX, entity.prevPosX) - calcRenderPos(player.posX, player.prevPosX);
    double diffY = calcRenderPos(entity.posY, entity.prevPosY) - calcRenderPos(player.posY, player.prevPosY);
    double diffZ = calcRenderPos(entity.posZ, entity.prevPosZ) - calcRenderPos(player.posZ, player.prevPosZ);
    
    GL11.glPushMatrix();
    GL11.glTranslated(diffX, diffY + entity.height, diffZ);
//    GL11.glRotated(-player.rotationYaw, 0f, 1f, 0f);
    GL11.glColor4f(1f, 1f, 1f, 1f);
    Minecraft.getMinecraft().renderEngine.bindTexture(cDisk);
    tessellator.startDrawing(GL11.GL_QUADS);
    
    tessellator.addVertexWithUV(0, -0.5f, 0, 0, 0);
    tessellator.addVertexWithUV(0, 0.5f, 0, 1, 0);
    tessellator.addVertexWithUV(1, 0.5f, 0, 0, 0);
    tessellator.addVertexWithUV(1, -0.5f, 0, 0, 1);
    
    tessellator.draw();
    GL11.glPopMatrix();
  }
}
