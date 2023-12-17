public class DetailTiket {
    private String idDetailTiket;
    private String maskapai;
    private String rute;
    private int time;
    private int hargaTiket;
    private int jumlahBeli;
    private int subTotal;

    public String getIdDetailTiket() {
        return idDetailTiket;
    }

    public void setidDetailTiket(String idDetailTiket) {
        this.idDetailTiket = idDetailTiket;
    }

    public String getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public String getRute() {
        return rute;
    }

    public void setNegaraTujuan(String rute) {
        this.rute = rute;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int Time) {
        this.time = Time;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

}