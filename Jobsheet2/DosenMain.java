package Jobsheet2;

public class DosenMain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        dosen1.idDosen = "10702551";
        dosen1.nama = "Yu Jimin";
        dosen1.statusAktif = false;
        dosen1.tahunBergabung = 2012;
        dosen1.bidangKeahlian = "Pemrograman";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2026);
        dosen1.ubahKeahlian("Matematika");
        dosen1.tampilInformasi();

        Dosen dosen2 = new Dosen("10702552", "Skybidi Toilo", true, 2023, "Bahasa Inggris");

        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false);
        dosen2.hitungMasaKerja(2026);
        dosen2.ubahKeahlian("Computer Vision");
        dosen2.tampilInformasi();
    }

}
