import java.util.Scanner;
public class MahasiswaDemo23 {
    public static void main(String[] args) {
        StackTugasMahasiswa23 stack = new StackTugasMahasiswa23(5);
        Scanner input = new Scanner(System.in);
        int pilih;
    do {
        System.out.println("\nMenu:");
        System.out.println("1. Mengumpulkan Tugas");
        System.out.println("2. Menilai Tugas");
        System.out.println("3. Melihat tugas teratas");
        System.out.println("4. Melihat daftar tugas");
        System.out.println("5. Mahasiswa Pertama Mengumpulkan");
        System.out.println("6. Jumlah Tugas Terkumpul");
        System.out.println("Pilih");
        pilih = input.nextInt();
        input.nextLine();
        switch (pilih) {
            case 1:
                System.out.println("Nama: ");
                String nama = input.nextLine();
                System.out.println("NIM: ");
                String nim = input.nextLine();
                System.out.println("Kelas: ");
                String kelas = input.nextLine();
                Mahasiswa23 mhs = new Mahasiswa23(nama, nim, kelas);
                stack.push(mhs);
                System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                break;
            case 2:
                Mahasiswa23 dinilai = stack.pop();
                if (dinilai != null) {
                    System.out.println("Menilai tugas dari " + dinilai.nama);
                    System.out.println("Masukkan nilai (0-100): ");
                    int nilai = input.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    String biner = stack.konversiDesimalKeBiner(nilai);
                    System.out.println("Nilai biner tugas: " + biner);
                }
                break;
            case 3:
                Mahasiswa23 lihat = stack.peek();
                if (lihat != null) {
                    System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                }
                break;
            case 4:
                System.out.println("Daftar semua tugas");
                System.out.println("Nama\tNIM\tKelas");
                stack.print();
                break;
            case 5:
                Mahasiswa23 bawah = stack.peekBawah();
                if (bawah != null) {
                    System.out.println("Mahasiswa yang pertama mengumpulkan: " + bawah.nama);
                }
                break;
            case 6:
                int jumlah = stack.jumlahTugas();
                System.out.println("Jumlah tugas yang telah terkumpul: " + jumlah);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    } while (pilih >= 1 && pilih <= 6);
    }
}