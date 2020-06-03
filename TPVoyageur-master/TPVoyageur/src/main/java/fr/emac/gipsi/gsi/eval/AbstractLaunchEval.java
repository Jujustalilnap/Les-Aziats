/**
 * 
 */
package fr.emac.gipsi.gsi.eval;

import java.util.ArrayList;

import fr.emac.gipsi.gsi.ecran.ListScreen;
import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.voyage.Planete;
import fr.emac.gipsi.gsi.voyage.Voyage;
import fr.emac.gipsi.gsi.voyageur.AbstractVoyageur;
import fr.emac.gipsi.gsi.voyageur.VoyageurSimuler;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public abstract class AbstractLaunchEval {

	
	/**
	 * 
	 */
	public AbstractLaunchEval() {
	}
	
	public ArrayList<Screen> addScreens2ListOfScreen(){
		// ajouter vos ecrans
		ArrayList<Screen> listOfScreen = new ArrayList<>();
		listOfScreen.add(ListScreen.first());
		listOfScreen.add(ListScreen.second());
		listOfScreen.add(ListScreen.first());
		
		return listOfScreen;
	}

	public AbstractVoyageur createSimulatedVoyageur() {
		// ici MAJ en fonction du nom de votre class pour le voyageur simuler
		return new VoyageurSimuler();
	}
	
	public abstract ArrayList<Planete> createListPlanete();

	public void simulateVoyage(){
		ArrayList<Screen> listOfScreen = addScreens2ListOfScreen();
		ArrayList<Planete> listPlanete = createListPlanete();
		AbstractVoyageur simulatedVoyageur = createSimulatedVoyageur();
		
		int i=0;
		for(Planete p : listPlanete){
			p.setImage(listOfScreen.get(i%listOfScreen.size()));
			i++;
			if(p.getEchantillonRoche()!=null){
				p.setEchantillonRoche(listOfScreen.get(i%listOfScreen.size()));
				i++;
			}
			if(p.getEchantillonSol()!=null){
				p.setEchantillonSol(listOfScreen.get(i%listOfScreen.size()));
				i++;
			}			
		}
		simulatedVoyageur.getPosTete().setX(listPlanete.get(0).getPos().getX());
		simulatedVoyageur.getPosTete().setY(listPlanete.get(0).getPos().getY());
		simulatedVoyageur.getPosBody().setX(listPlanete.get(0).getPos().getX());
		simulatedVoyageur.getPosBody().setY(listPlanete.get(0).getPos().getY()-1);
		simulatedVoyageur.setDirection("E");
		
		Voyage voyage = new Voyage(listPlanete, simulatedVoyageur);

		voyage.lancementSimuler();
	}
}
