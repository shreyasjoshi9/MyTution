package Exercise;

public class Arm {
    public static void main(String[] args) {
        int N = 0;
        int length = Integer.toString(N).length();
        int og_n = N;
        int digit = 0;
        int sum = 0;
        while (og_n != 0){
            digit = og_n%10;
            sum += Math.pow(digit, length);
            og_n /= 10;
        }
        if (N==0){
            System.out.println("Armstrong");
            System.exit(N);
        }
        if (sum==N){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}