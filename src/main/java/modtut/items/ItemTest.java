package modtut.items;

import modtut.Modtut;
import modtut.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;

public class ItemTest extends ItemModtut{
	public ItemTest(){
		this.setUnlocalizedName(Strings.TestItemName);
		this.setCreativeTab(Modtut.getCreativeTabs());
		ModItems.register(this);
	}
}
