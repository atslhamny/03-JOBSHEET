package tugas;

import java.util.Date;

public class MainToko {
    public static void main(String[] args) {
        Pegawai kasir = new Pegawai("K001", "Atsilah");
        Pegawai pramuniaga = new Pegawai("P001", "Jamik Afifah");

        Barang barang1 = new Barang();
        barang1.setNama("Laptop");
        barang1.setKode("LPT001");
        barang1.setHarga(1000000);
        barang1.setStok(10);

        Permintaan permintaan = new Permintaan(kasir, pramuniaga, new Date());
        permintaan.tambahBarang(barang1);

        Pembeli pembeli = new Pembeli();
        pembeli.setNama("Luis");
        pembeli.setTelp("123-456-7890");

        Pembayaran pembayaran = new Pembayaran("PAY001", new Date(), 1000000);

        System.out.println("Kasir: " + permintaan.getKasir().getNama());
        System.out.println("Pramuniaga: " + permintaan.getPramuniaga().getNama());
        System.out.println("Tanggal Permintaan: " + permintaan.getTanggal_minta());
        System.out.println("Pembeli: " + pembeli.getNama());
        System.out.println("Total Pembayaran: " + pembayaran.getTotal());
    }
}
