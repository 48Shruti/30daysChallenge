package dsa.Searching.LinearSearch;

public class basic {
    static void search(int target, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 34, 23, 54, 6, 7, 87 };
        search(7, arr);
    }
}