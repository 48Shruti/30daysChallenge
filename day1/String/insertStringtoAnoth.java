package day1.String;

public class insertStringtoAnoth {

    public static String insertString(String originalString, String insertString, int index) {
        String newString = new String();
        for (int i = 0; i < originalString.length(); i++) {
            newString += originalString.charAt(i);
            if (i == index) {
                newString += insertString;
            }
        }
        return newString;
    }

    public static void main(String[] args) {

        String originalString = " Dav institute enginerring";
        int index = 14;
        String insertString = "of ";
        System.out.println(insertString(originalString, insertString, index));
    }
}
