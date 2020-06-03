/**
 * 
 */
package fr.emac.gipsi.gsi.eval;

import java.util.ArrayList;

import fr.emac.gipsi.gsi.ecran.ListScreen;
import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.voyage.Planete;
import fr.emac.gipsi.gsi.voyageur.AbstractVoyageur;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class LaunchEvalExample extends AbstractLaunchEval {

	/**
	 * 
	 */
	public LaunchEvalExample() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see fr.emac.gipsi.gsi.launch.AbstractLaunchEval#createListPlanete()
	 */
	@Override
	public ArrayList<Planete> createListPlanete() {
		ArrayList<Planete> listPlanete = new ArrayList<>();
		
		Planete p1 = new Planete();
		p1.setColorName("DarkSalmon");
		p1.setEchantillonRoche(new Screen());
		p1.setEchantillonSol(new Screen());
		p1.setRayon(1);
		p1.getPos().setX(2);
		p1.getPos().setY(2);
		listPlanete.add(p1);
		
		Planete p2 = new Planete();
		p2.setColorName("DeepPink");
		p2.setRayon(1);
		p2.getPos().setX(5);
		p2.getPos().setY(5);
		listPlanete.add(p2);
		
		p2.getListAccessibilite().add(p1);
		p1.getListAccessibilite().add(p2);
		
		return listPlanete;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LaunchEvalExample lee = new LaunchEvalExample();
		lee.simulateVoyage();
	}
}
