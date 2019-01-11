package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import metier.Bulletin;

public class BulletinDao 
{

	String user = "root", pass = "", strUrl = "jdbc:mysql://localhost:3306/project_breizhlink";
	Connection conn= null;
	Statement stat= null;
	String sql_ajout = "insert into bulletin VALUES (?,?,?,?) ";
	String sql_affichage = "select nom from bulletin where nom = ?";

	public void addBulletin(Bulletin bull)
	{
		// inser bull dans la table
		try 
		{
			// chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// récupération de la connection
			conn = DriverManager.getConnection(strUrl,user,pass);
			// création dun statement
			stat = conn.createStatement();
			
			//preparation de la requete
			PreparedStatement pst = conn.prepareStatement(sql_ajout);
			pst.setInt(1,0);
			pst.setString(2, bull.getNom());
			pst.setString(3, bull.getPrenom());
			pst.setInt(4, bull.getNote());
			pst.execute();

		}
		catch (ClassNotFoundException e) {e.printStackTrace();} 
		catch (SQLException e) {e.printStackTrace();}
	}
	
	public ArrayList<String> bulletingParMC(String nomClef)
	{
		ArrayList<String> listEtudiant = new ArrayList<>();
		try 
		{
			// chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// récupération de la connection
			conn = DriverManager.getConnection(strUrl,user,pass);
			// création dun statement
			stat = conn.createStatement();
			
			PreparedStatement pst2 = conn.prepareStatement(sql_affichage);
			pst2.setString(1, nomClef);
			ResultSet rs = pst2.executeQuery();
			while (rs.next())//parcour le résultat
			{
				listEtudiant.add(rs.getString(rs.getRow()));
			}
			return listEtudiant;
		}
		catch (ClassNotFoundException e) {e.printStackTrace();return listEtudiant;} 
		catch (SQLException e) {e.printStackTrace();return listEtudiant;}
		
	}
	
}
