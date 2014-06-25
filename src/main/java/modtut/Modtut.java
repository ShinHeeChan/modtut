package modtut;

import modtut.blocks.ModBlocks;
import modtut.core.handler.CraftingHandler;
import modtut.core.handler.GrindHandler;
import modtut.core.proxy.CommonProxy;
import modtut.creativetab.ModtutTab;
import modtut.items.ModItems;
import modtut.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid=Reference.MODID, name=Reference.MODNAME, version = Reference.VERSION)

public class Modtut {
	private static CreativeTabs ModtutTab = new ModtutTab(CreativeTabs.getNextID(), Reference.MODID);
	 
	public static CreativeTabs getCreativeTabs()
	{
		return ModtutTab;
	}
	
	@Mod.Instance
	public static Modtut instance;
	
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event){
		ModBlocks.init();
		ModItems.init();
		CraftingHandler.init();
		proxy.registerTileEntities();
	}
	
	@Mod.EventHandler
	public static void init(FMLPreInitializationEvent event){
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GrindHandler());
	}
	
	@Mod.EventHandler
	public static void postInit(FMLPreInitializationEvent event){
	}
	
	@SidedProxy(clientSide = Reference.CLIENTPROXYLOCATION, serverSide = Reference.COMMONPROXYLOCATION)
	public static CommonProxy proxy;

}
