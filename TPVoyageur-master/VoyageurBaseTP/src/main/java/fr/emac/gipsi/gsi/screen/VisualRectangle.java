/**
 * 
 */
package fr.emac.gipsi.gsi.screen;

import java.io.Serializable;

/**
 * @author truptil
 *
 */
public class VisualRectangle implements Serializable{
	private int indiceLigne;
	private int indiceColonne;
	private String nomCouleur;
	
	/**
	 * 
	 */
	public VisualRectangle() {
	}
	
	/**
	 * 
	 */
	public VisualRectangle(String s) {
		super();
		String[] liste = s.split(",");
		indiceLigne=Integer.parseInt(liste[0].substring(liste[0].lastIndexOf("indiceLigne:")+12, liste[0].length()));
		indiceColonne=Integer.parseInt(liste[1].substring(liste[1].lastIndexOf("indiceColonne:")+14, liste[1].length()));
		nomCouleur=liste[2].substring(liste[2].lastIndexOf("nomCouleur:")+11, liste[2].length());
	}

	/**
	 * @param indiceLigne
	 * @param indiceColonne
	 * @param nomCouleur
	 */
	public VisualRectangle(int indiceLigne, int indiceColonne, String nomCouleur) {
		super();
		this.indiceLigne = indiceLigne;
		this.indiceColonne = indiceColonne;
		this.nomCouleur = nomCouleur;
		
//		System.out.println("indiceLigne ="+indiceLigne +" indiceColonne ="+indiceColonne+" nomCouleur ="+nomCouleur);
	}

	/**
	 * @return the indiceLigne
	 */
	public int getIndiceLigne() {
		return indiceLigne;
	}

	/**
	 * @param indiceLigne the indiceLigne to set
	 */
	public void setIndiceLigne(int indiceLigne) {
		this.indiceLigne = indiceLigne;
	}

	/**
	 * @return the indiceColonne
	 */
	public int getIndiceColonne() {
		return indiceColonne;
	}

	/**
	 * @param indiceColonne the indiceColonne to set
	 */
	public void setIndiceColonne(int indiceColonne) {
		this.indiceColonne = indiceColonne;
	}

	/**
	 * @return the nomCouleur
	 */
	public String getNomCouleur() {
		return nomCouleur;
	}

	/**
	 * @param nomCouleur the nomCouleur to set
	 */
	public void setNomCouleur(String nomCouleur) {
		this.nomCouleur = nomCouleur;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "indiceLigne:" + indiceLigne
				+ ",indiceColonne:" + indiceColonne + ",nomCouleur:"
				+ nomCouleur + ";";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + indiceColonne;
		result = prime * result + indiceLigne;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof VisualRectangle)) {
			return false;
		}
		VisualRectangle other = (VisualRectangle) obj;
		if (indiceColonne != other.indiceColonne) {
			return false;
		}
		if (indiceLigne != other.indiceLigne) {
			return false;
		}
		return true;
	}

}
