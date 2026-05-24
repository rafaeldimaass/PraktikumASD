import java.util.Scanner;

public class SuratDemo23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat23 surat = new StackSurat23(10);
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("Pilih");
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan id surat: ");
                    String idSurat = input.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaMhs = input.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (A/I/S): ");
                    char jenis = input.next().charAt(0);
                    System.out.print("Masukkan durasi: ");
                    int durasi = input.nextInt();
                    Surat23 srt = new Surat23(idSurat, namaMhs, kelas, jenis, durasi);
                    surat.push(srt);
                    System.out.printf("Surat dengan id %s berhasil ditambahkan\n", idSurat);
                    break;
                case 2:
                    Surat23 proses = surat.pop();
                    if (proses != null) {
                        System.out.printf("Surat dengan id %s diproses\n", proses.idSurat);
                    } else {
                        System.out.println("Surat gagal diproses!");
                    }
                    break;
                case 3:
                    Surat23 terakhir = surat.peek();
                    if (terakhir != null) {
                        System.out.println("Surat Terakhir");
                        System.out.printf("ID Surat: %s \nNama Mahasiswa: %s \nKelas: %s \nJenis Izin: %s \nDurasi: %d", terakhir.idSurat, terakhir.namaMahasiswa, terakhir.kelas, terakhir.jenisIzin, terakhir.durasi);
                    }
                    break;
                case 4: 
                    System.out.print("Masukkan Nama: ");
                    String cari = input.nextLine();
                    Surat23 cariSurat = surat.cariData(cari);
                    if (cariSurat != null) {
                        System.out.println("Data ditemukan");
                        System.out.printf("ID Surat: %s \nNama Mahasiswa: %s \nKelas: %s \nJenis Izin: %s \nDurasi: %d", cariSurat.idSurat, cariSurat.namaMahasiswa, cariSurat.kelas, cariSurat.jenisIzin, cariSurat.durasi);
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
