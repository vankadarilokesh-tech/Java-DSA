import java.util.Arrays;

public class Array {
    //syntax
    //datatype[] variable = new datatype[size];
    public static void main(String[] args) {
        int[] ros;//declaration of array. ros is getting defined in the stack
        ros = new int[5];// here object is being created in the memory (heap)
         //new is used to create an object
      //  System.out.println(ros[0]); // 0
        String[] arr = new String[3];
        System.out.println(arr[0]); // null (special literal)
    }
}
