
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fatma_boulabed
 */
public class Slot {
    public int idslots  ;
    public String nomslot;
    public String typeslot;
    public int idmsan;
    public Date date;
    public int numeroslot;
  public Slot() {
        this.idslots = 0;
        this.nomslot = null;
        this.typeslot = null;
        this.idmsan = 0;
        this.date = null;
        this.numeroslot =0;
    }
    
    
    public Slot(int idslots, String nomslot, String typeslot, int idmsan, Date date, int numeroslot) {
        this.idslots = idslots;
        this.nomslot = nomslot;
        this.typeslot = typeslot;
        this.idmsan = idmsan;
        this.date = date;
        this.numeroslot = numeroslot;
    }
public String getRequestInsert(Slot sl){
    String sql="INSERT INTO `slots` ( `id slots`, `nom slot`, `type slot`, `id msan`, `date`, `numero slot`) VALUES ('"+sl.idslots+"', '"+sl.nomslot+"', '"+sl.typeslot+"', '"+sl.idmsan+"', '"+sl.date+"', '"+sl.numeroslot+"');";
return sql;
}


    

    
}

    
    
   
