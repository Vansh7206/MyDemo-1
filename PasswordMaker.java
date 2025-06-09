import java.util.Random;
import java.util.Scanner;
public class PasswordMaker{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwzyz";
        String numbers = "0123456789";
        String chars = "*+-_=[]{}#@!$%^&";

        String all = upperCase + lowerCase + numbers + chars;

        System.out.println("Enter the length of passcode");
        int length = scanner.nextInt();

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for( int i=0;i<length;i++){
            int index = random.nextInt(all.length());
            password.append(all.charAt(index));
        }
        System.out.println("Generated Password : "+password.toString());
    }
}