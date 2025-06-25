import java.util.Arrays;
import java.util.Scanner;
public class Arrayss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        arr = new int[5];

        for (int i=0;i<arr.length;i++) {
            System.out.println("Enter the number");
            arr[i] = scanner.nextInt();

        }
            System.out.println("You have entered:");
//        for(int i=0;i<5;i++){
//            System.out.println(arr[i]); different Method
            System.out.println(Arrays.toString(arr));

        }

}