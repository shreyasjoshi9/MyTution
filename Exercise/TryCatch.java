package Exercise;

public class TryCatch {
    public static void main(String[] args) {
        try{
            int a = 1/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
