// - **Write a Java program to find the intersection of two arrays?**

//     for eg a = [1,2,3,4,5]  b = [ 3,4,5,6,7]  output = [3,4,5]

import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the arrays: ");
        int size = scanner.nextInt();
        int[] UserInput1 = new int[size];
        int[] UserInput2 = new int[size];
        int[] UserInput3 = new int[size + size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the value for the first array element: " + (i + 1) + " :");
            UserInput1[i] = scanner.nextInt();
            System.out.println("Please enter the value for the second array element: " + (i + 1) + " :");
            UserInput2[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int j = 0;
            while (j < size) {
                if (UserInput1[i] == UserInput2[j]) {
                    UserInput3[i] = UserInput1[i];

                }
                j += 1;
            }
        }

        System.out.println("Intersecting elements are: ");
        for (int num : UserInput3) {
            if (num != 0) {
                System.out.println(num + " ");
            }
        }
        scanner.close();
    }
}
