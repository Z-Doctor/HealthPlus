package zdoctor.hp.common;

import zdoctor.hp.common.events.EventRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
  
  public void preInit(FMLPreInitializationEvent e) {
    CTabs.preInit();
    ZItems.preInit();
    
  }
  
  public void init(FMLInitializationEvent e) {
    ZItems.init();
    EventRegistry.init();
    
  }
  
  public void postInit(FMLPostInitializationEvent e) {
    
  }
  
}
