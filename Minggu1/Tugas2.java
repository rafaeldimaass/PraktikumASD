package Minggu1;

import java.util.Scanner;

public class Tugas2 {
    static String[][] jadwalMatkul;
    static Scanner input = new Scanner(System.in);
    static int n = 0;

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah mata kuliah: ");
        n = input.nextInt();
        jadwalMatkul =  new String[n][4];
        System.out.println();

        do {
            System.out.println("==== MENU ====");
            System.out.println("==============================");
            System.out.println("1. Tambah data mata kuliah");
            System.out.println("2. Cetak seluruh mata kuliah");
            System.out.println("3. Cari data matkul berdasarkan hari");
            System.out.println("4. Cari data matkul berdasarkan nama mata kuliah");
            System.out.println("5. Keluar");
            System.out.println("==============================");
            System.out.print("Pilih menu : ");
            int menu = input.nextInt();

            input.nextLine();

            switch (menu) {
                case 1:
                    tambahJadwal();
                    break;
                case 2: 
                    tampilJadwal();
                    break;
                case 3:
                    System.out.print("Masukkan hari : ");
                    cariJadwalHari(input.nextLine());
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah : ");
                    cariJadwalNama(input.nextLine());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak ada");
            }
        } while (true);
    }

    public static void tambahJadwal() {
        
        for(int i = 0; i < n; i++) {
            System.out.println("Masukkan jadwal mata kuliah ke-" + (i+1));
            System.out.print("Mata kuliah: ");
            jadwalMatkul[i][0] = input.nextLine();
            System.out.print("Ruangan: ");
            jadwalMatkul[i][1] = input.nextLine();
            System.out.print("Hari: ");
            jadwalMatkul[i][2] = input.nextLine();
            System.out.print("Jam: ");
            jadwalMatkul[i][3] = input.nextLine();
        }
    
    }

    public static void tampilJadwal() {
        System.out.println("==============================");
        System.out.printf("%-30s %-10s %-10s %-17s\n",
                "Mata Kuliah", "Ruang", "Hari", "Pukul");

        for (int i = 0; i < jadwalMatkul.length; i++) {
            System.out.printf("%-30s %-10s %-10s %-17s\n",
                        jadwalMatkul[i][0], jadwalMatkul[i][1], jadwalMatkul[i][2], jadwalMatkul[i][3]);
        }
    }

    public static void cariJadwalHari(String keyword) {
        if (jadwalMatkul.equals(null)) {
            System.out.println("Data hari belum ditemukan.");
            return;
        }
        System.out.println("==============================");
        for (int i = 0; i < jadwalMatkul.length; i++) {
            if (jadwalMatkul[i][2].equalsIgnoreCase(keyword)) {
                System.out.printf("%-40s %-10s %-10s %-20s\n",
                        jadwalMatkul[i][0], jadwalMatkul[i][1], jadwalMatkul[i][2], jadwalMatkul[i][3]);
                        break;
            }
        }
        
    }

    public static void cariJadwalNama(String keyword) {
        if (jadwalMatkul.equals(null)) {
            System.out.println("Data mata kuliah belum ditemukan.");
            return;
        }
        System.out.println("==============================");
        for (int i = 0; i < jadwalMatkul.length; i++) {
            if (jadwalMatkul[i][0].equalsIgnoreCase(keyword)) {
                System.out.printf("%-40s %-10s %-10s %-20s\n",
                        jadwalMatkul[i][0], jadwalMatkul[i][1], jadwalMatkul[i][2], jadwalMatkul[i][3]);
                        break;
            } 
            }
        }
}
