package day1.String;

public class replaceCharAtIndex {
    public static void main(String[] args) {
        String str = "Electrinic Engineering";
        char ch = 'o';
        int index = 6;
        System.out.println("original String -> " + str);
        str = str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println("modified String -> " + str);

        // use of substring
        // System.out.println(str.substring(index)); // result : inic Engineering
        // System.out.println(str.substring(0, index)); // result : Electr
    }
}
