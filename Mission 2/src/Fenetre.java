import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre implements ActionListener 
{
	JFrame fenetre;      
	JPanel panel;
	JButton btValider;
	JButton btAnnuler;
	JLabel labelNom;
	JLabel labelPrenom;
	JLabel labelNote;
	JTextField txtNom;
	JTextField txtPrenom ;
	JTextField txtNote;
	
	Bulletin bull1;
	IBulletin ibull1;
	
 
	
	public Fenetre()
	{
		//Ouvre une fen�tre JAVA
		this.fenetre = new JFrame("Merci de remplir");
		//D�finit sa taille : 400 pixels de large et 100 pixels de haut
		this.fenetre.setSize(400, 300);
		//Nous demandons maintenant � notre objet de se positionner au centre
		this.fenetre.setLocationRelativeTo(null);
		//Termine le processus lorsqu'on clique sur la croix rouge
		this.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		 this.panel = new JPanel();
		 //d�finit un Layout en grille avec 4 lignes et 2 colonnes
		 this.panel.setLayout(new GridLayout(4,2));
		 this.btValider = new JButton("Valider");
		 this.btAnnuler = new JButton("Annuler");
		 this.btValider.addActionListener(this);
		 this.btAnnuler.addActionListener(this);
		 this.labelNom = new JLabel("Nom :");
		 this.labelPrenom = new JLabel("Prenom :");
		 this.labelNote = new JLabel("Note :");
		 this.txtNom = new JTextField();
		 this.txtNom.setPreferredSize(new Dimension(100, 24));
		 this.txtPrenom = new JTextField();
		 this.txtPrenom.setPreferredSize(new Dimension(100, 24));
		 this.txtNote = new JTextField();
		 this.txtNote.setPreferredSize(new Dimension(100, 24));
		 
		 this.panel.add(labelNom);
		 this.panel.add(txtNom);
		 this.panel.add(labelPrenom);
		 this.panel.add(txtPrenom);
		 this.panel.add(labelNote);
		 this.panel.add(txtNote);
		 this.panel.add(btAnnuler);
		 this.panel.add(btValider);
		 

		 this.fenetre.add(panel);		
		 this.fenetre.pack();
		 this.fenetre.setVisible(true);
		 
		 this.bull1 =  new Bulletin();
		 this.ibull1 = new IBulletin();
		 
	}
	
	public  void actionPerformed (ActionEvent e)
	{
		if (e.getSource().equals(btValider)) 
		{
			this.bull1.setNom(this.txtNom.getText());
			this.bull1.setNote(new Integer (this.txtNote.getText()));
			this.bull1.setPrenom(this.txtPrenom.getText());
			this.ibull1.addBulletin(bull1);
			
			System.out.println(this.ibull1.toString());
			
		}
		else
		{
			this.txtNom.setText("");
			this.txtPrenom.setText("");
			this.txtNote.setText("");
		}
	}
}
