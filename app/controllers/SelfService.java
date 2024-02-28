package controllers;

import models.spp.Spp2;

import java.util.List;

public class SelfService extends BasicCtr{

    public static void get (Long id_spp1){
        List<Spp2> daftarSpp1 = null;
        daftarSpp1 = Spp2.findList("id_spp1 = ?",id_spp1);

    }
}
