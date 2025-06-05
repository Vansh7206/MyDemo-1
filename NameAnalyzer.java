import java.util.Scanner;
public class NameAnalyzer{
//    NameAnalyzer Program
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full Name");
        String name=scanner.nextLine();
        String[] nameParts = name.split(" ");

        if(nameParts.length >=3){
            System.out.println("Your First name is: " +nameParts[0]);
        }else{
            System.out.println("You have entered wrong name");
        }

        if(nameParts.length >=3){
            System.out.println("Your middle name is: " +nameParts[1]);
        }else{
            System.out.println("You have entered wrong name");
        }
        if(nameParts.length >=3){
            System.out.println("Your Last name is: " +nameParts[2]);
        }else{
            System.out.println("You have entered wrong name");
        }


    }
}
