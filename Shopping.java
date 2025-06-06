import java.util.Scanner;
public class Shopping{
    // This is shopping cart Example
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the food item");
        String food=scanner.nextLine();

        System.out.println("Enter the quantity");
        int quan=scanner.nextInt();

        System.out.println("Enter the price");
        int price=scanner.nextInt();
        int bill=quan*price;

        System.out.println("You have purchased " +food+ " The no. of units are " +quan+ " Quantity. Price of each is:" +price+ "$.");
        System.out.println("Your total bill is: "+bill+ "$.");
        scanner.close();
    }
}