
//Count Occurrences of an Element in Array
import java.util.Scanner;

public class ArrayOccuranceOfElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the Array : ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        int occ = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter the value for the element : " + (i + 1));
            UserInput[i] = scanner.nextInt();
        }
        // Display the array elements
        System.out.println("Array elements are:");
        for (int num : UserInput) {
            System.out.println(num + " ");
        }
        System.out.println("Enter the element to count its occurence: ");
        int ele = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (UserInput[i] == ele) {
                occ += 1;
            }
        }
        System.out.println("The element " + ele + " has occurred " + occ + " times in the array.");
    }

}
