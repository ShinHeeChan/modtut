package modtut.items;

import net.minecraft.item.Item;
import modtut.items.ItemFoodTest;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static Item testItem;
	public static Item dirtItem;
	public static Item testFood;
	
	public static void init(){
		testItem = new ItemTest();
		dirtItem = new ItemDirt();
		testFood = new ItemFoodTest();
	}
	
	public static void register(ItemModtut item){
		GameRegistry.registerItem(item, item.getUnwrappedUnlocalizedName(item.getUnlocalizedName()));		
	}
}
