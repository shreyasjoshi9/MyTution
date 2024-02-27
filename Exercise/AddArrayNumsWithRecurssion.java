package Exercise;

public class AddArrayNumsWithRecurssion {
    public static void main(String[] args) {
    int[] A = {1, 2, -3, -4, 6};
    int ans = sumOfArrayElements(A, 0);
    System.out.println(ans);
    }
    public static int sumOfArrayElements(int[] array, int index){
        if (index >= array.length){
            return 0;
        }
        int ans = Math.abs(array[index]) + sumOfArrayElements(array, index+1);
        return ans;
    }
}
