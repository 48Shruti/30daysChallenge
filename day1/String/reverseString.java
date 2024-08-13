package day1.String;

public class reverseString {
    public static void main(String[] args) {
        String orignal = "Hello";
        int end = orignal.length() - 1;
        String newString = "";
        for (int i = 0; i <= end; i++) {
            newString += orignal.charAt(end - i);

        }
        System.out.println(newString);
    }
}
