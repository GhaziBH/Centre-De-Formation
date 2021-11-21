/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fatma_boulabed
 */
public class typecarte {
    public  int idtype;
    public String nom;
    public int acces;
    public int nbrport;

    public typecarte(int idtype, String nom, int acces, int nbrport) {
        this.idtype = idtype;
        this.nom = nom;
        this.acces = acces;
        this.nbrport = nbrport;
    }

    String getRequestInsert(typecarte type) {
        String sql ="INSERT INTO `type carte` (`id type`, `nom`, `acces`, `nbr port`) VALUES ('"+type.idtype+"','"+type.nom+"','"+type.acces+"','"+type.nbrport+"')";
        return sql;
    }
    
    
}
