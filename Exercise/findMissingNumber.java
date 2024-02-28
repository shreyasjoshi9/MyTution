package Exercise;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,6};
        //find max number in array
        int max = 0;
        for (int num : a){
            if (num > max){
                max = num;
            }
        }
        int total = (max *(max+1)/2);
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum += a[i];
        }
        int missing = total - sum;
        System.out.println("Missing element is: "+missing);
    
    }
}
