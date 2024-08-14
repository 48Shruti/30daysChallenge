package dsa.Arrays;

import java.util.Scanner;

// linear search

public class maxValue {
    static void max(int[] arr) {
        int m1 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                m1 = arr[i + 1];
            } else {
                m1 = arr[i];
            }
        }
        System.out.println("maximum value -> " + m1);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        max(arr);
        sc.close();
    }
}
