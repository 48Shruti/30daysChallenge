package dsa.loops.Easy;

public class factorial {
    public static void main(String[] args) {
        int n = 3;
        int ans = 1;
        for (int i = n; i > 0; i--) {
            ans *= i;
        }
        System.out.println(ans);
    }
}
