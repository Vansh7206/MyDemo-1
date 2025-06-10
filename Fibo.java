import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while(n >= count){
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println(b);
    }
}