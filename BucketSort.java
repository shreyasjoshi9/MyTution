// import java.util.Scanner;
import java.lang.Math;

public class BucketSort {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Please Enter the size of the array.");
        // int size = scanner.nextInt();
        // int[] UserInput = new int[size];
        // for (int i = 0; i < size; i++) {
        // System.out.println("Please enter the value for the array element " + (i + 1)
        // + " : ");
        // UserInput[i] = scanner.nextInt();
        // }
        // scanner.close();
        int[] UserInput = new int[] { 4, 2, 6, 5, 9, 11, 10 };
        Bucket_Sort(UserInput);
        for (int num : UserInput) {
            System.out.println(num);
        }
    }

    public static void Bucket_Sort(int[] arr) {
        // find number of buckets needed w.r.t the array length
        int numberOfBuckets = (int) Math.round(Math.sqrt(arr.length));
        double AppropriateBucket = 0;
        for (int i = 0; i < arr.length; i++) {
            AppropriateBucket = Math.ceil(arr[i] * numberOfBuckets / arr.length);
            arr[(int) Math.ceil(AppropriateBucket)] = arr[i];
        }
    }
}
