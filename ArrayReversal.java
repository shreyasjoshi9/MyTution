import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the Array : ");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        int start = 0;
        int end = size - 1;
        int temp = 0;
        int[] reverse = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter the value for the element : " + (i + 1));
            UserInput[i] = scanner.nextInt();
        }
        while (start < end) {
            temp = UserInput[start];
            UserInput[start] = UserInput[end];
            UserInput[end] = temp;
            start += 1;
            end -= 1;
        }
        // Display the array elements
        System.out.println("Reversed array elements are:");
        for (int num : UserInput) {
            System.out.println(num + " ");
        }
    }
}