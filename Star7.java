//  __*__
//  _*_*_
// _*_*_*_

public class Star7 {
    public static void main(String[] args) {
        int N = 3;
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
