package zdoctor.hp.common.items;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import zdoctor.hp.ModMain;

public class ItemMic extends Item {
    public ItemMic() {
        super();
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setMaxStackSize(1);
        this.setUnlocalizedName(ModMain.MODID + "_Mic");
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack iStack, World world, EntityPlayer player) {
        if(world.isRemote) {
            
        }
        return iStack;
    }
}
