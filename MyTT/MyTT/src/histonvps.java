
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
public class histonvps {
    public int idhistonvps;
    public int idnvps;
    public int idvoiceNE;
    public Date datehistonvps;
    public String typehistonvps;
    public int nbrdeslot;
public histonvps(){
    this.idhistonvps = 0;
        this.idnvps = 0;
        this.idvoiceNE = 0;
        this.datehistonvps = null;
        this.typehistonvps = null;
        this.nbrdeslot = 0;
    
}

    public histonvps(int idhistonvps, int idnvps, int idvoiceNE, Date datehistonvps, String typehistonvps, int nbrdeslot) {
        this.idhistonvps = idhistonvps;
        this.idnvps = idnvps;
        this.idvoiceNE = idvoiceNE;
        this.datehistonvps = datehistonvps;
        this.typehistonvps = typehistonvps;
        this.nbrdeslot = nbrdeslot;
    }

    String getRequestInsert(histonvps histo) {
        
       String sql= "INSERT INTO `histo nvps` (`id histo nvps`, `id nvps`, `id voice NE`, `date histo nvps`, `type histo nvps`, `nbr de slot`) VALUES ('"+histo.idhistonvps+"','"+histo.idnvps+"','"+histo.idvoiceNE+"','"+histo.datehistonvps+"','"+histo.typehistonvps+"','"+histo.nbrdeslot+"')";
    return sql;
    }
    
    
}
