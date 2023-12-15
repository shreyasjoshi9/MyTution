//Write a Java program to check whether a given number is an Armstrong number or not. Use a while loop for digit extraction and manipulation.
public class Armstrong {
    public static void main(String[] args) {
        int N = 153;
        int sum = 0;
        String l = Integer.toString(N);
        int length = l.length();
        int original_number = N;
        original_number = N; // Reset originalNumber to the input value
        while (original_number != 0) {
            int digit = original_number % 10;
            sum += Math.pow(digit, length);
            original_number /= 10;
        }
        if (sum == N) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");

        }
    }

}
