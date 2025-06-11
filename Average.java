import java.util.Scanner;
public class Average{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the 5 Numbers");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int e=scanner.nextInt();

        int total=a+b+c+d+e;
        System.out.println("The total of these numbers is: "+total);

        int average= total/5;
        System.out.println("Average is: "+average);
        
    }

}
