package modtut.items;

import modtut.Modtut;
import modtut.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;

public class testItem extends ItemModtut{
	public testItem(){
		this.setUnlocalizedName(Strings.TestItemName);
		this.setCreativeTab(Modtut.getCreativeTabs());
		ModItems.register(this);
	}
}
