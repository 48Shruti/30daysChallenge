package dsa.loops.Easy;

public class reverseString {
    public static void main(String[] args) {
        String n1 = "abcd";
        String n2 = "";

        for (int i = n1.length() - 1; i >= 0; i--) {
            n2 += n1.charAt(i);
        }
        System.out.println(n2);
    }
}
