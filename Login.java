import java.util.Scanner;
public class Login{
    public static void main(String[] args){
//        This is Login form credentials program
        Scanner scanner=new Scanner(System.in);
        String name= "Vansh";
        int age=19;
        String password="Vansh7206";

        System.out.println("Enter your name");
        String names=scanner.nextLine();

        System.out.println("Enter your age");
        int ages=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your passcode");
        String passcode=scanner.nextLine();

        if(name.equals(names)){
            if (age==ages){
                if(password.equals(passcode)) {
                    System.out.println("Your credentials are correct");

                }else{
                        System.out.println("Incorrect Passcode");
                    }
                }else{
                        System.out.println("Incorrect age");
            }
                    }else {
                System.out.println("Incorrect Name");
        }
        scanner.close();

        }

}