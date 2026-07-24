import java.util.Arrays;

public class Maxin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 45, 67},
                {56, 587, 93},
                {6, 7, 43},
                {54,32,77}
        };


        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int maxn = Integer.MIN_VALUE;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(arr[r][c] > maxn){
                    maxn = arr[r][c];
                }
            }
        }
        return maxn;
    }
}

