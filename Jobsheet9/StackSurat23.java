public class StackSurat23 {
    Surat23[] stack;
    int size, top;

    StackSurat23() {

    }
    StackSurat23(int size) {
        this.size = size;
        stack = new Surat23[size];
        top = -1;
    }
    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    void push(Surat23 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack Penuh!");
        }
    }
    Surat23 pop() {
        if (!isEmpty()) {
            Surat23 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
    Surat23 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
    Surat23 cariData(String nama) {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                if (stack[i].namaMahasiswa.equals(nama)) {
                    return stack[i];
                }
            }
            return null;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }
}
