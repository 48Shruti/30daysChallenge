package dsa.Arrays.Easy;

import java.util.Arrays;

public class concatenationArray {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 1 };
        int n = 2 * (nums.length);
        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n / 2] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
