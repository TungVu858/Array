package mylist;

import java.util.Arrays;

public class Mylist<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public Mylist() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public void nhan2() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
        if (size == element.length) {
            nhan2();
        }
        element[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + " ,Size " + size);
        }
        return (E) element[i];
    }
}
