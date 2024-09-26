package dsa.loops.Easy;

public class lcm {
    public static void main(String[] args) {
        int a = 12;
        int b = 16;
        int g = 0;
        // for hcf
        for (int i = 1; i < a && i < b; i++) {
            if (a % i == 0 && b % i == 0) {
                g = i;
            }
        }
        int l = (a * b) / g;
        System.out.println(l);
    }
}
