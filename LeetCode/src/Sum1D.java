import java.util.Arrays;

public class Sum1D {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int i = 1;
        while(i < nums.length){
            nums[i] = nums[i] + nums[i-1];
            i++;
        }
        System.out.println(Arrays.toString(nums));

    }
}
