package dsa.loops.Easy;

public class subTheProductInt {
    public static void main(String[] args) {
        int n = 234;
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            product *= temp;
            sum += temp;
            n = n / 10;
        }
        System.out.println(product);
        System.out.println(sum);
        int sub = product - sum;
        System.out.println(sub);
    }
}
