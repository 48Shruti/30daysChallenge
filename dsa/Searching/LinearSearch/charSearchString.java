package dsa.Searching.LinearSearch;

/**
 * charSearchString
 */
public class charSearchString {
    static void search(char tar, String name) {
        char[] n1 = name.toCharArray();
        for (int i = 0; i < n1.length; i++) {
            if (tar == n1[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        String name = "shruti";
        char tar = 'u';

        search(tar, name);
    }
}