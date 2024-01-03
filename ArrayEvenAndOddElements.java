//Count and display the number of even and odd elements in an array

import java.util.Scanner;

public class ArrayEvenAndOddElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the Array : ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        int even_count = 0;
        int odd_count = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter the value for the element : " + (i + 1));
            UserInput[i] = scanner.nextInt();
            if (UserInput[i] % 2 == 0) {
                even_count += 1;
            } else {
                odd_count += 1;
            }
        }
        // Display the array elements
        System.out.println("Array elements are:");
        for (int num : UserInput) {
            System.out.println(num + " ");
        }
        System.out.println("Even array elements are: " + even_count);
        System.out.println("Odd array elements are: " + odd_count);
        scanner.close();
    }
}