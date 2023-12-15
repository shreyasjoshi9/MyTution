//Develop a Java program to print the multiplication table of a given number using a for loop.
public class Multiplication {
    public static void main(String[] args) {
        int N = 2;
        int table = 1;
        for (int i = 1; i <= 10; i++) {
            table = i * N;
            System.out.println(i + " X " + N + " = " + table);
        }
    }
}
