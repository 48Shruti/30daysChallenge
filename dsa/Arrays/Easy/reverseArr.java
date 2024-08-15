package dsa.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {
    static void reverse(int[] arr) {
        int temp = 0;
        int end = arr.length - 1;
        for (int i = 0; i <= end / 2; i++) { // divide by two bcoz of the iteration to swap
            temp = arr[end - i];
            arr[end - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        sc.close();
    }
}
