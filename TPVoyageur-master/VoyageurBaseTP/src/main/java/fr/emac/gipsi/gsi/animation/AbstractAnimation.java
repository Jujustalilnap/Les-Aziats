/**
 * 
 */
package fr.emac.gipsi.gsi.animation;

import fr.emac.gipsi.gsi.gui.InterfaceAnimation;
import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.screen.VisualRectangle;

/**
 * @author truptil
 *
 */
public abstract class AbstractAnimation {

	protected String name;
	protected Screen ecranDeb;
	protected Screen ecranFin;
	protected Screen ecranInt;
	
		
	private static InterfaceAnimation visualisationAnimation = new InterfaceAnimation();
	
	
	/**
	 * 
	 */
	public AbstractAnimation() { }


	/**
	 * @param name
	 */
	public AbstractAnimation(String name) {
		super();
		this.name = name;
	}


	/**
	 * @param name
	 * @param ecranDeb
	 * @param ecranFin
	 */
	public AbstractAnimation(String name, Screen ecranDeb, Screen ecranFin) {
		super();
		this.name = name;
		this.ecranDeb = ecranDeb;
		this.ecranFin = ecranFin;
	}

	
	
	
	protected void showScreen(Screen ecranEnCours){
			sendSimulation(ecranEnCours);
		
	}
	
	private void sendSimulation(Screen ecranEnCours){
		if(!visualisationAnimation.isVisible()){
			
			visualisationAnimation.changeEcran(ecranDeb);
			visualisationAnimation.setVisible(true);
		}
		visualisationAnimation.changeEcran(ecranEnCours);
		
		System.out.println("MAJ");
	}
	
	
	public abstract void runAnimation();
	
	
	public void wait(int timems){
		try {
			Thread.sleep(timems);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Screen copyScreen(Screen ini) {
		Screen res = new Screen();
		res.setColMax(ini.getColMax());
		res.setLigMax(ini.getLigMax());
		res.setName(ini.getName());
		for( VisualRectangle rect : ini.getRectangles()){
			res.getRectangles().add(new VisualRectangle(rect.getIndiceLigne(), rect.getIndiceColonne(), rect.getNomCouleur()));
		}
		
		return res;
	}
		

	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the ecranDeb
	 */
	public Screen getEcranDeb() {
		return ecranDeb;
	}


	/**
	 * @param ecranDeb the ecranDeb to set
	 */
	public void setEcranDeb(Screen ecranDeb) {
		this.ecranDeb = ecranDeb;
	}


	/**
	 * @return the ecranFin
	 */
	public Screen getEcranFin() {
		return ecranFin;
	}


	/**
	 * @param ecranFin the ecranFin to set
	 */
	public void setEcranFin(Screen ecranFin) {
		this.ecranFin = ecranFin;
	}


	/**
	 * @return the ecranInt
	 */
	public Screen getEcranInt() {
		return ecranInt;
	}


	
}
