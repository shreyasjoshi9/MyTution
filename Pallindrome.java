//Create a Java program to check whether a given number is a palindrome or not. Use a while loop and for loop for the comparison.
public class Pallindrome {
    public static void main(String[] args) {
        int pal = 121;
        int second_value = pal;
        int r = 0;
        int reverse = 0;
        while (pal > 0) {
            r = pal % 10;
            reverse = (reverse * 10) + r;
            pal = pal / 10;
        }
        if (reverse == second_value) {
            System.out.println("Given number is palindrome.");
        }
    }
}