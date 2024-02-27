package Exercise;

public class StringReversal {
    public static void main(String[] args) {
    String A = "Shreyas";
    int length = A.length();
    char[] characters = new char[length];
    for (int i = 0; i < length; i++){
        characters[i] = A.charAt(length-i-1);
    }
    for (char b : characters){
    System.out.print(b);
    }
    }
}
