
import javax.persistence.*;

@Entity
@Table(name = "nha_xuat_ban")
public class NhaXuatBan {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "MA")
    private Integer ma;

    @Column(name = "TEN")
    private String ten;

    @Column(name = "TRANG_THAI")
    private Integer trangThai;

    @Column(name = "DIA_CHI")
    private String diaChi;

    @Column(name = "MO_TA")
    private String moTa;

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

    public Integer getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
