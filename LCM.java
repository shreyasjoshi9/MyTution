//Implement a Java program to find the prime factors of a given number using a for loop.
public class LCM {
    public static void main(String[] args) {
        int N = 24;
        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N = N / i;
            }
        }
    }
}