package dsa.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class candyKid {
    static void candy(int[] a, int extra) {

        Boolean[] ans = new Boolean[a.length];
        int maxCandy = 0;
        for (int candy : a) {
            maxCandy = Math.max(maxCandy, candy);
        }
        for (int i = 0; i < a.length; i++) {
            int temp = 0;
            temp = a[i] + extra;
            ans[i] = temp >= maxCandy;
        }
        System.out.println(Arrays.toString(ans));

    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter input extra candies");
        int extra = sc.nextInt();
        candy(arr, extra);
        sc.close();
    }
}
