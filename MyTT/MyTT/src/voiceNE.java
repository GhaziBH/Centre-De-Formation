
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
public class voiceNE {
    public int idvoiceNE;
    public String nomvoiceNE;
    public int nombrecarte;
    public int N_NE;
    public Date datevoice;
    public String typenvps;
    public int nbrslotsmax;

    public voiceNE(int idvoiceNE, String nomvoiceNE, int nombrecarte, int N_NE, Date datevoice, String typenvps, int nbrslotsmax) {
        this.idvoiceNE = idvoiceNE;
        this.nomvoiceNE = nomvoiceNE;
        this.nombrecarte = nombrecarte;
        this.N_NE = N_NE;
        this.datevoice = datevoice;
        this.typenvps = typenvps;
        this.nbrslotsmax = nbrslotsmax;
    }

    String getRequestInsert(voiceNE voice) {
        String sql="INSERT INTO `voice ne` (`id  voice NE`, ` nom voice NE`, `nombre carte`, `N_NE`, `date voice`, `type nvps`, `nbr slots max`) VALUES ('"+voice.idvoiceNE+"','"+voice.nomvoiceNE+"','"+voice.nombrecarte+"','"+voice.N_NE+"','"+voice.datevoice+"','"+voice.typenvps+"','"+voice.nbrslotsmax+"')";
        return sql;
    }
    
    
}
