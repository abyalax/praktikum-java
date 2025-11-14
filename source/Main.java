import custom.Mahasiswa;
import vars.Arrays;
import vars.SingleLinkedList;
import vars.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRAKTIKUM STRUKTUR DATA: ARRAY & LINKED LIST ===\n");

        // ============================================================
        // 1. ARRAY - TIPE DATA PRIMITIF
        // ============================================================
        System.out.println(">> ARRAY (PRIMITIF)");
        Arrays<string> angka = new Arrays<>();
        angka.add('10');
        angka.add(20);
        angka.add(30);
        angka.add(40);
        angka.add(50);
        angka.add(60); // trigger auto expand
        angka.print();

        System.out.println("Akses elemen index 2: " + angka.get(2));
        angka.set(2, 99);
        System.out.println("Set index 2 = 99:");
        angka.print();

        angka.remove(4);
        System.out.println("Setelah hapus index 4:");
        angka.print();

        System.out.println("Ukuran array sekarang: " + angka.size());
        System.out.println();

        // ============================================================
        // 2. ARRAY - TIPE DATA CUSTOM (Mahasiswa)
        // ============================================================
        System.out.println(">> ARRAY (CUSTOM OBJECT)");
        Arrays<Mahasiswa> arrMahasiswa = new Arrays<>(2);
        arrMahasiswa.add(new Mahasiswa("Wilda", "23562020425", 5));
        arrMahasiswa.add(new Mahasiswa("Akbar", "23562020426", 3));
        arrMahasiswa.add(new Mahasiswa("Stefani", "23562020427", 1));

        System.out.println("Daftar Mahasiswa:");
        arrMahasiswa.print();

        arrMahasiswa.remove(1);
        System.out.println("Setelah hapus index 1:");
        arrMahasiswa.print();

        System.out.println();

        // ============================================================
        // 3. SINGLY LINKED LIST
        // ============================================================
        System.out.println(">> SINGLY LINKED LIST");
        SingleLinkedList<String> namaList = new SingleLinkedList<>();
        namaList.add("Wilda");
        namaList.add("Akbar");
        namaList.addFirst("Stefani");
        namaList.addAt(1, "Santo");

        System.out.println("Isi linked list:");
        namaList.printList();

        namaList.remove("Akbar");
        System.out.println("Setelah hapus 'Akbar':");
        namaList.printList();

        namaList.reverse();
        System.out.println("Setelah dibalik:");
        namaList.printList();

        System.out.println("Ukuran list: " + namaList.size());
        System.out.println();

        // ============================================================
        // 4. DOUBLE LINKED LIST
        // ============================================================
        System.out.println(">> DOUBLE LINKED LIST");
        DoubleLinkedList<Mahasiswa> mhsList = new DoubleLinkedList<>();
        mhsList.addFirst(new Mahasiswa("Wilda", "23562020425", 5));
        mhsList.addLast(new Mahasiswa("Akbar", "23562020426", 3));
        mhsList.addLast(new Mahasiswa("Santo", "23562020427", 1));

        System.out.println("Cetak maju:");
        mhsList.printForward();
        System.out.println("Cetak mundur:");
        mhsList.printBackward();

        System.out.println("Hapus data pertama dan terakhir:");
        mhsList.removeFirst();
        mhsList.removeLast();
        mhsList.printForward();

        System.out.println("Apakah mengandung 'Akbar'? " + mhsList.contains(new Mahasiswa("Akbar", "23562020426", 3)));
        System.out.println("Ukuran double linked list: " + mhsList.size());

        System.out.println("\n=== SELESAI ===");
    }
}
