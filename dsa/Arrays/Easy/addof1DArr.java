package dsa.Arrays.Easy;

import java.util.Arrays;

public class addof1DArr {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] ans = new int[nums.length];
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            n += nums[i];
            ans[i] = n;
        }
        System.out.println(Arrays.toString(ans));
    }
}
