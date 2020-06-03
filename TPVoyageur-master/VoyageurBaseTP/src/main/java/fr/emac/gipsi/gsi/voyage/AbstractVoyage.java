/**
 * 
 */
package fr.emac.gipsi.gsi.voyage;

import java.util.ArrayList;

import fr.emac.gipsi.gsi.gui.InterfaceSimulation;
import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.screen.VisualRectangle;
import fr.emac.gipsi.gsi.voyageur.AbstractVoyageur;

/**
 * @author truptil
 *
 */
public abstract class AbstractVoyage {

	protected ArrayList<Planete> listPlanete = new ArrayList<Planete>();
	private AbstractVoyageur simulatedvoyageur;
	private AbstractVoyageur realVoyager;
	private Screen ecran;
	private InterfaceSimulation visualisationAnimation;



	/**
	 * @param simulatedVoyageur 
	 * 
	 */
	public AbstractVoyage(ArrayList<Planete> listPlanete, AbstractVoyageur simulatedVoyageur) {
		this.listPlanete=listPlanete;
		ecran = chemin();
		visualisationAnimation = new InterfaceSimulation(this);
		this.simulatedvoyageur = simulatedVoyageur;
	}

	

	public AbstractVoyage(ArrayList<Planete> listPlanete,AbstractVoyageur simulatedVoyageur, AbstractVoyageur realVoyager) {
		this(listPlanete,simulatedVoyageur);
		this.realVoyager= realVoyager;

	}


	public abstract int showFromPlanete(Planete p);
	public abstract int showAll();
	public abstract void lancement();
	public abstract void lancementSimuler();


	public void simulation(boolean voyageurReel){
		afficheEcran();
		if(!voyageurReel){
			lancementSimuler();
		}else{
			lancement();
		}
	}

	
	
	public void afficheEcran(){
		//on reinitialise
		for(VisualRectangle rect:ecran.getRectangles()){
			rect.setNomCouleur("Tan");
		}

		for(Planete at : listPlanete ){
			for(int i = -at.getRayon(); i<at.getRayon()+1; i++){
				for(int j = -at.getRayon(); j<at.getRayon()+1; j++){
					ecran.setColorByXY(at.getPos().getX()+i, at.getPos().getY()+j, at.getColorName());
				}}}

		ecran.setColorByXY(simulatedvoyageur.getPosTete().getX(), simulatedvoyageur.getPosTete().getY(), "Aqua");
		ecran.setColorByXY(simulatedvoyageur.getPosBody().getX(), simulatedvoyageur.getPosBody().getY(), "Black");

		if(!visualisationAnimation.isVisible()){
			visualisationAnimation.setVisible(true);
		}
		visualisationAnimation.changeEcran(ecran);

	}

	public void wait(int timems){
		try {
			Thread.sleep(timems);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private Screen chemin() {
			Screen chemin = new Screen("chemin");
			chemin.setColMax(14);
			chemin.setLigMax(9);
			chemin.getRectangles().add(new VisualRectangle(0,0,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,1,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,2,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,3,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,4,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,5,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,6,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,7,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,8,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,9,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,10,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,11,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,12,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,13,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(0,14,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,0,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,1,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,2,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,3,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,4,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,5,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,6,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,7,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,8,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,9,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,10,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,11,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,12,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,13,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(1,14,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,0,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,1,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,2,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,3,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,4,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,5,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,6,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,7,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,8,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,9,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,10,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,11,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,12,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,13,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(2,14,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,0,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,1,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,2,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,3,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,4,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,5,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,6,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,7,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,8,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,9,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,10,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,11,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,12,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,13,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(3,14,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,0,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,1,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,2,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,3,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,4,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,5,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,6,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,7,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,8,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,9,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,10,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,11,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,12,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,13,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(4,14,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,0,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,1,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,2,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,3,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,4,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,5,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,6,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,7,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,8,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,9,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,10,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,11,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,12,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,13,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(5,14,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,0,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,1,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,2,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,3,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,4,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,5,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,6,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,7,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,8,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,9,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,10,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,11,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,12,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,13,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(6,14,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,0,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,1,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,2,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,3,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,4,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,5,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,6,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,7,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,8,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,9,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,10,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,11,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,12,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,13,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(7,14,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,0,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,1,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,2,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,3,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,4,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,5,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,6,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,7,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,8,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,9,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,10,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,11,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,12,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,13,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(8,14,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,0,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,1,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,2,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,3,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,4,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,5,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,6,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,7,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,8,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,9,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,10,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,11,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,12,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,13,"Tan"));
			chemin.getRectangles().add(new VisualRectangle(9,14,"Tan"));

			return chemin;
	}

	/**
	 * @return the listPlanete
	 */
	public ArrayList<Planete> getListPlanete() {
		return listPlanete;
	}


	/**
	 * @return the ecran
	 */
	public Screen getEcran() {
		return ecran;
	}

	
	public void launch() {
		simulation(true);
		
	}



	public void simulation() {
		simulation(false);
	}

	/**
	 * @return the simulatedvoyageur
	 */
	public AbstractVoyageur getSimulatedvoyageur() {
		return simulatedvoyageur;
	}

	/**
	 * @param simulatedvoyageur the simulatedvoyageur to set
	 */
	public void setSimulatedvoyageur(AbstractVoyageur simulatedvoyageur) {
		this.simulatedvoyageur = simulatedvoyageur;
	}

	/**
	 * @return the realVoyager
	 */
	public AbstractVoyageur getRealVoyager() {
		return realVoyager;
	}

	/**
	 * @param realVoyager the realVoyager to set
	 */
	public void setRealVoyager(AbstractVoyageur realVoyager) {
		this.realVoyager = realVoyager;
	}

}
