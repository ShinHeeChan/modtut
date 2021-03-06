package modtut.blocks;

import modtut.Modtut;
import modtut.lib.Reference;
import modtut.tileentities.TEGrinder;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGrinder extends BlockContainer{
	
	@SideOnly(Side.CLIENT)
	public IIcon[] icons;
	
	public BlockGrinder(){
		super(Material.rock);
		this.setCreativeTab(Modtut.getCreativeTabs());
		this.setBlockName(Reference.MODID + ":" + "GrindBlock");
		GameRegistry.registerBlock(this, this.getUnlocalizedName());
		icons = new IIcon[6];
	}
	
	@Override
	public boolean hasTileEntity(int meta){
		return true;
	}
		
	@Override
	public boolean onBlockActivated(World world, int x,int y, int z, EntityPlayer entityPlayer,int side, float posx, float posy,float posz) {
		entityPlayer.openGui(Modtut.instance, 1, world, x, y, z);
		return true;
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
		for(int i=0;i<icons.length;i++){
			String name;
			switch(i){
				case 0: name = "0";
				break;
				case 1: name = "1";
				break;
				case 2: name = "2";
				break;
				case 3: name = "3";
				break;
				case 4: name = "4";
				break;
				case 5: name = "5";
				break;
				default: name = "0";
			}
			icons[i] = iconRegister.registerIcon(getUnwrappedUnlocalizedName(super.getUnlocalizedName() + name));
		}
    }
	
	/**
     * Returns the desired texture for the side.
     * 0: bottom
     * 1: top
     * 2-5: sides.
     *
     * @param side side of the block
     * @param meta metadata of the block.
     * @return IIcon
     */
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		if(side<=5) return icons[side];
		else return icons[0];
	}

	public String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		// TODO Auto-generated method stub
		return new TEGrinder();
	}
}
