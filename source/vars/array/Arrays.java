package vars.array;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class Arrays<T> implements Iterable<T> {
    private Object[] data;
    private int size;
    private int capacity;

    private static final int DEFAULT_CAPACITY = 5;

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

    // ubah elemen
    public void set(int index, T value) {
        checkIndex(index);
        data[index] = value;
    }

    // hapus elemen di posisi tertentu
    public void removeAt(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
    }

    public int size() {
        return size;
    }

    public boolean remove(T data) {
        return removeIf(e -> e.equals(data));
    }

    @SuppressWarnings("unchecked")
    public boolean removeIf(Predicate<T> callback) {
        boolean removed = false;

        for (int i = 0; i < size; i++) {
            if (callback.test((T) data[i])) {
                removeAt(i);
                i--;
                removed = true;
            }
        }
        return removed;
    }

    // ambil elemen
    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        T value = (T) data[--size];

        data[size] = null;
        return value;
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

    public void printStack() {
        System.out.print("[ ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(data[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<T> {

        private int cursor = 0; // index elemen berikutnya
        private int lastReturned = -1;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            lastReturned = cursor;
            return (T) data[cursor++];
        }

        @Override
        public void remove() {
            if (lastReturned < 0) {
                throw new IllegalStateException();
            }

            Arrays.this.removeAt(lastReturned);
            cursor = lastReturned;
            lastReturned = -1;
        }
    }

}
