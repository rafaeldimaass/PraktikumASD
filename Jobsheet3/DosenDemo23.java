package Jobsheet3;

import java.util.Scanner;

public class DosenDemo23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dosen23 arrayOfDosen[] = new Dosen23[3];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Jenis kelamin (L/P): ");
            String jenisKelamin = input.nextLine();
            System.out.print("Usia: ");
            String dummy = input.nextLine();
            int usia = Integer.parseInt(dummy);

            do {
                if (jenisKelamin.equalsIgnoreCase("L")) {
                    arrayOfDosen[i] = new Dosen23(kode, nama, true, usia);
                    System.out.println("---------------------------");
                    break;
                } else if (jenisKelamin.equalsIgnoreCase("P")) {
                    arrayOfDosen[i] = new Dosen23(kode, nama, false, usia);
                    System.out.println("---------------------------");
                    break;
                } else {
                    System.out.println("Jenis Kelamin tidak valid!");
                    System.out.println("---------------------------");
                    System.out.print("Jenis kelamin (L/P): ");
                    jenisKelamin = input.nextLine();
                }
            } while (true);

        }

    
        System.out.println("---------------------------");
        DataDosen23 dataDosen23 = new DataDosen23();
        dataDosen23.tampilkanSeluruhData(arrayOfDosen);
        dataDosen23.hitungGenderDosen(arrayOfDosen);
        System.out.println("---------------------------");
        dataDosen23.rataRataUmurGender(arrayOfDosen);
        System.out.println("---------------------------");
        dataDosen23.cariDosenTermuda(arrayOfDosen);
        System.out.println("---------------------------");
        dataDosen23.cariDosenSenior(arrayOfDosen);
        System.out.println("---------------------------");

    };
}
