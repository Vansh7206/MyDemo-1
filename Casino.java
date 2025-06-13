import java.util.Scanner;
import java.util.Random;
public class Casino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random num = new Random();
        int b = num.nextInt(1,2);

        String name = "Vansh";
        String passcode = "7206";
        int balance = 5000;
        int amount=0;
        while (true) {

            System.out.println("Enter your name");
            String ename = scanner.nextLine();

            System.out.println("Enter Password");
            String epasscode = scanner.nextLine();

            if (name.equals(ename) && passcode.equals(epasscode)) {
                System.out.println("Welcome to Casino Night, your balance is: " + balance);

            } else {
                System.out.println("Get out");
                break;
            }
            System.out.println("Game is Simple you have to invest 500 to play");
            System.out.println("If you win you get 1000 else you lose everything");

            System.out.println("Type play to continue");
            String typed = scanner.nextLine().toLowerCase();

            if(typed.contains("play")){
                System.out.println("Type a number");
                int a = scanner.nextInt();
                if(a==b){
                    System.out.println("Hurray you won");
                    amount = amount + balance + 1000;
                    System.out.println("You won 500, Your balance is:" +amount);
                    break;
                }else{
                    System.out.println("You lose, the number is: "+b);
                    amount = amount +balance -500;
                    System.out.println("Your balance is: " +amount);
                    break;
                }
            }
        }
    }
}