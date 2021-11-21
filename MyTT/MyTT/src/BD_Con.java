
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fatma_boulabed
 */
public class BD_Con {
    static Connection cnx;
    static Statement st;
    static ResultSet rst;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
                                       //***    constructeur       ***//
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static Connection Connection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void Connection(String url,String login,String pwd){
         try {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("class for name    okokokok");
            Connection cnx = (Connection) java.sql.DriverManager.getConnection(url,login,pwd);
           System.out.println("connection retablie");
         }
            catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
         
    }
     public void connect(){
       try{
              cnx = Connection();
              st=(Statement) cnx.createStatement();
           }
         catch(Exception e){
             System.out.println(e.getMessage());
         } 
    }
       public void ExuteQuerry(String query){
        try {
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(BD_Con.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
         public int ExcuteQueryUpdate(String query) throws SQLException{
     int rs;
        try {
            cnx.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(BD_Con.class.getName()).log(Level.SEVERE, null, ex);
        }
       rs = st.executeUpdate(query);
    return rs;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                             ///***METHODE UNIQUE***///
         

         
          public void DeleteFromTable ( String Nom_table, String nom_colonne,int idToDelete){
              
        
               String sql = "DELETE FROM "+Nom_table+" where "+nom_colonne+"="+idToDelete;
               this.connect();
               this.ExuteQuerry(sql);
     }   
          
          
          public void SelectFromTable ( String Nom_table, String nom_colonne,int idToSelect){
              
                String sql = "SELECT* FROM "+Nom_table+"where"+nom_colonne+"="+idToSelect;
               
                this.connect();
                this.ExuteQuerry(sql);
              java.sql.ResultSet  rst=st.executeQuery(sql);
                rst.last();
                int nbrRow=rst.getRow();
                if 
                  (nbrRow!=1){
                    System.out.println("bien trouvée");}
                else{
                    System.out.println("non trouvée");
                    
                }
          }
          public void ModifierTable  (String Nom_table, String nom_colonne,int idModifier,Slots slot){
               
              String sql ="UPDATE table SET table ='"+Nom_table+"',colonne='"+nom_colonne+"',Select='"+idModifier+"';";
              
              this.connect();
              this.ExuteQuerry(sql);
              System.out.println("bien modifier ");
            
       
               
             
       
                                                           
             
                
                

              
              
              
              
          }
          
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
                                       //***    CLASS SLOT       ***//
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

         
                                      //*** METHODE INSERT INTO***//

         
     public  void InsertIntoTable( Slot sl){
         
         
             String query=sl.getRequestInsert(sl);
             this.connect();
             this.ExuteQuerry(query);
             
                
     }


     

         
     
        
     
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
                                       //***    CLASS CARTE       ***//
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
                                       
                                       //***METHODE INSERT***//
   
    public  void InsertIntoTable( carte crte){
         
        
             String query=crte.getRequestInsert(crte);
                 this.connect();
                 this.ExuteQuerry(query);
        
    }
                     
                                      
    
    
     
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
                                      //***CLASSE VOICE NE     ***//

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    
                                     //***METHODE INSERT***///

    
    public void InserIntoTable (voiceNE voice){
        String query=voice.getRequestInsert(voice);
        
        this.connect();
        this.ExuteQuerry(query);
                
        
        
    }
    
                                       
    
    
    
     
     /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
                                      //***CLASSE TYPE CARTE    ***//

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
                                      //***METHODE INSERT***//
    
    public void InsertIntoTable (typecarte type){
        String query=type.getRequestInsert(type);
        this.connect();
        this.ExuteQuerry(query);
    
    }
    
                                      
    
    
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
                                      //***CLASSE PORT     ***//

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    public void InsertIntoTable (port por){
        String query=por.getRequestInsert(por);
        this.connect();
        this.ExuteQuerry(query);
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
                                      //***CLASSE HISTO NVPS   ***//

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    public void InsertIntoTable(histonvps histo){
        String query=histo.getRequestInsert(histo);
        this.connect();
        this.ExuteQuerry(query);
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
                                      //***CLASSE CARTE VOICE     ***//

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    public void InsertIntoTable(cartevoice carte){
        String query=carte.getRequestInsert(carte);
        this.connect();
        this.ExuteQuerry(query);
        
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
                                      //***CLASSE NVPS   ***//

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    public void InsertIntoTable(NVPSS NVPS ){
         String query=NVPS.getRequestInsert(NVPS);
         this.connect();
         this.ExuteQuerry(query);
        
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
                                      //***CLASSE HISTO_SLOT    ***//

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    public void InsertIntoTable( Histo_slot Histo){
        String query=Histo.getRequestInsert(Histo);
        this.connect();
        this.ExuteQuerry(query);
        
    }
    
    
     
  
    
 
    
  
        
    
}
