import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ghazi
 */
public class consulter {
     public String idslots;
     public String Nomdeslots ;
     public String Type ;
    public int idmsan ;
    public int Numslots ;
    public Date date;
public consulter (){
    this.idslots = null;
        this.idmsan = 0;
        this.idslots = null;
        this.date =null;
        this.Nomdeslots = null;
    
    
}
