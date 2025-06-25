import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int[] num = {2,5,7,0};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int arr[]){
        arr[0] = 45;
        arr[1] = 49;
        arr[2] =56;
        arr[3] =32;



    }
}