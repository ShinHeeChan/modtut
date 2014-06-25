package modtut.tileentities;

import net.minecraft.tileentity.TileEntity;

public class TETesttile extends TileEntity{
	int tick;
	int worldTime = 1;
	
	@Override
	public void updateEntity(){
		if(!worldObj.isRemote){
			tick++;
			if(tick==100){
				if(worldTime==1){
					this.worldObj.setWorldTime(1000);
					worldTime = 0;
				}
				else{
					this.worldObj.setWorldTime(0);
					worldTime = 1;
				}
				tick = 0;
			}
		}
	}
}
