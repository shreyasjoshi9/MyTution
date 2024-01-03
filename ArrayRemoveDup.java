//Write a Java program to remove duplicate elements from an array?

import java.util.Scanner;

public class ArrayRemoveDup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the value for the array element: " + (i + 1) + " :");
            UserInput[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (UserInput[i] == UserInput[j]) {
                    UserInput[i] = 00;
                }
            }
        }
        System.out.println("Array elements after removal of duplicate items.");
        for (int num : UserInput) {
            if (num != 00) {
                System.out.println(num + " ");
            }
        }
        scanner.close();
    }
}