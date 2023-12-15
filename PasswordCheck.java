//WAP to check if the password is valid. If the length of the password is less than 6 it should return invalid password.
//Password length.. should not be less than 6 
//It can be equal too or more than 6
public class PasswordCheck {
    public static void main(String[] args) {
        String pwd = "MyPassword";
        if (pwd.length() < 6) {
            System.out.println("Invalid Password. Length should be equal or more than 6 characters.");
        } else {
            System.out.println("Password Accepted");
        }
    }
}
