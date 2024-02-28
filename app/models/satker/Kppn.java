package models.satker;

import com.google.gson.annotations.Expose;
import play.db.jdbc.BaseTable;
import play.db.jdbc.Id;
import play.db.jdbc.Table;

import java.io.Serializable;
@Table(name = "satker")
public class Kppn extends BaseTable implements Serializable {

    @Expose
    @Id(sequence = "satker_seq")
    public Long id;

    @Expose
    public String kode_satker;

    @Expose
    public String nama_satker;

}
