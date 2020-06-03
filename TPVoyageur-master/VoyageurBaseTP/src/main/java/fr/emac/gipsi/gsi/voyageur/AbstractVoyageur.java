/**
 *
 */
package fr.emac.gipsi.gsi.voyageur;

import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.voyage.Planete;
import fr.emac.gipsi.gsi.voyage.Position;

import java.util.ArrayList;

/**
 * @author truptil
 *
 */
public abstract class AbstractVoyageur {

    protected ArrayList<Screen> listPhotographie = new ArrayList<Screen>();
    protected ArrayList<Screen> listEchantillonRoche = new ArrayList<Screen>();
    protected ArrayList<Screen> listEchantillonSol = new ArrayList<Screen>();

    protected ArrayList<Planete> alreadyVisit = new ArrayList<Planete>();


    protected Position posTete = new Position(1, 0);
    protected Position posBody = new Position(0, 0);

    protected int energy = 0;

    protected String direction = "S";

    /**
     *
     */
    public AbstractVoyageur() {
    }

    public void goForward() {
        energy = energy + 2;

        forward();
    }

    public void goBackward() {
        energy = energy + 2;
        backward();
    }

    public void turnLeft() {
        energy = energy + 1;
        left();
    }

    public void turnRight() {
        energy = energy + 1;
        right();
    }

    public void takePicture(Planete p) {
        energy = energy + 1;
        listPhotographie.add(p.getImage());
    }

    public void takeEchantillonSol(Planete p) {
        energy = energy + 1;
        if (p.getEchantillonSol() != null) {
            listEchantillonSol.add(p.getEchantillonSol());
        }
    }

    public void takeEchantillonRoche(Planete p) {
        energy = energy + 1;
        if (p.getEchantillonRoche() != null) {
            listEchantillonRoche.add(p.getEchantillonRoche());
        }
    }


    protected abstract void forward();

    protected abstract void backward();

    protected abstract void left();

    protected abstract void right();

    /**
     * @return the listPhotographie
     */
    public ArrayList<Screen> getListPhotographie() {
        return listPhotographie;
    }


    /**
     * @return the listEchantillonRoche
     */
    public ArrayList<Screen> getListEchantillonRoche() {
        return listEchantillonRoche;
    }


    /**
     * @return the listEchantillonSol
     */
    public ArrayList<Screen> getListEchantillonSol() {
        return listEchantillonSol;
    }


    /**
     * @return the pos
     */
    public ArrayList<Position> getPos() {
        ArrayList<Position> poss = new ArrayList<Position>();
        poss.add(posTete);
        poss.add(posBody);
        return poss;
    }


    /**
     * @return the posTete
     */
    public Position getPosTete() {
        return posTete;
    }


    /**
     * @param posTete the posTete to set
     */
    public void setPosTete(Position posTete) {
        this.posTete = posTete;
        this.posBody = new Position(posTete.getX(), posTete.getY() - 1);
        System.out.println(posTete.toString() + " " + posBody.toString());
    }


    /**
     * @return the posBody
     */
    public Position getPosBody() {
        return posBody;
    }


    /**
     * @param posBody the posBody to set
     */
    public void setPosBody(Position posBody) {
        this.posBody = posBody;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * @return the energy
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * @return the alreadyVisit
     */
    public ArrayList<Planete> getAlreadyVisit() {
        return alreadyVisit;
    }

//	/**
//	 * @param listPlanete
//	 * @param voyageur2
//	 * @param reel
//	 */
//	public abstract void launch(ArrayList<Planete> listPlanete, RealVoyageur voyageur2, boolean reel);


}
