package modtut.blocks;

import modtut.Modtut;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import modtut.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockModtut extends Block {
	public BlockModtut() {
		super(Material.rock);
	}

	public BlockModtut(Material material) {
		super(material);
	}

	public String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.RESOURCESPREFIX,
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Reference.RESOURCESPREFIX+getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
}
