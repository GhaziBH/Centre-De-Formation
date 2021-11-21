
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
public class carte {
    public int idcarte;
    public String nomdecarte;
    public int nbrport;
    public String description;
    public int idtype;
    public int nbrcarte;
    public int idnvps;
    public Date datedemisajour;
    public int slotsnvps;
    public int ipsignalization;
    public int ipgateway;
    public carte(){
        this.idcarte = 0;
        this.nomdecarte = null;
        this.nbrport = 0;
        this.description = null;
        this.idtype = 0;
        this.nbrcarte = 0;
        this.idnvps = 0;
        this.datedemisajour =null ;
        this.slotsnvps =0;
        this.ipsignalization =0 ;
        this.ipgateway =0 ;
    
}

    public carte(int idcarte, String nomdecarte, int nbrport, String description, int idtype, int nbrcarte, int idnvps, Date datedemisajour, int slotsnvps, int ipsignalization, int ipgateway) {
        this.idcarte = idcarte;
        this.nomdecarte = nomdecarte;
        this.nbrport = nbrport;
        this.description = description;
        this.idtype = idtype;
        this.nbrcarte = nbrcarte;
        this.idnvps = idnvps;
        this.datedemisajour = datedemisajour;
        this.slotsnvps = slotsnvps;
        this.ipsignalization = ipsignalization;
        this.ipgateway = ipgateway;
    }
    public String getRequestInsert(carte crte){
      String sql="INSERT INTO `cartes` (`id carte`, `nom de carte`, `nbr port`, `description`, `id type`, `nbr carte`, `id nvps`, `date de mis a jour`, `slots nvps`, `ip signialization`, `ip gateway`) VALUES ('"+crte.idcarte+"','"+crte.nomdecarte+"','"+crte.nbrport+"','"+crte.description+"','"+crte.idtype+"','"+crte.nbrcarte+"','"+crte.idnvps+"','"+crte.datedemisajour+"','"+crte.slotsnvps+"','"+crte.ipsignalization+"','"+crte.ipgateway+"');";
        return sql;    
}   
    
    
}
