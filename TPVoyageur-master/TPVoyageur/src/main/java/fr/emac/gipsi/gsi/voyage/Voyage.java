/**
 *
 */
package fr.emac.gipsi.gsi.voyage;

import fr.emac.gipsi.gsi.animation.AbstractAnimation;
import fr.emac.gipsi.gsi.animation.AnimationFlash;
import fr.emac.gipsi.gsi.ecran.ListScreen;
import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.voyageur.AbstractVoyageur;

import java.util.ArrayList;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class Voyage extends AbstractVoyage {

    /**
     * @param listPlanete
     * @param simulatedVoyageur
     */
    public Voyage(ArrayList<Planete> listPlanete, AbstractVoyageur simulatedVoyageur) {
        super(listPlanete, simulatedVoyageur);
        // TODO Auto-generated constructor stub
        
        
    }

    /**
     * @param listPlanete
     * @param simulatedVoyageur
     * @param realVoyager
     */
    public Voyage(ArrayList<Planete> listPlanete, AbstractVoyageur simulatedVoyageur, AbstractVoyageur realVoyager) {
        super(listPlanete, simulatedVoyageur, realVoyager);
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyage.AbstractVoyage#showFromPlanete(fr.emac.gipsi.gsi.voyage.Planete)
     */
    @Override
    public int showFromPlanete(Planete p) {
        // TODO Auto-generated method stub
    	AbstractAnimation aa = new AnimationFlash();
 
    	Screen p_image = p.getImage();
    	Screen rochep_image = p.getEchantillonRoche();
    	Screen solp_image = p.getEchantillonSol();//setImage(getEchantillonSol().setEchantillonSol(p.getEchantillonSol()));
    	aa.setEcranDeb(p_image);
		aa.setEcranFin(rochep_image);
	
		aa.runAnimation();		
		aa.wait(1000);
		AbstractAnimation ab = new AnimationFlash();
		ab.setEcranDeb(rochep_image);
		ab.setEcranFin(solp_image);
		ab.runAnimation();		
		ab.wait(1000);
		AbstractAnimation ac = new AnimationFlash();
		ac.setEcranDeb(solp_image);
		ac.setEcranFin(p_image);
		ac.wait(1000);		
		ac.runAnimation();
        
		return 0;
    }

 

	/* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyage.AbstractVoyage#showAll()
     */
    @Override
    public int showAll() {
        // TODO Auto-generated method stub
    	   	
        return 0;
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyage.AbstractVoyage#pilotage()
     */
    @Override
    public void lancement() { //pour lancer le robot
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyage.AbstractVoyage#pilotageSimuler()
     */
    @Override
    
    
    
    public void lancementSimuler() {
        // TODO Auto-generated method stub
     	//int L = listPlanete.size();
      	//ArrayList<Position> CoordPlanete = new ArrayList<Position>();
    	//ArrayList<Planete> Planetes_parcourues = new ArrayList<Planete>(); 
    	//ArrayList<Double> Distance = new ArrayList<Double>();
      	 
    	//for(int i = 0; i < L; i++) { 
         		     		 
    	//Position x = listPlanete.get(i).getPos();
      	
    	//CoordPlanete.add(x);
      		
      		
    	//}
    	//	getSimulatedvoyageur().getPos();
      	
      	
    	//for(int i = 0; i < L; i++) { 
      		
    	//}
      	

    	deplacement_Planete();
    }




public ArrayList<Planete> ordrePlanete(){
	Position posini = getSimulatedvoyageur().getPosBody();
	double d = Integer.MAX_VALUE; //+infini; //à faire
	
	Planete Planete_actuelle = new Planete();
	for (Planete x : listPlanete){
	
		if (d> distance(posini, x.getPos())){
		d = distance(posini,x.getPos());
		Planete_actuelle = x;
		}
	}
	ArrayList<Planete> Planete_rencontre = new ArrayList<Planete>();
	Planete_rencontre.add(Planete_actuelle);
	int compteur = 1;
	Planete Planete_courte = new Planete();
	
	while(PlaneteAllSee(Planete_rencontre)==false){//compteur < listPlanete.size()){
		Planete_actuelle = Planete_rencontre.get(compteur-1);
		d = Integer.MAX_VALUE;
		boolean b = true;
		if (Planete_rencontre.get(compteur-1).getListAccessibilite().size() > 0 ) {
			d = Integer.MAX_VALUE; 
			//if (Planete_actuelle.getListAccessibilite().size() > 0 )
			ArrayList<Planete> ListRemp = new ArrayList<Planete>();
			ListRemp.addAll(Planete_rencontre);
			for (Planete Acote : ListRemp.get(compteur-1).getListAccessibilite()){
				
				//d = Integer.MAX_VALUE;
				for (Planete x : Planete_rencontre) {
					if (Planete_equals(x,Acote)==false) {
						b = true;
						
					}
					else {
						//System.out.println(Acote);
						b = false;
						break;
					}
					
				}
				
				if (b==true) {
					
					if (d > distance(Acote.getPos(),Planete_rencontre.get(compteur-1).getPos())){
						
						d= distance(Acote.getPos(),Planete_rencontre.get(compteur-1).getPos());
						Planete_courte = Acote;
					}
				}
				
			}
				//for (Planete Acote : Planete_actuelle.getListAccessibilite()){
		//	if (d > distance(Acote.getPos(),Planete_actuelle.getPos())){
		//		d= distance(Acote.getPos(),Planete_actuelle.getPos());
		//		Planete_courte = Acote;
		//	}
		//}
			Planete_rencontre.add(Planete_courte);
			//compteur = compteur + 1;
		}
		//Planete_rencontre.add(Planete_courte);
		//compteur += 1;
	}
	
	return Planete_rencontre;
}

	
	
public double distance(Position pos1, Position pos2) {
	return Math.sqrt(Math.pow(pos1.getX() - pos2.getX(),2 ) + Math.pow(pos1.getY() - pos2.getY(),2));
}

public Position Ecartdistance(Position pos1, Position pos2) {
	return new Position (pos1.getX()-pos2.getX(), pos1.getY()-pos2.getY()); 
}


		
		
public void mouve_robot(Position mouv) {
			int i = 0;
			String direction = getSimulatedvoyageur().getDirection();					
			if (mouv.getX() > 0) {
				if (direction == "S"){
						for (i = 0; i < mouv.getX(); i++) {
							if (getSimulatedvoyageur().getPosTete().getX()==9){
								if (getSimulatedvoyageur().getPosTete().getY()==0) {							
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("N");
									direction ="N";
								}
								else if (getSimulatedvoyageur().getPosTete().getY()==14) {							
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("N");
									direction ="N";
								}
								else { //Le robot peut tourner n'importe quel sens si il se tove juste au niveau des arêtes et non au niveau des coins
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("N");
									direction ="N";
									
								}
							}
							else {
								getSimulatedvoyageur().goForward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
						}
						
						
				}
			
				else if (direction == "N"){
					//getSimulatedvoyageur().turnRight();
					//afficheEcran();
					//wait(1000);
					//getSimulatedvoyageur().turnRight();
					//afficheEcran();
					//wait(1000);
					
					
					for (i = 0; i < mouv.getX(); i++) {
						if (getSimulatedvoyageur().getPosTete().getX()==9){
							if (getSimulatedvoyageur().getPosTete().getY()==0) {							
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("N");
								direction ="N";
							}
							else if (getSimulatedvoyageur().getPosTete().getY()==14) {							
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("N");
								direction ="N";
							}
							else { //Le robot peut tourner n'importe quel sens si il se tove juste au niveau des arêtes et non au niveau des coins
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("N");
								direction ="N";
								
							}
						}
						else {
							getSimulatedvoyageur().goBackward();
							afficheEcran();
							wait(1000);
							getSimulatedvoyageur().setDirection("N");
							direction ="N";
						}
					}
				}
				//}//else if (direction == "N"){
				//		for (i = 0; i < mouv.getX(); i++) {
				//			getSimulatedvoyageur().goBackward();
				//			afficheEcran();
				//			wait(1000);
				//		}
				//}
				else if (direction == "O"){
						getSimulatedvoyageur().turnLeft();
						afficheEcran();
						wait(1000);
						for (i = 0; i < mouv.getX(); i++) {
							if (getSimulatedvoyageur().getPosTete().getX()==9){
								if (getSimulatedvoyageur().getPosTete().getY()==0) {							
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("N");
									direction ="N";
								}
								else if (getSimulatedvoyageur().getPosTete().getY()==14) {							
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("N");
									direction ="N";
								}
								else { //Le robot peut tourner n'importe quel sens si il se tove juste au niveau des arêtes et non au niveau des coins
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("N");
									direction ="N";
									
								}
						}
						else {
									getSimulatedvoyageur().goForward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("S");
									direction ="S";
								}
					
						}
					
				}
				else if (direction == "E"){
						getSimulatedvoyageur().turnRight();
						afficheEcran();
						wait(1000);
						for (i = 0; i < mouv.getX(); i++) { //+1 à enlever normalement
							if (getSimulatedvoyageur().getPosTete().getX()==9){
								if (getSimulatedvoyageur().getPosTete().getY()==0) {							
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("N");
									direction ="N";
								}
								else if (getSimulatedvoyageur().getPosTete().getY()==14) {							
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("N");
									direction ="N";
								}
								else { //Le robot peut tourner n'importe quel sens si il se tove juste au niveau des arêtes et non au niveau des coins
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("N");
									direction ="N";
									
								}
							}
							else {
								getSimulatedvoyageur().goForward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
						
				}
			}
			}
			else if (mouv.getX() < 0) {
				if (direction == "S"){
					for (i = 0; i < -mouv.getX(); i++) {//for (i= mouv.getX(); i < 0; i++) { //for (i = 0; i < mouv.getX(); i++)
						if (getSimulatedvoyageur().getPosTete().getX()==0){
							if (getSimulatedvoyageur().getPosTete().getY()==0) {							
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
							else if (getSimulatedvoyageur().getPosTete().getY()==14) {							
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
							else {
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
						}
						else {
							System.out.println(mouv);
							getSimulatedvoyageur().goBackward(); //sans le - c'est très bien
							afficheEcran();
							wait(1000);
							getSimulatedvoyageur().setDirection("S");
							direction ="S";
							
						}
						
					}
				}
				else if (direction == "N"){
					for (i = 0; i < -mouv.getX(); i++) {//for (i = mouv.getX(); i < 0; i++) { 
						if (getSimulatedvoyageur().getPosTete().getX()==0){
							if (getSimulatedvoyageur().getPosTete().getY()==0) {							
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
							else if (getSimulatedvoyageur().getPosTete().getY()==14) {							
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
							else {
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
						}
						else {
						
							getSimulatedvoyageur().goForward();
							afficheEcran();
							wait(1000);
							direction ="N";
							getSimulatedvoyageur().setDirection("N");
							direction ="N";
						}
					}
		
				}
				else if (direction == "O"){
					getSimulatedvoyageur().turnRight();
					afficheEcran();
					wait(1000);
					for (i = 0; i < -mouv.getX(); i++) {//for (i= mouv.getX(); i < 0; i++) {
						if (getSimulatedvoyageur().getPosTete().getX()==0){
							if (getSimulatedvoyageur().getPosTete().getY()==0) {							
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
							else if (getSimulatedvoyageur().getPosTete().getY()==14) {							
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
							else {
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
						}
						else {
						
							getSimulatedvoyageur().goForward();
							afficheEcran();
							wait(1000);
							getSimulatedvoyageur().setDirection("N");
							direction ="N";
						}
					}
				}
				else if (direction == "E"){
					getSimulatedvoyageur().turnLeft(); //à changer
					afficheEcran();
					wait(1000);
					for (i = 0; i < -mouv.getX(); i++) {//for (i= mouv.getX(); i < 0; i++) { //à enlever normalement
						if (getSimulatedvoyageur().getPosTete().getX()==0){
							if (getSimulatedvoyageur().getPosTete().getY()==0) {							
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
							else if (getSimulatedvoyageur().getPosTete().getY()==14) {							
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
							else {
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("S");
								direction ="S";
							}
						}
						else {
							
						
							getSimulatedvoyageur().goForward();
							afficheEcran();
							wait(1000);
							getSimulatedvoyageur().setDirection("N");
							direction ="N";
						}
				}
			}
		}
				
		else if (mouv.getX()== 0) {
				afficheEcran();				
			}
			if (mouv.getY() > 0) { //mettre mouv.getY()normalement au lieu de 6
					
					
					if (direction == "S"){
						getSimulatedvoyageur().turnLeft(); //turnLeftnormaleme,nt
						afficheEcran();
						wait(1000);
						for (i = 0; i < mouv.getY(); i++) {
							if (getSimulatedvoyageur().getPosTete().getY()==14){
								if (getSimulatedvoyageur().getPosTete().getX()==0) {							
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("O");
									direction ="O";
								}
								else if (getSimulatedvoyageur().getPosTete().getX()==9) {							
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("O");
									direction ="O";
								}
								else {
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("O");
									direction ="O";
								}
							}
							else {
								getSimulatedvoyageur().goForward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
						}
					}
					else if (direction == "N"){
						getSimulatedvoyageur().turnRight();
						afficheEcran();
						wait(1000);
						for (i = 0; i < mouv.getY(); i++) {
							if (getSimulatedvoyageur().getPosTete().getY()==14){
								if (getSimulatedvoyageur().getPosTete().getX()==0) {							
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("O");
									direction ="O";
								}
								else if (getSimulatedvoyageur().getPosTete().getX()==9) {							
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("O");
									direction ="O";
								}
								else {
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("O");
									direction ="O";
								}
							}
							else {
								getSimulatedvoyageur().goForward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
								
							}
							
						}
					
					}
					else if (direction == "O"){					
						for (i = 0; i < mouv.getY(); i++) { //peut être on doit mettre -1
							if (getSimulatedvoyageur().getPosTete().getY()==14){
								if (getSimulatedvoyageur().getPosTete().getX()==0) {							
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("O");
									direction ="O";
								}
								else if (getSimulatedvoyageur().getPosTete().getX()==9) {							
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("O");
									direction ="O";
								}
								else {
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("O");
									direction ="O";
								}
							}
							else {
							getSimulatedvoyageur().goBackward();
							afficheEcran();
							wait(1000);
							getSimulatedvoyageur().setDirection("O");
							direction ="O";
							}
						}
					}
					else if (direction == "E"){
						for (i = 0; i < mouv.getY(); i++) { //à modifier normalement
							if (getSimulatedvoyageur().getPosTete().getY()==14){
								if (getSimulatedvoyageur().getPosTete().getX()==0) {							
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnRight();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("O");
									direction ="O";
								}
								else if (getSimulatedvoyageur().getPosTete().getX()==9) {							
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("O");
									direction ="O";
								}
								else {
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().turnLeft();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().goBackward();
									afficheEcran();
									wait(1000);
									getSimulatedvoyageur().setDirection("O");
									direction ="O";
								}
							}
							else {
							
								getSimulatedvoyageur().goForward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
						}
					}			
			}
			else if (mouv.getY() < 0) {			
				if (direction == "S"){
					getSimulatedvoyageur().turnRight();
					afficheEcran();
					wait(1000);
					for (i =0; i <-mouv.getY() ; i++) {  //for (i = 0; i < mouv.getY(); i++)
						if (getSimulatedvoyageur().getPosTete().getY()==0){
							if (getSimulatedvoyageur().getPosTete().getX()==0) {							
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
							else if (getSimulatedvoyageur().getPosTete().getX()==9) {							
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
							else {
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
						}
						else {
							getSimulatedvoyageur().goForward();
							afficheEcran();
							wait(1000);
							getSimulatedvoyageur().setDirection("O");
							direction ="O";
						}
					}
				}
				else if (direction == "N"){
					getSimulatedvoyageur().turnLeft();
					afficheEcran();
					wait(1000);
					for (i =0; i <-mouv.getY() ; i++) {//for (i =mouv.getY(); i <0 ; i++) {
						if (getSimulatedvoyageur().getPosTete().getY()==0){
							if (getSimulatedvoyageur().getPosTete().getX()==0) {							
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
							else if (getSimulatedvoyageur().getPosTete().getX()==9) {							
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
							else {
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
						}
						else {
						getSimulatedvoyageur().goForward();
						afficheEcran();
						wait(1000);
						getSimulatedvoyageur().setDirection("O");
						direction ="O";
						}
					}
				}
				else if (direction == "O"){					
					for (i =0; i <-mouv.getY() ; i++) {//for (i =mouv.getY(); i <0 ; i++) {
						if (getSimulatedvoyageur().getPosTete().getY()==0){
							if (getSimulatedvoyageur().getPosTete().getX()==0) {							
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
							else if (getSimulatedvoyageur().getPosTete().getX()==9) {							
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
							else {
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
						}
						else {
							getSimulatedvoyageur().goForward();
							afficheEcran();
							wait(1000);
							getSimulatedvoyageur().setDirection("O");
							direction ="O";
							
						}
					}
				}
				else if (direction == "E"){
					for (i =0; i <-mouv.getY() ; i++) {//for (i =mouv.getY(); i <0 ; i++) {
						if (getSimulatedvoyageur().getPosTete().getY()==0){
							if (getSimulatedvoyageur().getPosTete().getX()==0) {							
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnLeft();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
							else if (getSimulatedvoyageur().getPosTete().getX()==9) {							
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
							else {
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().turnRight();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().goBackward();
								afficheEcran();
								wait(1000);
								getSimulatedvoyageur().setDirection("E");
								direction ="E";
							}
						}
						else {
						getSimulatedvoyageur().goBackward();
						afficheEcran();
						wait(1000);
						getSimulatedvoyageur().setDirection("E");
						direction ="E";
						}
					}
				}
			}
		else if (mouv.getY() == 0) {
			afficheEcran();
		}
	
			

}

public void deplacement_Planete() {
	Position posini = getSimulatedvoyageur().getPosBody();
	ArrayList<Planete> Ordre_Planete = ordrePlanete();
	int compteur = 0;
	int NbrePlanetes = listPlanete.size();
	int i = 0;
	
	String direction = getSimulatedvoyageur().getDirection();
	ArrayList<Planete> TestFaux = new ArrayList<Planete>();
	ArrayList<Integer> TestFaux1 = new ArrayList<Integer>();
	TestFaux1.add(0);
	TestFaux1.add(0);
	TestFaux.add(listPlanete.get(0));
	TestFaux.add(listPlanete.get(3));
	ArrayList<Screen> ListPokemon = new ArrayList<Screen>();
	ListPokemon.add(ListScreen.Grolem());
	ListPokemon.add(ListScreen.carapuce());
	ListPokemon.add(ListScreen.salameche());
	ListPokemon.add(ListScreen.dracolosse());
	//TestFaux.add(listPlanete.get(2));
	//TestFaux.add(listPlanete.get(1));
	//TestFaux.add(listPlanete.get(2));
	//TestFaux.add(listPlanete.get(4));
	//int c = calcul_energy(TestFaux);
	//System.out.println(c);
	//System.out.println(listPlanete.get(0));
	ArrayList<Planete> Solution = OrdrePlaneteOptimale(Ordre_Planete.get(0)); // Ordre planete sert juste à récuperer la planète sur laquelle se trouve le robot initialement
	System.out.println(Solution);
	//PlaneteAllSee(TestFaux);
	//boolean result = (TestFaux1.get(TestFaux1.size()-1)==TestFaux1.get(TestFaux1.size()-2));
	//System.out.println(result);
	//System.out.println(Ordre_Planete);
	//System.out.println(listPlanete);
	//Ordre_Planete.add(listPlanete.get(3));
	//System.out.println(Ordre_Planete);
	i=0;
	int j =0;
	int k=0;
	int l = 0;
	ArrayList<Planete> PlaneteAcces = PlaneteAccessible(Ordre_Planete);

	posini = getSimulatedvoyageur().getPosBody();
	direction = getSimulatedvoyageur().getDirection();
	for (i=0;i<Solution.size();i++) {
		posini = getSimulatedvoyageur().getPosBody();
		direction = getSimulatedvoyageur().getDirection();
		Position mouvement = Ecartdistance(Solution.get(i).getPos(),posini);
		System.out.println(mouvement);
		mouve_robot(mouvement);
		int nbrefalse = 0;
		//showFromPlanete(Solution.get(i));
		if (l==0) {
			l =l +1;
			AbstractAnimation aa = new AnimationFlash();
			aa.setEcranDeb(ListPokemon.get(2));
			aa.setEcranFin(ListPokemon.get(0));
			
			aa.runAnimation();

			aa.wait(1000);
		}
		else if (l==1) {
			AbstractAnimation ab = new AnimationFlash();
			ab.setEcranDeb(ListPokemon.get(0));
			ab.setEcranFin(ListPokemon.get(1));
			ab.wait(1000);
			
			ab.runAnimation();
			
			AbstractAnimation ac = new AnimationFlash();
			ac.setEcranDeb(ListPokemon.get(1));
			ac.setEcranFin(ListPokemon.get(3));
			ac.wait(1000);
			
			ac.runAnimation();
			AbstractAnimation ad = new AnimationFlash();
			ad.setEcranDeb(ListPokemon.get(3));
			ad.setEcranFin(ListPokemon.get(3));
			ad.wait(1000);
			
			ad.runAnimation();
		}
		
		for (k=0;k<Solution.get(i).getListVisibilite().size();k++) {
			nbrefalse=0;

			for (j=0;j<PlaneteAcces.size();j++) {
				if (Planete_equals(Solution.get(i).getListVisibilite().get(k),PlaneteAcces.get(j))==false){
					nbrefalse +=1;
					if (nbrefalse == PlaneteAcces.size()) {
						//Screen photo = Solution.get(i).getListVisibilite().get(k).getImage();
						AbstractAnimation gg = new AnimationFlash();
						if (k<ListPokemon.size()) {
							gg.setEcranDeb(ListPokemon.get(k));
							gg.setEcranFin(ListPokemon.get(k));
					
							gg.runAnimation();		
							gg.wait(1000);
						}
						else {
							k=0;
							gg.setEcranDeb(ListPokemon.get(k));
							gg.setEcranFin(ListPokemon.get(k));
					
							gg.runAnimation();		
							gg.wait(1000);
						}
						
					}
					
				}
				else {
					break;
					
				}
			}
		}
		
		
	}
	//while (compteur < 1) {//NbrePlanetes) 
		//listPlanete.get(1);
		//posini = getSimulatedvoyageur().getPosBody();
		//direction = getSimulatedvoyageur().getDirection();
		
		//for (i=0;i<NbrePlanetes;i++) {
			//posini = getSimulatedvoyageur().getPosBody();
			//direction = getSimulatedvoyageur().getDirection();
			//Position mouvement = Ecartdistance(Ordre_Planete.get(i).getPos(),posini);
			
			//mouve_robot(mouv2); // Le 2 n'est pas pris encompte donc le y
			//mouve_robot(mouv3);
			//mouve_robot(mouv4); //c'est ok tant que l'absisse est différent de 0
			//mouve_robot(mouv5);
			//mouve_robot(mouvement);
			//showFromPlanete(p);
		//}
	
		//for (Planete p : OrdrePlaneteOptimale(Ordre_Planete.get(0)) {
		//	posini = getSimulatedvoyageur().getPosBody();
		//	Position mouvement = Ecartdistance(p.getPos(),posini);
		//	mouve_robot(mouvement);
		//	showFromPlanete(p);
		//				
		//}
		//compteur += 1; 
	//}
}


public boolean Planete_equals(Planete r,Planete p) {
	if ((r.getPos().getX()==p.getPos().getX())&&(r.getPos().getY()==p.getPos().getY())){
		return true;
	}
	else {
		return false;
	}
}

public boolean PlaneteAllSee(ArrayList<Planete> Listp) {
	int i = 0;
	ArrayList<Planete> ListCopy = new ArrayList<Planete>();
	int k = 0;//Entier pour parcourir les boucles
	int j = 0;
	ArrayList<Planete> ListJetable = new ArrayList<Planete>();
	Position posini = getSimulatedvoyageur().getPosBody();
	double d = Integer.MAX_VALUE; //+infini; //à faire
	
	Planete Planete_actuelle = new Planete();
	for (Planete x : listPlanete){
	
		if (d> distance(posini, x.getPos())){
		d = distance(posini,x.getPos());
		Planete_actuelle = x;
		}
	}
	ArrayList<Planete> Planete_rencontre = new ArrayList<Planete>();
	Planete_rencontre.add(Planete_actuelle);
	
	//ListCopy.addAll(listPlanete);
	ArrayList<Planete> PlaneteAcces = PlaneteAccessible(Planete_rencontre);
	ListCopy.addAll(PlaneteAcces);
	//System.out.println(ListCopy);
	//ListCopy.addAll(listPlanete);
	for (i=0;i<Listp.size();i++) {
		for (Planete x : listPlanete) {
			if (Planete_equals(x,Listp.get(i))==true) {
				ListCopy.remove(x);
			}
		}
	}
	if (ListCopy.size()==0){
		return true;
	}
	else {
		return false;
	}
}

public int calcul_energy(ArrayList<Planete> Listp) {
	//System.out.println(Listp);
	//System.out.println(Listp.size());
	int j = 0;
	int i = 0;
	int k = 0;
	String direction = getSimulatedvoyageur().getDirection();
	int energieCons = 0;
	Position mouv = Ecartdistance(Listp.get(i).getPos(),Listp.get(i).getPos());
	//System.out.println(mouv);
	for (i=0;i<Listp.size()-1;i++) {
		//System.out.println(energieCons);
		j=0;
		k=0;
		//mouv = Ecartdistance(Listp.get(i+1).getPos(),Listp.get(i).getPos());
		mouv.setX(Listp.get(i+1).getPos().getX()-Listp.get(i).getPos().getX());
		mouv.setY(Listp.get(i+1).getPos().getY()-Listp.get(i).getPos().getY());
		///System.out.println(Listp.get(i));
		//System.out.println(Listp.get(i+1));
		
		
		
		
		if (mouv.getX() > 0) {
			if (direction == "S"){
					for (j = 0; j < mouv.getX(); j++) {
						energieCons +=2;//getSimulatedvoyageur().goForward();
						//getSimulatedvoyageur().setDirection("S");
					}
					
					direction ="S";
					
			}
			else if (direction == "N"){
				//energieCons+=1;//getSimulatedvoyageur().turnRight();
				
				//energieCons+=1;//getSimulatedvoyageur().turnRight();
				
				for (j = 0; j < mouv.getX(); j++) {
					energieCons+=2;//getSimulatedvoyageur().goForward(); on remplace par backward
					}
				
				direction ="S";
			}
			//}//else if (direction == "N"){
			//		for (i = 0; i < mouv.getX(); i++) {
			//			getSimulatedvoyageur().goBackward();
			//			afficheEcran();
			//			wait(1000);
			//		}
			//}
			else if (direction == "O"){
				energieCons+=1;//getSimulatedvoyageur().turnLeft();
				for (j = 0; j < mouv.getX(); j++) {
						energieCons+=2;//getSimulatedvoyageur().goForward();
					}
					direction ="S";
			}
			else if (direction == "E"){
					energieCons+=1;//getSimulatedvoyageur().turnRight();
				
					for (j = 0; j < mouv.getX(); j++) { //+1 à enlever normalement
						energieCons+=2;//getSimulatedvoyageur().goForward();
					}
					direction ="S";
					
			}
		}
		else if (mouv.getX() < 0) {
			if (direction == "S"){
				for (j = 0; j < -mouv.getX(); j++) {//for (i= mouv.getX(); i < 0; i++) { //for (i = 0; i < mouv.getX(); i++)
					energieCons+=2;//getSimulatedvoyageur().goBackward(); //sans le - c'est très bien
				}
			
				direction ="S";
			}
			else if (direction == "N"){
				for (j = 0; j < -mouv.getX(); j++) {//for (i = mouv.getX(); i < 0; i++) { 
					energieCons+=2;//getSimulatedvoyageur().goForward();
					
				}
				
				direction ="N";
			}
			else if (direction == "O"){
				energieCons+=1;//getSimulatedvoyageur().turnRight();
				
				for (j = 0; j < -mouv.getX(); j++) {//for (i= mouv.getX(); i < 0; i++) {
					energieCons+=2;//getSimulatedvoyageur().goForward();
					
				}
			
				direction ="N";
			}
			else if (direction == "E"){
				energieCons+=1;//getSimulatedvoyageur().turnLeft(); //à changer

				for (j = 0;j < -mouv.getX(); j++) {//for (i= mouv.getX(); i < 0; i++) { //à enlever normalement
					energieCons+=2;//getSimulatedvoyageur().goForward();
				}
		
				direction = "N";
			}
		}
			
		else if (mouv.getX()== 0) {
		//	afficheEcran();
			energieCons = energieCons;
			direction =direction;
		}
		if (mouv.getY() > 0) { //mettre mouv.getY()normalement au lieu de 6
				
				
				if (direction == "S"){
					energieCons+=1;//getSimulatedvoyageur().turnLeft(); //turnLeftnormaleme,nt
					for (k = 0; k < mouv.getY(); k++) {
						energieCons+=2;//getSimulatedvoyageur().goForward();
					}
					
					direction ="E";
				}
				else if (direction == "N"){
					energieCons+=1;//getSimulatedvoyageur().turnRight();
					
					for (k = 0; k < mouv.getY(); k++) {
						energieCons+=2;//getSimulatedvoyageur().goForward();
					}
				
					direction ="E";
				}
				else if (direction == "O"){					
					for (k = 0; k < mouv.getY(); k++) { //peut être on doit mettre -1
						energieCons+=2;//getSimulatedvoyageur().goBackward();
						
					}
				
					direction ="O";
				}
				else if (direction == "E"){
					for (k = 0; k < -mouv.getY(); k++) { //modifier normalement
						energieCons+=2;//getSimulatedvoyageur().goForward();
						
					}
				
					direction ="E";
				}			
		}
		else if (mouv.getY() < 0) {			
			if (direction == "S"){
				energieCons+=1;//getSimulatedvoyageur().turnRight();
				for (k = 0; k < -mouv.getY(); k++) {  //for (i = 0; i < mouv.getY(); i++)
					energieCons+=2;//getSimulatedvoyageur().goForward();
					
				}
				
				direction ="O";
			}
			else if (direction == "N"){
				energieCons+=1;//getSimulatedvoyageur().turnLeft();
				for (k = 0; k < -mouv.getY(); k++) {//for (i =mouv.getY(); i <0 ; i++) {
					energieCons+=2;//getSimulatedvoyageur().goForward();
				}
			
				direction ="O";
			}
			else if (direction == "O"){					
				for (k = 0; k < -mouv.getY(); k++) {//for (i =mouv.getY(); i <0 ; i++) {
					energieCons+=2;//getSimulatedvoyageur().goForward();
					
				}
				
				direction ="O";
			}
			else if (direction == "E"){
				for (k = 0; k < -mouv.getY(); k++) {//for (i =mouv.getY(); i <0 ; i++) {
					energieCons+=2;//getSimulatedvoyageur().goBackward();
				}
			
				direction ="E";
			}
		}
		
	}
		
 return energieCons;
	
}

public ArrayList<Planete> OrdrePlaneteOptimale(Planete PlaneteInitial){
	ArrayList<Planete> chemin_optimale = new ArrayList<Planete>();  //Liste qui contiendra le chemin optimale
	int i =0;
	int k = 0;//Entier pour parcourir les boucles
	int j = 0;
	int energie_optimale = 1000;  //entier représentant l'énergie consommée du chemin optimale
	ArrayList<Integer> NbreElemList = new ArrayList<Integer>(); // Liste donnant contenant le nombre d'éléments dans la liste all_way après chaque tout de while
	NbreElemList.add(0); //Valeur d'initialisation
	NbreElemList.add(1); //Valeur d'initialisation
	ArrayList<ArrayList<Planete>> all_way = new ArrayList<ArrayList<Planete>>(); // Liste de listes de tous les chemins possibles
	ArrayList<Planete> liste_ini = new ArrayList<Planete>(); // Liste d'initialisation qui contiendra..
	liste_ini.add(PlaneteInitial); // ..La planète initiale et que l'on met dans..
	all_way.add(liste_ini); // ..all_way
	//System.out.println(all_way); ok
	int taille_all_way = all_way.size(); //taille de la liste all_way au début égale à 1
	//System.out.println(all_way);
	int compteur = 0;
	int decalage = 0;
	//ArrayList<Planete> TestFaux = new ArrayList<Planete>();
	//TestFaux.add(listPlanete.get(0));
	//TestFaux.add(listPlanete.get(2));
	//TestFaux.add(listPlanete.get(4));
	//int c = calcul_energy(TestFaux);
	//System.out.println(c);
	
	while(compteur<6) {//while (NbreElemList.get(NbreElemList.size()-1)!=NbreElemList.get(NbreElemList.size()-2)) { // On regarde si la liste continue à s'étendre à créer d'autres chemins
		//System.out.println(NbreElemList.get(NbreElemList.size()-1));
		//System.out.println(NbreElemList.get(NbreElemList.size()-2));
		//System.out.println(NbreElemList.get(NbreElemList.size()-1)!=NbreElemList.get(NbreElemList.size()-2));
		taille_all_way = all_way.size(); // On enregistre la taille de la liste all_way car elle sera modifié au cours des boucles for
		//System.out.println(NbreElemList.size()-1); //Pas ok
		//System.out.println(NbreElemList.size());
		//System.out.println(calcul_energy(ListRemp.get(i)));
		//ListRemplaceSystem.out.println(all_way);.addAll(all_way.get(i)); // On créer une liste qui set une copie de all_way.get(ipour éviter toute modification sur cette dernière
		ArrayList<ArrayList<Planete>> ListRemp = new ArrayList<ArrayList<Planete>>();
		ListRemp.addAll(all_way); // De même pour all_way on copie pour pas que les modifications faites sur all_way modifie la boucle et les indiçages
		//System.out.println(ListRemp);
		for (i=0;i<taille_all_way;i++) {
			int compteurscd = 0;
			//System.out.println(ListRemp.get(i));
			//System.out.println(all_way);
			//System.out.println(calcul_energy(ListRemp.get(i)));
			//int p = all_way.get(i).get(0).getListAccessibilite().size(); // On récupère le nombre d'éléments accessible par la dernière planète traversée mais plus être utile finalement
			if ((calcul_energy(ListRemp.get(i))<energie_optimale)&&(PlaneteAllSee(ListRemp.get(i))==false)){ // On continue à étendre les chemins si l'énergie consommée est inférieur à celle du chemin optimale et si toutes les planètes n'ont pas encore été rencontrées
				for(Planete x : ListRemp.get(i).get(ListRemp.get(i).size()-1).getListAccessibilite()) { // On étend un chemin à partir de la dernière planète parcourue donc le dernier élément de la liste en y ajoutant les planètes d'accès
					ArrayList<Planete> ListAjout = new ArrayList<Planete>();
					ArrayList<Planete> ListAjoutei = ListRemp.get(i);
					ListAjout.addAll(ListRemp.get(i)); // On copie dans List Ajout all_way.get(i) au lieu de ListRemp
					//System.out.println(ListRemp.get(i).get(ListRemp.get(i).size()-1)); pas ok
 					ListAjout.add(x); // On y ajoute la planète auquel on a accès ce qui donne la suite d'un chemin
					//System.out.println(all_way);
					all_way.add(ListAjout);
					//System.out.println(all_way);
					//System.out.println(ListAjout);
					compteurscd +=1;
				
					//System.out.println(compteur);// On ajoute ce chemin all_way qui s'est donc agrandi et dont la liste s'est ajouté à la fin			
				}
				//System.out.println(all_way);
				//Une erreur ici mais je ne sais pas où
				all_way.remove(i-decalage); // On supprime le chemin qui nous a permis de créer tous les autres chemins dans la boucle for précédente et comme On ajoute à partir du début et non à partir de la fin sinon i+p, sa position dans la liste n'a pas changé
				//System.out.println(all_way);
				decalage +=1;// On décale car à chaque fois qu'on supprime un chemin avec le remove la position du chemin suivant qui passe dans la boucle est décalée//System.out.println(all_way); 
				//System.out.println(all_way);
		}
		
		//System.out.println(all_way); //ok
		//System.out.println(compteurscd); 
		}
		i=0;
		//System.out.println(all_way); //Problème ici
		decalage = 0; //On le réinitialise
		int Enp = 0;
		compteur +=1;
		//System.out.println(all_way);
		for (j=0;j<all_way.size();j++) { // Boucle for permettant de comparer les chemins qui ont parcouru toutes les planètes 
			//System.out.println(calcul_energy(all_way.get(j)));
			//System.out.println(all_way.get(j));
			if (PlaneteAllSee(all_way.get(j))==true) { // Si toutes les planètes ont déja été parcourues
				Enp = calcul_energy(all_way.get(j)); //On calcule l'énergie consommé pour faire ce chemin
				//System.out.println(energie_optimale);
				//System.out.println(Enp);
				if (Enp < energie_optimale) { //Si il est plus petit que celui du chemin optimale supposé
					//System.out.println(energie_optimale);
					energie_optimale = Enp; // On a une nouvelle énergie optimale
					//System.out.println(energie_optimale);
					//chemin_optimale.addAll(all_way.get(j)); // Avec un nouveau chemin optimale
					chemin_optimale = all_way.get(j);
					//System.out.println(chemin_optimale);
					//System.out.println(calcul_energy(chemin_optimale));
				}
			}
		}
		j=0;

	//System.out.println("Ce n'est pas encore fini");
	NbreElemList.add(all_way.size()); // On ajoute le nombre d'éléments totales dans la liste jusqu'à tous les chemins ne soient forcémenet pas optimale donc soit qu'ils aient dépassé l'énergie consommé ou qu'ils ait parcourues toutes les planètes
	//System.out.println(compteur);
	}
	//System.out.println(NbreElemList);
	return chemin_optimale; // On retourne le chemin optimale
	
}

public int calcul_energybis(ArrayList<Planete> Listp) {
	//System.out.println(Listp);
	//System.out.println(Listp.size());
	int j = 0;
	int i = 0;
	String direction = getSimulatedvoyageur().getDirection();
	int energieCons = 0;
	Position mouv = Ecartdistance(Listp.get(i).getPos(),Listp.get(i).getPos());
	//System.out.println(mouv);
	for (i=0;i<Listp.size()-1;i++) {
		
		//mouv = Ecartdistance(Listp.get(i+1).getPos(),Listp.get(i).getPos());
		mouv.setX(Listp.get(i+1).getPos().getX()-Listp.get(i).getPos().getX());
		mouv.setY(Listp.get(i+1).getPos().getY()-Listp.get(i).getPos().getY());
		//System.out.println(mouv);
		//System.out.println(mouv.getX());
		if (mouv.getX() > 0) {
			if (direction == "E"){
					for (j = 0; j < mouv.getX(); j++) {
						energieCons = energieCons +2;//getSimulatedvoyageur().goForward();
						//System.out.println(energieCons);
						//getSimulatedvoyageur().setDirection("S");
					}
					
					direction ="E";

			}
		}
		
	}
	return energieCons;
}


public ArrayList<Planete> PlaneteAccessible(ArrayList<Planete> Ordreplanete){
	Position posini = getSimulatedvoyageur().getPosBody();
	double d = Integer.MAX_VALUE; //+infini; //à faire
	
	Planete Planete_actuelle = new Planete();
	for (Planete x : listPlanete){
	
		if (d> distance(posini, x.getPos())){
		d = distance(posini,x.getPos());
		Planete_actuelle = x;
		}
	}
	ArrayList<Planete> Planete_rencontre = new ArrayList<Planete>();
	Planete_rencontre.add(Planete_actuelle);
	int i =0;
	int k = 0;//Entier pour parcourir les boucles
	int j = 0;
	ArrayList<Planete> PlaneteAccessible = new ArrayList<Planete>();
	int energie_optimale = 1000;  //entier représentant l'énergie consommée du chemin optimale
	ArrayList<ArrayList<Planete>> all_way = new ArrayList<ArrayList<Planete>>(); // Liste de listes de tous les chemins possibles
	ArrayList<Planete> liste_ini = new ArrayList<Planete>(); // Liste d'initialisation qui contiendra..
	liste_ini.add(Planete_actuelle); // ..La planète initiale et que l'on met dans..
	all_way.add(liste_ini); // ..all_way
	//System.out.println(all_way); ok
	int taille_all_way = all_way.size(); //taille de la liste all_way au début égale à 1
	//System.out.println(all_way);
	int compteur = 0;
	int decalage = 0;	
	while(compteur<6) {//while (NbreElemList.get(NbreElemList.size()-1)!=NbreElemList.get(NbreElemList.size()-2)) { // On regarde si la liste continue à s'étendre à créer d'autres chemins
		taille_all_way = all_way.size(); // On enregistre la taille de la liste all_way car elle sera modifié au cours des boucles for
		//ListRemplaceSystem.out.println(all_way);.addAll(all_way.get(i)); // On créer une liste qui set une copie de all_way.get(ipour éviter toute modification sur cette dernière
		ArrayList<ArrayList<Planete>> ListRemp = new ArrayList<ArrayList<Planete>>();
		ListRemp.addAll(all_way); // De même pour all_way on copie pour pas que les modifications faites sur all_way modifie la boucle et les indiçages
		//System.out.println(ListRemp);
		for (i=0;i<taille_all_way;i++) {
			int compteurscd = 0;
			//System.out.println(ListRemp.get(i));
			//System.out.println(all_way);
			//System.out.println(calcul_energy(ListRemp.get(i)));
			//int p = all_way.get(i).get(0).getListAccessibilite().size(); // On récupère le nombre d'éléments accessible par la dernière planète traversée mais plus être utile finalement
			 // On continue à étendre les chemins si l'énergie consommée est inférieur à celle du chemin optimale et si toutes les planètes n'ont pas encore été rencontrées
			for(Planete x : ListRemp.get(i).get(ListRemp.get(i).size()-1).getListAccessibilite()) { // On étend un chemin à partir de la dernière planète parcourue donc le dernier élément de la liste en y ajoutant les planètes d'accès
					ArrayList<Planete> ListAjout = new ArrayList<Planete>();
					ArrayList<Planete> ListAjoutei = ListRemp.get(i);
					ListAjout.addAll(ListRemp.get(i)); // On copie dans List Ajout all_way.get(i) au lieu de ListRemp
					//System.out.println(ListRemp.get(i).get(ListRemp.get(i).size()-1)); pas ok
 					ListAjout.add(x); // On y ajoute la planète auquel on a accès ce qui donne la suite d'un chemin
					//System.out.println(all_way);
					all_way.add(ListAjout);
					//System.out.println(all_way);
					//System.out.println(ListAjout);
					compteurscd +=1;
					
				
					//System.out.println(compteur);// On ajoute ce chemin all_way qui s'est donc agrandi et dont la liste s'est ajouté à la fin			
				}

				//System.out.println(all_way);
				//Une erreur ici mais je ne sais pas où
				 // On supprime le chemin qui nous a permis de créer tous les autres chemins dans la boucle for précédente et comme On ajoute à partir du début et non à partir de la fin sinon i+p, sa position dans la liste n'a pas changé
				//System.out.println(all_way);
				 
				//System.out.println(all_way);
		
		//System.out.println(all_way); //ok
		//System.out.println(compteurscd); 
		
		//System.out.println(all_way); //Problème ici
		decalage = 0; //On le réinitialise
		

		
		}
		compteur +=1;
	}
	//Maintenant que l'on a crée un grand nombre de chemins on va voir les planètes qui sont contenus dans ces chemins, ce qui nous permettra de voir les planètes accessibles
	i=0;
	ArrayList<Planete> ListJetable =new ArrayList<Planete>();
	ArrayList<Planete> ListCopy = new ArrayList<Planete>();
	ListJetable.addAll(listPlanete);
	for (i=0;i<all_way.size();i++) {
		for (k=0;k<all_way.get(i).size();k++) {
			for (j=0;j<ListJetable.size();j++) {
				if (all_way.get(i).get(k) == ListJetable.get(j)){//Si x fait partie des planètes accessibles
					PlaneteAccessible.add(ListJetable.get(j));
					ListJetable.remove(j);
					//System.out.println(PlaneteAccessible);
				}
			}
		}
	}
	//System.out.println(PlaneteAccessible);
	return PlaneteAccessible;
}


}
		
//ArrayList<ArrayList<Planete>> ListRemp = new ArrayList<ArrayList<Planete>>();
//ArrayList<Planete> ListRemplace = new ArrayList<Planete>();
//ListRemplace.addAll(all_way.get(i)); // On créer une liste qui set une copie de all_way.get(ipour éviter toute modification sur cette dernière
//ListRemp.addAll(all_way); // De même pour all_way
//System.out.println(calcul_energy(ListRemp.get(i)));	


