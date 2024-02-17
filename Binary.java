

// For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

// Write a function:

// class Solution { public int solution(int N); }

// that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

// For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

// Write an efficient algorithm for the following assumptions:

// N is an integer within the range [1..2,147,483,647]
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number");
    int N = scanner.nextInt();
    //convert given number to binary form
    String bin = Integer.toBinaryString(N);
    System.out.println(bin);
    //iterate through the binary form to find gaps
    int longGap = 0;
    int currentGap = 0;
    boolean status = false;
    for (int i=0;i<bin.length();i++){
        if (bin.charAt(i) == '1'){
            if (status){
                longGap = Math.max(longGap, currentGap);
                currentGap = 0;
            }
            else{
                status = true;
            }
        }
        else{
            if (status){
                currentGap +=1;
            }
        }

    }
    System.out.println(longGap);
    scanner.close();
}
}
