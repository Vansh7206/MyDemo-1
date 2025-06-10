import java.util.Scanner;
public class Count{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int a = scanner.nextInt();
        int count = 0;

        while(a > 0){
            int rem = a % 10;

            if(rem == 5){
                count++;
            }
            a = a / 10;
        }
        System.out.println(count);
    }
}