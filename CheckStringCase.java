//Write a Program to check if the String is in Uppercase or lowercase ?
public class CheckStringCase {
    public static void main(String[] args) {
        String str = "";
        boolean lower = false;
        boolean upper = false;
        if (str == str.toLowerCase()) {
            lower = true;
        }
        if (str == str.toUpperCase()) {
            upper = true;
        }
        if (str.length() > 1) {
            if (lower == true && upper == true || lower == false && upper == false) {
                System.out.println("String is a mixture of uppercase and lowercase letters.");
            } else if (lower == false && upper == true) {
                System.out.println("String is uppercase.");
            } else if (lower == true && upper == false) {
                System.out.println("String is lowercase.");
            }
        } else {
            System.out.println("String is blank.");
        }
    }
}
