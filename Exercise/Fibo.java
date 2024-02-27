package Exercise;

public class Fibo {
    public static void main(String[] args) {
        int num = 24;
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        System.out.println(n1);
        System.out.println(n2);
        for (int i=1;i<=num-1;i++){
            n3 = n1 + n2;
            if (n3<=num){
                System.out.println(n3);
                }
            n1 = n2;
            n2 = n3;
        }
    }
}
