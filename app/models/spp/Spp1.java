package models.spp;

import com.google.gson.annotations.Expose;
import play.db.jdbc.BaseTable;
import play.db.jdbc.Id;
import play.db.jdbc.Table;

import java.io.Serializable;
@Table(name = "jenis_spp_1")
public class Spp1 extends BaseTable implements Serializable {
    @Expose
    @Id(sequence = "jenis_spp1_seq")
    public Long id;

    @Expose
    public String nama;
}
