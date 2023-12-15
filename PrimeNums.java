//WAP to find all the prime numbers between 0-30.
public class PrimeNums {
    public static void main(String[] args) {
        int N = 30;
        int count = 0;
        for (int i = 1; i <= N; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);

            }
        }

    }

}
