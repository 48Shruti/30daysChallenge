package dsa.Pattern;

public class reciRightAngle {
    /*
     *****
     ****
     ***
     **
     *
     */
    public static void main(String[] args) {
        int j = 0;
        for (int i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
