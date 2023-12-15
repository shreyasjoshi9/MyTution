//5. WAP to change the case of the string ? Example

//input: ABC output: abc 

//input :abc output: ABC
public class ChangeStringCase {
    public static void main(String[] args) {
        // String input = "ABC";
        String input = "abc";
        String output = "";

        if (input == input.toLowerCase()) {
            output = input.toUpperCase();
        } else if (input == input.toUpperCase()) {
            output = input.toLowerCase();
        }
        System.out.println("output: " + output);
    }

}
