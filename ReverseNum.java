//WAP to display the reverse of a Number : for eg 123 output is 321 
public class ReverseNum {
    public static void main(String[] args) {
        int N = 123;
        int reverse = 0;
        int r = 0;
        while (N > 0) {
            r = N % 10;
            reverse = (reverse * 10) + r;
            N = N / 10;
        }
        System.out.println(reverse);
    }

}
