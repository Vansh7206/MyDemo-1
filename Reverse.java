import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        long num = scanner.nextLong();
        long ans = 0;

        while(num > 0){
            long rem = num % 10;
            ans = ans *10 + rem;
            num = num / 10;
        }
        System.out.println(ans);
    }
}