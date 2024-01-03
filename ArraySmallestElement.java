//Write a Java program to find smallest and second smallest element in an integer array

import java.util.Scanner;

public class ArraySmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the Array : ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        int value = 1;
        int temp;
        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter the value for the element : " + (i + 1));
            UserInput[i] = scanner.nextInt();
            value = UserInput[0];
            if (value > UserInput[i]) {
                value = UserInput[i];
            }
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
        System.out.println("The minimum number in the array is: " + value);
        System.out.println("The second minimum number in the array is: " + UserInput[1]);
        scanner.close();
    }

}
