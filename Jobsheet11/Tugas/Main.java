package Jobsheet11.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kapasitas Maks. Antrian: ");
        int max = input.nextInt();
        MhsLL mhs = new MhsLL(max);
        int pilih = 0;

        do {
            System.out.println("=== LAYANAN MAHASISWA ===");
            System.out.println("1. Registrasi Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cetak Antrian Depan dan Belakang");
            System.out.println("4. Cek Jumlah Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    if (mhs.isFull()) {
                        System.out.println("Antrian Penuh, Tunggu ya...");
                        break;
                    }
                    input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa newMhs = new Mahasiswa(nim, nama, kelas);
                    mhs.tambahAntrian(newMhs);
                    break;

                case 2:
                    mhs.panggilAntrian();
                    break;
                case 3: 
                    mhs.peek();
                    break;
                case 4:
                    System.out.println("Jumlah Antrian saat ini: " + mhs.jumlahAntrian());
                    break;
                case 5:
                    mhs.clear();
                    System.out.println("Antrian berhasil dikosongkan...");
                    break;
                case 0:
                    System.out.println("Terima kasih...");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while(pilih != 0);
    }
}
