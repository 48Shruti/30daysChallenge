package dsa.loops.Easy;

public class fiboonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        int n = 10;
        for (int i = 2; i < n; i++) {
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}
