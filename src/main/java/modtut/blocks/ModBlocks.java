package modtut.blocks;

import modtut.blocks.GrindBlock;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Block testBlock;
	public static Block	testTileBlock;
	public static Block testInventory;
	public static Block grindBlock;
	public static Block DoubleFurnace;
	
	public static void init(){
		testBlock = new testBlock();
		testTileBlock = new TestTileBlock();
		grindBlock = new GrindBlock();
		DoubleFurnace = new DoubleFurnace(false);
	}
	
	public static void register(BlockModtut block){
		GameRegistry.registerBlock(block, block.getUnwrappedUnlocalizedName(block.getUnlocalizedName()));
	}
}
