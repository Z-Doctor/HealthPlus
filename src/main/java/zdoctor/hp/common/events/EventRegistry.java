package zdoctor.hp.common.events;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import zdoctor.hp.client.renderer.CreatureDisk;
import zdoctor.hp.client.renderer.HelperRender;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;

public class EventRegistry {
  public static class ForgeEvents {
//    @SubscribeEvent
//    public void renderLiving(RenderLivingEvent.Specials.Pre e) {
//      if (e.entity.worldObj.isRemote) {
//        if (e.entity.isCreatureType(EnumCreatureType.creature, false)) {
//          CreatureDisk.renderDisk(Minecraft.getMinecraft().thePlayer, (EntityCreature) e.entity);
//        }
//      }
//    }
  }
  
  public static class FMLEvents {
//    @SubscribeEvent(priority = EventPriority.HIGHEST)
//    public void renderTick(TickEvent.RenderTickEvent e) {
//      HelperRender.partialTicks = e.renderTickTime;
//    }
    
  }
  
  public static void init() {
    System.out.println("Registering Events");
    MinecraftForge.EVENT_BUS.register(new ForgeEvents());
    // MinecraftForge.TERRAIN_GEN_BUS.register(target);
    // MinecraftForge.ORE_GEN_BUS.register(target);
    FMLCommonHandler.instance().bus().register(new FMLEvents());
  }
}
