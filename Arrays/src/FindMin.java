public class FindMin {
    public static void main(String[] args) {
        int[] nums = { 3,5,1,4,7,8,-3,4,67,99,12};
        System.out.println(min(nums));
    }
    static int min(int[] nums){
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < ans){
                ans = nums[i];
            }
        }
        return ans;
    }

}
