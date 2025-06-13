import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\uD83E\uDDF8❤\uFE0F Welcome to VAMA'S Restaurant");
        System.out.println("Here's our Menu: ");
        System.out.println("\uD83C\uDF55 Pizza @99");
        System.out.println("\uD83E\uDDFE Burger @69");
        System.out.println("\uD83C\uDF54 Pasta @129");
        System.out.println("\uD83E\uDD6A Sandwhich @79");
        System.out.println("\uD83C\uDF57 Chicken @149");
        

        System.out.println("What you would like to have?");
        String food = scanner.nextLine().toLowerCase();
        int quan;
        int price;
        int bill;

        switch (food) {
            case "pizza":
                System.out.println("\uD83C\uDF55 Wow that's our Best Seller, Please enter the quantity:");
                quan = scanner.nextInt();
                price = 99;
                bill = price * quan;
                System.out.println("\uD83E\uDDFE The bill is: " + bill+ "$");
                break;
            case "burger":
                System.out.println("\uD83C\uDF54 Thats the juciest thing in our menu, Please enter the quantity:");
                quan = scanner.nextInt();
                price = 69;
                bill = price * quan;
                System.out.println("\uD83E\uDDFE The bill is: " + bill+ "$");
                break;
            case "pasta":
                System.out.println("\uD83C\uDF5D Nice choice seems like someone wants Aroma of Italy, Please enter the quantity:");
                quan = scanner.nextInt();
                price = 129;
                bill = price * quan;
                System.out.println("\uD83E\uDDFE The bill is: " + bill+ "$");
                break;
            case "sandwhich":
                System.out.println("\uD83E\uDD6A Seems like someone is on Diet, Please enter the quantity:");
                quan = scanner.nextInt();
                price = 79;
                bill = price * quan;
                System.out.println("\uD83E\uDDFE The bill is: " + bill + "$");
                break;
            case "chicken":
                System.out.println("\uD83C\uDF57 Awesome choice, Please enter the quantity:");
                quan = scanner.nextInt();
                price = 149;
                bill = price * quan;
                System.out.println("\uD83E\uDDFE The bill is: " + bill + "$");
                break;
            default:
                System.out.println("\uD83D\uDE14 Not on our Menu Sorry");

        }
        }
    }

