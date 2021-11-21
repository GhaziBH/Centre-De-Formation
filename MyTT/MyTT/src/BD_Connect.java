
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Fatma_boulabed
 */
public class BD_Connect {

    /**
     *
     * @param slot
     */
    public 
 
   
   public void InsertIntoTable(Slot slot){
       System.out.println("slot =  "+slot);
       try{
           String sql =slot.getRequestInsert(slot) ;
           Class.forName("com.mysql.jdbc.Driver");
            System.out.println("class for name    okokokok");
            Connection con1 = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_des_equipements_voix","root","");
            System.out.println("connection retablie");
             java.sql.PreparedStatement pst = (java.sql.PreparedStatement) con1.prepareStatement(sql);
                pst.execute();
            System.out.println("sql ok    okokokok      sql  =    "+ sql);
             JOptionPane.showMessageDialog(null,"saved");
            
        }
        catch (HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }     
       }
   public void Connect(String url,String login,String pwd) throws SQLException {
       try {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("class for name    okokokok");
           Connection con1 = (Connection) java.sql.DriverManager.getConnection(url,login,pwd);
           System.out.println("connection retablie");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(BD_Connect.class.getName()).log(Level.SEVERE, null, ex);
       }
   } 
       
       
      
   }
   

   
    

