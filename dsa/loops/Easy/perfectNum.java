package dsa.loops.Easy;

public class perfectNum {
    public static void main(String[] args) {
        int n = 4558;
        int n1 = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                n1 += i;
            }
        }
        if (n1 == n) {
            System.out.println("perfect number");
        } else {
            System.out.println("Not perfect");
        }
    }
}
