package CM2;

public class NodePembeli {
    Pembeli pembeli;
    NodePembeli next;
    int noAntrian;

    public NodePembeli(int b, Pembeli a, NodePembeli c) {
        pembeli = a;
        noAntrian = b;
        next = c;
    }
}
