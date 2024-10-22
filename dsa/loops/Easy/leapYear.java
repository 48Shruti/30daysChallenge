package dsa.loops.Easy;

public class leapYear {
    public static void main(String[] args) {
        int y = 2025;
        if (y % 4 == 0) {
            System.out.println("leap year");
            if (y % 100 == 0) { // century year will be leap or not leap year
                if (y % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("non leap year");
                }
            }
        } else {
            System.out.println("non leap year");
        }
    }
}
