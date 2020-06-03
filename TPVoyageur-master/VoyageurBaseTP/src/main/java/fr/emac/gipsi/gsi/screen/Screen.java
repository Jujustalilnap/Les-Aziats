/**
 * 
 */
package fr.emac.gipsi.gsi.screen;

import fr.emac.gipsi.gsi.couleurs.EchantillonCouleur;

import java.util.ArrayList;

/**
 * @author truptil
 *
 */
public class Screen {
	private String name;
	private int colMax;
	private int LigMax;
	private ArrayList<VisualRectangle> rectangles = new ArrayList<VisualRectangle>();
	
	/**
	 * @param name
	 */
	public Screen(String name) {
		super();
		this.name = name;
	}

	/**
	 * @param name
	 * @param rectangles
	 */
	public Screen(String name, ArrayList<VisualRectangle> rectangles) {
		super();
		this.name = name;
		this.rectangles = rectangles;
	}

	/**
	 * 
	 */
	public Screen() {
		// TODO Auto-generated constructor stub
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
	 * @return the rectangles
	 */
	public ArrayList<VisualRectangle> getRectangles() {
		return rectangles;
	}

	/**
	 * @param rectangles the rectangles to set
	 */
	public void setRectangles(ArrayList<VisualRectangle> rectangles) {
		this.rectangles = rectangles;
	}

	/**
	 * @return the colMax
	 */
	public int getColMax() {
		return colMax;
	}

	/**
	 * @param colMax the colMax to set
	 */
	public void setColMax(int colMax) {
		this.colMax = colMax;
	}

	/**
	 * @return the ligMax
	 */
	public int getLigMax() {
		return LigMax;
	}

	/**
	 * @param ligMax the ligMax to set
	 */
	public void setLigMax(int ligMax) {
		LigMax = ligMax;
	}

	public void updateColorByXY(int lig, int col, VisualRectangle rectangleVisuel) {
		
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ debut MAJ couleur = " + rectangleVisuel.getNomCouleur());
		int total = lig*colMax+col;
//		System.out.println("lig = "+lig+" colMax="+colMax+" col="+col + "total="+total);
		this.rectangles.set(lig*(colMax+1)+col,rectangleVisuel);
		
	}

	public VisualRectangle getColorByXY(int lig, int col) {
	
//		System.out.println(lig +"  " + col);
		VisualRectangle _return = this.rectangles.get(lig*(colMax+1)+col);
		
		return _return;
	}

	public void setColorByXY(int lig, int col,String colorName) {
		
		int total = lig*colMax+col;
		this.rectangles.set(lig*(colMax+1)+col,new VisualRectangle(lig, col, colorName));
	}
	
}
