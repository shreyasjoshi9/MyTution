//WAP to check if the 2 arrays are equal.. ? for e.g. array is equal if a= [1,2,3] b= [1,2,3] 

import java.util.Scanner;

public class ArrayEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the Arrays : ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        int[] SecondUserInput = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("For the first Array, please Enter the value for the element : " + (i + 1));
            UserInput[i] = scanner.nextInt();
        }
        for (int j = 0; j < size; j++) {
            System.out.println("For the second Array, please Enter the value for the element : " + (j + 1));
            SecondUserInput[j] = scanner.nextInt();
        }
        while (count < size) {
            if (UserInput[count] == SecondUserInput[count]) {
                count += 1;
            } else {
                System.out.println("Arrays are not equal");
            }
        }
        if (count == size) {
            System.out.println("Arrays are equal");
        }
    }
}
