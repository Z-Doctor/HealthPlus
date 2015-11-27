package zdoctor.hp.common.events;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import zdoctor.hp.common.renderer.CreatureDisk;
import zdoctor.hp.common.renderer.HelperRender;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventRegistry {
    public static class forge {
        @SubscribeEvent
        public void renderWorldLast(RenderWorldLastEvent e) {
            HelperRender.partialTicks = e.partialTicks;
        }
        
        @SubscribeEvent
        public void renderLiving(RenderLivingEvent.Specials.Pre e) {
            if(e.entity.worldObj.isRemote) {
                if(e.entity.isCreatureType(EnumCreatureType.creature, false)) {
                    CreatureDisk.updateDisk(Minecraft.getMinecraft().thePlayer, (EntityCreature) e.entity);
                }
            }
        }
    }

    public static class fml {
    }

    public static void init() {
        System.out.println("Registering Events");
        MinecraftForge.EVENT_BUS.register(new forge());
        // MinecraftForge.TERRAIN_GEN_BUS.register(target);
        // MinecraftForge.ORE_GEN_BUS.register(target);
        FMLCommonHandler.instance().bus().register(new fml());
    }
}
