package modtut.items;

import net.minecraft.item.Item;
import modtut.items.testFood;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static Item testItem;
	public static Item dirtItem;
	public static Item testFood;
	
	public static void init(){
		testItem = new testItem();
		dirtItem = new dirtItem();
		testFood = new testFood();
	}
	
	public static void register(ItemModtut item){
		GameRegistry.registerItem(item, item.getUnwrappedUnlocalizedName(item.getUnlocalizedName()));		
	}
}
