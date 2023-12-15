// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
public class ReverseStar {
    public static void main(String[] args) {
        int N = 5;
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
