// - WAP find all pairs of elements in an integer array whose sum is equal to a given number?

//     for eg a = [1,2,3,4,5,6,7,8]   sum = 5   pair of numbers is 2,3  & 4,1

import java.util.Scanner;

public class ArraySumOfTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please state the size of the array.");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the value for array element " + (i + 1) + ":");
            UserInput[i] = scanner.nextInt();
        }
        System.out.println("Please state the expected sum of the elements.");
        int sum = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (UserInput[i] + UserInput[j] == sum) {
                    System.out.println("Elements (" + UserInput[i] + " , " + UserInput[j]
                            + ") from the array contribute to the given sum: " + sum);
                }
            }
        }
    }

}
