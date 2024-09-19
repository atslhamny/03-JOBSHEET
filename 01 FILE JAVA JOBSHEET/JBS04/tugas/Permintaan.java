package tugas;

import java.util.ArrayList;
import java.util.Date;

public class Permintaan {
    private Pegawai kasir;
    private Pegawai pramuniaga;
    private Date tanggal_minta;
    private ArrayList<Barang> barang;

    public Permintaan(Pegawai kasir, Pegawai pramuniaga, Date tanggal_minta) {
        this.kasir = kasir;
        this.pramuniaga = pramuniaga;
        this.tanggal_minta = tanggal_minta;
        this.barang = new ArrayList<>();
    }

    public Pegawai getKasir() {
        return kasir;
    }

    public void setKasir(Pegawai kasir) {
        this.kasir = kasir;
    }

    public Pegawai getPramuniaga() {
        return pramuniaga;
    }

    public void setPramuniaga(Pegawai pramuniaga) {
        this.pramuniaga = pramuniaga;
    }

    public Date getTanggal_minta() {
        return tanggal_minta;
    }

    public void setTanggal(Date tanggal_minta) {
        this.tanggal_minta = tanggal_minta;
    }

    public String getPermintaan() {
        return "Permintaan details";
    }

    public void tambahBarang(Barang barang) {
        this.barang.add(barang);
    }
}