import java.util.Scanner;
public class Hypo{
//    This is Hypotaneous program
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the side 1");
        double a=scanner.nextInt();

        System.out.println("Enter the side 2");
        double b=scanner.nextInt();

        double c;

        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The ans is " +c+ "cm");
    }
}