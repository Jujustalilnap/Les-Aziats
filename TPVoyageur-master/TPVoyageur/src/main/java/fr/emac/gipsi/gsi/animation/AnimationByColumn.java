/**
 * 
 */
package fr.emac.gipsi.gsi.animation;

import fr.emac.gipsi.gsi.screen.Screen;

/**
 * @author truptil
 *
 */
public class AnimationByColumn extends AbstractAnimation{
 
	/**
	 * 
	 */
	public AnimationByColumn() {
		
	}

	@Override
	public void runAnimation() {
		showScreen(ecranDeb);
		ecranInt=copyScreen(ecranDeb);
		for(int col=0;col<ecranInt.getColMax()+1;col++){
			System.out.println("startSend");
			this.showScreen(ecranInt);
			for(int lig=0;lig<ecranInt.getLigMax()+1;lig++){
				ecranInt.updateColorByXY(lig, col, ecranFin.getColorByXY(lig,col));
			}
			this.wait(400);
			
		}
		this.showScreen(ecranInt);
		
	}

	

}
