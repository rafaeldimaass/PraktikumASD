package Jobsheet3;

import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah anda: ");
        int jumMatkul = input.nextInt();
        MataKuliah[] arrayOfMataKuliah = new MataKuliah[jumMatkul];
        String kode, nama, dummy;
        int sks, jumlahJam;
        input.nextLine();
        for(int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = input.nextLine();
            System.out.print("Nama          :");
            nama = input.nextLine();
            System.out.print("SKS           :");
            dummy = input.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    :");
            dummy = input.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------");
            arrayOfMataKuliah[i] = new MataKuliah();
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }
        for(int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("---------------------");
        }
    }
}
