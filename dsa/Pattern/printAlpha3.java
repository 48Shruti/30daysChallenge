package dsa.Pattern;

public class printAlpha3 {
    public static void main(String[] args) {
        int ch = 65;
        int n = 5;
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print((char) (ch - 1 + j));
            }
            System.out.println();
        }
    }
}
