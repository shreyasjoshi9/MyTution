package Exercise;

public class Arm {
    public static void main(String[] args) {
    int N = 153;
    int sum = 0;
    String num = Integer.toString(N);
    int length = num.length();
    int og_num = N;
    while (og_num != 0){
        int digit = og_num%10;
        sum += Math.pow(digit, length);
        og_num /= 10;
    }
    if (sum == N) {
        System.out.println("Armstrong");
    } else {
        System.out.println("Not Armstrong");

    }
}
}