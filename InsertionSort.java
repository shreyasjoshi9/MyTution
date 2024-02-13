import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the size of the array.");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the value for the array element " + (i + 1) + " : ");
            UserInput[i] = scanner.nextInt();
        }
        scanner.close();
        Insertion_Sort(UserInput);
        for (int num : UserInput) {
            System.out.println(num);
        }
    }

    // arr = [5, 4, 2, 1, 3]
    public static void Insertion_Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = temp;
        }
    }
}
