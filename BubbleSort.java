import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array.");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        int temp = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the value for the array element" + (i + 1) + " : ");
            UserInput[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (UserInput[i] > UserInput[j]) {
                    temp = UserInput[j];
                    UserInput[j] = UserInput[i];
                    UserInput[i] = temp;
                }
            }
        }
        for (int num : UserInput) {
            System.out.println(num);
        }
        scanner.close();
    }
}
