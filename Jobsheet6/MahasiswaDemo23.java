import java.util.Scanner;
public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        String nim, nama, kelas;
        double ipk;
        int jumMhs = 5;

        for(int i=1; i<=jumMhs; i++) {
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

        list.tampil();
        System.out.println("-------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.println("IPK: ");
        double cari = input.nextDouble();
        
        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // binary search
        System.out.println("------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        double cariBinary = input.nextDouble();
        System.out.println("-------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        
    }
}