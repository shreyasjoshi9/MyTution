package Exercise;

public class AddArrayNumsWithoutRecussion {
    public static void main(String[] args) {
        int[] A = {1, 2, -3, -4, 6};
        int sum = 0;
        for (int i = 0; i < A.length; i++){
            sum += Math.abs(A[i]);
        }
        System.out.println(sum);
    }
}
