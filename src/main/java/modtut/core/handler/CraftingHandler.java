package modtut.core.handler;

import modtut.blocks.ModBlocks;
import modtut.items.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;

public class CraftingHandler {
	public static void init(){
		registerRecipes();
	}

	
	public static void registerRecipes(){
		CraftingManager.getInstance().addRecipe(new ItemStack(ModItems.testItem, 4), "###","#s#","###", '#', ModItems.dirtItem, 's', ModBlocks.testBlock);
		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(ModItems.testItem, 1), Blocks.dirt, Blocks.dirt, Blocks.coal_block, ModBlocks.testBlock);
		ItemStack manipulation = new ItemStack(Items.diamond_sword);
		manipulation.addEnchantment(Enchantment.sharpness, 1);
		CraftingManager.getInstance().addShapelessRecipe(manipulation,ModBlocks.testBlock,ModItems.testItem,Items.diamond_sword,Items.diamond);
		FurnaceRecipes.smelting().func_151396_a(ModItems.testItem, new ItemStack(ModItems.dirtItem,4), 4f);
	}
}
