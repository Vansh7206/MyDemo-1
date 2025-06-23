import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        boolean ans = isArmstrong(n);
        System.out.println(ans);
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum=0;

        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
      return sum == original;


    }
}