package dsa.loops.Easy;

public class hcf {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 18;
        int result = 0;
        for (int i = 1; i < n1 && i < n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                result = i;
            }
        }
        System.out.println(result);
    }
}
