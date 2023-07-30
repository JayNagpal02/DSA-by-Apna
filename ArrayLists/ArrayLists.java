package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // add elements to list
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());

        // get elements from list
        int element = list.get(0);
        System.out.println(element);

        // add elements in between
        list.add(1, 1);
        System.out.println(list.toString());

        // set element in list
        list.set(0, 5);
        System.out.println(list.toString());

        // remove elements from list
        list.remove(3);
        System.out.println(list.toString());

        // size of list
        int size = list.size();
        System.out.println(size);

        // loops on ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sorting in ArrayList
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
