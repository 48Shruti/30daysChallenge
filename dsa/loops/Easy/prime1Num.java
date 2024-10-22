package dsa.loops.Easy;

public class prime1Num {
    public static void main(String[] args) {
        int n = 4;
        boolean flag = false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
