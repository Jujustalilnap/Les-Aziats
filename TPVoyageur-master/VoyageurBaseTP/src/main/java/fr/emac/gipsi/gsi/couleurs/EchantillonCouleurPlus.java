/**
 * 
 */
package fr.emac.gipsi.gsi.couleurs;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * @author truptil
 *
 */
public class EchantillonCouleurPlus extends Color {

	private static List<EchantillonCouleurPlus> listeCouleurs = new ArrayList<EchantillonCouleurPlus>();
	private String name ="";
	
	public static final EchantillonCouleurPlus ALICE_BLUE = new EchantillonCouleurPlus("AliceBlue", 240, 248, 255);
	public static final EchantillonCouleurPlus ANTIQUE_WHITE = new EchantillonCouleurPlus("AntiqueWhite", 250, 235, 215);
	public static final EchantillonCouleurPlus AQUA = new EchantillonCouleurPlus("Aqua", 0, 255, 255);
	public static final EchantillonCouleurPlus AQUAMARINE = new EchantillonCouleurPlus("Aquamarine", 127, 255, 212);
	public static final EchantillonCouleurPlus AZURE = new EchantillonCouleurPlus("Azure", 240, 255, 255);
	public static final EchantillonCouleurPlus BEIGE = new EchantillonCouleurPlus("Beige", 245, 245, 220);
	public static final EchantillonCouleurPlus BISQUE = new EchantillonCouleurPlus("Bisque", 255, 228, 196);
	public static final EchantillonCouleurPlus BLACK = new EchantillonCouleurPlus("Black", 0, 0, 0);
	public static final EchantillonCouleurPlus BLANCHED_ALMOND = new EchantillonCouleurPlus("BlanchedAlmond", 255, 235, 205);
	public static final EchantillonCouleurPlus BLUE = new EchantillonCouleurPlus("Blue", 0, 0, 255);
	public static final EchantillonCouleurPlus BLUE_VIOLET = new EchantillonCouleurPlus("BlueViolet", 138, 43, 226);
	public static final EchantillonCouleurPlus BROWN = new EchantillonCouleurPlus("Brown", 165, 42, 42);
	public static final EchantillonCouleurPlus BURLY_WOOD = new EchantillonCouleurPlus("BurlyWood", 222, 184, 135);
	public static final EchantillonCouleurPlus CADET_BLUE = new EchantillonCouleurPlus("CadetBlue", 95, 158, 160);
	public static final EchantillonCouleurPlus CHARTREUSE = new EchantillonCouleurPlus("Chartreuse", 127, 255, 0);
	public static final EchantillonCouleurPlus CHOCOLATE = new EchantillonCouleurPlus("Chocolate", 210, 105, 30);
	public static final EchantillonCouleurPlus CORAL = new EchantillonCouleurPlus("Coral", 255, 127, 80);
	public static final EchantillonCouleurPlus CORNFLOWER_BLUE = new EchantillonCouleurPlus("CornflowerBlue", 100, 149, 237);
	public static final EchantillonCouleurPlus CORNSILK = new EchantillonCouleurPlus("Cornsilk", 255, 248, 220);
	public static final EchantillonCouleurPlus CRIMSON = new EchantillonCouleurPlus("Crimson", 220, 20, 60);
	public static final EchantillonCouleurPlus CYAN = new EchantillonCouleurPlus("Cyan", 0, 255, 255);
	public static final EchantillonCouleurPlus DARK_BLUE = new EchantillonCouleurPlus("DarkBlue", 0, 0, 139);
	public static final EchantillonCouleurPlus DARK_CYAN = new EchantillonCouleurPlus("DarkCyan", 0, 139, 139);
	public static final EchantillonCouleurPlus DARK_GOLDEN_ROD = new EchantillonCouleurPlus("DarkGoldenRod", 184, 134, 11);
	public static final EchantillonCouleurPlus DARK_GRAY = new EchantillonCouleurPlus("DarkGray", 169, 169, 169);
	public static final EchantillonCouleurPlus DARK_GREEN = new EchantillonCouleurPlus("DarkGreen", 0, 100, 0);
	public static final EchantillonCouleurPlus DARK_KHAKI = new EchantillonCouleurPlus("DarkKhaki", 189, 183, 107);
	public static final EchantillonCouleurPlus DARK_MAGENTA = new EchantillonCouleurPlus("DarkMagenta", 139, 0, 139);
	public static final EchantillonCouleurPlus DARK_OLIVE_GREEN = new EchantillonCouleurPlus("DarkOliveGreen", 85, 107, 47);
	public static final EchantillonCouleurPlus DARKORANGE = new EchantillonCouleurPlus("Darkorange", 255, 140, 0);
	public static final EchantillonCouleurPlus DARK_ORCHID = new EchantillonCouleurPlus("DarkOrchid", 153, 50, 204);
	public static final EchantillonCouleurPlus DARK_RED = new EchantillonCouleurPlus("DarkRed", 139, 0, 0);
	public static final EchantillonCouleurPlus DARK_SALMON = new EchantillonCouleurPlus("DarkSalmon", 233, 150, 122);
	public static final EchantillonCouleurPlus DARK_SEA_GREEN = new EchantillonCouleurPlus("DarkSeaGreen", 143, 188, 143);
	public static final EchantillonCouleurPlus DARK_SLATE_BLUE = new EchantillonCouleurPlus("DarkSlateBlue", 72, 61, 139);
	public static final EchantillonCouleurPlus DARK_SLATE_GRAY = new EchantillonCouleurPlus("DarkSlateGray", 47, 79, 79);
	public static final EchantillonCouleurPlus DARK_TURQUOISE = new EchantillonCouleurPlus("DarkTurquoise", 0, 206, 209);
	public static final EchantillonCouleurPlus DARK_VIOLET = new EchantillonCouleurPlus("DarkViolet", 148, 0, 211);
	public static final EchantillonCouleurPlus DEEP_PINK = new EchantillonCouleurPlus("DeepPink", 255, 20, 147);
	public static final EchantillonCouleurPlus DEEP_SKY_BLUE = new EchantillonCouleurPlus("DeepSkyBlue", 0, 191, 255);
	public static final EchantillonCouleurPlus DIM_GRAY = new EchantillonCouleurPlus("DimGray", 105, 105, 105);
	public static final EchantillonCouleurPlus DODGER_BLUE = new EchantillonCouleurPlus("DodgerBlue", 30, 144, 255);
	public static final EchantillonCouleurPlus FIRE_BRICK = new EchantillonCouleurPlus("FireBrick", 178, 34, 34);
	public static final EchantillonCouleurPlus FLORAL_WHITE = new EchantillonCouleurPlus("FloralWhite", 255, 250, 240);
	public static final EchantillonCouleurPlus FOREST_GREEN = new EchantillonCouleurPlus("ForestGreen", 34, 139, 34);
	public static final EchantillonCouleurPlus FUCHSIA = new EchantillonCouleurPlus("Fuchsia", 255, 0, 255);
	public static final EchantillonCouleurPlus GAINSBORO = new EchantillonCouleurPlus("Gainsboro", 220, 220, 220);
	public static final EchantillonCouleurPlus GHOST_WHITE = new EchantillonCouleurPlus("GhostWhite", 248, 248, 255);
	public static final EchantillonCouleurPlus GOLD = new EchantillonCouleurPlus("Gold", 255, 215, 0);
	public static final EchantillonCouleurPlus GOLDEN_ROD = new EchantillonCouleurPlus("GoldenRod", 218, 165, 32);
	public static final EchantillonCouleurPlus GRAY = new EchantillonCouleurPlus("Gray", 128, 128, 128);
	public static final EchantillonCouleurPlus GREEN = new EchantillonCouleurPlus("Green", 0, 128, 0);
	public static final EchantillonCouleurPlus GREEN_YELLOW = new EchantillonCouleurPlus("GreenYellow", 173, 255, 47);
	public static final EchantillonCouleurPlus HONEY_DEW = new EchantillonCouleurPlus("HoneyDew", 240, 255, 240);
	public static final EchantillonCouleurPlus HOT_PINK = new EchantillonCouleurPlus("HotPink", 255, 105, 180);
	public static final EchantillonCouleurPlus INDIAN_RED = new EchantillonCouleurPlus("IndianRed", 205, 92, 92);
	public static final EchantillonCouleurPlus INDIGO = new EchantillonCouleurPlus("Indigo", 75, 0, 130);
	public static final EchantillonCouleurPlus IVORY = new EchantillonCouleurPlus("Ivory", 255, 255, 240);
	public static final EchantillonCouleurPlus KHAKI = new EchantillonCouleurPlus("Khaki", 240, 230, 140);
	public static final EchantillonCouleurPlus LAVENDER = new EchantillonCouleurPlus("Lavender", 230, 230, 250);
	public static final EchantillonCouleurPlus LAVENDER_BLUSH = new EchantillonCouleurPlus("LavenderBlush", 255, 240, 245);
	public static final EchantillonCouleurPlus LAWN_GREEN = new EchantillonCouleurPlus("LawnGreen", 124, 252, 0);
	public static final EchantillonCouleurPlus LEMON_CHIFFON = new EchantillonCouleurPlus("LemonChiffon", 255, 250, 205);
	public static final EchantillonCouleurPlus LIGHT_BLUE = new EchantillonCouleurPlus("LightBlue", 173, 216, 230);
	public static final EchantillonCouleurPlus LIGHT_CORAL = new EchantillonCouleurPlus("LightCoral", 240, 128, 128);
	public static final EchantillonCouleurPlus LIGHT_CYAN = new EchantillonCouleurPlus("LightCyan", 224, 255, 255);
	public static final EchantillonCouleurPlus LIGHT_GOLDEN_ROD_YELLOW = new EchantillonCouleurPlus("LightGoldenRodYellow", 250, 250, 210);
	public static final EchantillonCouleurPlus LIGHT_GREY = new EchantillonCouleurPlus("LightGrey", 211, 211, 211);
	public static final EchantillonCouleurPlus LIGHT_GREEN = new EchantillonCouleurPlus("LightGreen", 144, 238, 144);
	public static final EchantillonCouleurPlus LIGHT_PINK = new EchantillonCouleurPlus("LightPink", 255, 182, 193);
	public static final EchantillonCouleurPlus LIGHT_SALMON = new EchantillonCouleurPlus("LightSalmon", 255, 160, 122);
	public static final EchantillonCouleurPlus LIGHT_SEA_GREEN = new EchantillonCouleurPlus("LightSeaGreen", 32, 178, 170);
	public static final EchantillonCouleurPlus LIGHT_SKY_BLUE = new EchantillonCouleurPlus("LightSkyBlue", 135, 206, 250);
	public static final EchantillonCouleurPlus LIGHT_SLATE_GRAY = new EchantillonCouleurPlus("LightSlateGray", 119, 136, 153);
	public static final EchantillonCouleurPlus LIGHT_STEEL_BLUE = new EchantillonCouleurPlus("LightSteelBlue", 176, 196, 222);
	public static final EchantillonCouleurPlus LIGHT_YELLOW = new EchantillonCouleurPlus("LightYellow", 255, 255, 224);
	public static final EchantillonCouleurPlus LIME = new EchantillonCouleurPlus("Lime", 0, 255, 0);
	public static final EchantillonCouleurPlus LIME_GREEN = new EchantillonCouleurPlus("LimeGreen", 50, 205, 50);
	public static final EchantillonCouleurPlus LINEN = new EchantillonCouleurPlus("Linen", 250, 240, 230);
	public static final EchantillonCouleurPlus MAGENTA = new EchantillonCouleurPlus("Magenta", 255, 0, 255);
	public static final EchantillonCouleurPlus MAROON = new EchantillonCouleurPlus("Maroon", 128, 0, 0);
	public static final EchantillonCouleurPlus MEDIUM_AQUA_MARINE = new EchantillonCouleurPlus("MediumAquaMarine", 102, 205, 170);
	public static final EchantillonCouleurPlus MEDIUM_BLUE = new EchantillonCouleurPlus("MediumBlue", 0, 0, 205);
	public static final EchantillonCouleurPlus MEDIUM_ORCHID = new EchantillonCouleurPlus("MediumOrchid", 186, 85, 211);
	public static final EchantillonCouleurPlus MEDIUM_PURPLE = new EchantillonCouleurPlus("MediumPurple", 147, 112, 216);
	public static final EchantillonCouleurPlus MEDIUM_SEA_GREEN = new EchantillonCouleurPlus("MediumSeaGreen", 60, 179, 113);
	public static final EchantillonCouleurPlus MEDIUM_SLATE_BLUE = new EchantillonCouleurPlus("MediumSlateBlue", 123, 104, 238);
	public static final EchantillonCouleurPlus MEDIUM_SPRING_GREEN = new EchantillonCouleurPlus("MediumSpringGreen", 0, 250, 154);
	public static final EchantillonCouleurPlus MEDIUM_TURQUOISE = new EchantillonCouleurPlus("MediumTurquoise", 72, 209, 204);
	public static final EchantillonCouleurPlus MEDIUM_VIOLET_RED = new EchantillonCouleurPlus("MediumVioletRed", 199, 21, 133);
	public static final EchantillonCouleurPlus MIDNIGHT_BLUE = new EchantillonCouleurPlus("MidnightBlue", 25, 25, 112);
	public static final EchantillonCouleurPlus MINT_CREAM = new EchantillonCouleurPlus("MintCream", 245, 255, 250);
	public static final EchantillonCouleurPlus MISTY_ROSE = new EchantillonCouleurPlus("MistyRose", 255, 228, 225);
	public static final EchantillonCouleurPlus MOCCASIN = new EchantillonCouleurPlus("Moccasin", 255, 228, 181);
	public static final EchantillonCouleurPlus NAVAJO_WHITE = new EchantillonCouleurPlus("NavajoWhite", 255, 222, 173);
	public static final EchantillonCouleurPlus NAVY = new EchantillonCouleurPlus("Navy", 0, 0, 128);
	public static final EchantillonCouleurPlus OLD_LACE = new EchantillonCouleurPlus("OldLace", 253, 245, 230);
	public static final EchantillonCouleurPlus OLIVE = new EchantillonCouleurPlus("Olive", 128, 128, 0);
	public static final EchantillonCouleurPlus OLIVE_DRAB = new EchantillonCouleurPlus("OliveDrab", 107, 142, 35);
	public static final EchantillonCouleurPlus ORANGE = new EchantillonCouleurPlus("Orange", 255, 165, 0);
	public static final EchantillonCouleurPlus ORANGE_RED = new EchantillonCouleurPlus("OrangeRed", 255, 69, 0);
	public static final EchantillonCouleurPlus ORCHID = new EchantillonCouleurPlus("Orchid", 218, 112, 214);
	public static final EchantillonCouleurPlus PALE_GOLDEN_ROD = new EchantillonCouleurPlus("PaleGoldenRod", 238, 232, 170);
	public static final EchantillonCouleurPlus PALE_GREEN = new EchantillonCouleurPlus("PaleGreen", 152, 251, 152);
	public static final EchantillonCouleurPlus PALE_TURQUOISE = new EchantillonCouleurPlus("PaleTurquoise", 175, 238, 238);
	public static final EchantillonCouleurPlus PALE_VIOLET_RED = new EchantillonCouleurPlus("PaleVioletRed", 216, 112, 147);
	public static final EchantillonCouleurPlus PAPAYA_WHIP = new EchantillonCouleurPlus("PapayaWhip", 255, 239, 213);
	public static final EchantillonCouleurPlus PEACH_PUFF = new EchantillonCouleurPlus("PeachPuff", 255, 218, 185);
	public static final EchantillonCouleurPlus PERU = new EchantillonCouleurPlus("Peru", 205, 133, 63);
	public static final EchantillonCouleurPlus PINK = new EchantillonCouleurPlus("Pink", 255, 192, 203);
	public static final EchantillonCouleurPlus PLUM = new EchantillonCouleurPlus("Plum", 221, 160, 221);
	public static final EchantillonCouleurPlus POWDER_BLUE = new EchantillonCouleurPlus("PowderBlue", 176, 224, 230);
	public static final EchantillonCouleurPlus PURPLE = new EchantillonCouleurPlus("Purple", 128, 0, 128);
	public static final EchantillonCouleurPlus RED = new EchantillonCouleurPlus("Red", 255, 0, 0);
	public static final EchantillonCouleurPlus ROSY_BROWN = new EchantillonCouleurPlus("RosyBrown", 188, 143, 143);
	public static final EchantillonCouleurPlus ROYAL_BLUE = new EchantillonCouleurPlus("RoyalBlue", 65, 105, 225);
	public static final EchantillonCouleurPlus SADDLE_BROWN = new EchantillonCouleurPlus("SaddleBrown", 139, 69, 19);
	public static final EchantillonCouleurPlus SALMON = new EchantillonCouleurPlus("Salmon", 250, 128, 114);
	public static final EchantillonCouleurPlus SANDY_BROWN = new EchantillonCouleurPlus("SandyBrown", 244, 164, 96);
	public static final EchantillonCouleurPlus SEA_GREEN = new EchantillonCouleurPlus("SeaGreen", 46, 139, 87);
	public static final EchantillonCouleurPlus SEA_SHELL = new EchantillonCouleurPlus("SeaShell", 255, 245, 238);
	public static final EchantillonCouleurPlus SIENNA = new EchantillonCouleurPlus("Sienna", 160, 82, 45);
	public static final EchantillonCouleurPlus SILVER = new EchantillonCouleurPlus("Silver", 192, 192, 192);
	public static final EchantillonCouleurPlus SKY_BLUE = new EchantillonCouleurPlus("SkyBlue", 135, 206, 235);
	public static final EchantillonCouleurPlus SLATE_BLUE = new EchantillonCouleurPlus("SlateBlue", 106, 90, 205);
	public static final EchantillonCouleurPlus SLATE_GRAY = new EchantillonCouleurPlus("SlateGray", 112, 128, 144);
	public static final EchantillonCouleurPlus SNOW = new EchantillonCouleurPlus("Snow", 255, 250, 250);
	public static final EchantillonCouleurPlus SPRING_GREEN = new EchantillonCouleurPlus("SpringGreen", 0, 255, 127);
	public static final EchantillonCouleurPlus STEEL_BLUE = new EchantillonCouleurPlus("SteelBlue", 70, 130, 180);
	public static final EchantillonCouleurPlus TAN = new EchantillonCouleurPlus("Tan", 210, 180, 140);
	public static final EchantillonCouleurPlus TEAL = new EchantillonCouleurPlus("Teal", 0, 128, 128);
	public static final EchantillonCouleurPlus THISTLE = new EchantillonCouleurPlus("Thistle", 216, 191, 216);
	public static final EchantillonCouleurPlus TOMATO = new EchantillonCouleurPlus("Tomato", 255, 99, 71);
	public static final EchantillonCouleurPlus TURQUOISE = new EchantillonCouleurPlus("Turquoise", 64, 224, 208);
	public static final EchantillonCouleurPlus VIOLET = new EchantillonCouleurPlus("Violet", 238, 130, 238);
	public static final EchantillonCouleurPlus WHEAT = new EchantillonCouleurPlus("Wheat", 245, 222, 179);
	public static final EchantillonCouleurPlus WHITE = new EchantillonCouleurPlus("White", 255, 255, 255);
	public static final EchantillonCouleurPlus WHITE_SMOKE = new EchantillonCouleurPlus("WhiteSmoke", 245, 245, 245);
	public static final EchantillonCouleurPlus YELLOW = new EchantillonCouleurPlus("Yellow", 255, 255, 0);
	public static final EchantillonCouleurPlus YELLOW_GREEN = new EchantillonCouleurPlus("YellowGreen", 154, 205, 50);

	/**
	 * 
	 */
	public EchantillonCouleurPlus(String colorCode, int red, int blue, int green) {
		super(red, blue, green);
		listeCouleurs.add(this);
		setName(colorCode);
	}

	/**
	 * @return the listeCouleurs
	 */
	public static List<EchantillonCouleurPlus> getListeCouleurs() {
		return listeCouleurs;
	}

	/**
	 * @param listeCouleurs the listeCouleurs to set
	 */
	public static void setListeCouleurs(List<EchantillonCouleurPlus> listeCouleurs) {
		EchantillonCouleurPlus.listeCouleurs = listeCouleurs;
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
	
		for(EchantillonCouleurPlus c : listeCouleurs){
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
