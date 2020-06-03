package fr.emac.gipsi.gsi.gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import fr.emac.gipsi.gsi.couleurs.EchantillonCouleur;
import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.screen.VisualRectangle;
import fr.emac.gipsi.gsi.voyage.AbstractVoyage;

public class InterfaceSimulation extends JFrame {

	private JPanel contentPane;
	public JPanel Ecran;
	private AbstractVoyage voyage;
	private Screen ecran=new Screen();
	private JTextField txtNbPhoto;
	private JTextField txtNbRoche;
	private JTextField txtNbSol;
	private JTextField txtPower;
	private JPanel panel_1;

	/**
	 * Create the frame.
	 */
	public InterfaceSimulation(AbstractVoyage p) {
		this.voyage = p;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		Ecran = new JPanel();
		Ecran.setName("ecran");
		Ecran.setLayout(null);
		contentPane.add(Ecran);

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(10);
		contentPane.add(panel, BorderLayout.SOUTH);

		JLabel labelPhot = new JLabel("Nombre de photographie");
		
		panel.add(labelPhot);
		
		txtNbPhoto = new JTextField();
		txtNbPhoto.setText("NbPhoto");
		panel.add(txtNbPhoto);
		txtNbPhoto.setColumns(10);
		
		JLabel labelRoche = new JLabel("Nombre de Roche");
		panel.add(labelRoche);
		txtNbRoche = new JTextField();
		txtNbRoche.setText("NbRoche");
		panel.add(txtNbRoche);
		txtNbRoche.setColumns(10);

		JLabel labelSol = new JLabel("Nombre de Sol");
		panel.add(labelSol);
		txtNbSol = new JTextField();
		txtNbSol.setText("txtNbSol");
		panel.add(txtNbSol);
		txtNbSol.setColumns(10);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel labelEnergy = new JLabel("Energy");
		panel_1.add(labelEnergy);
		txtPower = new JTextField();
		txtPower.setText("Power");
		panel_1.add(txtPower);
		txtPower.setColumns(10);
		
//		
//		txtRange = new JTextField();
//		txtRange.setText("Range");
//		panel_1.add(txtRange);
//		txtRange.setColumns(10);
//		
//		txtType = new JTextField();
//		txtType.setText("Type");
//		panel_1.add(txtType);
//		txtType.setColumns(10);
//		
//		txtCost = new JTextField();
//		txtCost.setText("Cost");
//		panel_1.add(txtCost);
//		txtCost.setColumns(10);
		
//		JButton btnUpgrade = new JButton("upgrade");
//		btnUpgrade.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
//		panel_1.add(btnUpgrade);

//		 ButtonGroup group = new ButtonGroup();
//		for( TypeTower at : TypeTower.values()){
//			JRadioButton rdbtnTowertype = new JRadioButton(at.getName());
//			rdbtnTowertype.addChangeListener(new ChangeListener() {
//
//				@Override
//				public void stateChanged(ChangeEvent e) {
//					if(e.getSource() instanceof JRadioButton){
//						JRadioButton radioButton = (JRadioButton) e.getSource();
//						if(radioButton.isSelected()){
//							typeEnCours=radioButton.getText();
//						}
//					}
//				}
//			});
//			group.add(rdbtnTowertype);
//			panel.add(rdbtnTowertype);
//		}

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

	private JPanel creation1CaseCouleur(final int lig, final int col,String nomCouleur) {

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
//		p.addMouseListener(new MouseListener() {
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				System.out.println("event click");
//				if(e.getSource() instanceof JPanel){
//					System.out.println("event click 2");
//					if(((JPanel)e.getSource()).getBackground().equals(EchantillonCouleur.getColorByName("Tan"))){
//						System.out.println("event click 3");
//						//on créer une nouvelle tower
//						pp.addTower(typeEnCours,lig,col);
//						
//					}else if(((JPanel)e.getSource()).getBackground().equals(EchantillonCouleur.getColorByName("White"))){
//						//on est sur le chemin donc rien
//						System.out.println("event click 4");
//					}else if(((JPanel)e.getSource()).getBackground().equals(EchantillonCouleur.getColorByName("Aqua"))){
//						//on est sur le chemin donc rien
//						System.out.println("event click 4");
//					}else{
//						System.out.println("event click 5");
//						//on doit upgrade tower
//						AbstractTower at=pp.getInfoTower(lig,col);
//						
//						if(at!=null){
//							pp.setTowerEnCours(at);
//							txtCost.setText(Integer.toString(at.getCostUpgrade()));
//							txtPower.setText(Integer.toString(at.getPower()));
//							txtRange.setText(Integer.toString(at.getRange()));
//							txtType.setText(at.getType());
//						}
//					}
//				}
//				
//			}
//
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});

		return p;
	}

	private void updatePanelByPixel(int lig, int col, VisualRectangle colorByXY) {
		// TODO Auto-generated method stub
		for(VisualRectangle vr : ecran.getRectangles()){
			if(vr.equals(colorByXY)){
				vr.setNomCouleur(colorByXY.getNomCouleur());
			}
		}
	}
	
	public void changeEcran(Screen ec) {

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

		this.txtNbPhoto.setText(Integer.toString(voyage.getSimulatedvoyageur().getListPhotographie().size()));
		this.txtNbRoche.setText(Integer.toString(voyage.getSimulatedvoyageur().getListEchantillonRoche().size()));
		this.txtNbSol.setText(Integer.toString(voyage.getSimulatedvoyageur().getListEchantillonSol().size()));
		this.txtPower.setText(Integer.toString(voyage.getSimulatedvoyageur().getEnergy()));
		
		ecran.setColMax(voyage.getEcran().getColMax());
		ecran.setLigMax(voyage.getEcran().getLigMax());
	//	ecran.setRectangles(new ArrayList<VisualRectangle>());
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
				((JPanel)p).setBackground(EchantillonCouleur.getColorByName(voyage.getEcran().getColorByXY(Integer.parseInt(coord[0]),Integer.parseInt(coord[1])).getNomCouleur()));
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
