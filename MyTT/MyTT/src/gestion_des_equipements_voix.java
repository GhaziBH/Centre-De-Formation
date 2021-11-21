
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Fatma_boulabed
 */
public class gestion_des_equipements_voix {
   
       public gestion_des_equipements_voix (){
       /*try{
            Class.forName("com.mysql.jdbc.Driver");
           try {
               Connection con = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_des_equipements_voix","root","");
           } catch (SQLException ex) {
               Logger.getLogger(gestion_des_equipements_voix.class.getName()).log(Level.SEVERE, null, ex);
           }

       }
       catch(ClassNotFoundException e){
           System.err.println("");
       }*/
       }
         void Connection_BD(String sql){
           try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("class for name     okkkkk");
           
            
            
           try {
               Connection con = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_des_equipements_voix","root","");
               System.out.println("                    connection base avec succès     okkkkk");
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                pst.execute();
            System.out.println("sql ok    okokokok      sql  =    "+ sql);
              
            //System.out.println("sql ok    okokokok      sql  =    "+ sql);
           } catch (SQLException ex) {
               Logger.getLogger(gestion_des_equipements_voix.class.getName()).log(Level.SEVERE, null, ex);
           }

       }
       catch(ClassNotFoundException e){
           System.err.println("");
       }
       }
         float somme( float p1, float p2){
return (p1 + p2);}
      //int ecrire(String tat){
      //int a=5;
         
     // return a;
  //}
             
         
    
}
   
            
            
    
 
    

