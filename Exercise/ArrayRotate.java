package Exercise;

public class ArrayRotate {
    public static void main(String[] args) {
    int[] N = {2,1,3,7};
    int k = 1;
    while (k>0){
        if (N.length <= 1){
            System.out.println("Can not rotate the array elements with length 0 or 1");
        }
        int last = N[N.length - 1];
        for (int i = N.length - 1; i > 0; i--){
            N[i] = N[i-1];
        }
        N[0] = last;
        k -= 1;
    }
    for ( int num : N){
        System.out.println(num);
    }
}
}
