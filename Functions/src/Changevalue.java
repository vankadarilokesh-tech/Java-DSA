import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int[] arr= {1,2,4,76,96};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] num)
    {
        num[0] = 99; // arrays can modify but not strings

// call by value
    }
}
