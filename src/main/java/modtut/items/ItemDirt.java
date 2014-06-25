package modtut.items;

import modtut.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;

public class ItemDirt extends ItemModtut{
	public ItemDirt(){
		this.setUnlocalizedName(Strings.DirtItemName);
		this.setCreativeTab(CreativeTabs.tabCombat);
		ModItems.register(this);
	}
}
