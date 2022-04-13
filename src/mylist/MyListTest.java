package mylist;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        Mylist<Integer> list = new Mylist<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("element 4 " + list.get(4));
        System.out.println("element 1 " + list.get(1));
        System.out.println("element 2 " + list.get(2));
    }
}
