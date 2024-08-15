package dsa.Arrays;

import java.util.Scanner;

public class arr2D {
    public static void main(String[] args) {

        // int[][] arr1 = {{2,4},{5,6},{6,8}};

        // input
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output is ->  ");
        // output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
