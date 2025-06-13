import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random num = new Random();

        int b = num.nextInt(1,10);
        int guess;
        int chance = 3;

        System.out.println("THe Game is Simple if you win you get 500$ else you lose everything");
        System.out.println("You have " +chance+ " tries");

        for(int i=1;i<=chance;i++) {
            System.out.println("Attempt " +i+ ":");
            guess = scanner.nextInt();

            if(guess==b){
                System.out.println("Hurray you win");
            }else{
                System.out.println("Wrong Guess");
                if(i < chance){
                    if(guess < b){
                        System.out.println("Try higher");
                    }else{
                        System.out.println("Try Lower");
                    }

                }
            }
        }
        System.out.println("The number is: "+b);
    }
}
