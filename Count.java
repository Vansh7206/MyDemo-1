import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = scanner.nextInt();

        int count = 0;
         while(num > 0){
             int rem = num % 10;
             if(rem == 8){
                 count++;
             }
             num = num / 10;
         }
        System.out.println(count);
    }
}