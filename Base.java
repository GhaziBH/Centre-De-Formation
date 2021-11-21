
package centreform;
 import java.net.ConnectException;
import java.sql.*;
import javax.swing.JOptionPane;
 

public class Base {
 static String username = "root";
static String password = "";
  static  String url = "jdbc:mysql://localhost/centreFormation";


  public static void Ajouter(String Ref ,String Nom , String DateD,String DateS  , String Ens , String NbH) {
     
            
            try{
            Connection con =DriverManager.getConnection(url, username, password);
            Statement st ;
            
            String req = "INSERT INTO formations VALUES (?,?,?,?,?,?);";
            PreparedStatement stat = con.prepareStatement(req);
            stat.setString(1, Ref);
            stat.setString(2, Nom);
            stat.setString(3, DateD);
            stat.setString(4, DateS);
            stat.setString(5, Ens);
            stat.setString(6, NbH);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"AJOUTEE AVEC SUCCES");
            }
            catch(Exception E)
             {
             System.out.println("Erreur");
              }
  }
  
public static void Supprimer(String Ref)
    {
      
            try{
            Connection con =DriverManager.getConnection(url, username, password);
            Statement st ;
            
            String req = "DELETE FROM formations WHERE Ref=? ;";
            PreparedStatement stat = con.prepareStatement(req);
            stat.setString(1, Ref);
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"SUPPRESSION AVEC SUCCES");
            }
            catch(Exception e)
             {
             System.out.println("Erreur");
              }
     
 
    }
 public static void Modifier(String Ref ,String Nom , String DateD,String DateS  , String Ens , String NbH , String  SelectedRef) {
     
            
            try{
            Connection con =DriverManager.getConnection(url, username, password);
            Statement st ;
            
            String req = "UPDATE formations SET Ref = ? , nomFormation = ? , dateDebut = ? , dateFin = ? , Ens = ? , nombreHeure = ? WHERE Ref = ? ;";
            PreparedStatement stat = con.prepareStatement(req);
            stat.setString(1, Ref);
            stat.setString(2, Nom);
            stat.setString(3, DateD);
            stat.setString(4, DateS);
            stat.setString(5, Ens);
            stat.setString(6, NbH);
            stat.setString (7 , SelectedRef);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"MODIFIEE AVEC SUCCES");
            }
            catch(Exception E)
             {
             System.out.println("Erreur");
         
}}

    static void Modifier(String text, String text0, String format, String format0, String text1, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

    

