//    * * * *
//    * * *
//    * *
//    * 
public class Star3 {
    public static void main(String[] args) {
        int N = 4;
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
