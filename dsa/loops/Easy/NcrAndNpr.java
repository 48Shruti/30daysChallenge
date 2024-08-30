package dsa.loops.Easy;

public class NcrAndNpr {
    static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int result1 = fact(n) / fact(n - r);
        System.out.println("Npr" + result1);
        int result2 = fact(n) / fact(n) * fact(n - r);
        System.out.println("Ncr" + result2);
    }
}
