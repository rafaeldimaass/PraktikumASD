import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mataKuliah[] = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja", "Fisika" };
        int sks[] = {2, 2, 2, 3, 2, 2, 3, 2 ,2};
        double nilaiAngka[] = new double[mataKuliah.length];
        double ipAwal = 0;
        int jumSKS = 0;
        double ipSemester;

        System.out.println("==== PROGRAM MENGHITUNG IP SEMESTER ====");
        for(int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + " ");
            nilaiAngka[i] = input.nextDouble();
        }

        System.out.println("==== KONVERSI NILAI ====");
        System.out.printf("%-40s\t %-12s\t %-10s\t %-10s\t", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for(int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf;
            double nilaiSetara;

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf = "A";
                nilaiSetara = 4;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf = "B+";
                nilaiSetara = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf = "B";
                nilaiSetara = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf = "C+";
                nilaiSetara = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf = "C";
                nilaiSetara = 2;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf = "D";
                nilaiSetara = 1;
            } else {
                nilaiHuruf = "E";
                nilaiSetara = 0;
            }

            ipAwal += (nilaiSetara * sks[i]);
            jumSKS += sks[i];
            System.out.println();
            System.out.printf("%-40s\t %-10.2f\t %-10s\t %-10.2f\t", mataKuliah[i], nilaiAngka[i], nilaiHuruf, nilaiSetara);
        }
        ipSemester = ipAwal / jumSKS;
        System.out.println("===========================================================================================================");
        System.out.println("IP: " + ipSemester);
    }
}
