package zdoctor.hp.client.renderer;

import static zdoctor.hp.client.renderer.HelperRender.calcRenderPos;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class CreatureDisk {
    protected static ResourceLocation cDisk = new ResourceLocation("ZDoctorHP:textures/CreatureDisk.png");
    public static void renderDisk(EntityPlayer player, EntityCreature entity) {
        Tessellator tessellator = Tessellator.instance;
        
        double diffX = calcRenderPos(entity.posX, entity.prevPosX) - calcRenderPos(player.posX, player.prevPosX);
        double diffY = calcRenderPos(entity.posY, entity.prevPosY) - calcRenderPos(player.posY, player.prevPosY);
        double diffZ = calcRenderPos(entity.posZ, entity.prevPosZ) - calcRenderPos(player.posZ, player.prevPosZ);
        
//        double diffX = calcRenderPos(entity.posX, entity.lastTickPosX) - calcRenderPos(player.posX, player.lastTickPosX);
//        double diffY = calcRenderPos(entity.posY, entity.lastTickPosY) - calcRenderPos(player.posY, player.lastTickPosY);
//        double diffZ = calcRenderPos(entity.posZ, entity.lastTickPosZ) - calcRenderPos(player.posZ, player.lastTickPosZ);
//        
        
        GL11.glPushMatrix();
        GL11.glTranslated(diffX, diffY, diffZ);
        GL11.glRotated(-player.rotationYaw, 0f, 1f, 0f);
        GL11.glColor4f(1f, 1f, 1f, 1f);
        Minecraft.getMinecraft().renderEngine.bindTexture(cDisk);
        tessellator.startDrawing(GL11.GL_QUADS);
        
        tessellator.addVertexWithUV(0, 0, 0, 1, 1);
        tessellator.addVertexWithUV(0, 1, 0, 1, 0);
        tessellator.addVertexWithUV(1, 1, 0, 0, 0);
        tessellator.addVertexWithUV(1, 0, 0, 0, 1);
        
        tessellator.draw();
        GL11.glPopMatrix();
    }
}
