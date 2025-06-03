import java.util.Scanner;
public class Main {
    // This is basic example
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your favourite food");
        String food = scanner.nextLine();

        System.out.println("Enter your CGPA");
        double cgpa = scanner.nextDouble();

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your favourite food is: " + food);
        System.out.println("You have got " + cgpa + " cgpa");

        scanner.close();
    }
}

