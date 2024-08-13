package day1.String;

public class pallindrome {
    public static void pallin(String a) {
        boolean flag = true;
        int beg = 0;
        int last = a.length() - 1;
        int mid = (beg + last) / 2;
        for (int i = 0; i <= mid; i++) {
            if (a.charAt(i) != a.charAt(last - i)) {
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

    public static void main(String[] args) {
        String str = "abba";
        pallin(str);
    }
}
