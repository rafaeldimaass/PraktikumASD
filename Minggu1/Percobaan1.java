package Minggu1;
import java.util.Scanner;

public class Percobaan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiTugas, nilaiKuis, nilaiUts, nilaiUas;
        float nilaiAkhir;
        String nilaiHuruf, pesan;

        System.out.println("==== PROGRAM MENGHITUNG NILAI AKHIR ====");
        System.out.println("========================================");
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = input.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUts = input.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUas = input.nextInt();

        System.out.println("========================================");

        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai tidak valid!");
        } else if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai tidak valid!");
        } else if (nilaiUts < 0 || nilaiUts > 100) {
            System.out.println("Nilai tidak valid!");
        } else if (nilaiUas < 0 || nilaiUas > 100) {
            System.out.println("Nilai tidak valid!");
        }

        nilaiAkhir = (nilaiTugas + nilaiKuis + nilaiUts + nilaiUas) / 4;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            pesan = "Selamat anda lulus!";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            pesan = "Selamat anda lulus!";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            pesan = "Selamat anda lulus!";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            pesan = "Selamat anda lulus!";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            pesan = "Selamat anda lulus!";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            pesan = "Selamat anda tidak lulus!";
        } else {
            nilaiHuruf = "E";
            pesan = "Selamat anda tidak lulus!";
        }

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println(pesan);
        System.out.println("==========================================");
    }
}
