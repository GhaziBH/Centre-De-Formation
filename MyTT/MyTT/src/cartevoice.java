
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
public class cartevoice {
    public int idcartevoice;
    public String nomcartevoice;
    public String typecartevoice;
    public int idvoiceNE;
    public Date datecartevoice;
    public int slot;
    public int tiddebut;
    public int tidfin;

    public cartevoice(int idcartevoice, String nomcartevoice, String typecartevoice, int idvoiceNE, Date datecartevoice, int slot, int tiddebut, int tidfin) {
        this.idcartevoice = idcartevoice;
        this.nomcartevoice = nomcartevoice;
        this.typecartevoice = typecartevoice;
        this.idvoiceNE = idvoiceNE;
        this.datecartevoice = datecartevoice;
        this.slot = slot;
        this.tiddebut = tiddebut;
        this.tidfin = tidfin;
    }

    String getRequestInsert(cartevoice carte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
    
}
