import java.time.LocalDate;
import java.util.ArrayList;

public class Sale {
    private String idSale;
    private String Maskapai;
    private String penumpang;
    private String admin;
    private int total;
    private LocalDate tanggal;
    private ArrayList<DetailTiket> detailTikets;

    public String getIdSale() {
        return Maskapai;
    }

    public Sale setIdSale(String idSale) {
        this.idSale = idSale;
        return this;
    }

    public String getidSAsetidSale() {
        return idSale;
    }

    public Sale setMaskapai(String Maskapai) {
        this.Maskapai = Maskapai;
        return this;
    }

    public String getPenumpang() {
        return penumpang;
    }

    public Sale setPenumpang(String penumpang) {
        this.penumpang = penumpang;
        return this;
    }

    public String getAdmin() {
        return admin;
    }

    public Sale setAdmin(String admin) {
        this.admin = admin;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public Sale setTotal(int total) {
        this.total = total;
        return this;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public Sale setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }

    public ArrayList<DetailTiket> getDetailTikets() {
        return detailTikets;
    }

    public Sale setDetailTikets(ArrayList<DetailTiket> detailTikets) {
        this.detailTikets = detailTikets;
        return this;
    }

}
