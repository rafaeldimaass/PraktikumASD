package Jobsheet11.Tugas;

public class MhsLL {
    NodeMahasiswa front, rear;
    int size;
    int max;

    public MhsLL(int max) {
        front = rear = null;
        size = 0;
        this.max = max;
    } 

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
    }

    public void tambahAntrian(Mahasiswa mahasiswa) {
        if (isFull()) {
            System.out.println("Maaf, antrian penuh");
        } else {
            NodeMahasiswa newNode = new NodeMahasiswa(mahasiswa, null);
            if (isEmpty()) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
            System.out.println(mahasiswa.nama + " berhasil masuk ke antrian");
        }
    }
    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            Mahasiswa current = front.mahasiswa;
            System.out.println("Mahasiswa a.n " + current.nama + " sedang dilayani");
            front = front.next;
            size--;

            if (isEmpty()) {
                rear = null;
            }
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Antrian Terdepan: ");
            System.out.println("Nama: " + front.mahasiswa.nama + " \nNIM: " + front.mahasiswa.nim);
            System.out.println("Antrian Akhir: ");
            System.out.println("Nama: " + rear.mahasiswa.nama + " \nNIM: " + rear.mahasiswa.nim);
        }
    }
    public int jumlahAntrian() {
        return size;
    }
}
