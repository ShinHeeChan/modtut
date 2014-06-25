package modtut.core.proxy;

import modtut.tileentities.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TEGrinder.class, "GrindContainer");
		GameRegistry.registerTileEntity(TEDoubleFurnace.class, "DoubleFurnaceContainer");
	}
}
