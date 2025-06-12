import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Abc";
        String Password = "@1234";
        double balance = 100000;

        while(true) {
            System.out.println("Enter the Name");
            String Ename = scanner.nextLine();

            System.out.println("Enter the Password");
            String Epass = scanner.nextLine();

            if (name.equals(Ename)) {
                if (Password.equals(Epass)) {
                    System.out.println("Correct Credentials Proceed Ahead.");
                }
            } else {
                System.out.println("Incorrect Credentials, try again later.");
                break;
            }

            System.out.println("Enter what you wanna proceed with(Deposit Money / Withdraw Money / Check Balance)");
            String options = scanner.nextLine();

            switch (options.toLowerCase()) {
                case "deposit":
                    System.out.println("Enter the Deposit Amount: ");
                    int deposit = scanner.nextInt();
                    balance = balance + deposit;
                    System.out.println("New Balance: " + balance);
                    break;

                case "withdraw":
                    System.out.println("Enter the Withdrawal Amount: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("New Balance: " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case "check balance":
                    System.out.println("Your Current Balance is: " + balance);
                    break;
            }
            break;
        }
    }
}