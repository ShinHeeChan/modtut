package modtut.items;

import modtut.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;

public class dirtItem extends ItemModtut{
	public dirtItem(){
		this.setUnlocalizedName(Strings.DirtItemName);
		this.setCreativeTab(CreativeTabs.tabCombat);
		ModItems.register(this);
	}
}
