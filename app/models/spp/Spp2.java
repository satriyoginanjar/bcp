package models.spp;

import com.google.gson.annotations.Expose;
import play.db.jdbc.BaseTable;
import play.db.jdbc.Id;
import play.db.jdbc.Table;

import java.io.Serializable;
import java.util.List;

@Table(name = "jenis_spp_2")
public class Spp2 extends BaseTable implements Serializable {
    @Expose
    @Id(sequence = "jenis_spp2_seq")
    public Long id;

    @Expose
    public String nama;

    @Expose
    public Long id_spp1;


    public List<Spp2> getSpp2ByIdSpp1 (Long idSpp1){
        List<Spp2> daftarSpp2 = Spp2.findList("id_spp1 = ? ",idSpp1);
        return daftarSpp2;
    }

}
