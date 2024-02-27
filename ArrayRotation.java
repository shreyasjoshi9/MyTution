

// The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

// Write a function:

// class Solution { public int[] solution(int[] A, int K); }

// that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

// For example, given

//     A = [3, 8, 9, 7, 6]
//     K = 3
// the function should return [9, 7, 6, 3, 8]. Three rotations were made:

//     [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
//     [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
//     [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
// For another example, given

//     A = [0, 0, 0]
//     K = 1
// the function should return [0, 0, 0]

// Given

//     A = [1, 2, 3, 4]
//     K = 4
// the function should return [1, 2, 3, 4]

// Assume that:

// N and K are integers within the range [0..100];
// each element of array A is an integer within the range [−1,000..1,000].
// In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
public class ArrayRotation {
    public static void main(String[] args) {
        int k = 3;
        int [] arr = {4,2,1,5,7,6};
        while (k > 0){
        if (arr.length <= 1) {
            // Nothing to rotate for arrays with 0 or 1 element
            return;
        }

        int lastElement = arr[arr.length - 1];

        // Shift elements to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        k -= 1;
        // Move the last element to the first position
        arr[0] = lastElement;
    }
for (int num : arr){
System.out.println(num);
}
    }
}