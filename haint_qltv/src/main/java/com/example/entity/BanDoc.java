
import javax.persistence.*;

@Entity
@Table(name = "ban_doc")
public class BanDoc {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "MA")
    private Integer ma;

    @Column(name = "TEN")
    private String ten;

    @Column(name = "SDT")
    private Integer sdt;

    @Column(name = "DIA_CHI")
    private String diaChi;

    @Column(name = "NGAY_SINH")
    private java.sql.Timestamp ngaySinh;

    @Column(name = "TAO_TK")
    private java.sql.Timestamp taoTk;

    @Column(name = "HANG")
    private Integer hang;

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

    public Integer getSdt() {
        return this.sdt;
    }

    public void setSdt(Integer sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public java.sql.Timestamp getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(java.sql.Timestamp ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public java.sql.Timestamp getTaoTk() {
        return this.taoTk;
    }

    public void setTaoTk(java.sql.Timestamp taoTk) {
        this.taoTk = taoTk;
    }

    public Integer getHang() {
        return this.hang;
    }

    public void setHang(Integer hang) {
        this.hang = hang;
    }
}
