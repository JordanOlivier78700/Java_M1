import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.SpringLayout.Constraints;
 
public class Run 
{
	public static void main(String[] args)
	{
		//Ouvre une fen�tre JAVA
		JFrame fenetre = new JFrame();    
		//D�finit un titre pour notre fen�tre
		fenetre.setTitle("Merci de Remplir");
		//D�finit sa taille : 400 pixels de large et 100 pixels de haut
		fenetre.setSize(400, 300);
		//Nous demandons maintenant � notre objet de se positionner au centre
		fenetre.setLocationRelativeTo(null);
		//Termine le processus lorsqu'on clique sur la croix rouge
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Et enfin, la rendre visible        

		
		JPanel panel = new JPanel();
		//d�finit un Layout en grille avec 4 lignes et 2 colonnes
		panel.setLayout(new GridLayout(4,2));
		
		JButton btValider = new JButton("Valider");
		JButton btAnnuler = new JButton("Annuler");
		JLabel labelNom = new JLabel("Nom :");
		JLabel labelPrenom = new JLabel("Prenom :");
		JLabel labelNote = new JLabel("Note :");
		JTextField txtNom = new JTextField();
		txtNom.setPreferredSize(new Dimension(100, 24));
		JTextField txtPrenom = new JTextField();
		txtPrenom.setPreferredSize(new Dimension(100, 24));
		JTextField txtNote = new JTextField();
		txtNote.setPreferredSize(new Dimension(100, 24));
	    
		
		panel.add(labelNom);
		panel.add(txtNom);
		panel.add(labelPrenom);
		panel.add(txtPrenom);
		panel.add(labelNote);
		panel.add(txtNote);
		panel.add(btAnnuler);
		panel.add(btValider);
		
		fenetre.add(panel);		
		fenetre.pack();
		fenetre.setVisible(true);
	}       
}