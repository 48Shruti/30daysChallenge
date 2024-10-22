package dsa.loops.Easy;

public class pallindromeString {
    public static void main(String[] args) {
        String a = "abfa";
        int end = a.length();
        Boolean flag = false;
        for (int i = 1; i <= end / 2; i++) {
            if (a.charAt(i) != a.charAt(end - i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("String is pallindrome");
        } else {
            System.out.println("String is not pallindrome");
        }
    }
}
