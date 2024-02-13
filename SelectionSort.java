import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array.");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the value for the array element" + (i + 1) + " : ");
            UserInput[i] = scanner.nextInt();
        }
        scanner.close();
        Selection_Sort(UserInput);
        for (int num : UserInput) {
            System.out.println(num);
        }
    }

    public static void Selection_Sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int min_value = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_value] > arr[j]) {
                    min_value = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min_value];
            arr[min_value] = temp;
        }

    }
}