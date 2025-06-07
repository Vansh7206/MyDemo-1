import java.util.Random;
import java.util.Scanner;
public class OTP{
    // This is otp program
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random number= new Random();

        System.out.println("Enter the Phone Number");
        double a=scanner.nextDouble();

        System.out.println("Your OTP is :");
        int b=number.nextInt(1000,9999);

        System.out.println(b);
    }
}