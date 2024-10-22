package dsa.Searching.LinearSearch;

public class minNumber {
    static int search(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (temp > arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 45, 34, 78, 23, 98, 76 };
        System.out.println(search(arr));
    }
}
