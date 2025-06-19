import java.util.Scanner;
public class ADDSUB {
    // Function and method in java for addition and subtraction
    public static void main(String[] args) {
    sum();
    sub();
    }

     static void sub() {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter first number");
         int a = scanner.nextInt();
         System.out.println("Enter second number");
         int b = scanner.nextInt();
         int sub = a-b;
         System.out.println(sub);

    }

    static void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}