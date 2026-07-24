import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] arr = new int[5];
//        input using loops
//        for(int i =0;i < arr.length;i++){
//            arr[i] = in.nextInt();
//        }
//        method 1 for printing an array
//        for(int i =0;i < arr.length;i++){
//
//                    System.out.print(arr[i] + " ");
//                }
        //method 2
//        for(int num : arr){
//            System.out.print(num + " ");//num is every element in an array
//
//        }
//        method 3 (best)
//        System.out.print(Arrays.toString(arr));
        String[] str = new String[3];
        for(int i = 0; i< str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));


       //modify
        str[1] = "lokesh";
        System.out.println(Arrays.toString(str));


    }
}
