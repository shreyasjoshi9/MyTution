// 1. Write a Java program that takes three numbers from the user and prints the greatest number.

// Test Data*

// Input the 1st number: 25

// Input the 2nd number: 78

// Input the 3rd number: 87

// *Expected Output* :

// The greatest: 87
public class GreatestNum {
    public static void main(String[] args) {
        int a = 25;
        int b = 78;
        int c = 87;
        int greatest = 0;
        greatest = a;
        if (b > greatest) {
            greatest = b;
        }
        if (c > greatest) {
            greatest = c;
        }
        System.out.println("The greatest : " + greatest);

    }

}