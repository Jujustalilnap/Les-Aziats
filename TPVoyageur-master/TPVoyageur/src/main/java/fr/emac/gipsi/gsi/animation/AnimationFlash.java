/**
 * 
 */
package fr.emac.gipsi.gsi.animation;

import fr.emac.gipsi.gsi.screen.Screen;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class AnimationFlash extends AbstractAnimation {

	/**
	 * 
	 */
	public AnimationFlash() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public AnimationFlash(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param ecranDeb
	 * @param ecranFin
	 */
	public AnimationFlash(String name, Screen ecranDeb, Screen ecranFin) {
		super(name, ecranDeb, ecranFin);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see fr.emac.gipsi.gsi.animation.AbstractAnimation#runAnimation()
	 */
	@Override
	public void runAnimation() {
		// TODO Auto-generated method stub
		ecranInt=copyScreen(ecranDeb);
		showScreen(ecranInt);
		wait(1000);
		ecranInt=copyScreen(ecranFin);
		showScreen(ecranInt);
	}

}
