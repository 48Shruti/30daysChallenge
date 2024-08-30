package dsa.loops.Easy;

public class armstrong {
    public static void main(String[] args) {
        int number = 371;
        int result = 0;
        int original = 0;
        int remainder = 0;
        original = number;
        while (original > 0) {
            remainder = original % 10;
            result += Math.pow(remainder, 3);
            original = original / 10;
        }
        if (result == number) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not armstrong number");
        }
    }
}
