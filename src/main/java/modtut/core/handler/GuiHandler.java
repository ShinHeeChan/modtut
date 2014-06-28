package modtut.core.handler;

import modtut.Inventory.ContainerDoubleFurnace;
import modtut.Inventory.ContainerGrinder;
import modtut.client.gui.GUIGrinder;
import modtut.client.gui.gui_test;
import modtut.tileentities.TEDoubleFurnace;
import modtut.tileentities.TEGrinder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;


public class GuiHandler implements IGuiHandler
{
    public GuiHandler(){}
 
    /**
     * Gets the server element.
     * This means, do something server side, when this ID gets called.
     */
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == 1)
        {
            // Create an Object of our TE, so we can give that to our inventory.
            TEGrinder gc = (TEGrinder) world.getTileEntity(x, y, z);
            return new ContainerGrinder(player.inventory, gc);
        }
        if(ID == 2)
        {
            // Create an Object of our TE, so we can give that to our inventory.
            TEDoubleFurnace gc = (TEDoubleFurnace) world.getTileEntity(x, y, z);
            return new ContainerDoubleFurnace(player.inventory, gc);
        }
        return null;
    }
 
    /**
     * Gets the client element.
     * This means, do something client side, when this ID gets called.
     */
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == 0)
            return new gui_test();
        if(ID == 1)
        {
            // Create an Object of our TE, so we can give that to our GUI.
            TEGrinder gc = (TEGrinder) world.getTileEntity(x, y, z);
            return new GUIGrinder(player.inventory, gc);
        }
        if(ID == 2)
        {
            // Create an Object of our TE, so we can give that to our inventory.
            TEDoubleFurnace gc = (TEDoubleFurnace) world.getTileEntity(x, y, z);
            return new ContainerDoubleFurnace(player.inventory, gc);
        }
        return null;
    }
}