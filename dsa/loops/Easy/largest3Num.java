package dsa.loops.Easy;

public class largest3Num {
    public static void main(String[] args) {
        int a = 17;
        int b = 12;
        int c = 14;
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
