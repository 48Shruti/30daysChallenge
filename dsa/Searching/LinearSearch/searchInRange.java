package dsa.Searching.LinearSearch;

public class searchInRange {
    static void search(int[] arr, int target, int start, int end) {
        for (int i = start; i < end; i++) {
            if (target == arr[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 34, 36, 89, 23, 67, 80, 39 };
        int target = 23;
        int start = 1;
        int end = 5;
        search(arr, target, start, end);
    }
}
