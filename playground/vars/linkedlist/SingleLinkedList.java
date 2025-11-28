package vars.linkedlist;

import node.SingleNode;

public class SingleLinkedList<T> {
    private SingleNode<T> head;
    private int size;

    // Tambah di akhir
    public void add(T data) {
        addLast(data);
    }

    // Tambah di akhir
    public void addLast(T data) {
        SingleNode<T> newNode = new SingleNode<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            SingleNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Cetak isi list
    public void printList() {
        SingleNode<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}