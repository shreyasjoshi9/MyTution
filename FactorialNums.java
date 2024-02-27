//WAP Factorial Calculation: Create a Java program to find the factorial of a given number using while loop. (3! = 3 * 2 * 1)
public class FactorialNums {
    public static void main(String[] args) {
        int N = 3;
        int sum = 1;
        for (int i = 1; i <= N; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}