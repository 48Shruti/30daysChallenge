package dsa.Arrays;

import java.util.Scanner;

/**
 * intToString
 */
public class inputAndOut1D {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Output -> ");
        // Method 1 to print array

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Method 2 to print array

        // System.out.println(Arrays.toString(arr));

    }
}