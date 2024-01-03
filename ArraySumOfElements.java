import java.util.Scanner;

public class ArraySumOfElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Prompting user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter Element: " + (i + 1));
            UserInput[i] = scanner.nextInt();
            sum = sum + UserInput[i];
        }
        System.out.println("Total sum of the array elements: " + sum);
        System.out.println("Average of the Array elements: " + (sum / size));
    }

}
