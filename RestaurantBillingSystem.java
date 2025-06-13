import java.util.Scanner;
public class RestaurantBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pizzaPrice = 99, burgerPrice = 69, pastaPrice = 89, sandwhichPrice = 109, chickenPrice = 129;
        int bill1=0, bill2=0, bill3=0, bill4=0, bill5=0;
        int quan;

        System.out.println("🧸❤️ Welcome to VAMA'S Restaurant");
        System.out.println("Here's our Menu:");
        System.out.println("🍕 Pizza @99");
        System.out.println("🍔 Burger @69");
        System.out.println("🍝 Pasta @89");
        System.out.println("🥪 Sandwich @109");
        System.out.println("🍗 Chicken @129");

        while(true) {
            System.out.println("Please tell us what would you like to have? Type (Done) once you finish");
            String food = scanner.nextLine().toLowerCase();

            if (food.contains("done")) {
                break;
            }
            if (food.contains("pizza")) {
                System.out.println("\uD83C\uDF55 Wow that's our Best Seller, Please enter the quantity:");
                quan = scanner.nextInt();
                scanner.nextLine();
                bill1 = bill1 + quan * pizzaPrice;
            } else if (food.contains("burger")) {
                System.out.println("\uD83C\uDF54 Thats the juciest thing in our menu, Please enter the quantity:");
                quan = scanner.nextInt();
                scanner.nextLine();
                bill2 = bill2 + quan * burgerPrice;
            } else if (food.contains("pasta")) {
                System.out.println("\uD83C\uDF5D Nice choice seems like someone wants Aroma of Italy, Please enter the quantity:");
                quan = scanner.nextInt();
                scanner.nextLine();
                bill3 = bill3 + quan * pastaPrice;
            } else if (food.contains("sandwhich")) {
                System.out.println("\uD83E\uDD6A Seems like someone is on Diet, Please enter the quantity:");
                quan = scanner.nextInt();
                scanner.nextLine();
                bill4 = bill4 + quan * sandwhichPrice;
            } else if (food.contains("chicken")) {
                System.out.println("\uD83C\uDF57 Awesome choice, Please enter the quantity:");
                quan = scanner.nextInt();
                scanner.nextLine();
                bill5 = bill5 + quan * chickenPrice;
            } else {
                System.out.println("Sorry! We dont have this on our Menu 😕");
            }
        }
            int total = bill1 + bill2 + bill3 + bill4 + bill5;
            System.out.println("🧾 Your Total bill is :" +total);
            System.out.println("🙏 Thank you for visiting VAMA'S Restaurant!");
        }

}