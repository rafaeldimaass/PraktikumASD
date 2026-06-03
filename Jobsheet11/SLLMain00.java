package Jobsheet11;

public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList00 sll = new SingleLinkedList00();
        Mahasiswa00 mhs1 = new Mahasiswa00("123", "Andi", "1C", 3.6);
        Mahasiswa00 mhs2 = new Mahasiswa00("124", "Joko", "1D", 3.7);
        Mahasiswa00 mhs3 = new Mahasiswa00("125", "Dodi", "1F", 3.8);
        Mahasiswa00 mhs4 = new Mahasiswa00("126", "Wowi", "1Z", 4.0);
    
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dodi", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    
    }
}
