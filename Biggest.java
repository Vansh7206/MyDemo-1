import java.util.Scanner;
public class Biggest {
    // Biggest of 3 Numbers
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number");
        int a=scanner.nextInt();


        System.out.println("Enter the number");
        int b=scanner.nextInt();

        System.out.println("Enter the number");
        int c=scanner.nextInt();

        if(a>b && a>c){
            System.out.println("A is biggest and its value is " +a);
        }
        else if(b>a && b>c){
            System.out.println("B is biggest and its value is " +b);

        }
        else{
            System.out.println("C is biggest and its value is " +c);
            scanner.close();
        }
    }
}