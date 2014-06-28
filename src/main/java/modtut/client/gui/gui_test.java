package modtut.client.gui;

import modtut.lib.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class gui_test extends GuiScreen {
	int xSize = 176;
	int ySize = 166;
	private static final ResourceLocation backgroundimage = new ResourceLocation(Reference.MODID.toLowerCase()+":"+"textures/gui/doublefurgui.png");
	
	public gui_test(){
	}
	
	//only a image
	@Override
	public void drawScreen(int par1, int par2, float par3){
		//bind texture
		this.mc.getTextureManager().bindTexture(backgroundimage);
		par2 = (this.width-xSize)/2;
		int j = (this.height-ySize-30)/2;
		//draw
		drawTexturedModalRect(par2, j, 0, 0, xSize, ySize);
	}
	
	//prevent pausing
	public boolean doesGuiPauseGame(){
		return false;
	}
}
