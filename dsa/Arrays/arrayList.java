package dsa.Arrays;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0, 4);
        arr.add(1, 7);
        arr.add(2, 6);
        arr.add(3, 61);
        System.out.println(arr.get(2));
        arr.remove(3);
        System.out.println(arr.size());
        System.out.println(arr);

    }
}
