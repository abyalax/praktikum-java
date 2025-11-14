package vars;

import node.DoubleNode;

public class DoubleLinkedList<T> {
    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    private int size;

    // Tambah di akhir
    public void add(T data) {
        addLast(data);
    }

    // Tambah di akhir
    public void addLast(T data) {
        DoubleNode<T> newNode = new DoubleNode<>(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // menampilkan ke console dengan urutan maju
    public void printForward() {
        DoubleNode<T> current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

     // Cetak mundur
    public void printBackward() {
        DoubleNode<T> current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}