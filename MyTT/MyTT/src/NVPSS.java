/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fatma_boulabed
 */
public class NVPSS {
    public int idnvps;
    public String nomnvpc;
    public String nvpstype;
public NVPSS() {
        this.idnvps = 0;
        this.nomnvpc = null;
        this.nvpstype = null;
    
}

    public NVPSS(int idnvps, String nomnvpc, String nvpstype) {
        this.idnvps = idnvps;
        this.nomnvpc = nomnvpc;
        this.nvpstype = nvpstype;
    }

    String getRequestInsert(NVPSS NVPS) {
        String sql ="INSERT INTO `nvps` (`id nvps`, ` nom nvps`, `nvps type`) VALUES ('"+NVPS.idnvps+"','"+NVPS.nomnvpc+"','"+NVPS.nvpstype+"')";
        return sql;
        
    }
    
    
}
