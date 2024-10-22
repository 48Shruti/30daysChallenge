package dsa.Searching.BinarySearch;

public class basic {
    static void binary(int[] arr, int target) {
        int start = 0;
        int last = arr.length;
        while (start <= last) {
            int mid = (start + last) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            } else if (arr[mid] > target) {
                last = mid - 1;
            } else {
                start = mid + 1;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 22, 24, 45, 56, 70, 89, 90, 99 };
        binary(arr, 99);
    }
}
