// Implement a Java program to calculate the sum of digits of a given number using a while loop.
public class SumOfDigits {
    public static void main(String[] args) {
        int N = 546;
        int sum = 0;
        int original_number = N;
        while (original_number != 0) {
            int r = original_number % 10;
            sum += r;
            original_number = original_number / 10;
        }
        System.out.println(sum);

    }
}
