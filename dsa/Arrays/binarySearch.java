package dsa.Arrays;

import java.util.Scanner;

public class binarySearch {
    static void binary(int[] arr, int value) {
        int beg = 0;
        boolean flag = false;
        int result = 0;
        int last = arr.length;
        int mid = (beg + last) / 2;
        if (mid > value) {
            for (int i = 0; i < mid; i++) {
                if (value == arr[i]) {
                    flag = true;
                    result = i;
                    break;
                }
            }
        } else {
            for (int i = mid; i < arr.length; i++) {
                if (value == arr[i]) {
                    flag = true;
                    result = i;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Value " + value + "is at index " + result);
        } else {
            System.out.println("not present");
        }
    }

    // input is in sorted array form
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value");
        int v = sc.nextInt();
        binary(arr, v);
        sc.close();
    }
}
