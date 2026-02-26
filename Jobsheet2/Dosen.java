package Jobsheet2;

public class Dosen {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    Dosen() {

    }

    Dosen(String idDosen, String namaDosen, boolean statusAktif, int tahunGabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        nama = namaDosen;
        this.statusAktif = statusAktif;
        tahunBergabung = tahunGabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("==== INFORMASI DOSEN ====");
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        if (statusAktif == true) {
            System.out.println("Status: Aktif");
        } else if (statusAktif == false) {
            System.out.println("Status: Non-Aktif");
        } 
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Keahlian: " + bidangKeahlian);
        System.out.println("----------------------------");
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (status == true) {
            System.out.println("Status dosen saat ini aktif");
        } else {
            System.out.println("Status dosen saat ini tidak aktif");
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa Kerja Dosen: " + masaKerja + " tahun");
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
