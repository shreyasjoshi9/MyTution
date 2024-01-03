// - **Write a Java program to count occurrences of each element in an array?**

//     for eg a= [1,2,3,3,2,4,5]   output = (1=1, 2=2, 3=2, 4=1, 5=1)

import java.util.Scanner;

public class ArrayOccurances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the value for the array element: " + (i + 1) + " :");
            UserInput[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            count = 1;
            for (int j = i + 1; j < size; j++) {
                if (UserInput[i] == UserInput[j]) {
                    count += 1;
                }
            }
            System.out.println("Occurance of '" + UserInput[i] + "' is " + count + " times. ");
        }
        scanner.close();
    }
}