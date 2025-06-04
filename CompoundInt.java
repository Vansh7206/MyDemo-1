import java.util.Scanner;
public class CompoundInt{
//    Compound Interest Calculator program
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        double Amount;
        double principle;
        double rate;
        double years;
        double times;

        System.out.println("Enter the Principle");
        principle=scanner.nextDouble();

        System.out.println("Enter the Rate");
        rate=scanner.nextDouble();

        System.out.println("Enter the No. of years");
        years=scanner.nextDouble();

        System.out.println("Enter the times you want to Compound");
        times=scanner.nextDouble();

        Amount= principle * Math.pow(1+ rate / times, years * times);
        System.out.println(Amount);

    }
}