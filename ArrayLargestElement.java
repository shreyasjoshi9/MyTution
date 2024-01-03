import java.util.Scanner;

public class ArrayLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the Array : ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        int max = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter the value for the element : " + (i + 1));
            UserInput[i] = scanner.nextInt();
            if (max < UserInput[i]) {
                max = UserInput[i];
            }
        }
        System.out.println("The largest number in the array is: " + max);
        scanner.close();
    }
}
