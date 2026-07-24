import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
               fun(2,4,5,6,88,99,79,44);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a , int b, String ...v){
        // ...v should be always in the end of the all types of parameters
    }
}
