import java.time.LocalDate;

public class RumahSakitDemo {
    public static void main(String[] args) {
        Pegawai ani =  new Pegawai("1234", "dr. Ani");
        Pegawai bagus = new Pegawai("4567", "dr. Bagus");

        Pegawai desi = new Pegawai("1234", "Ns. Desi");
        Pegawai eka = new Pegawai("4567", "Ns. Eka");

        Pasien pasien1 = new Pasien("356434", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2024, 1, 4), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2024, 3, 17), bagus, eka);

        System.out.println(pasien1.getInfo());

        Pasien pasien2 = new Pasien("998238", "Yenny Anggreani");
        System.out.println(pasien2.getInfo());

    }
}
