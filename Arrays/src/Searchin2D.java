import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 45, 67},
                {56, 87, 93},
                {6, 7, 43},
                {54,32,77}
        };
         int target = 77;
         int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(arr[r][c] == target){
                    return new int[] {r, c};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
