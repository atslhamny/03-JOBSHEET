package tugas;

import java.util.Date;

public class Pembayaran {
    private String id_pembayaran;
    private Date tgl_bayar;
    private int total;

    public Pembayaran(String id_pembayaran, Date tgl_bayar, int total) {
        this.id_pembayaran = id_pembayaran;
        this.tgl_bayar = tgl_bayar;
        this.total = total;
    }

    public String getIdPembayaran() {
        return id_pembayaran;
    }

    public Date getTglByr() {
        return tgl_bayar;
    }

    public int getTotal() {
        return total;
    }
}