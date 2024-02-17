package Exercise;
import java.util.Scanner;
public class Binary {
    public static void main(String[] args){
        //Get input from the User:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int N = scanner.nextInt();
        int longGap = 0;
        int currentGap = 0;
        boolean status = false;
        longGap = findGaps(N, longGap, currentGap, status);
        System.out.println(longGap);
        scanner.close();
    }
    public static String binary_coversion(int num){
        String binary_conversion = Integer.toBinaryString(num);
        return binary_conversion;
    }
    public static int findGaps(int num, int longGap, int currentGap, boolean status){
        String binary_conversion = Binary.binary_coversion(num);
        for (int i=0;i<binary_conversion.length();i++){
            if (binary_conversion.charAt(i) == '1'){
                if (status){
                    longGap = Math.max(longGap, currentGap);
                    currentGap = 0;
                }
                else {
                    status = true;
                }
            }
            else {
                if (status){
                    currentGap  += 1;
                }
            }
        }
        return longGap;
    }
}