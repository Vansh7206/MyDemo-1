public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {10,3,6,9,45};
        System.out.println(max(arr));

    }
    static int max(int[] arr){
        int minv1 = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < minv1){
                minv1 = arr[i];
            }
        }
        return minv1;
    }
}