package dsa.loops.Easy;

public class primeNum1toN {
    public static void main(String[] args) {
        int n = 100;
        boolean flag = false;

        for (int i = 1; i <= n; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (!flag) {
                System.out.println(i);
            }
        }

    }
}
