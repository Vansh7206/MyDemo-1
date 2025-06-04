import java.util.Scanner;
public class ReportCard{
//    This is Report Card Program
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Maths marks");
        float math=scanner.nextFloat();

        System.out.println("Enter the English marks");
        float english=scanner.nextFloat();

        System.out.println("Enter the Hindi marks");
        float hindi=scanner.nextFloat();

        System.out.println("Enter the Science marks");
        float science=scanner.nextFloat();

        System.out.println("Enter the Social Science marks");
        float ss=scanner.nextFloat();

        System.out.println("Enter the Computer marks");
        float computer=scanner.nextFloat();

        float total = math + english + hindi + science + ss + computer;
        System.out.println("Your Total is: "+total);

        float percentage = total/600 * 100;
        System.out.println("You have got " +percentage+ "%");

          if(percentage>90){
              System.out.println("Topper");
          }else if(percentage>80){
            System.out.println("Distinction");
        }else if(percentage>70){
              System.out.println("Good");
          }else if(percentage>60){
              System.out.println("Can do better");
          }else if(percentage>50){
              System.out.println("Requires Improvement");
          }else if(percentage>40){
              System.out.println("Just Pass");
          }else{
              System.out.println("Fail");
          }

    }
}