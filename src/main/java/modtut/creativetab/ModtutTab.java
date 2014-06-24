package modtut.creativetab;

import modtut.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModtutTab extends CreativeTabs{
	public ModtutTab(int id, String modid)
    {
        super(id, modid);
    }
 
    @Override
    public Item getTabIconItem()
    {
        return ModItems.testItem;
    }
}
