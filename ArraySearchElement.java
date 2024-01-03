
//Search the position of the given element in an array
import java.util.Scanner;

public class ArraySearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the Array : ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter the value for the element : " + (i + 1));
            UserInput[i] = scanner.nextInt();
        }
        // Display the array elements
        System.out.println("Array elements are:");
        for (int num : UserInput) {
            System.out.println(num + " ");
        }
        System.out.println("Enter the element to find its position: ");
        int ele = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (UserInput[i] == ele) {
                System.out.println("Position of the element is : " + i);
            }
        }
    }

}