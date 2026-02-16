package Minggu1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char KODE[] = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char KOTA[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' ' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' ' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' ' },
                { 'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' ' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' ' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' ' },
                { 'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }
        };
        System.out.print("Masukkan Kode Plat Kota! ");
        char inputKode = input.next().toUpperCase().charAt(0);

        for (int i = 0; i < KOTA.length; i++) {
            if (inputKode == KODE[i]) {
                for (int x = 0; x < KOTA[i].length; x++) {
                    System.out.print(KOTA[i][x]);
                }
                break;
            }
        }
    }
}
