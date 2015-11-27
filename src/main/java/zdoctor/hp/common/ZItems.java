package zdoctor.hp.common;

import zdoctor.hp.common.items.ItemMic;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;


public class ZItems {
    public static Item itemMic;
    
    public static void preInit() {
       
    };
    
    public static void init() {
        itemMic = new ItemMic();
        GameRegistry.registerItem(itemMic, "Mic");
    };

}
