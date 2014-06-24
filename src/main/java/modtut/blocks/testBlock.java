package modtut.blocks;

import modtut.Modtut;
import modtut.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class testBlock extends BlockModtut {
	public testBlock(){
		this.setBlockName(Strings.TestBlockName);
        this.setHardness(1f);
        this.setResistance(3f);
        this.setCreativeTab(Modtut.getCreativeTabs());
        this.setStepSound(Block.soundTypeMetal);
        ModBlocks.register(this);
	}
}
