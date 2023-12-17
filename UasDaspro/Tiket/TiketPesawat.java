public class TiketPesawat {
    private String idTiketPesawat;
    private String Maskapai;
    private int hargaTiket;
    private boolean isAvailable;

    public TiketPesawat setIdTiketPesawat(String setIdTiketPesawat) {
        this.idTiketPesawat = setIdTiketPesawat;
        return this;
    }

    public TiketPesawat setMaskapai(String Maskapai) {
        this.Maskapai = Maskapai;
        return this;
    }

    public TiketPesawat setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
        return this;
    }

    public TiketPesawat setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    public String getIdTiketPesawat() {
        return idTiketPesawat;
    }

    public String getIdMaskapai() {
        return Maskapai;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

}