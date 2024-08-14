package dsa.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class swapArr {
    static void swap(int[] arr, int i1, int i2) {
        int temp = 0;
        temp = arr[i2];
        arr[i2] = arr[i1];
        arr[i1] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter index1");
        int i1 = sc.nextInt();
        System.out.println("Enter index2");
        int i2 = sc.nextInt();
        swap(arr, i1, i2);
        sc.close();
    }
}
