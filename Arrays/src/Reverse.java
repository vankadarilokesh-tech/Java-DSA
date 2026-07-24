import java.util.Arrays;
//2 pointer method
public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 34, 56, 69, 74};//[74, 69, 56, 34, 1]
       reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;// we are playing with index value
        while(start < end){
            swap(arr, start , end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
