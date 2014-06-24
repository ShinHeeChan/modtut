package modtut.items;

import cpw.mods.fml.common.registry.GameRegistry;
import modtut.Modtut;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class testFood extends ItemFood{
	public testFood(){
		super(7,1F,false);
		this.setUnlocalizedName("Hell Food");
		this.setCreativeTab(Modtut.getCreativeTabs());
		this.setAlwaysEdible();
		GameRegistry.registerItem(this,this.getUnlocalizedName());
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack is){
		//default : 32
		return 10;
	}
	
	
}
