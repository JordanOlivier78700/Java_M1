package classes;
import java.sql.*;	                 // ResultSet Connection DriverManager SQLException Statement

public class Bulletin{

public static void main(String[] args) {
try{

Class.forName("com.mysql.jdbc.Driver");
System.out.println("Pilote chargé");

}catch(ClassNotFoundException e){

System.out.println("Pilote non trouvé. "+e.getMessage());
}

/*****************************************************/

String url="jdbc:mysql://localhost/exempleBDD"; //url de la base 
ResultSet res = null;

String requete = "select * from bulletin";     //à créer d’abord la table 
Connection cnx=null;

try{

cnx = DriverManager.getConnection(url,"root","");  //identifiant, mot de passe 
System.out.println("Connection établie avec succès.\n"); 
Statement stmt = cnx.createStatement();

res = stmt.executeQuery(requete);



System.out.println("Le resultat de la requete ["+requete+"] est :"); 
while(res.next()){

System.out.print(res.getString(2)+" ");

System.out.print(res.getString(3)+" ");

System.out.println(res.getString(4));
}

System.out.println("\n Affichage terminé.");

cnx.close(); //fermeture de la connexion

cnx = DriverManager.getConnection(url,"root","");  //identifiant, mot de passe 
System.out.println("Connection établie avec succès.\n"); 
Statement stmt2 = cnx.createStatement();

String requete2 = "INSERT INTO bulletin(nom,prenom,note) VALUES ('Marie','DUBOIS',13);"; 
stmt2.executeUpdate(requete2);
String requete3 = "INSERT INTO bulletin(nom,prenom,note) VALUES ('Jojo','BERNARD',14);"; 
stmt2.executeUpdate(requete3);
String requete4 = "INSERT INTO bulletin(nom,prenom,note) VALUES ('Yahya','SIDIBE',15);"; 
stmt2.executeUpdate(requete4);
String requete5 = "INSERT INTO bulletin(nom,prenom,note) VALUES ('Antoine','GRIEZMANN',12);"; 
stmt2.executeUpdate(requete5);
String requete6 = "INSERT INTO bulletin(nom,prenom,note) VALUES ('Olivier','JUJU',9);"; 
stmt2.executeUpdate(requete6);
cnx.close();
System.out.println("\n Ajout des personnes terminé.");

cnx = DriverManager.getConnection(url,"root","");  //identifiant, mot de passe 
System.out.println("Connection établie avec succès.\n"); 
stmt = cnx.createStatement();

res = stmt.executeQuery(requete);



System.out.println("Le resultat de la requete ["+requete+"] après inserts est :"); 
while(res.next()){

System.out.print(res.getString(2)+" ");

System.out.print(res.getString(3)+" ");

System.out.println(res.getString(4));
}



cnx.close(); //fermeture de la connexion



cnx = DriverManager.getConnection(url,"root","");  //identifiant, mot de passe 
System.out.println("Connection établie avec succès.\n"); 

String sql = "SELECT * FROM bulletin WHERE note < ?";
PreparedStatement pstmt = cnx.prepareStatement(sql);
pstmt.setInt(1,10);

ResultSet res2 = pstmt.executeQuery();
while(res2.next()){

System.out.print(res2.getString(2)+" ");

System.out.print(res2.getString(3)+" ");

System.out.println(res2.getString(4));
}

System.out.println("\n Affichage terminé.");


}
catch(SQLException e){

         System.out.println("Erreur de connexion ou d'exécution de la requête"+   
         e.getMessage());
}
}
}
