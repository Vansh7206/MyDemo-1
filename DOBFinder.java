import java.util.Scanner;

public class DOBFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int date = 32;
        String month = "ABCD";
        int year = 0000;

        System.out.println("Enter name of person:");
        String enter = scanner.nextLine().toLowerCase();

        if (enter.contains("vansh")) {
            System.out.println("The Date of Birth is: " + date + " " + month + " " + year);
        } else {
            System.out.println("Sorry, we have no person with this name.");
            System.out.println("Please enter the details so that we can store the data. Type 'go' to proceed:");

            String proceed = scanner.nextLine().toLowerCase();
            if (proceed.equals("go")) {
                System.out.println("Enter name:");
                String newName = scanner.nextLine().toLowerCase();

                System.out.println("Enter date of birth (as a number):");
                int newDate = scanner.nextInt();
                scanner.nextLine(); 

                System.out.println("Enter month of birth:");
                String newMonth = scanner.nextLine();

                System.out.println("Enter year of birth:");
                int newYear = scanner.nextInt();
                scanner.nextLine();

                System.out.println("✅ Data Stored Successfully!");

                System.out.println("Enter name to retrieve stored birth date:");
                String checkName = scanner.nextLine().toLowerCase();

                if (checkName.equals(newName)) {
                    System.out.println("The Date of Birth is: " + newDate + " " + newMonth + " " + newYear);
                } else {
                    System.out.println("❌ Name not found in stored data.");
                }
            }
        }
    }
}
