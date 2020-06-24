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
    	if (direction == "O") { //direction du robot ouest
    		getPosBody().setY(getPosBody().getY()-1);
    		getPosTete().setY(getPosTete().getY()-1);
    		setDirection("O");
    	}

    	else if (direction == "E") { //direction du robot est
        	getPosBody().setY(getPosBody().getY()+1);
        	getPosTete().setY(getPosTete().getY()+1);
        	setDirection("E");
        }
    	else if (direction == "N") {
    		getPosBody().setX(getPosBody().getX()-1);
    		getPosTete().setX(getPosTete().getX()-1);
    		setDirection("N");
    	}
    	else {
    		getPosBody().setX(getPosBody().getX()+1);
    		getPosTete().setX(getPosTete().getX()+1);
    		setDirection("S");
    	}
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#backward()
     */
    @Override
    protected void backward() {
    	String direction = getDirection();
    	if (direction == "O") { //direction du robot ouest
    		getPosBody().setY(getPosBody().getY()+1);
    		getPosTete().setY(getPosTete().getY()+1);
    		setDirection("O");
    	}

    	else if (direction == "E") { //direction du robot est
        	getPosBody().setY(getPosBody().getY()-1);
        	getPosTete().setY(getPosTete().getY()-1);
        	setDirection("E");
        }
    	else if (direction == "N") {  //direction nord
    		getPosBody().setX(getPosBody().getX()+1);
    		getPosTete().setX(getPosTete().getX()+1);
    		setDirection("N");
    	}
    	else {
    		getPosBody().setX(getPosBody().getX()-1); //sinon direction sud
    		getPosTete().setX(getPosTete().getX()-1);
    		setDirection("S");
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
    	if (direction == "O") { //direction du robot ouest
    		getPosTete().setX(getPosTete().getX()+1);
    		getPosTete().setY(getPosTete().getY()+1);
    		setDirection("S");
    	}

    	else if (direction == "E") { //direction du robot est
    		getPosTete().setX(getPosTete().getX()-1);
        	getPosTete().setY(getPosTete().getY()-1);
        	setDirection("N");
        }
    	else if (direction == "N") {  //direction nord
    		getPosTete().setX(getPosTete().getX()+1);
    		getPosTete().setY(getPosTete().getY()-1);
    		setDirection("O");
    	}
    	else {
    		getPosTete().setY(getPosTete().getY()+1); //sinon direction sud
    		getPosTete().setX(getPosTete().getX()-1);
    		setDirection("E");
    	}
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#right()
     */
    @Override
    protected void right() {
        // TODO Auto-generated method stub
    	String direction = getDirection();
    	if (direction == "O") { //direction du robot ouest
    		getPosTete().setX(getPosTete().getX()-1);
    		getPosTete().setY(getPosTete().getY()+1);
    		setDirection("N");
    	}

    	else if (direction == "E") { //direction du robot est
    		getPosTete().setX(getPosTete().getX()+1);
        	getPosTete().setY(getPosTete().getY()-1);
        	setDirection("S");
        }
    	else if (direction == "N") {  //direction nord
    		getPosTete().setX(getPosTete().getX()+1); //à changer le signe
    		getPosTete().setY(getPosTete().getY()+1); 
    		setDirection("E");
    	}
    	else {
    		getPosTete().setY(getPosTete().getY()-1); //sinon direction sud
    		getPosTete().setX(getPosTete().getX()-1);
    		setDirection("O");
    	}
    }
}
