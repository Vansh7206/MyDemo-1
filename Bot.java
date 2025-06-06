import java.util.Scanner;
public class Bot{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        while(true){
            System.out.println("You: ");
            String input = scanner.nextLine().toLowerCase();

            if(input.contains("hi")){
                System.out.println("Bot: Hello");
            }else if(input.contains("hello")) {
                System.out.println("Bot: Hello, how may I help you");
            }else if(input.contains("how's the weather")){
                System.out.println("Bot: The weather is pleasent");
            }else if(input.contains("What is 2+2")){
                System.out.println("Bot: The answer is 4");}
            else{
            System.out.println("Bot: bye");
            break;
        }
        }
    }
}