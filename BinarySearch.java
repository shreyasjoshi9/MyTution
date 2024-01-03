import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the value for the element " + (i + 1) + " : ");
            UserInput[i] = scanner.nextInt();
        }
        System.out.println("Please enter the value to be searched in the array.");
        int val = scanner.nextInt();
        scanner.close();
        int start = 0;
        int end = UserInput.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (UserInput[mid] == val) {
                System.out.println("Element found at index: " + mid);
                return; // Exit the program after finding the element
            } else if (UserInput[mid] < val) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Element not found in the array.");
    }
}