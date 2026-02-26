package Jobsheet2;

public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "1F";
        mk1.nama = "Aljabar Linier";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.tampilInformasi();
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah mk2 = new MataKuliah("1C", "ASD", 3, 4);
        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(2);
        mk2.tampilInformasi();
        mk2.kurangiJam(8);
        mk2.tampilInformasi();


    }
}
