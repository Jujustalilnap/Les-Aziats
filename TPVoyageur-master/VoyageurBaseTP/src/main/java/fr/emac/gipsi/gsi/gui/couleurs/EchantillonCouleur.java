/**
 * 
 */
package fr.emac.gipsi.gsi.gui.couleurs;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * @author truptil
 *
 */
public class EchantillonCouleur extends Color {

	private static List<EchantillonCouleur> listeCouleurs = new ArrayList<EchantillonCouleur>();
	private String name ="";
	
	public static final Color ALICE_BLUE = new EchantillonCouleur("AliceBlue", 240, 248, 255);
	public static final Color ANTIQUE_WHITE = new EchantillonCouleur("AntiqueWhite", 250, 235, 215);
	public static final Color AQUA = new EchantillonCouleur("Aqua", 0, 255, 255);
	public static final Color AQUAMARINE = new EchantillonCouleur("Aquamarine", 127, 255, 212);
	public static final Color AZURE = new EchantillonCouleur("Azure", 240, 255, 255);
	public static final Color BEIGE = new EchantillonCouleur("Beige", 245, 245, 220);
	public static final Color BISQUE = new EchantillonCouleur("Bisque", 255, 228, 196);
	public static final Color BLACK = new EchantillonCouleur("Black", 0, 0, 0);
	public static final Color BLANCHED_ALMOND = new EchantillonCouleur("BlanchedAlmond", 255, 235, 205);
	public static final Color BLUE = new EchantillonCouleur("Blue", 0, 0, 255);
	public static final Color BLUE_VIOLET = new EchantillonCouleur("BlueViolet", 138, 43, 226);
	public static final Color BROWN = new EchantillonCouleur("Brown", 165, 42, 42);
	public static final Color BURLY_WOOD = new EchantillonCouleur("BurlyWood", 222, 184, 135);
	public static final Color CADET_BLUE = new EchantillonCouleur("CadetBlue", 95, 158, 160);
	public static final Color CHARTREUSE = new EchantillonCouleur("Chartreuse", 127, 255, 0);
	public static final Color CHOCOLATE = new EchantillonCouleur("Chocolate", 210, 105, 30);
	public static final Color CORAL = new EchantillonCouleur("Coral", 255, 127, 80);
	public static final Color CORNFLOWER_BLUE = new EchantillonCouleur("CornflowerBlue", 100, 149, 237);
	public static final Color CORNSILK = new EchantillonCouleur("Cornsilk", 255, 248, 220);
	public static final Color CRIMSON = new EchantillonCouleur("Crimson", 220, 20, 60);
	public static final Color CYAN = new EchantillonCouleur("Cyan", 0, 255, 255);
	public static final Color DARK_BLUE = new EchantillonCouleur("DarkBlue", 0, 0, 139);
	public static final Color DARK_CYAN = new EchantillonCouleur("DarkCyan", 0, 139, 139);
	public static final Color DARK_GOLDEN_ROD = new EchantillonCouleur("DarkGoldenRod", 184, 134, 11);
	public static final Color DARK_GRAY = new EchantillonCouleur("DarkGray", 169, 169, 169);
	public static final Color DARK_GREEN = new EchantillonCouleur("DarkGreen", 0, 100, 0);
	public static final Color DARK_KHAKI = new EchantillonCouleur("DarkKhaki", 189, 183, 107);
	public static final Color DARK_MAGENTA = new EchantillonCouleur("DarkMagenta", 139, 0, 139);
	public static final Color DARK_OLIVE_GREEN = new EchantillonCouleur("DarkOliveGreen", 85, 107, 47);
	public static final Color DARKORANGE = new EchantillonCouleur("Darkorange", 255, 140, 0);
	public static final Color DARK_ORCHID = new EchantillonCouleur("DarkOrchid", 153, 50, 204);
	public static final Color DARK_RED = new EchantillonCouleur("DarkRed", 139, 0, 0);
	public static final Color DARK_SALMON = new EchantillonCouleur("DarkSalmon", 233, 150, 122);
	public static final Color DARK_SEA_GREEN = new EchantillonCouleur("DarkSeaGreen", 143, 188, 143);
	public static final Color DARK_SLATE_BLUE = new EchantillonCouleur("DarkSlateBlue", 72, 61, 139);
	public static final Color DARK_SLATE_GRAY = new EchantillonCouleur("DarkSlateGray", 47, 79, 79);
	public static final Color DARK_TURQUOISE = new EchantillonCouleur("DarkTurquoise", 0, 206, 209);
	public static final Color DARK_VIOLET = new EchantillonCouleur("DarkViolet", 148, 0, 211);
	public static final Color DEEP_PINK = new EchantillonCouleur("DeepPink", 255, 20, 147);
	public static final Color DEEP_SKY_BLUE = new EchantillonCouleur("DeepSkyBlue", 0, 191, 255);
	public static final Color DIM_GRAY = new EchantillonCouleur("DimGray", 105, 105, 105);
	public static final Color DODGER_BLUE = new EchantillonCouleur("DodgerBlue", 30, 144, 255);
	public static final Color FIRE_BRICK = new EchantillonCouleur("FireBrick", 178, 34, 34);
	public static final Color FLORAL_WHITE = new EchantillonCouleur("FloralWhite", 255, 250, 240);
	public static final Color FOREST_GREEN = new EchantillonCouleur("ForestGreen", 34, 139, 34);
	public static final Color FUCHSIA = new EchantillonCouleur("Fuchsia", 255, 0, 255);
	public static final Color GAINSBORO = new EchantillonCouleur("Gainsboro", 220, 220, 220);
	public static final Color GHOST_WHITE = new EchantillonCouleur("GhostWhite", 248, 248, 255);
	public static final Color GOLD = new EchantillonCouleur("Gold", 255, 215, 0);
	public static final Color GOLDEN_ROD = new EchantillonCouleur("GoldenRod", 218, 165, 32);
	public static final Color GRAY = new EchantillonCouleur("Gray", 128, 128, 128);
	public static final Color GREEN = new EchantillonCouleur("Green", 0, 128, 0);
	public static final Color GREEN_YELLOW = new EchantillonCouleur("GreenYellow", 173, 255, 47);
	public static final Color HONEY_DEW = new EchantillonCouleur("HoneyDew", 240, 255, 240);
	public static final Color HOT_PINK = new EchantillonCouleur("HotPink", 255, 105, 180);
	public static final Color INDIAN_RED = new EchantillonCouleur("IndianRed", 205, 92, 92);
	public static final Color INDIGO = new EchantillonCouleur("Indigo", 75, 0, 130);
	public static final Color IVORY = new EchantillonCouleur("Ivory", 255, 255, 240);
	public static final Color KHAKI = new EchantillonCouleur("Khaki", 240, 230, 140);
	public static final Color LAVENDER = new EchantillonCouleur("Lavender", 230, 230, 250);
	public static final Color LAVENDER_BLUSH = new EchantillonCouleur("LavenderBlush", 255, 240, 245);
	public static final Color LAWN_GREEN = new EchantillonCouleur("LawnGreen", 124, 252, 0);
	public static final Color LEMON_CHIFFON = new EchantillonCouleur("LemonChiffon", 255, 250, 205);
	public static final Color LIGHT_BLUE = new EchantillonCouleur("LightBlue", 173, 216, 230);
	public static final Color LIGHT_CORAL = new EchantillonCouleur("LightCoral", 240, 128, 128);
	public static final Color LIGHT_CYAN = new EchantillonCouleur("LightCyan", 224, 255, 255);
	public static final Color LIGHT_GOLDEN_ROD_YELLOW = new EchantillonCouleur("LightGoldenRodYellow", 250, 250, 210);
	public static final Color LIGHT_GREY = new EchantillonCouleur("LightGrey", 211, 211, 211);
	public static final Color LIGHT_GREEN = new EchantillonCouleur("LightGreen", 144, 238, 144);
	public static final Color LIGHT_PINK = new EchantillonCouleur("LightPink", 255, 182, 193);
	public static final Color LIGHT_SALMON = new EchantillonCouleur("LightSalmon", 255, 160, 122);
	public static final Color LIGHT_SEA_GREEN = new EchantillonCouleur("LightSeaGreen", 32, 178, 170);
	public static final Color LIGHT_SKY_BLUE = new EchantillonCouleur("LightSkyBlue", 135, 206, 250);
	public static final Color LIGHT_SLATE_GRAY = new EchantillonCouleur("LightSlateGray", 119, 136, 153);
	public static final Color LIGHT_STEEL_BLUE = new EchantillonCouleur("LightSteelBlue", 176, 196, 222);
	public static final Color LIGHT_YELLOW = new EchantillonCouleur("LightYellow", 255, 255, 224);
	public static final Color LIME = new EchantillonCouleur("Lime", 0, 255, 0);
	public static final Color LIME_GREEN = new EchantillonCouleur("LimeGreen", 50, 205, 50);
	public static final Color LINEN = new EchantillonCouleur("Linen", 250, 240, 230);
	public static final Color MAGENTA = new EchantillonCouleur("Magenta", 255, 0, 255);
	public static final Color MAROON = new EchantillonCouleur("Maroon", 128, 0, 0);
	public static final Color MEDIUM_AQUA_MARINE = new EchantillonCouleur("MediumAquaMarine", 102, 205, 170);
	public static final Color MEDIUM_BLUE = new EchantillonCouleur("MediumBlue", 0, 0, 205);
	public static final Color MEDIUM_ORCHID = new EchantillonCouleur("MediumOrchid", 186, 85, 211);
	public static final Color MEDIUM_PURPLE = new EchantillonCouleur("MediumPurple", 147, 112, 216);
	public static final Color MEDIUM_SEA_GREEN = new EchantillonCouleur("MediumSeaGreen", 60, 179, 113);
	public static final Color MEDIUM_SLATE_BLUE = new EchantillonCouleur("MediumSlateBlue", 123, 104, 238);
	public static final Color MEDIUM_SPRING_GREEN = new EchantillonCouleur("MediumSpringGreen", 0, 250, 154);
	public static final Color MEDIUM_TURQUOISE = new EchantillonCouleur("MediumTurquoise", 72, 209, 204);
	public static final Color MEDIUM_VIOLET_RED = new EchantillonCouleur("MediumVioletRed", 199, 21, 133);
	public static final Color MIDNIGHT_BLUE = new EchantillonCouleur("MidnightBlue", 25, 25, 112);
	public static final Color MINT_CREAM = new EchantillonCouleur("MintCream", 245, 255, 250);
	public static final Color MISTY_ROSE = new EchantillonCouleur("MistyRose", 255, 228, 225);
	public static final Color MOCCASIN = new EchantillonCouleur("Moccasin", 255, 228, 181);
	public static final Color NAVAJO_WHITE = new EchantillonCouleur("NavajoWhite", 255, 222, 173);
	public static final Color NAVY = new EchantillonCouleur("Navy", 0, 0, 128);
	public static final Color OLD_LACE = new EchantillonCouleur("OldLace", 253, 245, 230);
	public static final Color OLIVE = new EchantillonCouleur("Olive", 128, 128, 0);
	public static final Color OLIVE_DRAB = new EchantillonCouleur("OliveDrab", 107, 142, 35);
	public static final Color ORANGE = new EchantillonCouleur("Orange", 255, 165, 0);
	public static final Color ORANGE_RED = new EchantillonCouleur("OrangeRed", 255, 69, 0);
	public static final Color ORCHID = new EchantillonCouleur("Orchid", 218, 112, 214);
	public static final Color PALE_GOLDEN_ROD = new EchantillonCouleur("PaleGoldenRod", 238, 232, 170);
	public static final Color PALE_GREEN = new EchantillonCouleur("PaleGreen", 152, 251, 152);
	public static final Color PALE_TURQUOISE = new EchantillonCouleur("PaleTurquoise", 175, 238, 238);
	public static final Color PALE_VIOLET_RED = new EchantillonCouleur("PaleVioletRed", 216, 112, 147);
	public static final Color PAPAYA_WHIP = new EchantillonCouleur("PapayaWhip", 255, 239, 213);
	public static final Color PEACH_PUFF = new EchantillonCouleur("PeachPuff", 255, 218, 185);
	public static final Color PERU = new EchantillonCouleur("Peru", 205, 133, 63);
	public static final Color PINK = new EchantillonCouleur("Pink", 255, 192, 203);
	public static final Color PLUM = new EchantillonCouleur("Plum", 221, 160, 221);
	public static final Color POWDER_BLUE = new EchantillonCouleur("PowderBlue", 176, 224, 230);
	public static final Color PURPLE = new EchantillonCouleur("Purple", 128, 0, 128);
	public static final Color RED = new EchantillonCouleur("Red", 255, 0, 0);
	public static final Color ROSY_BROWN = new EchantillonCouleur("RosyBrown", 188, 143, 143);
	public static final Color ROYAL_BLUE = new EchantillonCouleur("RoyalBlue", 65, 105, 225);
	public static final Color SADDLE_BROWN = new EchantillonCouleur("SaddleBrown", 139, 69, 19);
	public static final Color SALMON = new EchantillonCouleur("Salmon", 250, 128, 114);
	public static final Color SANDY_BROWN = new EchantillonCouleur("SandyBrown", 244, 164, 96);
	public static final Color SEA_GREEN = new EchantillonCouleur("SeaGreen", 46, 139, 87);
	public static final Color SEA_SHELL = new EchantillonCouleur("SeaShell", 255, 245, 238);
	public static final Color SIENNA = new EchantillonCouleur("Sienna", 160, 82, 45);
	public static final Color SILVER = new EchantillonCouleur("Silver", 192, 192, 192);
	public static final Color SKY_BLUE = new EchantillonCouleur("SkyBlue", 135, 206, 235);
	public static final Color SLATE_BLUE = new EchantillonCouleur("SlateBlue", 106, 90, 205);
	public static final Color SLATE_GRAY = new EchantillonCouleur("SlateGray", 112, 128, 144);
	public static final Color SNOW = new EchantillonCouleur("Snow", 255, 250, 250);
	public static final Color SPRING_GREEN = new EchantillonCouleur("SpringGreen", 0, 255, 127);
	public static final Color STEEL_BLUE = new EchantillonCouleur("SteelBlue", 70, 130, 180);
	public static final Color TAN = new EchantillonCouleur("Tan", 210, 180, 140);
	public static final Color TEAL = new EchantillonCouleur("Teal", 0, 128, 128);
	public static final Color THISTLE = new EchantillonCouleur("Thistle", 216, 191, 216);
	public static final Color TOMATO = new EchantillonCouleur("Tomato", 255, 99, 71);
	public static final Color TURQUOISE = new EchantillonCouleur("Turquoise", 64, 224, 208);
	public static final Color VIOLET = new EchantillonCouleur("Violet", 238, 130, 238);
	public static final Color WHEAT = new EchantillonCouleur("Wheat", 245, 222, 179);
	public static final Color WHITE = new EchantillonCouleur("White", 255, 255, 255);
	public static final Color WHITE_SMOKE = new EchantillonCouleur("WhiteSmoke", 245, 245, 245);
	public static final Color YELLOW = new EchantillonCouleur("Yellow", 255, 255, 0);
	public static final Color YELLOW_GREEN = new EchantillonCouleur("YellowGreen", 154, 205, 50);

	/**
	 * 
	 */
	public EchantillonCouleur(String colorCode, int red, int blue, int green) {
		super(red, blue, green);
		listeCouleurs.add(this);
		setName(colorCode);
	}

	/**
	 * @return the listeCouleurs
	 */
	public static List<EchantillonCouleur> getListeCouleurs() {
		return listeCouleurs;
	}

	/**
	 * @param listeCouleurs the listeCouleurs to set
	 */
	public static void setListeCouleurs(List<EchantillonCouleur> listeCouleurs) {
		EchantillonCouleur.listeCouleurs = listeCouleurs;
	}

	public static Color findCouleur(String nomCouleur) {

		if(nomCouleur.contains("_")){
			String[] valeurs = nomCouleur.split("_");
			Color c =new Color(Integer.parseInt(valeurs[0]), Integer.parseInt(valeurs[1]), Integer.parseInt(valeurs[2]));
			return c;
		}else{
		for(int i =0;i<listeCouleurs.size();i++){
//			System.out.println("nomcouleur0 :"+nomCouleur +"listeCouleurs.get(i).getColorCode() ="+listeCouleurs.get(i).getName() );
			if(listeCouleurs.get(i).getName().equals(nomCouleur)){
//				System.out.println("nomcouleur :"+nomCouleur);
	//			return new Color(listeCouleurs.get(i).getR(),listeCouleurs.get(i).getB(),listeCouleurs.get(i).getG());
			}
		}}
		return new Color(0, 0, 0);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Color getColorByName(String nomCouleur) {
	
		for(EchantillonCouleur c : listeCouleurs){
			if(c.getName().equals(nomCouleur)){
				return c;
			}
		}
		
		return DARK_GRAY;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "name";
	}
	
	

}
