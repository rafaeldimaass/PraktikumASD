package Minggu1;
public class Percobaan4 {
    public static void main(String[] args) {
        
        int[][] stokCabang = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        double[] harga = {75000, 50000, 60000, 10000};
        pendapatan(stokCabang, harga);
    }

    public static void pendapatan(int[][] stokCabang, double[] harga) {
        System.out.printf("%-15s %-15s %-15s", "Cabang", "Pendapatan", "Status");
        System.out.println();
        System.out.println("================================================");

        for (int i = 0; i < stokCabang.length; i++) {
            double pendapatanCabang = 0;
            
            for (int j = 0; j < stokCabang[i].length; j++) {
                pendapatanCabang += (double) stokCabang[i][j] * harga[j];
            }

            String status = (pendapatanCabang > 1500000) ? "Sangat Baik" : "Perlu Evaluasi";
            System.out.printf("RoyalGarden %-3d Rp %-13.2f %-15s\n", (i + 1), pendapatanCabang, status);
        }
    }
}