public class Swap {
    // Swapping using Method and Function
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int temp =0;
        swap(a,b);
    }
    static void swap(int a, int b){
        int temp = a;
        a= b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}