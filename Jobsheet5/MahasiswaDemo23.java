import java.util.Scanner;
public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        String nim, nama, kelas;
        double ipk;
        for(int i=1; i<=5; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + i);
            System.out.print("NIM: ");
            nim = input.nextLine();
            System.out.print("Nama: ");
            nama = input.nextLine();
            System.out.print("Kelas: ");
            kelas = input.nextLine();
            System.out.print("IPK: ");
            ipk = Double.parseDouble(input.nextLine());
            System.out.println("-----------------------------");
            Mahasiswa23 m = new Mahasiswa23(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data Mahasiswa sebelum di sorting");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        
    }
}