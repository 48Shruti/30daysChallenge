package dsa.Arrays.Easy;

import java.util.Arrays;

public class shuffleAraay {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] ans = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[n + i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
