import java.util.Scanner;

public class WhileAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        int avg = 0;
        int i = 0;
        while (i < size) {
            System.out.println("Please enter the value for the element: " + (i + 1));
            UserInput[i] = scanner.nextInt();
            avg += UserInput[i];
            i++;
        }
        System.out.println("Average of the array elements is: " + (avg / size));
        scanner.close();
    }
}
