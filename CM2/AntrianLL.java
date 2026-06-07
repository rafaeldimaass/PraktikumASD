package CM2;

public class AntrianLL {
    NodePembeli head, tail;
    int counter;
    public AntrianLL() {
        head = tail = null;
        counter = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void enqueue(Pembeli pembeli) {
        counter++;
        NodePembeli newNode = new NodePembeli(counter, pembeli, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public NodePembeli dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong..");
            return null;
        }
        NodePembeli temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        return temp;
    }
    public void print() {
        NodePembeli current = head;
        while (current != null) {
            System.out.println("No Antrian: " + current.noAntrian);
            System.out.println("Nama Pembeli: " + current.pembeli.namaPembeli);
            System.out.println("No HP: " + current.pembeli.noHp);
            System.out.println();
            current = current.next;
        }
    }

}
