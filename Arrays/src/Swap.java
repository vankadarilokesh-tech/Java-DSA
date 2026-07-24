import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 1, 34, 56, 74};
        swap(arr , 1, 3);//{1,74,56,34}
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
