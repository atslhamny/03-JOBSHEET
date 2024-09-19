package tugas;

import java.util.ArrayList;

public class Pembeli {
    private String nama;
    private String telp;
    private ArrayList<Permintaan> jumlahPermintaan;

    public Pembeli() {
        this.jumlahPermintaan = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
}
