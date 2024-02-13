//Print even number from 1-10 
public class WhilePrintEvenNums {
    public static void main(String[] args) {
        int N = 10;
        int i = 1;
        while (i <= N) {
            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            }
        }
    }
}