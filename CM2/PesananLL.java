package CM2;

public class PesananLL {
    NodePesanan head, tail;
    public boolean isEmpty() {
        return head == null;
    }
    public void tambahPesanan(Pesanan pesanan) {
        NodePesanan newNode = new NodePesanan(pesanan, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void urutNama() {
        if (isEmpty() || head.next == null) {
            return;
        }
        boolean swapped;   
        do {
            swapped = false;
            NodePesanan current = head;
            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareTo(current.next.pesanan.namaPesanan) > 0) {
                    Pesanan temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
    public void laporan() {
            if (isEmpty()) {
                System.out.println("Tidak ada pesanan.");
                return;
            }

            urutNama();
            System.out.println("Laporan Pesanan: (LAPORAN URUT SESUAI NAMA)");
            System.out.println("==========================================");
            System.out.printf("%-12s | %-20s | %s%n", "Kode Pesanan", "Nama Pesanan", "Harga");
            NodePesanan current = head;
            int totalPendapatan = 0;

            while (current != null) {
                System.out.printf("%-12d | %-20s | %d%n", current.pesanan.kodePesanan, current.pesanan.namaPesanan, current.pesanan.harga);
                totalPendapatan += current.pesanan.harga;
                current = current.next;
            }
            System.out.println("==========================================");
            System.out.println("Total Pendapatan: Rp." + totalPendapatan);
    }
}
