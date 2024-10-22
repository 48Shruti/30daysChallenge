package dsa.Searching.BinarySearch;

public class floor {
    static int f(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 10, 16, 18 };
        int target = 15;
        System.out.println(f(arr, target));
    }
}
