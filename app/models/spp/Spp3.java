package models.spp;

import com.google.gson.annotations.Expose;
import play.db.jdbc.BaseTable;
import play.db.jdbc.Id;
import play.db.jdbc.Table;

import java.io.Serializable;

@Table(name = "jenis_spp_3")
public class Spp3 extends BaseTable implements Serializable {
    @Expose
    @Id(sequence = "jenis_spp3_seq")
    public Long id;

    @Expose
    public String nama;

    @Expose
    public Long id_spp2;

}
