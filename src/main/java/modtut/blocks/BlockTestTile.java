package modtut.blocks;

import modtut.Modtut;
import modtut.tileentities.TETesttile;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTestTile extends BlockModtut{
	public BlockTestTile(){
		super(Material.rock);
		this.setBlockName("TestTileBlock");
		this.setCreativeTab(Modtut.getCreativeTabs());
		ModBlocks.register(this);
	}
	
	@Override
	public boolean hasTileEntity(int meta){
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world,int meta){
		return new TETesttile();
	}
		
	@Override
	public boolean onBlockActivated(World world, int x,int y, int z, EntityPlayer entityPlayer,int side, float posx, float posy,float posz) {
		entityPlayer.openGui(Modtut.instance, 0, world, x, y, z);
		return true;
	}
}
