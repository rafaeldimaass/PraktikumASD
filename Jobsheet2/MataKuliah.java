package Jobsheet2;

public class MataKuliah {
    String kodeMK, nama;
    int sks, jumlahJam;

    MataKuliah() {

    }

    MataKuliah(String kodeMK, String namaMK, int sks, int jumJam) {
        this.kodeMK = kodeMK;
        nama = namaMK;
        this.sks = sks;
        jumlahJam = jumJam;
    }

    void tampilInformasi() {
        System.out.println("=== INFORMASI MATA KULIAH " + nama + " ===");
        System.out.println("Kode: " + kodeMK);
        System.out.println("Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("================================");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS anda telah diubah");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jam anda berkurang.");
            System.out.println("Jumlah jam saat ini: " + jumlahJam);
        }

    }


}
