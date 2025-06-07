import java.util.Scanner;
public class Circle{
    // This is Circumference and Area program
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Radius");
        float r=scanner.nextFloat();

        double Circum= 2 * Math.PI * r;
        double Area= Math.PI * r * r;

        System.out.println("The Circumference of Circle is: " +Circum);
        System.out.println("The Area of Circle is: " +Area);
    }
}