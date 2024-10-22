package dsa.Searching.BinarySearch;

public class ceiling {
    static int c(int[] arr, int target) {
        int first = 0;
        int end = arr.length;
        while (first <= end) {
            int mid = first + (end - first) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                first = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return arr[first];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 10;
        System.out.println(c(arr, target));
    }
}
