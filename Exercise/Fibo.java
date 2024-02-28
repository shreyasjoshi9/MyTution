package Exercise;

public class Fibo {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        System.out.println(n1);
        System.out.println(n2);
        int given = 30;
        for(int i = 0; i<given; i++){
            n3=n1+n2;
            if(n3<=given){
                System.out.println(n3);
            }
            else{
                System.out.println("GIven limit "+given+" reached!");
                break;
            }
            n1 = n2;
            n2 = n3;
        }
    }
}