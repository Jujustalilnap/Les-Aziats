/**
 * 
 */
package fr.emac.gipsi.gsi.voyage;

import java.util.ArrayList;

import fr.emac.gipsi.gsi.screen.Screen;

/**
 * @author truptil
 *
 */
public class Planete {

	private ArrayList<Planete> listVisibilite = new ArrayList<Planete>();
	private ArrayList<Planete> listAccessibilite = new ArrayList<Planete>();
	private Screen echantillonRoche;
	private Screen image;
	private Screen echantillonSol;
	
	private Position pos = new Position(0, 0);
	private int rayon=1;
	private String colorName="Aqua";
	
	/**
	 * 
	 */
	public Planete() {
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @return the listVisibilite
	 */
	public ArrayList<Planete> getListVisibilite() {
		return listVisibilite;
	}

	
	/**
	 * @return the listAccessibilite
	 */
	public ArrayList<Planete> getListAccessibilite() {
		return listAccessibilite;
	}

	/**
	 * @return the echantillonRoche
	 */
	public Screen getEchantillonRoche() {
		return echantillonRoche;
	}


	/**
	 * @param echantillonRoche the echantillonRoche to set
	 */
	public void setEchantillonRoche(Screen echantillonRoche) {
		this.echantillonRoche = echantillonRoche;
	}


	/**
	 * @return the echantillonSol
	 */
	public Screen getEchantillonSol() {
		return echantillonSol;
	}


	/**
	 * @param echantillonSol the echantillonSol to set
	 */
	public void setEchantillonSol(Screen echantillonSol) {
		this.echantillonSol = echantillonSol;
	}



	/**
	 * @return the rayon
	 */
	public int getRayon() {
		return rayon;
	}



	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}



	/**
	 * @return the pos
	 */
	public Position getPos() {
		return pos;
	}



	/**
	 * @return the colorName
	 */
	public String getColorName() {
		return colorName;
	}



	/**
	 * @param colorName the colorName to set
	 */
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}



	/**
	 * @return the image
	 */
	public Screen getImage() {
		return image;
	}



	/**
	 * @param image the image to set
	 */
	public void setImage(Screen image) {
		this.image = image;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Planete [" + (pos != null ? "\npos=" + pos + ", " : "")
				+ (colorName != null ? "colorName=" + colorName : "") + "]";
	}


		
	
}
