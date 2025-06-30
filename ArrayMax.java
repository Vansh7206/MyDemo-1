public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {1,3,6,9,45};
        System.out.println(max(arr));

    }
    static int max(int[] arr){
        int maxv1 = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > maxv1){
                maxv1 = arr[i];
            }
        }
        return maxv1;
    }
}