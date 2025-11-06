import vars.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Praktikum!");

        // Demonstrate Array usage

        int[] angka = new int[5]; // array kosong ukuran 5
        int[] angka2 = { 1, 2, 3, 4, 5 }; // array langsung diisi

        angka[0] = 10; // assign
        System.out.println(angka[0]); // baca

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }

        // atau enhanced for loop
        for (int n : angka2) {
            System.out.println(n);
        }

        // Demonstrate LinkedList usage

        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();
    }
}