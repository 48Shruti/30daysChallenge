package dsa.loops.Easy;

public class vowelandConst {
    static void vowel(char a1) {
        if (a1 == 'a' || a1 == 'e' || a1 == 'o' || a1 == 'i' || a1 == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        char ch = 't';
        vowel(ch);

    }
}
