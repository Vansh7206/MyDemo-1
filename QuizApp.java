import java.util.Scanner;

public class QuizApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {"1. What is 5*4?\n a)15\n b)20\n c)35\n d)100\n" ,"2. What is capital of India?\n a)Mumbai\n b)Banglore\n c)Delhi\n d)Kolkata\n" , "3. What is called pink city of india?\n a)Jaipur\n b)Mohali\n c)Rajkot\n d)Mumbai\n"};

        char[] answers = {'B' , 'C' , 'A'};
        int score=0;

        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            System.out.println("Your Answer: ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            if(userAnswer == answers[i]){
                System.out.println("✅Your Answer is correct\n");
                score++;

            }else{
                System.out.println("❌ Incorrect! The Correct Answer is " +answers[i] +"\n");
            }
        }
        System.out.println("\uD83C\uDF89 Your score is: " +score+ "/" + questions.length);
        scanner.close();

    }
}