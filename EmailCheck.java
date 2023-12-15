//WAP to check if the email entered is correct. If the email address has ‘@’ and '.', then it is correct, if not then display invalid.

public class EmailCheck {
    public static void main(String[] args) {
        String email = "shreyas.joshi9@gmail.com";
        if (email.contains("@") && email.contains(".")) {
            System.out.println("Email Address is Valid.");
        } else {
            System.out.println("Email Address is Invalid.");
        }
    }
}