/**
 * 
 */
package fr.emac.gipsi.gsi.launch;

import java.util.ArrayList;

import fr.emac.gipsi.gsi.ecran.ListScreen;
import fr.emac.gipsi.gsi.voyage.Planete;
import fr.emac.gipsi.gsi.voyage.Voyage;
import fr.emac.gipsi.gsi.voyageur.AbstractVoyageur;
import fr.emac.gipsi.gsi.voyageur.VoyageurSimuler;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class LaunchVoyage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {     //fonction où l'on doit appliquer le programme pour faire des tests
		// TODO Auto-generated method stub

		
		ArrayList<Planete> listPlanete = new ArrayList<>();
		
		Planete p1 = new Planete();  //p1 donne p2 et p2 donne p1
		p1.setColorName("DarkSalmon");
		p1.setImage(ListScreen.first());
		p1.setEchantillonRoche(ListScreen.second());
		p1.setEchantillonSol(ListScreen.first());
		p1.setRayon(1);
		p1.getPos().setX(2);
		p1.getPos().setY(2);
		
		listPlanete.add(p1);
		
		Planete p2 = new Planete();
		p2.setColorName("DeepPink");
		p2.setImage(ListScreen.first());
		p2.setEchantillonRoche(ListScreen.second());
		p2.setEchantillonSol(ListScreen.first());
		p2.setRayon(1);
		p2.getPos().setX(5);
		p2.getPos().setY(5);
		p2.getListAccessibilite().add(p1);
		
		listPlanete.add(p2);

		
		
		AbstractVoyageur simulatedVoyageur = new VoyageurSimuler();
		
		simulatedVoyageur.getPosTete().setX(listPlanete.get(0).getPos().getX());
		simulatedVoyageur.getPosTete().setY(listPlanete.get(0).getPos().getY());
		simulatedVoyageur.getPosBody().setX(listPlanete.get(0).getPos().getX());
		simulatedVoyageur.getPosBody().setY(listPlanete.get(0).getPos().getY()-1); //(-1 veut dire qu'il regarde vers la gauche
		simulatedVoyageur.setDirection("E");
		
		Voyage voyage = new Voyage(listPlanete, simulatedVoyageur);

		voyage.lancementSimuler();
	}

}













