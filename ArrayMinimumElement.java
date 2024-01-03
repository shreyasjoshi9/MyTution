import java.util.Scanner;

public class ArrayMinimumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the Array : ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        int value = 1;

        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter the value for the element : " + (i + 1));
            UserInput[i] = scanner.nextInt();
            value = UserInput[0];
            if (value > UserInput[i]) {
                value = UserInput[i];
            }
        }
        System.out.println("The minimum number in the array is: " + value);
        scanner.close();
    }
}
