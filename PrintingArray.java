import java.util.Scanner;
public class PrintingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 9 numbers to make an array");
        int[][] arr = new int[3][3];

        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                arr[row][col] = scanner.nextInt();
            }
        }
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
            }
    }
}