
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
public class port {
    
    public int idport;
    public int tid;
    public int reference;
    public int idcarte;
    public Date dateport;
    public int nbrport;

    public port(int idport, int tid, int reference, int idcarte, Date dateport, int nbrport) {
        this.idport = idport;
        this.tid = tid;
        this.reference = reference;
        this.idcarte = idcarte;
        this.dateport = dateport;
        this.nbrport = nbrport;
    }

    String getRequestInsert(port por) {
        String sql ="INSERT INTO `port` (`id port`, `t id`, `reference`, `id carte`, ` date port`, `nbr port`) VALUES ('"+por.idport+"','"+por.tid+"','"+por.reference+"','"+por.idcarte+"','"+por.dateport+"','"+por.nbrport+"')";
        return sql;
        
    }
    
    
    
}
