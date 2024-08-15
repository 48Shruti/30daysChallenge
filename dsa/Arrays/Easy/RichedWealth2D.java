package dsa.Arrays.Easy;

public class RichedWealth2D {
    public static void main(String[] args) {
        int max = 0;
        int[][] arr = { { 20, 30, 40 }, { 35, 35, 15 }, { 15, 40, 5 } };

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr[i].length; j++) {
                temp += arr[i][j];

            }
            max = Math.max(temp, max);
        }
        System.out.println(max);
    }
}
