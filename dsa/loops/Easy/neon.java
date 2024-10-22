package dsa.loops.Easy;

public class neon {
    public static void main(String[] args) {
        int n = 9;
        int sqr = n * n;
        int ans = 0;
        while (sqr > 0) {
            int temp = 0;
            temp = sqr % 10;
            ans += temp;
            sqr = sqr / 10;
        }
        if (n == ans) {
            System.out.println("Neon number");
        } else {
            System.out.println("not neon number");
        }
    }
}
