package fr.emac.gipsi.gsi.gui.couleurs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SelectColor extends JFrame {

	private JPanel contentPane;
	private JTextField txtCouleurchoisi;
	
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectColor frame = new SelectColor();
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
	public SelectColor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		creationCaseCouleur();
		
		
		
		JPanel action = new JPanel();
		contentPane.add(action, BorderLayout.SOUTH);
		
		txtCouleurchoisi = new JTextField();
		action.add(txtCouleurchoisi);
		txtCouleurchoisi.setColumns(10);
		
		JButton btnOk = new JButton("ok");
		action.add(btnOk);
	}

private void creationCaseCouleur(){
		
		for(int i = 0 ;i<EchantillonCouleur.getListeCouleurs().size();i++){
			panel.add(creation1CaseCouleur(i));
		}
		
	}
	
	private JPanel creation1CaseCouleur(int indice){
		
		JPanel p = new JPanel();
		p.setName(EchantillonCouleur.getListeCouleurs().get(indice).getName());
		((FlowLayout)p.getLayout()).setVgap(10);
		((FlowLayout)p.getLayout()).setHgap(10);
		p.setBackground(EchantillonCouleur.getListeCouleurs().get(indice));
		
		p.addMouseListener(new MouseAdapter() {
			

			@Override
			public void mouseClicked(MouseEvent arg0) {
				String NomCouleurClick=((JPanel)arg0.getSource()).getName();
				txtCouleurchoisi.setText(NomCouleurClick);
			}
		});
		
		return p;
		
	}
	
}
