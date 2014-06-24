package modtut.core.handler;

import modtut.client.gui.GrindGUI;
import modtut.Inventory.GrindInventory;
import modtut.client.gui.TestGUI;
import modtut.tileentities.GrindContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;


public class GrindHandler implements IGuiHandler
{
    public GrindHandler(){}
 
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
            GrindContainer gc = (GrindContainer) world.getTileEntity(x, y, z);
            return new GrindInventory(player.inventory, gc);
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
            return new TestGUI();
        if(ID == 1)
        {
            // Create an Object of our TE, so we can give that to our GUI.
            GrindContainer gc = (GrindContainer) world.getTileEntity(x, y, z);
            return new GrindGUI(player.inventory, gc);
        }
        return null;
    }
}