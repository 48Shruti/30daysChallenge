package dsa.loops.Easy;

public class pallindromeNum {
    public static void main(String[] args) {
        int n = 123321;
        int temp = 0;
        int reverse = 0;
        boolean flag = false;
        temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            // System.out.println(reverse);
            temp = temp / 10;
            // System.out.println(temp);
        }
        if (reverse == n) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not pallindrome");
        }
    }
}
