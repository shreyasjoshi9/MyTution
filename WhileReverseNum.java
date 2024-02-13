//find the reverse of a num

import java.util.Scanner;

public class WhileReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for reversal.");
        int num = scanner.nextInt();
        int r = 0;
        int reverse = 0;
        while (num > 0) {
            r = (num % 10);
            reverse = (reverse * 10) + r;
            num = num / 10;
        }
        System.out.println(reverse);
        scanner.close();
    }
}