package dsa.Pattern;

public class ex {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int i = 0;
        int temp = arr[i];
        for (i = 0; i < n - 1; i++) {

            if (temp < arr[i + 1]) {
                temp = arr[i + 1];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]
        int n = 6;
        System.out.println(largestElement(arr, n));

    }
}