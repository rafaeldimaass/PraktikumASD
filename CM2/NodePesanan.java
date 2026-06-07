package CM2;

public class NodePesanan {
    Pesanan pesanan;
    NodePesanan next;
    public NodePesanan(Pesanan a, NodePesanan b) {
        pesanan = a;
        next = b;
    }
}
