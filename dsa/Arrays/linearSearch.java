package dsa.Arrays;

import java.util.Scanner;

public class linearSearch {
    static void linear(int[] arr, int value) {
        boolean flag = false;
        int v1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                flag = true;
                v1 = arr[i];
                break;
            }
        }
        if (flag) {
            System.out.println("Value " + value + "is at index " + v1);
        } else {
            System.out.println("not present");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value");
        int v = sc.nextInt();
        linear(arr, v);
        sc.close();
    }
}
