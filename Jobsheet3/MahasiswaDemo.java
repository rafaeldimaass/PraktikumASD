package Jobsheet3;

import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa arrayOfMahasiswa[] = new Mahasiswa[3];
        String dummy;

        for(int i =0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            arrayOfMahasiswa[i] = new Mahasiswa();
            System.out.print("NIM: ");
            arrayOfMahasiswa[i].nim = input.nextLine();
            System.out.print("NAMA: ");
            arrayOfMahasiswa[i].nama = input.nextLine();
            System.out.print("KELAS: ");
            arrayOfMahasiswa[i].kelas = input.nextLine();
            System.out.print("IPK: ");
            dummy = input.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);

        }
        for(int i=0; i<3; i++) {
            System.out.println("--------------------------------------");
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("NIM: " + arrayOfMahasiswa[i].nim);
            System.out.println("NAMA: " + arrayOfMahasiswa[i].nama);
            System.out.println("KELAS: " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK: " + arrayOfMahasiswa[i].ipk);
            System.out.println("--------------------------------------");
        }
        
    }
    
    
}
