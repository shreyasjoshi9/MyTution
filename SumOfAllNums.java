//WAP to calculate the sum of numbers from 1 to N using a for loop, where N is taken as user input.

public class SumOfAllNums {
    public static void main(String[] args) {
        int N = 20;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

}
