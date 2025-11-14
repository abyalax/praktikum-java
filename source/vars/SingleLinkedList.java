package vars;

import node.SingleNode;

public class SingleLinkedList<T> {
    private SingleNode<T> head;
    private int size;

    // Tambah di akhir
    public void add(T data) {
        addLast(data);
    }

    // Tambah di awal
    public void addFirst(T data) {
        SingleNode<T> newNode = new SingleNode<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
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

    // Tambah di posisi tertentu
    public void addAt(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
        if (index == 0) {
            addFirst(data);
            return;
        }

        SingleNode<T> newNode = new SingleNode<T>(data);
        SingleNode<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    // Hapus di awal
    public void removeFirst() {
        if (head == null) return;
        head = head.next;
        size--;
    }

    // Hapus di akhir
    public void removeLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
        } else {
            SingleNode<T> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    // Hapus berdasarkan nilai
    public void remove(T data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return;
        }

        SingleNode<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    // Cek apakah data ada
    public boolean contains(T data) {
        SingleNode<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) return true;
            current = current.next;
        }
        return false;
    }

    // Ambil data berdasarkan index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }

        SingleNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Balik urutan linked list
    public void reverse() {
        SingleNode<T> prev = null;
        SingleNode<T> current = head;
        SingleNode<T> next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
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

    // Ukuran dan status
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
