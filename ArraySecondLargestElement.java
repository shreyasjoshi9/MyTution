import java.util.Arrays;
import java.util.Scanner;

public class ArraySecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the Array : ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        int temp;
        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter the value for the element : " + (i + 1));
            UserInput[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (UserInput[i] > UserInput[j]) {
                    temp = UserInput[i];
                    UserInput[i] = UserInput[j];
                    UserInput[j] = temp;
                }
            }
        }

        System.out.println("Second largest element : " + (UserInput[size - 2]));
    }
}
