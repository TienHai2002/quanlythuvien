
import javax.persistence.*;

@Entity
@Table(name = "muon_sach")
public class MuonSach {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ID_BAN_DOC")
    private Integer idBanDoc;

    @Column(name = "ID_SACH")
    private Integer idSach;

    @Column(name = "SO_LUONG")
    private Integer soLuong;

    @Column(name = "NGAY_MUON")
    private java.sql.Timestamp ngayMuon;

    @Column(name = "NGAY_TRA")
    private java.sql.Timestamp ngayTra;

    @Column(name = "TRANG_THAI")
    private String trangThai;

    @Column(name = "GHI_CHU")
    private String ghiChu;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdBanDoc() {
        return this.idBanDoc;
    }

    public void setIdBanDoc(Integer idBanDoc) {
        this.idBanDoc = idBanDoc;
    }

    public Integer getIdSach() {
        return this.idSach;
    }

    public void setIdSach(Integer idSach) {
        this.idSach = idSach;
    }

    public Integer getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public java.sql.Timestamp getNgayMuon() {
        return this.ngayMuon;
    }

    public void setNgayMuon(java.sql.Timestamp ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public java.sql.Timestamp getNgayTra() {
        return this.ngayTra;
    }

    public void setNgayTra(java.sql.Timestamp ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return this.ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
