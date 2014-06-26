package modtut.core.handler;

import modtut.client.gui.DF_gui_test;
import modtut.client.gui.GUIDoubleFurnace;
import modtut.Inventory.ContainerDoubleFurnace;
import modtut.tileentities.TEDoubleFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class DFHandler implements IGuiHandler{
	public DFHandler(){}
	
	//server
	@Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == 2)
        {
            // Create an Object of our TE, so we can give that to our inventory.
            TEDoubleFurnace gc = (TEDoubleFurnace) world.getTileEntity(x, y, z);
            return new ContainerDoubleFurnace(player.inventory, gc);
        }
        return null;
    }
	
	//client
	@Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == 0)
            return new DF_gui_test();
        if(ID == 2)
        {
            // Create an Object of our TE, so we can give that to our GUI.
        	TEDoubleFurnace gc = (TEDoubleFurnace) world.getTileEntity(x, y, z);
            return new GUIDoubleFurnace(player.inventory, gc);
        }
        return null;
    }
}
