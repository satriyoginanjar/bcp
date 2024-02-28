package controllers;

import models.satker.Kppn;
import models.spp.Spp1;
import models.spp.Spp2;
import models.spp.Spp3;

import java.util.List;

public class LandingPageCtr extends BasicCtr{

    public static void index(){
        List<Spp1> daftarSPP1 = null;
        List<Spp2> daftarSPP2 = null;
        List<Spp3> daftarSPP3 = null;
        List<Kppn> daftarKppn = null;
        daftarSPP1 = Spp1.findList("id = ?",1);
        daftarSPP2 = Spp2.findList("id_spp1 = ? ",1);
        daftarSPP3 = Spp3.findList("id_spp2 = ? ",1);
        daftarKppn = Kppn.findAll();
        render(daftarSPP1,daftarSPP2,daftarSPP3,daftarKppn);
    }

}
