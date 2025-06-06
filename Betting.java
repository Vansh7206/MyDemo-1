
import java.util.Random;
import java.util.Scanner;
public class Betting{
    // This is Betting Game
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random number=new Random();
        System.out.println("The Game is Simple, if you win you get 500$ else you lose everything");
        System.out.println("Enter the number");
        int a=scanner.nextInt();

        System.out.println("The number is:"+a);

        System.out.println("The number chosen by System is:");
        int b=number.nextInt(1,5);

        System.out.println(b);
        if(a==b){
            System.out.println("You want 500$");
        }else{
            System.out.println("Sorry you lost");
        }
    }
}
