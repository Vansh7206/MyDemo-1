import java.util.Scanner;
public class Swapping{
    // This is swapping of two numbers
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first number");
        int a=scanner.nextInt();

        System.out.println("Enter second number");
        int b=scanner.nextInt();

        System.out.println("Before swapping A:" +a);
        System.out.println("Before swapping B:" +b);

        int c;
        c=a;
        a=b;
        b=c;

        System.out.println("After swapping A:" +a);
        System.out.println("After swapping B:" +b);
        scanner.close();
    }
}