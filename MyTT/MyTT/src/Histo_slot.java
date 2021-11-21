
import java.util.Date;
import org.w3c.dom.Text;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fatma_boulabed
 */
public class Histo_slot {
    public String histoslot;
    public int idcarte;
    public int idslot;
    public Date date;
    public Text observation;
public Histo_slot(){
    this.histoslot = null;
        this.idcarte = 0;
        this.idslot = 0;
        this.date =null;
        this.observation = null;
    
}


    public Histo_slot(String histoslot, int idcarte, int idslot, Date date, Text observation) {
        this.histoslot = histoslot;
        this.idcarte = idcarte;
        this.idslot = idslot;
        this.date = date;
        this.observation = observation;
    }

    String getRequestInsert(Histo_slot Histo) {
       String sql ="INSERT INTO `histo slot` (`histo slot`, `id carte`, `id slot`, `date`, `observation`) VALUES ('"+Histo.histoslot+"','"+Histo.idcarte+"','"+Histo.idslot+"','"+Histo.date+"','"+Histo.observation+"')";
       return sql;
       
    }
    
    
    
    
    
}
