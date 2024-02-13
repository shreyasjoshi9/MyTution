import java.util.Scanner;

public class WhilePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for reversal.");
        int num = scanner.nextInt();
        int r = 0;
        int reverse = 0;
        int number = num;
        while (num > 0) {
            r = (num % 10);
            reverse = (reverse * 10) + r;
            num = num / 10;
        }
        if (reverse == number) {
            System.out.println("The number is palindrome.");
        } else {
            System.out.println("The number is not palindrome.");
        }
        scanner.close();

    }
}
