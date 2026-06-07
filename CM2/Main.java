package CM2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianLL antrian = new AntrianLL();
        PesananLL pesanan = new PesananLL();

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String nama = input.nextLine();
                    System.out.print("No HP: ");
                    String noHp = input.nextLine();
                    Pembeli pembeli = new Pembeli(nama, noHp);
                    antrian.enqueue(pembeli);
                    break;
                case 2:
                    antrian.print();
                    break;
                case 3:
                    NodePembeli node = antrian.dequeue();

                    if (node != null) {
                        System.out.println("Pesanan untuk " + node.pembeli.namaPembeli);
                        System.out.print("Kode Pesanan: ");
                        int kode = input.nextInt();
                        input.nextLine(); 
                        System.out.print("Nama Pesanan: ");
                        String namaPesanan = input.nextLine();
                        System.out.print("Harga: ");
                        int harga = input.nextInt();
                        input.nextLine(); 
                        Pesanan pesananBaru = new Pesanan(kode, namaPesanan, harga);
                        pesanan.tambahPesanan(pesananBaru);
                    } else {
                        System.out.println("Antrian kosong!");
                    }
                    break;
                case 4:
                    pesanan.laporan();
                    break;
                case 0:
                    System.out.println("Terima kasih...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}
