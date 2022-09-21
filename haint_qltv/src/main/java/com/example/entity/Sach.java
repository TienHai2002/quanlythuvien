
import javax.persistence.*;

@Entity
@Table(name = "sach")
public class Sach {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "MA")
    private Integer ma;

    @Column(name = "TEN")
    private String ten;

    @Column(name = "ID_NXB")
    private Integer idNxb;

    @Column(name = "ID_TG")
    private Integer idTg;

    @Column(name = "CHU_DE")
    private String chuDe;

    @Column(name = "NXB")
    private Integer nxb;

    @Column(name = "MO_TA")
    private String moTa;

    @Column(name = "SLCL")
    private Integer slcl;

    @Column(name = "SLDM")
    private Integer sldm;

    @Column(name = "TONG_SACH")
    private Integer tongSach;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMa() {
        return this.ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getIdNxb() {
        return this.idNxb;
    }

    public void setIdNxb(Integer idNxb) {
        this.idNxb = idNxb;
    }

    public Integer getIdTg() {
        return this.idTg;
    }

    public void setIdTg(Integer idTg) {
        this.idTg = idTg;
    }

    public String getChuDe() {
        return this.chuDe;
    }

    public void setChuDe(String chuDe) {
        this.chuDe = chuDe;
    }

    public Integer getNxb() {
        return this.nxb;
    }

    public void setNxb(Integer nxb) {
        this.nxb = nxb;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getSlcl() {
        return this.slcl;
    }

    public void setSlcl(Integer slcl) {
        this.slcl = slcl;
    }

    public Integer getSldm() {
        return this.sldm;
    }

    public void setSldm(Integer sldm) {
        this.sldm = sldm;
    }

    public Integer getTongSach() {
        return this.tongSach;
    }

    public void setTongSach(Integer tongSach) {
        this.tongSach = tongSach;
    }
}
