package fr.emac.gipsi.gsi.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import fr.emac.gipsi.gsi.couleurs.EchantillonCouleur;
import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.screen.VisualRectangle;

public class InterfaceAnimation extends JFrame {

	private JPanel contentPane;
	public JPanel Ecran;
	private Screen ecran=new Screen();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceAnimation frame = new InterfaceAnimation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceAnimation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Ecran = new JPanel();
		Ecran.setName("ecran");
		Ecran.setLayout(null);
//		InitEcran();
		Ecran.addPropertyChangeListener(new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent arg0) {
				
				
			}
		});
		contentPane.add(Ecran);
		
	}
	
	private void InitEcran() {
		//valeur par d�faut 9*9
	ecran.setColMax(ecran.getColMax());
	ecran.setLigMax(ecran.getLigMax());
		for(int lig=0;lig<ecran.getLigMax();lig++){
			for(int col=0;col<ecran.getColMax();col++){
				updatePanel(lig,col,"AQUA");
			}
		}
		
	}
	
	private void updatePanelByPixel(int lig, int col, VisualRectangle colorByXY) {
		// TODO Auto-generated method stub
		for(VisualRectangle vr : ecran.getRectangles()){
			if(vr.equals(colorByXY)){
				vr.setNomCouleur(colorByXY.getNomCouleur());
			}
		}
	}

	private void updatePanel(int lig, int col,String nomCouleur) {
		
		int total=lig*ecran.getColMax()+col;
//		System.out.println("ecran.getRectangles().size() ="+ecran.getRectangles().size()+"  lig*ecran.getColMax()+col="+total+" lig="+lig+" ecran.colmax="+ecran.getColMax()+" col="+col);

		if(ecran.getRectangles().size()>total){
			ecran.updateColorByXY(lig,col,new VisualRectangle(lig,col,nomCouleur));
		}else{
			creationEcran(nomCouleur);
		}
		
	}
	
	private void creationEcran(String nomCouleur) {
		
		for(int lig=0;lig<ecran.getLigMax()+1;lig++){
			for(int col=0;col<ecran.getColMax()+1;col++){
				ecran.getRectangles().add(new VisualRectangle(lig,col,nomCouleur));
				Ecran.add(creation1CaseCouleur(lig,col,nomCouleur));
			}
		}
	}
	
	private JPanel creation1CaseCouleur(int lig, int col,String nomCouleur) {
		
		int h=(400-ecran.getLigMax())/(ecran.getLigMax()+1);
		int w=(400-ecran.getColMax())/(ecran.getColMax()+1);
		
		JPanel p = new JPanel();
		p.setName(lig+"_"+col);
		p.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		p.setBounds(col*w, lig*h, w, h);
	
//		((FlowLayout)p.getLayout()).setVgap(vgap/2);
//		((FlowLayout)p.getLayout()).setHgap(hgap/2);
		p.setBackground(EchantillonCouleur.getColorByName(nomCouleur));
		
		
		p.addPropertyChangeListener(new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				((JPanel)evt.getSource()).revalidate();
				((JPanel)evt.getSource()).repaint();
//				System.out.println("ici2 :" + ((JPanel)evt.getSource()).getName() + " "+((JPanel)evt.getSource()).getBackground());
			}
		});
		
		return p;
	}
	
	public void changeEcran(Screen ec) {
//		System.out.println("taille = " + ecran.getRectangles().size() );
		
//		Ecran.removeAll();
//		Ecran = new JPanel();
//		Ecran.setName("ecran");
//		Ecran.setBounds(5, 5, 494, 450);
//		Ecran.setLayout(null);
		
	//	ecran.getRectangles()//.clear();
//		ecran.setColMax(ec.getColMax());
//		ecran.setLigMax(ec.getLigMax());
//			for(int lig=0;lig<ecran.getLigMax()+1;lig++){
//				for(int col=0;col<ecran.getColMax()+1;col++){
//					updatePanel(lig,col,ec.getColorByXY(lig, col).getNomCouleur());
		
		
		ecran.setColMax(ec.getColMax());
		ecran.setLigMax(ec.getLigMax());
//		ecran.setRectangles(new ArrayList<VisualRectangle>());
//		for(Component p :Ecran.getComponents()){
//			Ecran.remove(p);
//		}
		
		if(ecran.getRectangles().size()==0){
			creationEcran("AQUA");
		}
		
			for(int lig=0;lig<ec.getLigMax();lig++){
				for(int col=0;col<ec.getColMax();col++){
//					updatePanel(lig,col,ec.getColorByXY(lig, col).getNomCouleur());
					updatePanelByPixel(lig,col,ec.getColorByXY(lig, col));
					
				}
			}
		
		
					for(Component p :Ecran.getComponents()){
						if(p instanceof JPanel){
							String[] coord = p.getName().split("_");
							((JPanel)p).setBackground(EchantillonCouleur.getColorByName(ec.getColorByXY(Integer.parseInt(coord[0]),Integer.parseInt(coord[1])).getNomCouleur()));
						}
					}
//				}
//			}
		
		
	}
//
//	public void refresh(Ecran ec) {
//		//this.setVisible(false);
//		changeEcran(ec);
//		//this.setVisible(true);
//		for( Component p : this.rootPane.getComponents()){
//			if( p instanceof JPanel){
//				if(!(p.getName()==null)){
//				if (p.getName().equals("ecran")){
//					p.validate();
//					p.repaint();
//				}
//			}
//		}
//	}
//		this.rootPane.add(Ecran);
//	}
	
	
	

	public void addListener(){

	}
}
