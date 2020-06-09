/**
 *
 */
package fr.emac.gipsi.gsi.voyageur;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class VoyageurSimuler extends AbstractVoyageur {

    /**
     *
     */
    public VoyageurSimuler() {
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#forward()
     */
    @Override
    protected void forward() {
        // TODO Auto-generated method stub
    	
    	String direction = getDirection();
    	if (direction == "o") { //direction du robot ouest
    		getPosBody().setY(getPosBody().getY()-1);
    		getPosTete().setY(getPosTete().getY()-1);
    	}

    	else if (direction == "e") { //direction du robot est
        		getPosBody().setY(getPosBody().getY()+1);
        		getPosTete().setY(getPosTete().getY()+1);
        }
    	else if (direction == "n") {
    		getPosBody().setX(getPosBody().getX()-1);
    		getPosTete().setX(getPosTete().getX()-1);
    	}
    	else {
    		getPosBody().setX(getPosBody().getX()+1);
    		getPosTete().setX(getPosTete().getX()+1);
    	}
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#backward()
     */
    @Override
    protected void backward() {
    	String direction = getDirection();
    	if (direction == "o") { //direction du robot ouest
    		getPosBody().setY(getPosBody().getY()+1);
    		getPosTete().setY(getPosTete().getY()+1);
    	}

    	else if (direction == "e") { //direction du robot est
        		getPosBody().setY(getPosBody().getY()-1);
        		getPosTete().setY(getPosTete().getY()-1);
        }
    	else if (direction == "n") {  //direction nord
    		getPosBody().setX(getPosBody().getX()+1);
    		getPosTete().setX(getPosTete().getX()+1);
    	}
    	else {
    		getPosBody().setX(getPosBody().getX()-1); //sinon direction sud
    		getPosTete().setX(getPosTete().getX()-1);
    	}
        // TODO Auto-generated method stub
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#left()
     */
    @Override
    protected void left() {
        // TODO Auto-generated method stub
    	String direction = getDirection();
    	if (direction == "o") { //direction du robot ouest
    		getPosTete().setX(getPosTete().getX()+1);
    		getPosTete().setY(getPosTete().getY()+1);
    	}

    	else if (direction == "e") { //direction du robot est
    			getPosTete().setX(getPosTete().getX()-1);
        		getPosTete().setY(getPosTete().getY()-1);
        }
    	else if (direction == "n") {  //direction nord
    		getPosTete().setX(getPosTete().getX()+1);
    		getPosTete().setY(getPosTete().getY()-1);
    	}
    	else {
    		getPosTete().setY(getPosTete().getY()+1); //sinon direction sud
    		getPosTete().setX(getPosTete().getX()-1);
    	}
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#right()
     */
    @Override
    protected void right() {
        // TODO Auto-generated method stub
    	String direction = getDirection();
    	if (direction == "o") { //direction du robot ouest
    		getPosTete().setX(getPosTete().getX()-1);
    		getPosTete().setY(getPosTete().getY()+1);
    	}

    	else if (direction == "e") { //direction du robot est
    			getPosTete().setX(getPosTete().getX()+1);
        		getPosTete().setY(getPosTete().getY()-1);
        }
    	else if (direction == "n") {  //direction nord
    		getPosTete().setX(getPosTete().getX()+1);
    		getPosTete().setY(getPosTete().getY()-1);
    	}
    	else {
    		getPosTete().setY(getPosTete().getY()-1); //sinon direction sud
    		getPosTete().setX(getPosTete().getX()-1);
    	}
}
