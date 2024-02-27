//Write a Java program to generate the Fibonacci series up to N terms, where N is taken as user input 1 1 2 3 5 8 13 
public class Fibonacci {
    public static void main(String[] args) {
        int N = 6;
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 1; i <= N - 1; i++) {
            n3 = n1 + n2;
            if (n3<=N){
            System.out.println(n3);
            }
            n1 = n2;
            n2 = n3;
        }
    }
}
// n1 =1 n2=1