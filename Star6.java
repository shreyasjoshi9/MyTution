// # 54321
// # 5432*
// # 543**
// # 54***
// # *****

public class Star6 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
    }
}