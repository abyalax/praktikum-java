package vars;

public class Arrays<T> {
    private Object[] data;
    private int size;
    private int capacity;

    private static final int DEFAULT_CAPACITY = 4;

    // konstruktor default
    public Arrays() {
        this(DEFAULT_CAPACITY);
    }

    // konstruktor dengan kapasitas custom
    public Arrays(int capacity) {
        if (capacity <= 0) {
            capacity = DEFAULT_CAPACITY;
        }
        this.capacity = capacity;
        this.data = new Object[capacity];
        this.size = 0;
    }

    // menambah elemen di akhir
    public void add(T value) {
        ensureCapacity();
        data[size++] = value;
    }

    // ambil elemen
    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    // ubah elemen
    public void set(int index, T value) {
        data[index] = value;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            // naikkan kapasitas 1.5x (dibulatkan ke atas)
            int newCapacity = capacity + (capacity >> 1);
            Object[] newData = new Object[newCapacity];

            // copy manual elemen lama ke array baru
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }

            // tukar referensi
            data = newData;
            capacity = newCapacity;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i < size - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
